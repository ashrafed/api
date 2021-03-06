package Orders.Change_Status.Receive_Car;

import Auth.Login_Main;
import Orders.Change_Status.Receive_Car.Car_Under_examination_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Car_Under_examination {
    private RestActions apiobject ;
    private Car_Under_examination_Main car_Under_examination_Main;
    private Login_Main login_main;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        car_Under_examination_Main = new Car_Under_examination_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);
    }
    @Test
    @Description("check message with true status")
    public void Car_Under_examination_check_message_with_true_status(){
        Response Car_Under_examination_Response = car_Under_examination_Main
                .Success_Car_Under_examination("45");
        Validations.assertThat().response(Car_Under_examination_Response).
                extractedJsonValue("message")
                .contains("You Are Not Allowed To Change This Order Status")
                .perform();
    }
    @Test
    @Description("check errors with true status")
    public void confirm_Recived_From_Customer_check_message_with_true_status(){
        Response Car_Under_examination_Response = car_Under_examination_Main
                .Success_Car_Under_examination("45");
        Validations.assertThat().response(Car_Under_examination_Response).
                extractedJsonValue("errors[0]")
                .contains("err_order_status_provider_not_allowed")
                .perform();
    }
    @Test
    @Description("check status code with true status")
    public void confirm_Recived_From_Customer_check_status_code_with_true_status(){
        Response Car_Under_examination_Response = car_Under_examination_Main
                .Success_Car_Under_examination("45");
        Validations.assertThat().response(Car_Under_examination_Response).
                extractedJsonValue("status_code")
                .contains("501")
                .perform();
    }
    @Test
    @Description("check message with empty indexes")
    public void confirm_Recived_From_Customer_check_with_empty_status_validate_on_message(){
        Response Car_Under_examination_Response = car_Under_examination_Main
                .Success_Car_Under_examination("");
        Validations.assertThat().response(Car_Under_examination_Response).
                extractedJsonValue("message")
                .contains("Failed Change Order Status")
                .perform();
    }
    @Test
    @Description("check errors with empty indexes")
    public void confirm_Recived_From_Customer_check_with_empty_status_validate_on_errros(){
        Response Car_Under_examination_Response = car_Under_examination_Main
                .Success_Car_Under_examination("");
        Validations.assertThat().response(Car_Under_examination_Response).
                extractedJsonValue("errors[0]")
                .contains("err_order_status_status_not_valid")
                .perform();
    }
}
