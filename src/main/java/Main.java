import com.github.javafaker.Faker;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver.", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://automationexercise.com");
        driver.manage().window().maximize();

        WebElement signUp = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
        signUp.click();

        Faker faker = new Faker();
        String name = faker.name().fullName();

        WebElement inputName = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]"));
        inputName.sendKeys(name);

        String email = faker.internet().emailAddress();

        WebElement emailInput = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]"));
        emailInput.sendKeys(email);

        WebElement signButton = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button"));
        signButton.click();

        WebElement genderButton = driver.findElement(By.id("id_gender1"));
        genderButton.click();

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("1234");

        WebElement selectDay = driver.findElement(By.id("days"));
        Select day = new Select(selectDay);
        day.selectByVisibleText("28");

        WebElement selectMonth = driver.findElement(By.id("months"));
        Select month = new Select(selectMonth);
        month.selectByVisibleText("May");

        WebElement selectYear = driver.findElement(By.id("years"));
        Select year = new Select(selectYear);
        year.selectByVisibleText("1996");

        WebElement buttonSpecialOffers = driver.findElement(By.id("optin"));
        buttonSpecialOffers.click();

        WebElement selectCountry = driver.findElement(By.id("country"));
        Select country = new Select(selectCountry);
        country.selectByVisibleText("Canada");

        WebElement firstName = driver.findElement(By.id("first_name"));
        firstName.sendKeys("Milan");

        WebElement lastName = driver.findElement(By.id("last_name"));
        lastName.sendKeys("Kovacevic");

        WebElement company = driver.findElement(By.id("company"));
        company.sendKeys("Company One");

        WebElement address = driver.findElement(By.id("address1"));
        address.sendKeys("Monthy Pythona");

        WebElement address2 = driver.findElement(By.id("address2"));
        address2.sendKeys("Dzordza Karlina");

        WebElement state = driver.findElement(By.id("state"));
        state.sendKeys("Srbija");

        WebElement city = driver.findElement(By.id("city"));
        city.sendKeys("Novi Sad");

        WebElement zipCode = driver.findElement(By.id("zipcode"));
        zipCode.sendKeys("21000");

        WebElement mobileNumber = driver.findElement(By.id("mobile_number"));
        mobileNumber.sendKeys("874569");
        WebDriverWait webDriverWait1 = new WebDriverWait(driver, Duration.ofSeconds(20));


        WebElement createAccount = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button"));
        createAccount.click();

        WebElement continue1 = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a"));
        continue1.click();
        
    }
}
