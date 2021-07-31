import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class BaseClass {

public static WebDriver driver;

    @BeforeSuite
    public void BeforeSuite() {
        System.out.println("BaseClass's Before Suite method " );

        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");

        driver = new ChromeDriver();
        //WebDriverManager.chromedriver().setup();
        String baseUrl = "https://www.google.com/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        driver.get(baseUrl);
    }


    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BaseClass's Before Test method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("BaseClass's After Test method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("BaseClass's Before Class method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("BaseClass's After Class method");
    }

    @AfterSuite
    public void AfterSuite() {

        //driver.close();
    }


}