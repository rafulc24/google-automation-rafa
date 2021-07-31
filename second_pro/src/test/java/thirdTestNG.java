import org.testng.annotations.Test;

public class thirdTestNG extends BaseClass{
    @Test(priority=1)
    void setup(){
        System.out.println("thirdTestNG");
    }
}
