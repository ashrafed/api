package Orders.Change_Status.Receive_Car;

import Auth.Login_Main;
import Orders.Change_Status.Receive_Car.Recive_From_Carrier_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Recive_From_Carrier {
    private RestActions apiobject ;
    private Recive_From_Carrier_Main recive_From_Carrier_Main;
    private Login_Main login_main;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        recive_From_Carrier_Main = new Recive_From_Carrier_Main(apiobject);
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
    @Test
    @Description(" validate on errors with status = 30 ")
    public void Recive_From_Carrier_validate_on_errors_with_status_equal_30(){
        Response Recive_From_Carrier_Response = recive_From_Carrier_Main
                .Success_Recive_From_Carrier("30");
        Validations.assertThat().response(Recive_From_Carrier_Response).
                extractedJsonValue("errors[0]")
                .contains("err_order_status_provider_not_allowed")
                .perform();
    }
    @Test
    @Description(" validate on errors with status = 30 ")
    public void Recive_From_Carrier_validate_on_status_code(){
        Response Recive_From_Carrier_Response = recive_From_Carrier_Main
                .Success_Recive_From_Carrier("30");
        Validations.assertThat().response(Recive_From_Carrier_Response).
                extractedJsonValue("status_code")
                .contains("501")
                .perform();
    }
}
