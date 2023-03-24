package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class test1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.click();
        fullName.sendKeys("bilgen");

        WebElement email = driver.findElement(new By.ByCssSelector(".mr-sm-2[id='userEmail']"));
        email.click();
        email.sendKeys("bigen@yahoo.com");

        WebElement currentAddress = driver.findElement(new By.ByCssSelector(".form-control[placeholder='Current Address']"));
        currentAddress.click();
        currentAddress.sendKeys("Kırklareli");

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.click();
        permanentAddress.sendKeys("Kırklareli");

        WebElement submitButton = driver.findElement(new By.ByCssSelector("button.btn"));
        submitButton.click();

        ///////////

        WebElement nametext = driver.findElement(By.xpath("//div/p[@id='name']"));
        String name = nametext.getText();
        System.out.println(name);

        WebElement emailtext = driver.findElement(By.xpath("//div/p[@id='email']"));
        String email1 = emailtext.getText();
        System.out.println(email1);

        System.setProperty("webdriver.crome.driver.", "drivers/cromedriver.");
        WebDriver driver1 = new ChromeDriver();

        driver.get("https://demoqa.com/checkbox");
        driver.manage().window().maximize();

        String homeCheckBoxCssValeu = "label[for='tree-node-home'] spam.ret-checkbox svg";
        WebElement homeCheckBox = driver.findElement(new By.ByCssSelector(homeCheckBoxCssValeu));
        homeCheckBox.click();

        homeCheckBox = driver.findElement(new By.ByCssSelector(homeCheckBoxCssValeu));

        String homeCheckBoxClassName = homeCheckBox.getAttribute("class");

        if (homeCheckBoxClassName.equals("rct-icon rct-icon-check")){

        System.out.println("Checkbox is Checked!");
        }else{

            System.out.println("Checkbox is unchecked!");

        }

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver2 = new ChromeDriver();

        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

        WebElement sportCheckbox = driver.findElement(By.id("hobbies-checkbox-1"));
        boolean isEnabled = sportCheckbox.isEnabled();
        System.out.println(isEnabled);

        if (isEnabled){
            sportCheckbox.click();
        }

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver3 = new ChromeDriver();

        driver.get("https://demoqa.com/automation-radio-button");
        driver.manage().window().maximize();

        WebElement yesRadioButton = driver.findElement(By.id(""));
         boolean isEnabled1 = yesRadioButton.isEnabled();

        ///////////

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver4 = new ChromeDriver();

        driver.get("https://demoqa.com/button");
        driver.manage().window().maximize();

         WebElement doubleClickButton= driver.findElement(By.id("doubleClickButton"));
        Actions action = new Actions(driver);
        action.doubleClick(doubleClickButton).perform();

        WebElement messege = driver.findElement(By.id("doubleClickMessege"));
        String messegeText = messege.getText();
        System.out.println("messegeText");

        WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
        action.contextClick(rightClickButton).perform();

        WebElement rightClickMessege = driver.findElement(By.id("rightClickMessege"));
        String messege2 = rightClickMessege.getText();
        System.out.println(messege2);

        WebElement textElement = driver.findElement(By.xpath("//div/p"));
        String text1 = textElement.getText();
        System.out.println("text");

        WebElement firstButton = driver.findElement(By.id("enableafter"));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofMinutes(5l) );
        wait.until(ExpectedConditions.elementToBeClickable(firstButton));
        firstButton.click();

        WebElement colorChangeButton = driver.findElement(By.id("colorchange"));
        String className = colorChangeButton.getAttribute("class");
        System.out.println("Before change: " + className);

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofMinutes(5l));
        wait.until(ExpectedConditions.attributeToBe(colorChangeButton , "class", "mt-4 text-danger btn btn-prinary "));
        className = colorChangeButton.getAttribute("class");
        System.out.println("After change: " + className);

       WebDriverWait wait2 = new WebDriverWait(driver , Duration.ofMinutes(5l));
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
       driver.findElement(By.id("visibleAfter")).click();




    }
}
