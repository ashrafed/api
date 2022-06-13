package Orders.Change_Status.Deliver_Car;

import Auth.Login_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Resend_Complete_Order_Confirmation_code_to_Customer {
    private RestActions apiobject;
    private Login_Main login_main;
    private Resend_Complete_Order_Confirmation_code_to_Customer_Main resend_Complete_Order_Confirmation_code_to_Customer_Main;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        resend_Complete_Order_Confirmation_code_to_Customer_Main = new Resend_Complete_Order_Confirmation_code_to_Customer_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);
    }
    @Test
    @Description("Validate on message")
    public void Success_Resend_Complete_Order_Confirmation_code_to_Customer_Main_vaildate_0n_message(){
        Response Resend_Complete_Order_Confirmation_code_to_Customer_Response = resend_Complete_Order_Confirmation_code_to_Customer_Main.Success_Resend_Complete_Order_Confirmation_code_to_Customer_Main("80");
        Validations.assertThat().response(Resend_Complete_Order_Confirmation_code_to_Customer_Response)
                .extractedJsonValue("message")
                .contains("You Are Not Allowed To Change This Order Status")
                .perform();
    }
    @Test
    @Description("Validate on message")
    public void Success_Resend_Complete_Order_Confirmation_code_to_Customer_Main_vaildate_0n_errors(){
        Response Resend_Complete_Order_Confirmation_code_to_Customer_Response = resend_Complete_Order_Confirmation_code_to_Customer_Main.Success_Resend_Complete_Order_Confirmation_code_to_Customer_Main("80");
        Validations.assertThat().response(Resend_Complete_Order_Confirmation_code_to_Customer_Response)
                .extractedJsonValue("errors[0]")
                .contains("err_order_status_provider_not_allowed")
                .perform();
    }
    @Test
    @Description("Validate on message")
    public void Success_Resend_Complete_Order_Confirmation_code_to_Customer_Main_vaildate_0n_status_code(){
        Response Resend_Complete_Order_Confirmation_code_to_Customer_Response = resend_Complete_Order_Confirmation_code_to_Customer_Main.Success_Resend_Complete_Order_Confirmation_code_to_Customer_Main("80");
        Validations.assertThat().response(Resend_Complete_Order_Confirmation_code_to_Customer_Response)
                .extractedJsonValue("status_code")
                .contains("501")
                .perform();
    }
    @Test
    @Description("Validate on message")
    public void Failed_Resend_Complete_Order_Confirmation_code_to_Customer_Main_vaildate_0n_message(){
        Response Resend_Complete_Order_Confirmation_code_to_Customer_Response = resend_Complete_Order_Confirmation_code_to_Customer_Main.Failed_Resend_Complete_Order_Confirmation_code_to_Customer_Main("80");
        Validations.assertThat().response(Resend_Complete_Order_Confirmation_code_to_Customer_Response)
                .extractedJsonValue("message")
                .contains("You Are Not Allowed To Change This Order Status")
                .perform();
    }
    @Test
    @Description("Validate on message")
    public void Failed_Resend_Complete_Order_Confirmation_code_to_Customer_Main_vaildate_0n_errros(){
        Response Resend_Complete_Order_Confirmation_code_to_Customer_Response = resend_Complete_Order_Confirmation_code_to_Customer_Main.Failed_Resend_Complete_Order_Confirmation_code_to_Customer_Main("80");
        Validations.assertThat().response(Resend_Complete_Order_Confirmation_code_to_Customer_Response)
                .extractedJsonValue("errors[0]")
                .contains("err_order_status_provider_not_allowed")
                .perform();
    }
    @Test
    @Description("Validate on message")
    public void Failed_Resend_Complete_Order_Confirmation_code_to_Customer_Main_vaildate_0n_status_code(){
        Response Resend_Complete_Order_Confirmation_code_to_Customer_Response = resend_Complete_Order_Confirmation_code_to_Customer_Main.Failed_Resend_Complete_Order_Confirmation_code_to_Customer_Main("80");
        Validations.assertThat().response(Resend_Complete_Order_Confirmation_code_to_Customer_Response)
                .extractedJsonValue("status_code")
                .contains("501")
                .perform();
    }


}
