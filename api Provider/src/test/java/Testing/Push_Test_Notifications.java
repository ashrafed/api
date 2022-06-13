package Testing;

import Auth.Login_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Push_Test_Notifications {
    private RestActions apiobject ;
    private Push_Test_Notifications_Main push_Test_Notifications_Main;
    private Login_Main login_main;


    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        push_Test_Notifications_Main = new Push_Test_Notifications_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);
    }
    @Test
    @Description("check Push Test Notifications")
    public void check_Push_Test_Notifications_Successfully_1(){
        Response Push_Test_Notifications_Response = push_Test_Notifications_Main.Push_Test_Notifications_Successfully(1);

        Validations.assertThat().response(Push_Test_Notifications_Response).extractedJsonValue("message")
                .contains("done sent notifications ")
                .perform();
    }
    @Test
    @Description("check Push Test Notifications")
    public void check_Push_Test_Notifications_Successfully_2(){
        Response Push_Test_Notifications_Response = push_Test_Notifications_Main.Push_Test_Notifications_Successfully(2);

        Validations.assertThat().response(Push_Test_Notifications_Response).extractedJsonValue("message")
                .contains("done sent notifications ")
                .perform();
    }
}
