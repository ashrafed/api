package Orders.Change_Status.Receive_Car;

import Auth.Login_Main;
import Orders.Change_Status.Receive_Car.Confirm_Recived_From_Customer_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Confirm_Recived_From_Customer {
    private RestActions apiobject ;
    private Confirm_Recived_From_Customer_Main confirm_Recived_From_Customer_Main;
    private Login_Main login_main;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        confirm_Recived_From_Customer_Main = new Confirm_Recived_From_Customer_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);
    }
    @Test
    @Description("check message with the true indexes on postman")
    public void confirm_Recived_From_Customer_check_message_with_all_indexes(){
        Response Confirm_Recived_From_Customer_Main_Response = confirm_Recived_From_Customer_Main
                .Success_Confirm_Recived_From_Customer("20","9531");
        Validations.assertThat().response(Confirm_Recived_From_Customer_Main_Response).
                extractedJsonValue("message")
                .contains("You Are Not Allowed To Change This Order Status")
                .perform();
    }
    @Test
    @Description("check errors with the true indexes on postman")
    public void confirm_Recived_From_Customer_check_errors_with_all_indexes(){
        Response Confirm_Recived_From_Customer_Main_Response = confirm_Recived_From_Customer_Main
                .Success_Confirm_Recived_From_Customer("20","9531");
        Validations.assertThat().response(Confirm_Recived_From_Customer_Main_Response).
                extractedJsonValue("errors[0]")
                .contains("err_order_status_provider_not_allowed")
                .perform();
    }
    @Test
    @Description("check status code with true indexes on postman")
    public void confirm_Recived_From_Customer_check_status_code(){
        Response Confirm_Recived_From_Customer_Main_Response = confirm_Recived_From_Customer_Main
                .Success_Confirm_Recived_From_Customer("20","9531");
        Validations.assertThat().response(Confirm_Recived_From_Customer_Main_Response).
                extractedJsonValue("status_code")
                .contains("501")
                .perform();
    }
    @Test
    @Description("validate on message with empty indexes")
    public void confirm_Recived_From_Customer_check_With_empty_indexes_validate_on_message(){
        Response Confirm_Recived_From_Customer_Main_Response = confirm_Recived_From_Customer_Main
                .Success_Confirm_Recived_From_Customer("","");
        Validations.assertThat().response(Confirm_Recived_From_Customer_Main_Response).
                extractedJsonValue("messasge")
                .contains("")
                .perform();
    }
    @Test
    @Description("validate on errors with empty indexes")
    public void confirm_Recived_From_Customer_check_With_empty_indexes_validate_on_errors(){
        Response Confirm_Recived_From_Customer_Main_Response = confirm_Recived_From_Customer_Main
                .Success_Confirm_Recived_From_Customer("","");
        Validations.assertThat().response(Confirm_Recived_From_Customer_Main_Response).
                extractedJsonValue("errors[0]")
                .contains("err_order_status_status_not_valid")
                .perform();
    }
    @Test
    @Description("check empty otp validate on message")
    public void confirm_Recived_From_Customer_check_With_empty_otp_validate_on_message(){
        Response Confirm_Recived_From_Customer_Main_Response = confirm_Recived_From_Customer_Main
                .Success_Confirm_Recived_From_Customer("20","");
        Validations.assertThat().response(Confirm_Recived_From_Customer_Main_Response).
                extractedJsonValue("message")
                .contains("You Are Not Allowed To Change This Order Status")
                .perform();
    }
    @Test
    @Description("check empty otp validate on errors")
    public void confirm_Recived_From_Customer_check_With_empty_otp_validate_on_errors(){
        Response Confirm_Recived_From_Customer_Main_Response = confirm_Recived_From_Customer_Main
                .Success_Confirm_Recived_From_Customer("20","");
        Validations.assertThat().response(Confirm_Recived_From_Customer_Main_Response).
                extractedJsonValue("errors[0]")
                .contains("err_order_status_provider_not_allowed")
                .perform();
    }
    @Test
    @Description("check empty status validate on message")
    public void confirm_Recived_From_Customer_check_With_empty_status_validate_on_message(){
        Response Confirm_Recived_From_Customer_Main_Response = confirm_Recived_From_Customer_Main
                .Success_Confirm_Recived_From_Customer("","9531");
        Validations.assertThat().response(Confirm_Recived_From_Customer_Main_Response).
                extractedJsonValue("message")
                .contains("Failed Change Order Status")
                .perform();
}
    @Test
    @Description("check empty status validate on errors")
    public void confirm_Recived_From_Customer_check_With_empty_status_validate_on_errors(){
        Response Confirm_Recived_From_Customer_Main_Response = confirm_Recived_From_Customer_Main
                .Success_Confirm_Recived_From_Customer("","9531");
        Validations.assertThat().response(Confirm_Recived_From_Customer_Main_Response).
                extractedJsonValue("errors[0]")
                .contains("err_order_status_status_not_valid")
                .perform();
    }
    @Test
    @Description("check otp length and validate on message")
    public void confirm_Recived_From_Customer_check_otp_length_validate_on_message(){
        Response Confirm_Recived_From_Customer_Main_Response = confirm_Recived_From_Customer_Main
                .Success_Confirm_Recived_From_Customer("20","95");
        Validations.assertThat().response(Confirm_Recived_From_Customer_Main_Response).
                extractedJsonValue("message")
                .contains("You Are Not Allowed To Change This Order Status")
                .perform();
    }
}