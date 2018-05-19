import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessagePage {
    @FindBy(id="messages-button")
    WebElement messageButton;

    public NewMassagePage message(){
        messageButton.click();
        return PageFactory.initElements(BrowserType.browser, NewMassagePage.class);
    }
}

