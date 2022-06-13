package Users_Flows;

import Auth.Login_Main;
import Orders.Change_Status.Receive_Car.Confirm_Recive_From_Carrier_Main;
import Orders.Change_Status.Receive_Car.Confirm_Recived_From_Customer_Main;
import Orders.Change_Status.Receive_Car.Recive_From_Carrier_Main;
import Orders.Change_Status.Receive_Car.Recived_From_Customer_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CP_1066_Login_$_Order_$_Change_Status_$_Receive_Car_$_Recive_From_Carrier_$_Confirm_Recived {
    private RestActions apiobject ;
    private Login_Main login_main ;
    private Recive_From_Carrier_Main recive_From_Carrier_Main;
    private Confirm_Recive_From_Carrier_Main confirm_recived_from_customer_main;

    @BeforeClass
    public void beforeclass() {
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        recive_From_Carrier_Main = new Recive_From_Carrier_Main(apiobject);
        confirm_recived_from_customer_main = new Confirm_Recive_From_Carrier_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);
    }
    @Test
    @Description(" validate on message with status = 30 ")
    public void Recive_From_Carrier_validate_on_message_with_status_equal_30(){
        Response Recive_From_Carrier_Response = recive_From_Carrier_Main
                .Success_Recive_From_Carrier("30");
        Validations.assertThat().response(Recive_From_Carrier_Response).
                extractedJsonValue("message")
                .contains("You Are Not Allowed To Change This Order Status")
                .perform();
    }
    @Test (dependsOnMethods = {"Recive_From_Carrier_validate_on_message_with_status_equal_30"})
    @Description("validate on message with status = 32 and otp = 9531 ")
    public void Car_Carrier_Confirmed_Recive_Car_From_Customer_validate_on_message(){
        Response Confirm_Recive_From_Carrier_Main_Response = confirm_recived_from_customer_main
                .Success_Confirm_Recive_From_Carrier("32","9531");
        Validations.assertThat().response(Confirm_Recive_From_Carrier_Main_Response).
                extractedJsonValue("message")
                .contains("You Are Not Allowed To Change This Order Status")
                .perform();
    }
}
