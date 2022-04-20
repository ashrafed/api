package Testing;

import Auth.main_Class;
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
    private main_Class maain_Class;


    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(main_Class.BASE_URL);
        maain_Class = new main_Class(apiobject);
        sent_SMS_Main = new Sent_SMS_Main(apiobject);
        maain_Class.login("966506425181" , "123456");
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
