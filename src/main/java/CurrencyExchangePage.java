import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CurrencyExchangePage{
    @FindBy (id="currency-rates")
    WebElement currency;
    @FindBy(id="currency-exchange")
    WebElement exchange;
    @FindBy(name="payment.details")
    WebElement assignment;
    @FindBy (id="forward")
    WebElement buttonForward;
    public  ConfirmExchangePage currencyExchange() {
        Actions actions = new Actions(BrowserType.browser);
        actions.moveToElement(currency).click(exchange).build().perform();
        Select oSelect = new Select(BrowserType.browser.findElement(By.id("acc1")));
        oSelect.selectByValue("10013");
        BrowserType.browser.findElement(By.id("from-amount")).sendKeys("10");
        oSelect = new Select(BrowserType.browser.findElement(By.id("acc2")));
        oSelect.selectByValue("10001");
        assignment.sendKeys("sdsdg");
        buttonForward.click();
        return PageFactory.initElements(BrowserType.browser,ConfirmExchangePage.class);
    }
}
