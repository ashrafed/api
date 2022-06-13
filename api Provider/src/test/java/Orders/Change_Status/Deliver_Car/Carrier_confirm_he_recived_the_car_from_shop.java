package Orders.Change_Status.Deliver_Car;

import Auth.Login_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Carrier_confirm_he_recived_the_car_from_shop {
    private RestActions apiobject;
    private Login_Main login_main;
    private Carrier_confirm_he_recived_the_car_from_shop_Main carrier_confirm_he_recived_the_car_from_shop_Main;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        carrier_confirm_he_recived_the_car_from_shop_Main = new Carrier_confirm_he_recived_the_car_from_shop_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);
    }
    @Test
    @Description("Validate on message")
    public void Success_Carrier_confirm_he_recived_the_car_from_shop_vaildate_0n_message(){
        Response Carrier_confirm_he_recived_the_car_from_shop_Response = carrier_confirm_he_recived_the_car_from_shop_Main.Success_Carrier_confirm_he_recived_the_car_from_shop_Main("110","9531");
        Validations.assertThat().response(Carrier_confirm_he_recived_the_car_from_shop_Response)
                .extractedJsonValue("message")
                .contains("You Are Not Allowed To Change This Order Status")
                .perform();
    }
    @Test
    @Description("Validate on errors")
    public void Success_Carrier_confirm_he_recived_the_car_from_shop_vaildate_0n_errors(){
        Response Carrier_confirm_he_recived_the_car_from_shop_Response = carrier_confirm_he_recived_the_car_from_shop_Main.Success_Carrier_confirm_he_recived_the_car_from_shop_Main("110","9531");
        Validations.assertThat().response(Carrier_confirm_he_recived_the_car_from_shop_Response)
                .extractedJsonValue("errors[0]")
                .contains("err_order_status_provider_not_allowed")
                .perform();
    }
    @Test
    @Description("Validate on status code")
    public void Success_Carrier_confirm_he_recived_the_car_from_shop_vaildate_0n_status_code(){
        Response Carrier_confirm_he_recived_the_car_from_shop_Response = carrier_confirm_he_recived_the_car_from_shop_Main.Success_Carrier_confirm_he_recived_the_car_from_shop_Main("110","9531");
        Validations.assertThat().response(Carrier_confirm_he_recived_the_car_from_shop_Response)
                .extractedJsonValue("status_code")
                .contains("501")
                .perform();
    }
    @Test
    @Description("Validate on status")
    public void Success_Carrier_confirm_he_recived_the_car_from_shop_vaildate_0n_message_when_status_notfound(){
        Response Carrier_confirm_he_recived_the_car_from_shop_Response = carrier_confirm_he_recived_the_car_from_shop_Main.Success_Carrier_confirm_he_recived_the_car_from_shop_Main("","9531");
        Validations.assertThat().response(Carrier_confirm_he_recived_the_car_from_shop_Response)
                .extractedJsonValue("message")
                .contains("Failed Change Order Status")
                .perform();
    }
    @Test
    @Description("Validate on message when otp is not fond")
    public void Success_Carrier_confirm_he_recived_the_car_from_shop_vaildate_0n_message_when_otp_notfound(){
        Response Carrier_confirm_he_recived_the_car_from_shop_Response = carrier_confirm_he_recived_the_car_from_shop_Main.Success_Carrier_confirm_he_recived_the_car_from_shop_Main("110","");
        Validations.assertThat().response(Carrier_confirm_he_recived_the_car_from_shop_Response)
                .extractedJsonValue("message")
                .contains("You Are Not Allowed To Change This Order Status")
                .perform();
    }
    @Test
    @Description("Validate on message")
    public void Failed_Carrier_confirm_he_recived_the_car_from_shop_vaildate_0n_message(){
        Response Carrier_confirm_he_recived_the_car_from_shop_Response = carrier_confirm_he_recived_the_car_from_shop_Main.Failed_Carrier_confirm_he_recived_the_car_from_shop_Main("110","8679");
        Validations.assertThat().response(Carrier_confirm_he_recived_the_car_from_shop_Response)
                .extractedJsonValue("message")
                .contains("You Are Not Allowed To Change This Order Status")
                .perform();
    }
    @Test
    @Description("Validate on errors")
    public void Failed_Carrier_confirm_he_recived_the_car_from_shop_vaildate_0n_errors(){
        Response Carrier_confirm_he_recived_the_car_from_shop_Response = carrier_confirm_he_recived_the_car_from_shop_Main.Failed_Carrier_confirm_he_recived_the_car_from_shop_Main("110","8679");
        Validations.assertThat().response(Carrier_confirm_he_recived_the_car_from_shop_Response)
                .extractedJsonValue("errors[0]")
                .contains("err_order_status_provider_not_allowed")
                .perform();
    }
}
