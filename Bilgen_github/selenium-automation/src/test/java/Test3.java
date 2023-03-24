import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test3 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver2 = new ChromeDriver(options);

        driver2.get("https://demoqa.com/automation-practice-form");
        driver2.manage().window().maximize();

        WebElement sportCheckbox = driver2.findElement(By.id("hobbies-checkbox-1"));
        boolean isEnabled = sportCheckbox.isEnabled();
        System.out.println(isEnabled);

        WebElement sportCheckBoxLabel = driver2.findElement(new By.ByCssSelector("label[for='hobbies-checkbox-1']"));
        if (isEnabled) {
            try{
                System.out.println("Entered try blocked...");
                sportCheckbox.click();
            }catch (ElementClickInterceptedException e){
                sportCheckBoxLabel.click();
                System.out.println("Entered catched blocked...");
            }
        }

        boolean isSelected = sportCheckbox.isSelected();
        System.out.println("isSelected : " + isSelected);


    }
}
