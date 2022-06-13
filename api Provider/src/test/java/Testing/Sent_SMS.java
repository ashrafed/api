package Testing;

import Auth.Login_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sent_SMS {
    private RestActions apiobject ;
    private Sent_SMS_Main sent_SMS_Main;
    private Login_Main login_main;


    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        sent_SMS_Main = new Sent_SMS_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);
    }
    @Test
    @Description("check Sent SMS")
    public void check_Sent_SMS(){
        Response Sent_SMS_Main_Response = sent_SMS_Main.Sent_SMS_Successfully("966564004885" ,"Your Carefer verification code is 1568");

        Validations.assertThat().response(Sent_SMS_Main_Response).extractedJsonValue("message")
                .contains("check pipeline")
                .perform();
    }
}
