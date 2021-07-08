package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.UTestPage;

public class Login implements Task {

    private String firstName, lastName, email, month, day, year, zip, password;

    public static  Login onThePage(String firstName, String lastName, String email, String month, String day,
                                   String year, String zip, String password) {
        return Tasks.instrumented(Login.class, firstName, lastName, email, month, day, year, zip, password);
    }

    public Login(String firstName, String lastName, String email, String month, String day, String year, String zip, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.month = month;
        this.day = day;
        this.year = year;
        this.zip = zip;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestPage.JOIN_BUTTON),
                Enter.theValue(firstName).into(UTestPage.FIRSTNAME_INPUT),
                Enter.theValue(lastName).into(UTestPage.LASTNAME_INPUT),
                Enter.theValue(email).into(UTestPage.EMAIL_INPUT),
                SelectFromOptions.byVisibleText(month).from(UTestPage.MONTH_SELECT),
                SelectFromOptions.byVisibleText(day).from(UTestPage.DAY_SELECT),
                SelectFromOptions.byVisibleText(year).from(UTestPage.YEAR_SELECT),
                Click.on(UTestPage.LOCATION_BUTTON),
                Enter.theValue(zip).into(UTestPage.ZIP_INPUT),
                Click.on(UTestPage.DEVICES_BUTTON),
                Click.on(UTestPage.LASTSTEP_BUTTON),
                Enter.theValue(password).into(UTestPage.PASSWORD_INPUT),
                Enter.theValue(password).into(UTestPage.CONFIRM_INPUT),
                Click.on(UTestPage.CHECKTERMS_BUTTON),
                Click.on(UTestPage.CHECKPRIVACY_BUTTON),
                Click.on(UTestPage.COMPLETE_BUTTON));
    }
}
