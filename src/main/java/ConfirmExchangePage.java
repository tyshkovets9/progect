import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmExchangePage {
    @FindBy (id="confirmation-frame")
    WebElement confirmation;
    @FindBy (id="otp-input")
    WebElement buttonOtp;
    public ResultOfAnExchangePage confirmExchange(){
        confirmation.getText();
        buttonOtp.click();
        return PageFactory.initElements(BrowserType.browser,ResultOfAnExchangePage.class);
    }
}
