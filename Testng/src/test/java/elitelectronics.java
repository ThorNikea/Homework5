import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class elitelectronics extends ChromeRunner {
    @Test
    public void Test1(){
        $(".btn-register").click();
        $(byText("სწრაფი რეგისტრაცია"));
        $("#firstName").setValue("Tornike").shouldNotBe(Condition.empty);
        $("#lastName").setValue("Gogia").shouldNotBe(Condition.empty);
        $("#email").setValue("tornike.gogia1996@gmail.com").shouldNotBe(Condition.empty);
        $("#password").setValue("Testing").shouldNotBe(Condition.empty);
        $("#confirmPassword").setValue("Testing").shouldNotBe(Condition.empty);
        $("#singup").shouldBe(Condition.enabled);
    }
}
