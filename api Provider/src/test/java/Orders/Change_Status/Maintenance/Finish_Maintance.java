package Orders.Change_Status.Maintenance;

import Auth.Login_Main;
import Orders.Change_Status.Maintenance.Finish_Maintance_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Finish_Maintance {
    private RestActions apiobject;
    private Login_Main login_main;
    private Finish_Maintance_Main finish_Maintance_Main;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        finish_Maintance_Main = new Finish_Maintance_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);
    }
    @Test
    @Description("Validate on message with Body 'status equal 70' ")
    public void Success_Finish_Maintance_Validate_on_message_Body_70(){
        Response Finish_Maintance_Respone = finish_Maintance_Main.Success_Finish_Maintance_Main(70);
        Validations.assertThat().response(Finish_Maintance_Respone)
                .extractedJsonValue("message")
                .contains("You Are Not Allowed To Change This Order Status")
                .perform();
    }
    @Test
    @Description("Validate on message with Body 'status equal 5' ")
    public void Success_Finish_Maintance_Validate_on_message_Body_5(){
        Response Finish_Maintance_Respone = finish_Maintance_Main.Success_Finish_Maintance_Main(5);
        Validations.assertThat().response(Finish_Maintance_Respone)
                .extractedJsonValue("message")
                .contains("Failed Change Order Status")
                .perform();
    }
    @Test
    @Description("Validate on status code")
    public void Success_Finish_Maintance_Validate_on_status_code(){
        Response Finish_Maintance_Respone = finish_Maintance_Main.Success_Finish_Maintance_Main(70);
        Validations.assertThat().response(Finish_Maintance_Respone)
                .extractedJsonValue("status_code")
                .contains("501")
                .perform();
    }
    @Test
    @Description("Validate on errors")
    public void Success_Finish_Maintance_Validate_on_errors(){
        Response Finish_Maintance_Respone = finish_Maintance_Main.Success_Finish_Maintance_Main(70);
        Validations.assertThat().response(Finish_Maintance_Respone)
                .extractedJsonValue("errors[0]")
                .contains("err_order_status_provider_not_allowed")
                .perform();
    }
}
