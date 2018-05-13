import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankLoginPage {
    @FindBy(name="username")
    WebElement loginField;

    @FindBy(name="password")
    WebElement passwordField;

    public ConfirmLoginPage loginWithUser(String username, String password) {
        loginField.sendKeys(username);
        passwordField.sendKeys(password, Keys.ENTER);
        return PageFactory.initElements(BrowserType.browser, ConfirmLoginPage.class);
    }
}

