import com.sun.xml.internal.bind.XmlAccessorFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Keys;

/**
 * Created by M@t
 */
//#define firefoxLocation
public class mySimpleSeleniumExample {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","~/Downloads/geckodriver");
        //New Firefox window
        WebDriver driver = new FirefoxDriver();
        //maximize window
        driver.manage().window().maximize();
        //opens specified url in browser
        driver.get("https://www.google.com");
        //barrel roll necessary 
        driver.findElement(By.name("q")).sendKeys("do a barrel roll" + Keys.RETURN);
        String CurrentURL = driver.getCurrentUrl();
        System.out.println("My Current URL is : " + CurrentURL);
        driver.close(); //this kills the window
    }
}
