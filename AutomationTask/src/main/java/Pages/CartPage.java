package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends PageBase {


    public CartPage(WebDriver driver) {
        super(driver);
    }


    By AddQuantityButton = By.className("icon-plus");
    WebElement addQuantityButtonElement;

    By proceedToButton = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]");
    WebElement proceedToButtonElement;

    public void clickOnAddQuantityButton() {
        addQuantityButtonElement = driver.findElement(AddQuantityButton);
        PageBase.Clicking(addQuantityButtonElement);
    }
    public void clickOnProceedToButton() {
        proceedToButtonElement = driver.findElement(proceedToButton);
        PageBase.Clicking(proceedToButtonElement);
    }

}
