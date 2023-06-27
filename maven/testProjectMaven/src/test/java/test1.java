import org.example.MathClass;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test1 {

    @BeforeTest
    void BeforeTest(){
        System.out.println("Run tests.");
    }

    @AfterTest
    void AfterTest(){
        System.out.println("Tests are done.");
    }

    @Test
    void testDivision(){
        Assert.assertEquals(MathClass.division(9,1), 9);
    }

    @Test
    void testAddition(){
        Assert.assertEquals(MathClass.addition(9,1), 10);
    }

    @Test
    void testMultiplication(){
        Assert.assertEquals(MathClass.multiplication(9,1), 9);
    }

    @Test
    void testSubtraction(){
        Assert.assertEquals(MathClass.subtraction(9,1), 8);
    }
}
