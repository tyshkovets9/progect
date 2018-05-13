import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountStatementPage {
    @FindBy(id="accounts-index")
    WebElement account;
    @FindBy(id="statements-statement")
    WebElement statement;
    @FindBy(id="closing-balance-row")
    WebElement balance;
    @FindBy(xpath = "//tr[@id='closing-balance-row']/th[2]")
    WebElement amountResult;

    public AccountStatementPage accountStatement (WebElement account, WebElement statement) {
        Actions actions = new Actions(BrowserType.browser);
        actions.moveToElement(account).click(statement).build().perform();
        return PageFactory.initElements(BrowserType.browser, CurrencyExchangePage.class);
    }
    public boolean isBalancePositive(){
        String []ArrResult = amountResult.getText().replaceAll(" ", "").split("\\.");
        String result  = ArrResult[0];
        int resultOfBalance = Integer.parseInt(result);
        return  (resultOfBalance > 0);
    }
}
