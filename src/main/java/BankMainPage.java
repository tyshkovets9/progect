import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BankMainPage {
    @FindBy(id="representee-list")
    WebElement userName;
    public String LoginUser(){
        return userName.getText();
    }
}

