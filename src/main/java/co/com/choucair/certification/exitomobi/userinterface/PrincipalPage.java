package co.com.choucair.certification.exitomobi.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class PrincipalPage {
    public static final Target ENTER_EXITO = Target.the("button app exito")
            .located(By.xpath("//android.widget.TextView[@content-desc=\"Exito\"]"));
}
