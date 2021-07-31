import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class firstTestNG extends BaseClass{

    @Test(priority=2)
    void setup(){
        System.out.println("login");
    }

    @Test(priority=1)
    void checkNumKeys() {
        WebDriver driver=BaseClass.driver;

        WebElement search_google_box = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
       // search_google_box.sendKeys(word);

        String  max_length_search_google_box = search_google_box.getAttribute("maxlength");

        int max_length_search_google_box_int = Integer.parseInt(max_length_search_google_box);
        //System.out.println(max_length_search_google_box);

        System.out.println("max length of the search box is " +max_length_search_google_box);


        String word= "";
        for (int i=0; i< max_length_search_google_box_int+1 ; i++){
            word+="a";
        }

        System.out.println("word length= " + word.length());
        search_google_box.sendKeys(word);

        int count_search_google_box = search_google_box.getAttribute("value").length();
        System.out.println("actual max length of the search box is " +count_search_google_box);

        Assert.assertEquals(max_length_search_google_box_int, count_search_google_box);



    }

}


