package Orders.Change_Status.Deliver_Car;

import Auth.Login_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Carrier_Deliver_to_Customer {
    private RestActions apiobject;
    private Login_Main login_main;
    private Carrier_Deliver_to_Customer_Main carrier_Deliver_to_Customer_Main;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        carrier_Deliver_to_Customer_Main = new Carrier_Deliver_to_Customer_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);
    }
    @Test
    @Description("Validate on message")
    public void Success_Carrier_Deliver_to_Customer_vaildate_0n_message(){
        Response Success_Carrier_Deliver_to_Customer_Main_Response = carrier_Deliver_to_Customer_Main.Success_Carrier_Deliver_to_Customer_Main("120");
        Validations.assertThat().response(Success_Carrier_Deliver_to_Customer_Main_Response)
                .extractedJsonValue("message")
                .contains("You Are Not Allowed To Change This Order Status")
                .perform();
    }
    @Test
    @Description("Validate on errors")
    public void Success_Carrier_Deliver_to_Customer_vaildate_0n_errors(){
        Response Success_Carrier_Deliver_to_Customer_Main_Response = carrier_Deliver_to_Customer_Main.Success_Carrier_Deliver_to_Customer_Main("120");
        Validations.assertThat().response(Success_Carrier_Deliver_to_Customer_Main_Response)
                .extractedJsonValue("errors[0]")
                .contains("err_order_status_provider_not_allowed")
                .perform();
    }
    @Test
    @Description("Validate on status code")
    public void Success_Carrier_Deliver_to_Customer_vaildate_0n_status_code(){
        Response Success_Carrier_Deliver_to_Customer_Main_Response = carrier_Deliver_to_Customer_Main.Success_Carrier_Deliver_to_Customer_Main("120");
        Validations.assertThat().response(Success_Carrier_Deliver_to_Customer_Main_Response)
                .extractedJsonValue("status_code")
                .contains("501")
                .perform();
    }
    @Test
    @Description("Validate on message")
    public void failed_Carrier_Deliver_to_Customer_vaildate_0n_message(){
        Response Success_Carrier_Deliver_to_Customer_Main_Response = carrier_Deliver_to_Customer_Main.Failed_Carrier_Deliver_to_Customer_Main("120");
        Validations.assertThat().response(Success_Carrier_Deliver_to_Customer_Main_Response)
                .extractedJsonValue("message")
                .contains("You Are Not Allowed To Change This Order Status")
                .perform();
    }
    @Test
    @Description("Validate on errors")
    public void failed_Carrier_Deliver_to_Customer_vaildate_0n_errors(){
        Response Success_Carrier_Deliver_to_Customer_Main_Response = carrier_Deliver_to_Customer_Main.Failed_Carrier_Deliver_to_Customer_Main("120");
        Validations.assertThat().response(Success_Carrier_Deliver_to_Customer_Main_Response)
                .extractedJsonValue("errors[0]")
                .contains("err_order_status_provider_not_allowed")
                .perform();
    }
    @Test
    @Description("Validate on status code")
    public void failed_Carrier_Deliver_to_Customer_vaildate_0n_status_code(){
        Response Success_Carrier_Deliver_to_Customer_Main_Response = carrier_Deliver_to_Customer_Main.Failed_Carrier_Deliver_to_Customer_Main("120");
        Validations.assertThat().response(Success_Carrier_Deliver_to_Customer_Main_Response)
                .extractedJsonValue("status_code")
                .contains("501")
                .perform();
    }
}
