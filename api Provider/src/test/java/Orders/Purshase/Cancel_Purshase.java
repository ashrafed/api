package Orders.Purshase;

import Auth.Login_Main;
import Orders.Purshase.Cancel_Purshase_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Cancel_Purshase {
    private RestActions apiobject;
    private Login_Main login_main;
    private Cancel_Purshase_Main cancel_Purshase_Main;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        cancel_Purshase_Main = new Cancel_Purshase_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);
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
