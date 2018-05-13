import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PeterburgBankTest {
    private static final String login ="demo";
    private static final String password = "demo";
    private static final String otpCode = "";

    @BeforeClass
    public void browser(){
        BrowserType.openBrowser();
    }

    @Test
    public void searchTest(){
        Navigation.openBankLoginPage()
                .loginWithUser(login, password)
                .confirmLogin(otpCode)
                .getUsername("Королёва Ольга")
                .accountStatement(account, statement)
                .currencyExchange();

    }
}
