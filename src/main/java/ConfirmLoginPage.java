import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmLoginPage {
    @FindBy(name="otpCode")
    WebElement loginConfirm;
    @FindBy(id="login-otp-button")
    WebElement logiOtpButton;
    public BankMainPage confirmLogin(){
        loginConfirm.sendKeys("");
        logiOtpButton.click();
        return PageFactory.initElements(BrowserType.browser, BankMainPage.class);
    }
}
