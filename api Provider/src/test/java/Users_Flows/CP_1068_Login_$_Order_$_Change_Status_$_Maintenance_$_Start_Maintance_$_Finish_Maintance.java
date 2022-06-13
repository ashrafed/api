package Users_Flows;

import Auth.Login_Main;
import Orders.Change_Status.Maintenance.Finish_Maintance_Main;
import Orders.Change_Status.Maintenance.Start_Maintance_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CP_1068_Login_$_Order_$_Change_Status_$_Maintenance_$_Start_Maintance_$_Finish_Maintance {
    private RestActions apiobject ;
    private Login_Main login_main ;
    private Start_Maintance_Main start_maintance_main;
    private Finish_Maintance_Main finish_maintance_main;

    @BeforeClass
    public void beforeclass() {
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        start_maintance_main = new Start_Maintance_Main(apiobject);
        finish_maintance_main = new Finish_Maintance_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);
    }
    @Test
    @Description("Validate on message with Body 'status equal 50' ")
    public void Success_Get_List_Order_Purshases_Validate_on_message_Body_equal_50(){
        Response start_Maintance_Respone = start_maintance_main.Success_Start_Maintance_Main(50);
        Validations.assertThat().response(start_Maintance_Respone)
                .extractedJsonValue("message")
                .contains("You Are Not Allowed To Change This Order Status")
                .perform();
    }
    @Test (dependsOnMethods = {"Success_Get_List_Order_Purshases_Validate_on_message_Body_equal_50"})
    @Description("Validate on message with Body 'status equal 70' ")
    public void Success_Finish_Maintance_Validate_on_message_Body_70(){
        Response Finish_Maintance_Respone = finish_maintance_main.Success_Finish_Maintance_Main(70);
        Validations.assertThat().response(Finish_Maintance_Respone)
                .extractedJsonValue("message")
                .contains("You Are Not Allowed To Change This Order Status")
                .perform();
    }
}
