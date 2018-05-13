import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankMainPage {
    @FindBy(id="representee-list")
    WebElement Username;

    public String getUsername(String text){
        return Username.getText();
    }
}

