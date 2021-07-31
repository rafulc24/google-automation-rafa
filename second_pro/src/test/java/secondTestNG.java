import org.testng.Assert;
import org.testng.annotations.Test;


public class secondTestNG extends BaseClass{
    @Test(priority=2)
    void exit(){
        System.out.println("EXIT");
    }

    @Test(priority=1)
    void close(){
        System.out.println("CLOSE");
    }
/*
    @Test(priority=3)
    void testFaild(){
        Assert.assertEquals(1,2);
    }

 */
}