package Orders.Change_Status.Receive_Car;

import Auth.main_Class;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Car_Under_examination_2 {
    private RestActions apiobject ;
    private Car_Under_examination_Main_2 car_Under_examination_Main_2;
    private main_Class maain_Class;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(main_Class.BASE_URL);
        maain_Class = new main_Class(apiobject);
        car_Under_examination_Main_2 = new Car_Under_examination_Main_2(apiobject);
        maain_Class.login("966506425181" , "123456");
    }
    @Test
    @Description("check message with true status")
    public void car_Under_examination_2_validate_on_message(){
        Response car_Under_examination_2_Response = car_Under_examination_Main_2
                .Success_Car_Under_examination_Main_2("45");
        Validations.assertThat().response(car_Under_examination_2_Response).
                extractedJsonValue("message")
                .contains("You Are Not Allowed To Change This Order Status")
                .perform();
    }
    @Test
    @Description("check errors with true status")
    public void car_Under_examination_2_validate_on_errros(){
        Response car_Under_examination_2_Response = car_Under_examination_Main_2
                .Success_Car_Under_examination_Main_2("45");
        Validations.assertThat().response(car_Under_examination_2_Response).
                extractedJsonValue("errors[0]")
                .contains("err_order_status_provider_not_allowed")
                .perform();
    }
    @Test
    @Description("check status code")
    public void car_Under_examination_2_validate_on_status_code(){
        Response car_Under_examination_2_Response = car_Under_examination_Main_2
                .Success_Car_Under_examination_Main_2("45");
        Validations.assertThat().response(car_Under_examination_2_Response).
                extractedJsonValue("status_code")
                .contains("501")
                .perform();
    }
}
