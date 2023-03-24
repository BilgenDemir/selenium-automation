import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test4 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver3 = new ChromeDriver(options);

        driver3.get("https://demoqa.com/radio-button");
        driver3.manage().window().maximize();

        WebElement yesRadioButtonLabel = driver3.findElement(new By.ByCssSelector("label[for='yesRadio']"));
        boolean isEnabled = yesRadioButtonLabel.isEnabled();

        if(isEnabled){
            yesRadioButtonLabel.click();
            System.out.println("clicked yesRadio Button");
        }

        WebElement yesRadioButton = driver3.findElement(By.id("yesRadio"));

        boolean isSelected = yesRadioButton.isSelected();

        if(isSelected){
            System.out.println("Yes Radio Button is Selected...");
        }

        WebElement output = driver3.findElement(new By.ByCssSelector("p.mt-3"));
        System.out.println(output.getText());

        WebElement noRadioButton = driver3.findElement(By.id("noRadio"));
        System.out.println(noRadioButton.isEnabled());
    }
}
