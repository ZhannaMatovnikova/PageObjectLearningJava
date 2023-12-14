import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
    WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    private By heading = By.xpath("//span[text()='Welcome to GitHub!']");

    private By emailField = By.cssSelector("#email");
    private By buttonContinue = By.cssSelector("#email-container > div.d-flex.flex-items-center.flex-column.flex-sm-row > button");
    private By errorEmail = By.cssSelector("#email-err");

    public SignUpPage typeEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
        return this;


    }

    public SignUpPage registerWithInvalidCreds(String email) {
        this.typeEmail(email);
        driver.findElement(buttonContinue).click();
        return new SignUpPage(driver);

    }


    public String GetHeadingText(){
        return driver.findElement(heading).getText();

    }

    public String ErrorText(){
        return driver.findElement(errorEmail).getText();

    }

}
