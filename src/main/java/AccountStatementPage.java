import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountStatementPage {
    @FindBy(id="accounts-index")
    WebElement account;
    @FindBy(id="statements-statement")
    WebElement statement;

    public PositiveBalancePage accountStatement() {
        Actions actions = new Actions(BrowserType.browser);
        actions.moveToElement(account).click(statement).build().perform();
        return PageFactory.initElements(BrowserType.browser,PositiveBalancePage.class);
    }
}
