import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultOfAnExchangePage {
    @FindBy (id="payment-status")
    WebElement status;
    public String exchangeOfResult(){
        return status.getText();
    }
}
