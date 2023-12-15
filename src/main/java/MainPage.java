import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(css = "body > div.logged-out.env-production.page-responsive.header-overlay.home-campaign > div.position-relative.js-header-wrapper > header > div > div.HeaderMenu--logged-out.p-responsive.height-fit.position-lg-relative.d-lg-flex.flex-column.flex-auto.pt-7.pb-4.top-0 > div > div > div > a")
    private WebElement signInButtonHeader;
    @FindBy(css = "body > div.logged-out.env-production.page-responsive.header-overlay.home-campaign > div.position-relative.js-header-wrapper > header > div > div.HeaderMenu--logged-out.p-responsive.height-fit.position-lg-relative.d-lg-flex.flex-column.flex-auto.pt-7.pb-4.top-0 > div > div > a")

    private WebElement signUpButtonHeader;
    @FindBy(css = "body > div.logged-out.env-production.page-responsive.header-overlay.home-campaign > div.application-main > main > div:nth-child(1) > div.px-3.home-campaign-hero > div > div > div.col-11.text-left.pl-2.pl-sm-0.mt-n4 > div.d-flex.flex-column.flex-md-row > form > div > button")

    private WebElement signUpButton2;
    @FindBy(css = "#user_email")

    private WebElement signUpField;

    //способ определения элементов на странице 2

//    private By signInButtonHeader = By.cssSelector("body > div.logged-out.env-production.page-responsive.header-overlay.home-campaign > div.position-relative.js-header-wrapper > header > div > div.HeaderMenu--logged-out.p-responsive.height-fit.position-lg-relative.d-lg-flex.flex-column.flex-auto.pt-7.pb-4.top-0 > div > div > div > a");
//    private By signUpButtonHeader = By.cssSelector("body > div.logged-out.env-production.page-responsive.header-overlay.home-campaign > div.position-relative.js-header-wrapper > header > div > div.HeaderMenu--logged-out.p-responsive.height-fit.position-lg-relative.d-lg-flex.flex-column.flex-auto.pt-7.pb-4.top-0 > div > div > a");
//    private By signUpButton2 = By.cssSelector("body > div.logged-out.env-production.page-responsive.header-overlay.home-campaign > div.application-main > main > div:nth-child(1) > div.px-3.home-campaign-hero > div > div > div.col-11.text-left.pl-2.pl-sm-0.mt-n4 > div.d-flex.flex-column.flex-md-row > form > div > button");
//    private By signUpField = By.cssSelector("#user_email");


    //методы для FindBy

    public LoginPage clickSignInHeader(){
        signInButtonHeader.click();
        return new LoginPage(driver);
    }

    public SignUpPage clickSignUpHeader(){
        signUpButtonHeader.click();
        return new SignUpPage(driver);
    }

    public SignUpPage clickSignUpButton2(){
        signUpButton2.click();
        return new SignUpPage(driver);
    }

    public MainPage typeEmail(String email){
        signUpField.sendKeys(email);
        return this;
    }
    public SignUpPage register(String email){
        this.typeEmail(email);
        this.clickSignUpButton2();
        return new SignUpPage(driver);
    }






    //методы для элементов на стр 2
//
//    public LoginPage clickSignInHeader(){
//        driver.findElement(signInButtonHeader).click();
//        return new LoginPage(driver);
//    }
//
//    public SignUpPage clickSignUpHeader(){
//        driver.findElement(signUpButtonHeader).click();
//        return new SignUpPage(driver);
//    }
//
//    public SignUpPage clickSignUpButton2(){
//        driver.findElement(signUpButton2).click();
//        return new SignUpPage(driver);
//    }
//
//    public MainPage typeEmail(String email){
//        driver.findElement(signUpField).sendKeys(email);
//        return this;
//    }
//    public SignUpPage register(String email){
//        this.typeEmail(email);
//        this.clickSignUpButton2();
//        return new SignUpPage(driver);
//    }



}
