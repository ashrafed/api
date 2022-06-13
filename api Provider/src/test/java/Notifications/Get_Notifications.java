package Notifications;
import Auth.Login_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Get_Notifications {
    private RestActions apiobject;
    private Login_Main login_main;
    private Get_Notifications_Main get_Notifications_Main;

    @BeforeClass
    public void beforeclass() {
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        get_Notifications_Main = new Get_Notifications_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);
    }

    @Test
    @Description(" check success get working hours")
    public void check_massage_get_Working_Hours(){
        Response get_Working_Hours_Respons  = get_Notifications_Main.Get_Notifications();

        Validations.assertThat().response(get_Working_Hours_Respons)
                .extractedJsonValue("message")
                .contains("list notifications")
                .perform();
    }
}


