package Orders.Change_Status.Deliver_Car;

import Auth.Login_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier {
    private RestActions apiobject;
    private Login_Main login_main;
    private Car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_Main car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_Main;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_Main = new Car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);
    }
    @Test
    @Description("Validate on message")
    public void Success_Car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_vaildate_0n_message(){
        Response Success_Car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_Response = car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_Main.Success_Car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_Main("100");
        Validations.assertThat().response(Success_Car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_Response)
                .extractedJsonValue("message")
                .contains("You Are Not Allowed To Change This Order Status")
                .perform();
    }
    @Test
    @Description("Validate on errors")
    public void Success_Car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_vaildate_0n_errors(){
        Response Success_Car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_Response = car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_Main.Success_Car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_Main("100");
        Validations.assertThat().response(Success_Car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_Response)
                .extractedJsonValue("errors[0]")
                .contains("err_order_status_provider_not_allowed")
                .perform();
    }
    @Test
    @Description("Validate on status code")
    public void Success_Car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_vaildate_0n_status_code(){
        Response Success_Car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_Response = car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_Main.Success_Car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_Main("100");
        Validations.assertThat().response(Success_Car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_Response)
                .extractedJsonValue("status_code")
                .contains("501")
                .perform();
    }
    @Test
    @Description("Validate on message")
    public void Failed_Car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_vaildate_0n_message(){
        Response Success_Car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_Response = car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_Main.Success_Car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_Main("100");
        Validations.assertThat().response(Success_Car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_Response)
                .extractedJsonValue("message")
                .contains("You Are Not Allowed To Change This Order Status")
                .perform();
    }
    @Test
    @Description("Validate on errors")
    public void Failed_Car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_vaildate_0n_errors(){
        Response Success_Car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_Response = car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_Main.Success_Car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_Main("100");
        Validations.assertThat().response(Success_Car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_Response)
                .extractedJsonValue("errors[0]")
                .contains("err_order_status_provider_not_allowed")
                .perform();
    }
    @Test
    @Description("Validate on status_code")
    public void Failed_Car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_vaildate_0n_status_code(){
        Response Success_Car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_Response = car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_Main.Success_Car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_Main("100");
        Validations.assertThat().response(Success_Car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_Response)
                .extractedJsonValue("status_code")
                .contains("501")
                .perform();
    }



}
