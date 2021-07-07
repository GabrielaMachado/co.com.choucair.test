package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.UTestPage;

public class Login implements Task {
    public static  Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestPage.JOIN_BUTTON),
                Enter.theValue("Gabriela").into(UTestPage.FIRSTNAME_INPUT),
                Enter.theValue("Machado").into(UTestPage.LASTNAME_INPUT),
                Enter.theValue("gabimachadop@hotmail.com").into(UTestPage.EMAIL_INPUT),
                SelectFromOptions.byVisibleText("September").from(UTestPage.MONTH_SELECT),
                SelectFromOptions.byVisibleText("19").from(UTestPage.DAY_SELECT),
                SelectFromOptions.byVisibleText("1999").from(UTestPage.YEAR_SELECT),
                Click.on(UTestPage.LOCATION_BUTTON),
                Enter.theValue("6300002").into(UTestPage.ZIP_INPUT),
                Click.on(UTestPage.DEVICES_BUTTON),
                Click.on(UTestPage.LASTSTEP_BUTTON),
                Enter.theValue("Gabriela199Machado").into(UTestPage.PASSWORD_INPUT),
                Enter.theValue("Gabriela199Machado").into(UTestPage.CONFIRM_INPUT),
                Click.on(UTestPage.CHECKTERMS_BUTTON),
                Click.on(UTestPage.CHECKPRIVACY_BUTTON),
                Click.on(UTestPage.COMPLETE_BUTTON));
    }
}
