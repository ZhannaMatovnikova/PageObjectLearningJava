import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By loginField = By.xpath("//input[@name='login']");
    private By passwordField = By.xpath("//input[@name='password']");
    private By buttonSignIn = By.xpath("//input[@type='submit']");
    private By heading = By.xpath("//h1[text()='Sign in to GitHub']");
    private By error = By.xpath("//div[@class='px-2']");
    private By createAccountLink = By.xpath("//a[text()='Create an account']");


    public LoginPage typeUsername(String username){
        driver.findElement(loginField).sendKeys(username);
        return this;
    }
    public LoginPage typePassword(String password){
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }


    public LoginPage loginWithInvalidCreds(String username, String password){
        this.typeUsername(username);
        this.typePassword(password);
        driver.findElement(buttonSignIn).click();
        return new LoginPage(driver);

    }


    public String GetHeadingText(){
        return driver.findElement(heading).getText();

    }

    public SignUpPage CreateAccount(){
        driver.findElement(createAccountLink).click();
        return new SignUpPage(driver);
    }




    public LoginPage clickSighIn(){
        driver.findElement(buttonSignIn).click();
        return this;
    }


}
