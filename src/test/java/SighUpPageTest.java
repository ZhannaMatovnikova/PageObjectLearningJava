import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SighUpPageTest {
    private WebDriver driver;
    private SignUpPage signUpPage;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Жанна\\IdeaProjects\\untitled2\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://github.com/signup");
        signUpPage = new SignUpPage(driver);
    }

    @Test
    @Ignore

    public void signUpWithShortPass(){ //TODO пока не работает, ввести email, нажать кнопку continue, ввести пароль короткий, сравнить текст в ошибке через ассерт
        SignUpPage sp = signUpPage.clickButtonContinue("fghj1234ss@mail.ru");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password']")));
        SignUpPage password = signUpPage.typePass("123");
        String error = signUpPage.getErrorPasswordText();
        Assert.assertEquals("Password is too short", error);


    }





    @After
    public void tearDown(){
        driver.quit();}


}





