package Pages;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase {
    public HomePage(WebDriver driver){

        super(driver);
    }
    By loginButton = By.className("login");
    WebElement loginButtonElement ;

    By WomanButton = By.className("sf-with-ul");
    WebElement WomanButtonElement ;

    By ProductHover = By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img");
    WebElement ProductHoverElement ;

    By MoreButton = By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a/span");
    WebElement MoreButtonElement ;

    By ColorButton = By.xpath("//*[@id=\"color_8\"]");
    WebElement ColorButtonElement ;

    By SizeButton = By.id("group_1");
    WebElement SizeButtonElement ;

    By AddToCartButton = By.name("Submit");
    WebElement AddToCartButtonElement ;

    By ProceedToCheckoutButton = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");
    WebElement ProceedToCheckoutButtonElement ;


    public LoginPage clickingOnLogingButton(){
        loginButtonElement = driver.findElement(loginButton);
        PageBase.Clicking(loginButtonElement);
        return new LoginPage(driver);
    }
    public void clickingOnWomanButton(){
        WomanButtonElement = driver.findElement(WomanButton);
        PageBase.Clicking(WomanButtonElement);
    }
    public void ProductHover(){
        ProductHoverElement = driver.findElement(ProductHover);
        Actions actions = new Actions(driver);
        actions.moveToElement(ProductHoverElement).perform();
    }
    public void clickingOnMoreButton(){
        MoreButtonElement = driver.findElement(MoreButton);
        PageBase.Clicking(MoreButtonElement);
    }
    public void clickingOnColorButton() {
        ColorButtonElement = driver.findElement(ColorButton);
        PageBase.Clicking(ColorButtonElement);
    }
    public void clickingOnSizeButton() {
        SizeButtonElement = driver.findElement(SizeButton);
        Select select = new Select(SizeButtonElement);
        select.selectByValue("2");
    }
    public void clickingOnAddToCartButton() {
        AddToCartButtonElement = driver.findElement(AddToCartButton);
        PageBase.Clicking(AddToCartButtonElement);
    }

    public CartPage clickingOnProceedToCheckoutButton() {
        ProceedToCheckoutButtonElement = driver.findElement(ProceedToCheckoutButton);
        PageBase.Clicking(ProceedToCheckoutButtonElement);
        return new CartPage(driver);
    }

}
