package pages;

import abstractPackage.BasePageClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

// minor comment
//"sun.*" packages should not be used
// I see that it works but you'd better use standard Log4g2, SLF4G, or at least standard from java.util
import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

public class LoginPage extends MainPage {

    private static final By EMAIL_FIELD = By.id("exampleInputEmail1");

    private static final By PASSWORD_FIELD = By.id("exampleInputPassword1");


    // please create utils or other package and create there static class for work with properties
    // because properties could potentially be called from different places, not from jusdt specific page
    private String getParamFromProperty(String propertyName) {
        FileInputStream fis;
        Properties properties = new Properties();
        String emailFromPropertyFile = "";
        try {
            fis = new FileInputStream("./src/test/java/resources/application.properties");
            properties.load(fis);
            emailFromPropertyFile = properties.getProperty(propertyName);
        } catch (FileNotFoundException e) {
            LOGGER.warning("Check out file's path");
        } catch (IOException e) {
            LOGGER.warning(e.getMessage());
        }
        return emailFromPropertyFile;
    }


    public LoginPage fillOutEmailField() {
        WebElement emailField = waitForExpectedElement(EMAIL_FIELD);
        emailField.sendKeys(getParamFromProperty("email"), Keys.ENTER);
        waitPageIsLoadedAndJQueryIsProcessed();
        return this;
    }


    public PersonalAreaPage fillOutPasswordField() {
        WebElement passwordField = waitForExpectedElement(PASSWORD_FIELD);
        passwordField.sendKeys(getParamFromProperty("password"), Keys.ENTER);
        waitPageIsLoadedAndJQueryIsProcessed();
        return new PersonalAreaPage();
    }


    public boolean isLoginPageHeaderDisplayed() {
        return isElementDisplayed(By.xpath("//a[contains(text(), 'Вход')]"));
    }
}


