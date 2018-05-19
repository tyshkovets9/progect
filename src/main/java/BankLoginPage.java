import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankLoginPage {
    @FindBy(name="username")
    WebElement loginField;
    @FindBy(name="password")
    WebElement passwordField;
    @FindBy(id="login-button")
    WebElement loginButton;
    public ConfirmLoginPage loginWithUser() {
        loginField.sendKeys("");
        passwordField.sendKeys("");
        loginButton.click();
        return PageFactory.initElements(BrowserType.browser, ConfirmLoginPage.class);
    }
}

