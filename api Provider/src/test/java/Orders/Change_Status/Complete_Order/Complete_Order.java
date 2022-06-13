package Orders.Change_Status.Complete_Order;

import Auth.Login_Main;
import Orders.Change_Status.Complete_Order.Complete_Order_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Complete_Order {
    private RestActions apiobject;
    private Login_Main login_main;
    private Complete_Order_Main complete_Order_Main;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        complete_Order_Main = new Complete_Order_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);
    }
    @Test
    @Description("Validate on message Body = 'status:90 , otp:9531' ")
    public void Success_Complete_Order_Validate_on_message(){
        Response Complete_Order_Respone = complete_Order_Main.Success_Complete_Order_Main("90","9531");
        Validations.assertThat().response(Complete_Order_Respone)
                .extractedJsonValue("message")
                .contains("You Are Not Allowed To Change This Order Status")
                .perform();
    }
    @Test
    @Description("Validate on message Body = 'status:90 , otp:9531' ")
    public void Success_Complete_Order_Validate_on_errors(){
        Response Complete_Order_Respone = complete_Order_Main.Success_Complete_Order_Main("90","9531");
        Validations.assertThat().response(Complete_Order_Respone)
                .extractedJsonValue("errors")
                .contains("err_order_status_provider_not_allowed")
                .perform();
    }
    @Test
    @Description("Validate on message Body = 'status:80' ")
    public void Success_Complete_Order_Validate_on_otp_errors(){
        Response Complete_Order_Respone = complete_Order_Main.Success_Complete_Order_Main("80","");
        Validations.assertThat().response(Complete_Order_Respone)
                .extractedJsonValue("errors")
                .contains("[err_order_status_provider_not_allowed]")
                .perform();
    }
    @Test
    @Description("Validate on message Body = 'status:80' ")
    public void Success_Complete_Order_Validate_on_otp_message(){
        Response Complete_Order_Respone = complete_Order_Main.Success_Complete_Order_Main("80","");
        Validations.assertThat().response(Complete_Order_Respone)
                .extractedJsonValue("message")
                .contains("You Are Not Allowed To Change This Order Status")
                .perform();
    }
}
