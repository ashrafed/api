package Orders.Change_Status.Receive_Car;

import Auth.main_Class;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Confirm_Recive_From_Carrier {
    private RestActions apiobject ;
    private Confirm_Recive_From_Carrier_Main confirm_Recive_From_Carrier_Main;
    private main_Class maain_Class;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(main_Class.BASE_URL);
        maain_Class = new main_Class(apiobject);
        confirm_Recive_From_Carrier_Main = new Confirm_Recive_From_Carrier_Main(apiobject);
        maain_Class.login("966506425181" , "123456");

    }
    @Test
    @Description("validate on message with status = 32 and otp = 9531 ")
    public void Car_Carrier_Confirmed_Recive_Car_From_Customer_validate_on_message(){
        Response Confirm_Recive_From_Carrier_Main_Response = confirm_Recive_From_Carrier_Main
                .Success_Confirm_Recive_From_Carrier("32","9531");
        Validations.assertThat().response(Confirm_Recive_From_Carrier_Main_Response).
                extractedJsonValue("message")
                .contains("You Are Not Allowed To Change This Order Status")
                .perform();
    }
    @Test
    @Description(" validate on errors with status = 32 and otp = 9531 ")
    public void Car_Carrier_Confirmed_Recive_Car_From_Customer_validate_on_errors(){
        Response Confirm_Recive_From_Carrier_Main_Response = confirm_Recive_From_Carrier_Main
                .Success_Confirm_Recive_From_Carrier("32","9531");
        Validations.assertThat().response(Confirm_Recive_From_Carrier_Main_Response).
                extractedJsonValue("errors[0]")
                .contains("err_order_status_provider_not_allowed")
                .perform();
    }
    @Test
    @Description(" validate on status code ")
    public void Car_Carrier_Confirmed_Recive_Car_From_Customer_validate_on_status_code(){
        Response Confirm_Recive_From_Carrier_Main_Response = confirm_Recive_From_Carrier_Main
                .Success_Confirm_Recive_From_Carrier("32","9531");
        Validations.assertThat().response(Confirm_Recive_From_Carrier_Main_Response).
                extractedJsonValue("status_code")
                .contains("501")
                .perform();
    }

}
