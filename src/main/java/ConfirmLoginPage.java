import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmLoginPage {
    @FindBy(name="otpCode")
    WebElement loginConfirm;

    public BankMainPage confirmLogin(String otpCode){
        loginConfirm.sendKeys(otpCode,Keys.ENTER);
        return PageFactory.initElements(BrowserType.browser, BankMainPage.class);
    }
}
