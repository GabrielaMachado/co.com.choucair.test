package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;



@DefaultUrl("https://www.utest.com")
public class UTestPage extends PageObject {

    public static final Target JOIN_BUTTON = Target.the("button that show us the form to login")
            .located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));

    public static final Target FIRSTNAME_INPUT = Target.the("where do we write the firstname")
            .located(By.id("firstName"));

    public static final Target LASTNAME_INPUT = Target.the("where do we write the lastname")
            .located(By.id("lastName"));

    public static final Target EMAIL_INPUT = Target.the("where do we write the email")
            .located(By.id("email"));

    public static final Target MONTH_SELECT = Target.the("where do we select the month")
            .located(By.id("birthMonth"));

    public static final Target DAY_SELECT = Target.the("where do we select the day")
            .located(By.id("birthDay"));

    public static final Target YEAR_SELECT = Target.the("where do we select the year")
            .located(By.id("birthYear"));

    public static final Target LOCATION_BUTTON = Target.the("button that show us the form to location")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));

   /* public static final Target CITY_INPUT = Target.the("where do we write the city")
            .located(By.id("city")); */

    public static final Target ZIP_INPUT = Target.the("where do we write the zip")
            .located(By.id("zip"));

    /*public static final Target COUNTRY_SELECT = Target.the("where do we select the country")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]"));*/

    public static final Target DEVICES_BUTTON = Target.the("button that show us the form to devices")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));

  /*  public static final Target BRAND_SELECT = Target.the("where do we select the mobile device")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]"));

    public static final Target MODEL_SELECT = Target.the("where do we select the model")
            .located(By.id("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span"));

    public static final Target OS_SELECT = Target.the("where do we select the operating system")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span")); */

    public static final Target LASTSTEP_BUTTON = Target.the("button that show us the last step")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));

    public static final Target PASSWORD_INPUT = Target.the("where do we write the password")
            .located(By.id("password"));

    public static final Target CONFIRM_INPUT = Target.the("where do we write the password to confirm")
            .located(By.id("confirmPassword"));

    public static final Target CHECKTERMS_BUTTON = Target.the("button that check terms of use")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target CHECKPRIVACY_BUTTON = Target.the("button that check privacy")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target COMPLETE_BUTTON = Target.the("button that complete setup")
            .located(By.xpath("//*[@id=\"laddaBtn\"]"));

}
