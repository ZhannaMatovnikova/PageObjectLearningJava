import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    private By signInButtonHeader = By.xpath("//a[contains(text(), 'Sign in')][1]");
    private By signUpButtonHeader = By.xpath("//a[contains(text(), 'Sign up')][1]");
    private By signUpButton2 = By.xpath("//a[contains(text(), 'Sign up')][2]");
    private By signUpField = By.xpath("//input[@name='type']");

    public LoginPage clickSignInHeader(){
        driver.findElement(signInButtonHeader).click();
        return new LoginPage(driver);
    }

    public SignUpPage clickSignUpHeader(){
        driver.findElement(signUpButtonHeader).click();
        return new SignUpPage(driver);
    }

    public SignUpPage clickSignUpButton2(){
        driver.findElement(signUpButton2).click();
        return new SignUpPage(driver);
    }

    public MainPage typeEmail(String email){
        driver.findElement(signUpField).sendKeys(email);
        return this;
    }
    public SignUpPage register(String email){
        this.typeEmail(email);
        this.clickSignUpButton2();
        return new SignUpPage(driver);
    }




}
