package Orders.Change_Status.Deliver_Car;

import Auth.Login_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Shop_Deliver_to_Carrier {
    private RestActions apiobject;
    private Login_Main login_main;
    private Shop_Deliver_to_Carrier_Main shop_Deliver_to_Carrier_Main;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        shop_Deliver_to_Carrier_Main = new Shop_Deliver_to_Carrier_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);
    }
    @Test
    @Description("Validate on message")
    public void Success_Shop_Deliver_to_Carrier_Main_vaildate_0n_message(){
        Response Shop_Deliver_to_Carrier_Response = shop_Deliver_to_Carrier_Main.Success_Shop_Deliver_to_Carrier_Main("100");
        Validations.assertThat().response(Shop_Deliver_to_Carrier_Response)
                .extractedJsonValue("message")
                .contains("You Are Not Allowed To Change This Order Status")
                .perform();
    }
    @Test
    @Description("Validate on errors")
    public void Success_Shop_Deliver_to_Carrier_Main_vaildate_0n_errors(){
        Response Shop_Deliver_to_Carrier_Response = shop_Deliver_to_Carrier_Main.Success_Shop_Deliver_to_Carrier_Main("100");
        Validations.assertThat().response(Shop_Deliver_to_Carrier_Response)
                .extractedJsonValue("errors[0]")
                .contains("err_order_status_provider_not_allowed")
                .perform();
    }
    @Test
    @Description("Validate on status code")
    public void Success_Shop_Deliver_to_Carrier_Main_vaildate_0n_status_code(){
        Response Shop_Deliver_to_Carrier_Response = shop_Deliver_to_Carrier_Main.Success_Shop_Deliver_to_Carrier_Main("100");
        Validations.assertThat().response(Shop_Deliver_to_Carrier_Response)
                .extractedJsonValue("status_code")
                .contains("501")
                .perform();
    }
    @Test
    @Description("Validate on message")
    public void Failed_Shop_Deliver_to_Carrier_Main_vaildate_0n_message(){
        Response Shop_Deliver_to_Carrier_Response = shop_Deliver_to_Carrier_Main.Success_Shop_Deliver_to_Carrier_Main("100");
        Validations.assertThat().response(Shop_Deliver_to_Carrier_Response)
                .extractedJsonValue("message")
                .contains("You Are Not Allowed To Change This Order Status")
                .perform();
    }
    @Test
    @Description("Validate on errors")
    public void Failed_Shop_Deliver_to_Carrier_Main_vaildate_0n_errors(){
        Response Shop_Deliver_to_Carrier_Response = shop_Deliver_to_Carrier_Main.Success_Shop_Deliver_to_Carrier_Main("100");
        Validations.assertThat().response(Shop_Deliver_to_Carrier_Response)
                .extractedJsonValue("errors[0]")
                .contains("err_order_status_provider_not_allowed")
                .perform();
    }
    @Test
    @Description("Validate on status code")
    public void Failed_Shop_Deliver_to_Carrier_Main_vaildate_0n_status_code(){
        Response Shop_Deliver_to_Carrier_Response = shop_Deliver_to_Carrier_Main.Success_Shop_Deliver_to_Carrier_Main("100");
        Validations.assertThat().response(Shop_Deliver_to_Carrier_Response)
                .extractedJsonValue("status_code")
                .contains("501")
                .perform();
    }


}
