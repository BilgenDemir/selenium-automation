import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestJava {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
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



        WebElement nametext = driver.findElement(By.xpath("//div/p[@id='name']"));
        String name = nametext.getText();
        System.out.println(name);

        WebElement emailtext = driver.findElement(By.xpath("//div/p[@id='email']"));
        String email1 = emailtext.getText();
        System.out.println(email1);



//////////////////////////////////////////////////////////////

        //12nci video
















        /*
        WebElement textElement = driver.findElement(By.xpath("//div/p"));
        String text1 = textElement.getText();
        System.out.println("text");

        WebElement firstButton = driver.findElement(By.id("enableafter"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(5l));
        wait.until(ExpectedConditions.elementToBeClickable(firstButton));
        firstButton.click();

        WebElement colorChangeButton = driver.findElement(By.id("colorchange"));
        String className = colorChangeButton.getAttribute("class");
        System.out.println("Before change: " + className);

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofMinutes(5l));
        wait.until(ExpectedConditions.attributeToBe(colorChangeButton, "class", "mt-4 text-danger btn btn-prinary "));
        className = colorChangeButton.getAttribute("class");
        System.out.println("After change: " + className);

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofMinutes(5l));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
        driver.findElement(By.id("visibleAfter")).click();
    }
       public void test() {
           System.setProperty ("webdriver.crome.driver ","drivers/cromedriver.exe");
           driver = new CromeDriver();
           driver.get("https://demoqa.com/nestedframes");

           WebElement adFrame = driver.findElement(By.cssSelector("iframe [title='3rd party ad content']"));
           driver.switchTo().frame(adFrame);

            Thread.sleep(5000);
           WebElement closeButton = driver.findElement(By.id("cbb"));
           closeButton.click();

           driver.switchTo().frame("frame1");

           WebElement parentBody = driver.findElement(By.tagName("body"));
            System.out.println("parentBody.getText");

            driver.switchTo().frame(0);

            WebElement p = driver.findElement(By.tagName("p"));
            System.out.println("p.getText()");

            driver.switchTo().parentFrame();
            driver.switchTo().parentFrame();

            WebElement modalText = driver.findElement(By.cssSelector("div.modal/body"));
            System.out.println("modalText.getText()");

            WebElement smallCloseButton = driver.findElement(By.id("closeSmallModal"));
            smallCloseButton.click();















 */




        }






}
