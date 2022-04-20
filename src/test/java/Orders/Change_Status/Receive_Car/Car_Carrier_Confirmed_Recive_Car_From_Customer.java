package Orders.Change_Status.Receive_Car;

import Auth.main_Class;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Car_Carrier_Confirmed_Recive_Car_From_Customer {
    private RestActions apiobject ;
    private Car_Carrier_Confirmed_Recive_Car_From_Customer_Main car_Carrier_Confirmed_Recive_Car_From_Customer_Main;
    private main_Class maain_Class;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(main_Class.BASE_URL);
        maain_Class = new main_Class(apiobject);
        car_Carrier_Confirmed_Recive_Car_From_Customer_Main = new Car_Carrier_Confirmed_Recive_Car_From_Customer_Main(apiobject);
        maain_Class.login("966506425181" , "123456");

    }
    @Test
    @Description(" validate on message with status = 30 ")
    public void Car_Carrier_Confirmed_Recive_Car_From_Customer_validate_on_message_with_status_equal_32(){
        Response Car_Carrier_Confirmed_Recive_Car_From_Customer_Main_Response = car_Carrier_Confirmed_Recive_Car_From_Customer_Main
                .Success_Car_Carrier_Confirmed_Recive_Car_From_Customer("32");
        Validations.assertThat().response(Car_Carrier_Confirmed_Recive_Car_From_Customer_Main_Response).
                extractedJsonValue("message")
                .contains("You Are Not Allowed To Change This Order Status")
                .perform();
    }
    @Test
    @Description(" validate on message with status = 30 ")
    public void Car_Carrier_Confirmed_Recive_Car_From_Customer_validate_on_errors_with_status_equal_32(){
        Response Car_Carrier_Confirmed_Recive_Car_From_Customer_Main_Response = car_Carrier_Confirmed_Recive_Car_From_Customer_Main
                .Success_Car_Carrier_Confirmed_Recive_Car_From_Customer("32");
        Validations.assertThat().response(Car_Carrier_Confirmed_Recive_Car_From_Customer_Main_Response).
                extractedJsonValue("errors[0]")
                .contains("err_order_status_provider_not_allowed")
                .perform();
    }
    @Test
    @Description(" validate on message with status = 30 ")
    public void Car_Carrier_Confirmed_Recive_Car_From_Customer_validate_on_status_code(){
        Response Car_Carrier_Confirmed_Recive_Car_From_Customer_Main_Response = car_Carrier_Confirmed_Recive_Car_From_Customer_Main
                .Success_Car_Carrier_Confirmed_Recive_Car_From_Customer("32");
        Validations.assertThat().response(Car_Carrier_Confirmed_Recive_Car_From_Customer_Main_Response).
                extractedJsonValue("status_code")
                .contains("501")
                .perform();
    }
}
