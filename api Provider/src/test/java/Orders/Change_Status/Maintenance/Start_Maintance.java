package Orders.Change_Status.Maintenance;

import Auth.main_Class;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Start_Maintance {
    private RestActions apiobject;
    private main_Class maain_class;
    private Start_Maintance_Main start_Maintance_Main;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(main_Class.BASE_URL);
        maain_class = new main_Class(apiobject);
        start_Maintance_Main = new Start_Maintance_Main(apiobject);
        maain_class.login("966506425181" , "123456");
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
