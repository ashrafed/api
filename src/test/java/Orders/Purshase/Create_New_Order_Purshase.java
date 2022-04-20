package Orders.Purshase;

import Auth.main_Class;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Create_New_Order_Purshase {
    private RestActions apiobject;
    private main_Class maain_class;
    private Create_New_Order_Purshase_Main create_New_Order_Purshase_Main;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(main_Class.BASE_URL);
        maain_class = new main_Class(apiobject);
        create_New_Order_Purshase_Main = new Create_New_Order_Purshase_Main(apiobject);
        maain_class.login("966506425181" , "123456");
    }
    @Test
    @Description("Validate on message")
    public void Success_create_New_Order_Purshase_Validate_on_message(){
        Response Create_New_Order_Purshase_Respone = create_New_Order_Purshase_Main.Success_Create_New_Order_Purshase_Main();
        Validations.assertThat().response(Create_New_Order_Purshase_Respone)
                .extractedJsonValue("message")
                .contains("provider did not accept invitation for this order")
                .perform();
    }
    @Test
    @Description("Validate on status code")
    public void Success_create_New_Order_Purshase_Validate_on_status_code(){
        Response Create_New_Order_Purshase_Respone = create_New_Order_Purshase_Main.Success_Create_New_Order_Purshase_Main();
        Validations.assertThat().response(Create_New_Order_Purshase_Respone)
                .extractedJsonValue("status_code")
                .contains("406")
                .perform();
    }
}
