package learning.homework1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Auth auth = new Auth();
        auth.register("example@gmail.com","Smbulik ","other", "06-06-2006","example address 75","admin7","password","0-88-888-888");
        auth.register("example@gmail.com","Smbulik ","other", "06-06-2006","example address 75","admin6","password","0-88-888-888");
        auth.register("example@gmail.com","Smbulik ","other", "06-06-2006","example address 75","admin5","password","0-88-888-888");
        auth.register("example@gmail.com","Smbulik ","other", "06-06-2006","example address 75","admin4","password","0-88-888-888");
        auth.register("example@gmail.com","Smbulik ","other", "06-06-2006","example address 75","admin3","password","0-88-888-888");
        auth.register("example@gmail.com","Smbulik ","other", "06-06-2006","example address 75","admin2","password","0-88-888-888");
        auth.register("example@gmail.com","Smbulik ","other", "06-06-2006","example address 75","admin1","password","0-88-888-888");
        auth.register("example@gmail.com","Smbulik ","other", "06-06-2006","example address 75","admin","password","0-88-888-888");
        auth.register("example@gmail.com","Smbulik ","other", "06-06-2006","example address 75","Smbulik777","password","0-88-888-888");


        User user = auth.getUsers().get("admin");
        user.setUname("adminByReference");
        User user1 = new User(user);
        System.out.println(auth.getUsers().size());
        auth.register(user1);
        System.out.println(auth.getUsers()+" "+user1+" "+auth.getUsers().size());

        List<Auth> a = new ArrayList<>();
    }
}
