import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PositiveBalancePage {
    @FindBy(xpath = "//tr[@id='closing-balance-row']/th[2]")
    WebElement amountResult;

    public String isBalancePositive(){
        String[]ArrResult = amountResult.getText().replaceAll(" ", "").split("\\.");
        return String.valueOf(Integer.parseInt(ArrResult[0]));
    }
}
