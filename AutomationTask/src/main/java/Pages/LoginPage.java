package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageBase {
    public LoginPage(WebDriver driver) {

        super(driver);
    }

    By emailAddress = By.id("email");
    WebElement emailAddressElement;
    By passWord = By.id("passwd");
    WebElement passwordElement;
    By signInButton = By.id("SubmitLogin");
    WebElement signInButtonElement;

    public void enterEmail(String email) {
        emailAddressElement = driver.findElement(emailAddress);
        PageBase.sendText(emailAddressElement, email);
    }

    public void enterPassword(String password) {
        passwordElement = driver.findElement(passWord);
        PageBase.sendText(passwordElement, password);
    }

    public void clickingOnSignInButton() {
        signInButtonElement = driver.findElement(signInButton);
        PageBase.Clicking(signInButtonElement);
    }
}
