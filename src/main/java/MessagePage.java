import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MessagePage {
    @FindBy(id="messages-button")
    WebElement messageButton;
    @FindBy(id="new-message-btn")
    WebElement newMessage;
    @FindBy(name="message.text")
    WebElement messageText;
    @FindBy(id="send-button")
    WebElement sendButton;

    private MessagePage message(WebElement messageButton, WebElement newMessage,WebElement messageText, WebElement sendButton){
        BrowserType.browser.findElement(By.id("messages-button")).sendKeys(Keys.ENTER);
        BrowserType.browser.findElement(By.id("new-message-btn")).click();
        BrowserType.browser.findElement(By.name("message.text")).sendKeys("dghfdjdj", Keys.ENTER);
    }
}
