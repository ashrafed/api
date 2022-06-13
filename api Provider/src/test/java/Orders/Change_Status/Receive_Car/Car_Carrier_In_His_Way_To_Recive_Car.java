package Orders.Change_Status.Receive_Car;

import Auth.Login_Main;
import Orders.Change_Status.Receive_Car.Car_Carrier_In_His_Way_To_Recive_Car_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Car_Carrier_In_His_Way_To_Recive_Car {
    private RestActions apiobject ;
    private Car_Carrier_In_His_Way_To_Recive_Car_Main car_Carrier_In_His_Way_To_Recive_Car_Main;
    private Login_Main login_main;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        car_Carrier_In_His_Way_To_Recive_Car_Main = new Car_Carrier_In_His_Way_To_Recive_Car_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);

    }
    @Test
    @Description(" validate on message with status = 30 ")
    public void Car_Carrier_In_His_Way_To_Recive_Car_validate_on_message_with_status_equal_31(){
        Response Car_Carrier_In_His_Way_To_Recive_Car_Main_Response = car_Carrier_In_His_Way_To_Recive_Car_Main
                .Success_Car_Carrier_In_His_Way_To_Recive_Car("31");
        Validations.assertThat().response(Car_Carrier_In_His_Way_To_Recive_Car_Main_Response).
                extractedJsonValue("message")
                .contains("You Are Not Allowed To Change This Order Status")
                .perform();
    }
    @Test
    @Description(" validate on message with status = 30 ")
    public void Car_Carrier_In_His_Way_To_Recive_Car_validate_on_errors_with_status_equal_31(){
        Response Car_Carrier_In_His_Way_To_Recive_Car_Main_Response = car_Carrier_In_His_Way_To_Recive_Car_Main
                .Success_Car_Carrier_In_His_Way_To_Recive_Car("31");
        Validations.assertThat().response(Car_Carrier_In_His_Way_To_Recive_Car_Main_Response).
                extractedJsonValue("errors[0]")
                .contains("err_order_status_provider_not_allowed")
                .perform();
    }
    @Test
    @Description(" validate on message with status = 30 ")
    public void Car_Carrier_In_His_Way_To_Recive_Car_validate_on_status_code(){
        Response Car_Carrier_In_His_Way_To_Recive_Car_Main_Response = car_Carrier_In_His_Way_To_Recive_Car_Main
                .Success_Car_Carrier_In_His_Way_To_Recive_Car("31");
        Validations.assertThat().response(Car_Carrier_In_His_Way_To_Recive_Car_Main_Response).
                extractedJsonValue("status_code")
                .contains("501")
                .perform();
    }
}
