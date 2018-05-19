import org.openqa.selenium.support.PageFactory;

public class Navigation {
    public static BankLoginPage openBankLoginPage() {
        BrowserType.browser.get("https://idemo.bspb.ru");
        return PageFactory.initElements(BrowserType.browser, BankLoginPage.class);
    }
    public void loginUserTest(){

    }
}