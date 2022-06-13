package Profile.Working_Hours;

import Auth.Login_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Get_Working_Hours {
    private RestActions apiobject;
    private Login_Main login_main;
    private Get_Working_Hours_Main get_Working_Hours_Main;


    @BeforeClass
    public void beforeclass() {
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        get_Working_Hours_Main = new Get_Working_Hours_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);
    }

    @Test
    @Description(" check success get working hours")
    public void check_massage_get_Working_Hours(){
        Response get_Working_Hours_Respons  = get_Working_Hours_Main.Get_Working_Hours();

        Validations.assertThat().response(get_Working_Hours_Respons)
                .extractedJsonValue("message")
                .contains("success get working hours")
                .perform();
    }


    @Test
    @Description(" check massage success get working hours")
    public void check_status_code_get_Working_Hours(){
        Response get_Working_Hours_Respons  = get_Working_Hours_Main.Get_Working_Hours();

        Validations.assertThat().response(get_Working_Hours_Respons)
                .extractedJsonValue("status_code")
                .contains("200")
                .perform();
    }



}
