import data.Language;
import data.MicrosoftTestData;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.support.PageFactory;
import pages.MicrosoftPage;
import java.util.Arrays;
import java.util.Collection;
import java.util.ResourceBundle;

@RunWith(Parameterized.class)
public class MicrosoftPageTest extends MicrosoftTestData {

    @Parameterized.Parameters
    public static Collection options() {
        return Arrays.asList(Language.values());
    }

    public MicrosoftPageTest(Language lang) {
        resourceBundle = ResourceBundle.getBundle(lang.getLang());
        if(!driver.getCurrentUrl().contains("https://www.microsoft.com/" + resourceBundle.getString("language"))) {
            driver.get("https://www.microsoft.com/" + resourceBundle.getString("language"));
            microsoftPage = PageFactory.initElements(driver, MicrosoftPage.class);
        }
    }

    @Test
    public void testItem1() {

        Assert.assertEquals(resourceBundle.getString("item1"), microsoftPage.getItem1Text());
    }
    @Test
    public void testItem2() {
        Assert.assertEquals(resourceBundle.getString("item2"), microsoftPage.getItem2Text());
    }
}
