
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class x_path_locator {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\piyus\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(4000);

        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        Thread.sleep(4000);

        driver.findElement(By.className("submit-button")).click();
        Thread.sleep(4000);
        
        String currentWindowHandle = driver.getWindowHandle();
        driver.switchTo().window(currentWindowHandle);
        driver.findElement(By.linkText("Sauce Labs Bike Light")).click();
        Thread.sleep(4000);
        
        driver.findElement(By.xpath("//*[@id=\"add-to-cart\"]")).click();
       Thread.sleep(4000);

       driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).click();
        

        System.out.println(" Finished ");
        
        //driver.quit();
        
       
    }
}
