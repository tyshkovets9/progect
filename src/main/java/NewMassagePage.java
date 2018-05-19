import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

public class NewMassagePage {
    @FindBy(id="new-message-btn")
    WebElement newMessage;
    @FindBy(name="message.text")
    WebElement messageText;
    @FindBy(id="send-button")
    WebElement sendButton;

    public MessageResultPage newMessage(){
        newMessage.click();
        messageText.sendKeys("dvkslfdbs");
        sendButton.click();
        return PageFactory.initElements(BrowserType.browser, MessageResultPage.class);
    }
    @DataProvider
    public static Object[][] createData() {
        return new Object[][]{
        };
    }
}
