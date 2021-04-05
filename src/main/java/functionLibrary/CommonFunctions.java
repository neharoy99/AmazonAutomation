package functionLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class CommonFunctions {

    public static WebDriver driver;

    public void openBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void quitBrowser()
    {
        driver.quit();
    }

    public String readFile(String key) throws Exception {
        // Read the file through FileInputStream
        FileInputStream inputStream = new FileInputStream("C:\\Users\\inani\\IdeaProjects\\AmazonTestAutoFramework\\src\\main\\resources\\testData\\testData.properties");
        //Load the properties of the file read
        Properties properties = new Properties();
        properties.load(inputStream);
        //get the value of the property on basis of key from the file
        String value = properties.getProperty(key);
        return value;
    }

    public void implicitWait(int waitTime)
    {
        driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
    }
}
