import Pages.CartPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.testDataLogin;
import org.testng.annotations.Test;

import java.time.Duration;

public class PageTest extends TestBase{
     HomePage homePage;
     LoginPage loginPage;
     CartPage cartPage;
     testDataLogin data;

    @Test(testName = "Valid proceed to checkout")
    public void pageTest(){
        homePage = new HomePage(driver);
        loginPage = homePage.clickingOnLogingButton();
        loginPage.enterEmail(data.email);
        loginPage.enterPassword(data.pass);
        loginPage.clickingOnSignInButton();
        homePage.clickingOnWomanButton();
        homePage.ProductHover();
        homePage.clickingOnMoreButton();
        homePage.clickingOnColorButton();
        homePage.clickingOnSizeButton();
        homePage.clickingOnAddToCartButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        cartPage = homePage.clickingOnProceedToCheckoutButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        cartPage.clickOnAddQuantityButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        cartPage.clickOnProceedToButton();
    }
}
