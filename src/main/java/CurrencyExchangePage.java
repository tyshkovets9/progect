import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CurrencyExchangePage extends AccountStatementPage {
    @FindBy (id="currency-rates")
    WebElement currency;
    @FindBy(id="currency-exchange")
    WebElement exchange;

    private  ConfirmExchangePage currencyExchange (WebElement currency, WebElement exchange) {
        Actions actions = new Actions(BrowserType.browser);
        actions.moveToElement(currency).click(exchange).build().perform();
        Select oSelect = new Select(BrowserType.browser.findElement(By.id("acc1")));
        oSelect.selectByValue("10013");
        BrowserType.browser.findElement(By.id("from-amount")).sendKeys("10");
        oSelect = new Select(BrowserType.browser.findElement(By.id("acc2")));
        oSelect.selectByValue("10001");
        BrowserType.browser.findElement(By.name("payment.details")).sendKeys("sdsdg", Keys.ENTER);
        BrowserType.browser.findElement(By.id("forward")).click();
        return PageFactory.initElements(BrowserType.browser,ConfirmExchangePage.class);
    }
}
