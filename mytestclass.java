import com.sun.xml.internal.bind.XmlAccessorFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by mattsawyer on 11/14/16.
 */
//#define firefoxLocation
public class mytestclass {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","/Users/mattsawyer/Downloads/geckodriver");
        //New Firefox window
        WebDriver driver = new FirefoxDriver();

        //maximize window
        driver.manage().window().maximize();

        //opens specified url in browser
        driver.get("https://www.google.com");

        driver.findElement(By.name("q")).sendKeys("test writing inside of the search bar");

        String CurrentURL = driver.getCurrentUrl();
        System.out.println("My Current URL is : " + CurrentURL);
        driver.close();

    }
}