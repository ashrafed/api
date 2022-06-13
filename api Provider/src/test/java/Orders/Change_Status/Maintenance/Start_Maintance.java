package Orders.Change_Status.Maintenance;

import Auth.Login_Main;
import Orders.Change_Status.Maintenance.Start_Maintance_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Start_Maintance {
    private RestActions apiobject;
    private Login_Main login_main;
    private Start_Maintance_Main start_Maintance_Main;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        start_Maintance_Main = new Start_Maintance_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);
    }
    @Test
    @Description("Validate on message with Body 'status equal 50' ")
    public void Success_Get_List_Order_Purshases_Validate_on_message_Body_equal_50(){
        Response start_Maintance_Respone = start_Maintance_Main.Success_Start_Maintance_Main(50);
        Validations.assertThat().response(start_Maintance_Respone)
                .extractedJsonValue("message")
                .contains("You Are Not Allowed To Change This Order Status")
                .perform();
    }
    @Test
    @Description("Validate on status code")
    public void Success_Get_List_Order_Purshases_Validate_on_status_code(){
        Response start_Maintance_Respone = start_Maintance_Main.Success_Start_Maintance_Main(50);
        Validations.assertThat().response(start_Maintance_Respone)
                .extractedJsonValue("status_code")
                .contains("501")
                .perform();
    }
    @Test
    @Description("Validate on errors")
    public void Success_Get_List_Order_Purshases_Validate_on_errors(){
        Response start_Maintance_Respone = start_Maintance_Main.Success_Start_Maintance_Main(50);
        Validations.assertThat().response(start_Maintance_Respone)
                .extractedJsonValue("errors[0]")
                .contains("err_order_status_provider_not_allowed")
                .perform();
    }
}
