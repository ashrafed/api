package Orders.Purshase;

import Auth.main_Class;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Cancel_Purshase {
    private RestActions apiobject;
    private main_Class maain_class;
    private Cancel_Purshase_Main cancel_Purshase_Main;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(main_Class.BASE_URL);
        maain_class = new main_Class(apiobject);
        cancel_Purshase_Main = new Cancel_Purshase_Main(apiobject);
        maain_class.login("966506425181" , "123456");
    }
    @Test
    @Description("Validate on message")
    public void Success_Get_List_Order_Purshases_Validate_on_message(){
        Response Cancel_Purshase_Respone = cancel_Purshase_Main.Success_Cancel_Purshase_Main("test reason");
        Validations.assertThat().response(Cancel_Purshase_Respone)
                .extractedJsonValue("message")
                .contains("Order Not Found")
                .perform();
    }
    @Test
    @Description("Validate on status code")
    public void Success_Get_List_Order_Purshases_Validate_on_status_code() {
        Response Cancel_Purshase_Respone = cancel_Purshase_Main.Success_Cancel_Purshase_Main("test reason");
        Validations.assertThat().response(Cancel_Purshase_Respone)
                .extractedJsonValue("status_code")
                .contains("404")
                .perform();
    }
    @Test
    @Description("Validate on status code")
    public void Success_Get_List_Order_Purshases_Validate_on_success() {
        Response Cancel_Purshase_Respone = cancel_Purshase_Main.Success_Cancel_Purshase_Main("test reason");
        Validations.assertThat().response(Cancel_Purshase_Respone)
                .extractedJsonValue("success")
                .contains("false")
                .perform();
    }
}
