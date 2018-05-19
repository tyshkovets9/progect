import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class PeterburgBankTest {
    @DataProvider(name = "csv")
    public Iterator<Object[]> searchFromCsv() {
        return .loadDataFromFile();
    }

    @BeforeMethod
    public void browser() {
        BrowserType.openBrowser();
    }

    @Test()
    public void loginUserTest() {
        String userName = Navigation.openBankLoginPage().loginWithUser().confirmLogin().LoginUser();
        assertTrue(userName.contains("Королёва Ольга"));
    }

    @Test
    public void isBalancePositiveTest() {
        PositiveBalancePage PositiveBalancePage=
                assertTrue(PositiveBalancePage.isBalancePositive());
    }

    @Test
    public void currencyExchangeTest() {
        String exchangeOfResult = Navigation.openBankLoginPage().
                assertTrue(exchangeOfResult.contains("Исполнен"));

    }

    @Test(dataProvider = "csv")
    public void messageTest(String text){
        String messageResultPage = .pageOfUserAuthorization().loginUser().
                messagePage().createNewMessagePage().createNewMessage(text).isPresentNewMessage();
        assertTrue(messageResultPage.contains(text));
    }

    @AfterMethod
    public void closeBrowser() {
        new BrowserType().closeBrowser();
    }
}

