package learning.homework1;

import net.bytebuddy.implementation.bytecode.Duplication;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class Auth {
    private TreeMap<String,User> users = new TreeMap<>();
    private static HashMap<String,HashMap<String,AuthStatus>> session = new HashMap<>();


    public Auth() {}

    public Auth(ArrayList<User> users) {
        for (User user : users){
            register(user);
        }
    }

    public Auth(Auth toCopy){
        this.users = toCopy.users;
    }

    public void register(User user) {
        if (users.containsKey(user.getUname()) ) throw new UserExists("User already registered");

        HashMap<String,AuthStatus> status = new HashMap<>();
        status.put("logged", AuthStatus.REGISTERED);

        session.put(user.getUname(), status);
        users.put(user.getUname(), new User(user));
    }

    public void register(String email, String name, String gender, String birthday, String address, String uname, String pwd, String phoneNumber) {
        register(new User(email,name,gender,birthday,address,uname,pwd,phoneNumber));
    }

    public boolean login(String username, String password){
        if (users.get(username)!=null){
            session.get(username).put("logged",AuthStatus.LOGGED_IN);
            return users.get(username).getPwd().equals(password);
        }
        return false;
    }

    public void logout(User user) {
        session.get(user.getUname()).put("logged",AuthStatus.LOGGED_OUT);
    }

    public AuthStatus status(User user){
        return session.get(user.getUname()).get("logged");
    }

    public static HashMap<String, HashMap<String, AuthStatus>> getSession() {
        return session;
    }

    public TreeMap<String, User> getUsers() {
        return users;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        return equals((Auth) obj);
    }

    public boolean equals(Auth a) {
        if (this == a) return true;
        return this.users.keySet().equals(a.users.keySet());
    }
}
