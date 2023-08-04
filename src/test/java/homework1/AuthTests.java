package homework1;

import learning.homework1.Auth;
import learning.homework1.User;
import learning.homework1.UserExists;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class AuthTests {
    Auth auth = new Auth();


    @BeforeTest
    void beforeTest() throws IOException {
        auth.register("example@gmail.com","Smbulik ","other", "06-06-2006","example address 75","admin7","password","0-88-888-888");
        auth.register("example@gmail.com","Smbulik ","other", "06-06-2006","example address 75","admin6","password","0-88-888-888");
        auth.register("example@gmail.com","Smbulik ","other", "06-06-2006","example address 75","admin5","password","0-88-888-888");
        auth.register("example@gmail.com","Smbulik ","other", "06-06-2006","example address 75","admin4","password","0-88-888-888");
        auth.register("example@gmail.com","Smbulik ","other", "06-06-2006","example address 75","admin3","password","0-88-888-888");
        auth.register("example@gmail.com","Smbulik ","other", "06-06-2006","example address 75","admin2","password","0-88-888-888");
        auth.register("example@gmail.com","Smbulik ","other", "06-06-2006","example address 75","admin1","password","0-88-888-888");
        auth.register("example@gmail.com","Smbulik ","other", "06-06-2006","example address 75","admin","password","0-88-888-888");

        auth.register("example@gmail.com","Smbulik ","other", "06-06-2006","example address 75","Smbulik777","password","0-88-888-888");
    }

    @AfterTest
    void afterTest(){
        auth = null;
    }


    @Test
    void testLogin() {
        Assert.assertTrue(auth.login("Smbulik777", "password"));
    }

    @Test
    void testLoginNegativePassword() {
        Assert.assertFalse(auth.login("Smbulik777", "wrongPassword"));
    }

    @Test
    void testLoginNegativeUname() {
        Assert.assertFalse(auth.login("Smbulik7778", "password"));
    }

    @Test
    void testRegister() {
        auth.register("example@gmail.com","Smbulik ","other", "06-06-2006","example address 75","Smbulik7778","password","0-88-888-888");
        Assert.assertTrue(auth.getUsers().containsKey("Smbulik7778"));
    }

    @Test
    void testRegister2() {
        User user = new User(auth.getUsers().get("admin"));
        user.setUname("adminByReference");
        auth.register(user);

        Assert.assertTrue(auth.getUsers().containsKey("adminByReference"));
    }

    @Test(expectedExceptions = UserExists.class)
    void testRegisterNegative(){
        User user = new User(auth.getUsers().get("admin"));
        System.out.println(user);
        auth.register(user);
    }

}
