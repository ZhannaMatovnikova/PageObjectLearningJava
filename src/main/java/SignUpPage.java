import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
    WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    private By heading = By.xpath("//span[text()='Welcome to GitHub!']");

    private By emailField = By.cssSelector("#email");
    private By buttonContinue = By.xpath("//button[@data-optimizely-event = 'click.signup_continue.email']");
    private By errorEmail = By.xpath("//p[@class='mb-0']");

    private By errorPassword = By.xpath("//p[@class='password-validity-summary password-validity-summary-fail mb-1']");

    private By passField = By.xpath("//input[@id='password']");

    public SignUpPage typeEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
        return this;
    }

    public SignUpPage typePass(String password) {
        driver.findElement(passField).sendKeys(password);
        return this;
    }

    public SignUpPage clickButtonContinue(String email){ //TODO дополнить и поправить
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(buttonContinue).click();
        return new SignUpPage(driver);
    }

    public SignUpPage registerWithInvalidCreds(String email) {
        this.typeEmail(email);
        driver.findElement(buttonContinue).click();
        return new SignUpPage(driver);

    }


    public String getHeadingText(){
        return driver.findElement(heading).getText();

    }

    public String errorText(){
        return driver.findElement(errorEmail).getText();

    }

    public String getErrorPasswordText(){
        return driver.findElement(errorPassword).getText();
    }

}
