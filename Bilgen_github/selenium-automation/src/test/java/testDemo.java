import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Locale;

public class testDemo{

    WebDriver driver;

    @Test
    public void test() throws InterruptedException{
        System.setProperty("webdriver.crome.driver" , "drivers/cromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://demoga.com/accordian");

        WebElement firstCard = driver.findElement(By.xpath("//div[@class='card'][1]/div[2]"));
        String className = firstCard.getAttribute("class");
        System.out.println(className);

        driver.findElement(By.id("section1Heading"));
        firstCard.click();

        className = firstCard.getAttribute("class");
        System.out.println(className);

        Thread.sleep(1000);
        className = firstCard.getAttribute("class");
        System.out.println(className);

        System.setProperty("webdriver.crome.driver" , "drivers/cromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://demoga.com/complete");

        WebElement input = driver.findElement(By.id("autocompleteSingleInput"));
        input.sendKeys("R");
        List<WebElement> suggestions = driver.findElements(By.cssSelector("div.auto-complete__option"));

        for (WebElement suggestion : suggestions){

            String text = suggestion.getText();
            System.out.println(text);

            if (text.toLowerCase().contains("r")){
                System.out.println(text + "has r letter");

                if (text.equalsIgnoreCase("red"));
                suggestion.click();
                break;


            }

        }






    }


}
