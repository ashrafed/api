package Fake_Requests;

import Auth.Login_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Fake_Initial_Order_Status {
    private RestActions apiobject;
    private Login_Main login_main;
    private Fake_Initial_Order_Status_Main fake_Initial_Order_Status_Main;


    @BeforeClass
    public void beforeclass() {
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        fake_Initial_Order_Status_Main = new Fake_Initial_Order_Status_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);
    }

    @Test
    @Description(" check Fake Initial Order Status")
    public void check_Fake_Initial_Order_Status(){
        Response get_Working_Hours_Response  = fake_Initial_Order_Status_Main.Get_Notifications();

        Validations.assertThat().response(get_Working_Hours_Response)
                .extractedJsonValue("message")
                .contains("Method App\\Http\\Controllers\\Api\\v1\\providers\\TempController::logInitialOrderStatus does not exist.")
                .perform();
    }
}
