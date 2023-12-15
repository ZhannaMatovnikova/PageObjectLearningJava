import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.awt.print.PageFormat;
import java.util.concurrent.TimeUnit;

public class MainClass {
    static WebDriver driver;
    public static void main(String[] args) {
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.get("https://github.com/");

//    MainPage mainPage = new MainPage(driver); //если используем способ определения элементов стр 2 - замена следующих 2 строк
    MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
    mainPage.register("test3t@jhg.ru");

    driver.quit();
    }
}
