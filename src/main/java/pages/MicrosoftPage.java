package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MicrosoftPage {

    @FindBy(xpath = "//button[contains(@class, 'c-button-logo')]")
    private WebElement item1;

    @FindBy(id = "search")
    private WebElement item2;

    public String getItem1Text() {
        return item1.getText();
    }

    public String getItem2Text() {
        return item2.getText();
    }
}
