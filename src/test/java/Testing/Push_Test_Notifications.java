package Testing;

import Auth.main_Class;
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
    private main_Class maain_Class;


    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(main_Class.BASE_URL);
        maain_Class = new main_Class(apiobject);
        push_Test_Notifications_Main = new Push_Test_Notifications_Main(apiobject);
        maain_Class.login("966506425181" , "123456");
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
    @Test
    @Description("check Push Test Notifications")
    public void Push_Test_Notifications_Failed(){
        Response Push_Test_Notifications_Response = push_Test_Notifications_Main.Push_Test_Notifications_Failed("3");

        Validations.assertThat().response(Push_Test_Notifications_Response).extractedJsonValue("message")
                .contains("Call to a member function first() on null")
                .perform();
    }
}
