package Testing;

import Auth.Login_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Get_environment_variable_info {
    private RestActions apiobject ;
    private Get_environment_variable_info_Main get_environment_variable_info_Main;
    private Login_Main login_main;


    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        get_environment_variable_info_Main = new Get_environment_variable_info_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);
    }
    @Test
    @Description("check Getting environment variable info")
    public void check_Getting_environment_variable_info(){
        Response Getting_environment_variable_info_Response = get_environment_variable_info_Main.Get_environment_variable_info_Successfully("1");

        Validations.assertThat().response(Getting_environment_variable_info_Response).extractedJsonValue("data.key")
                .contains("GOOGLE_CLIENT_SECRET")
                .perform();
    }
}
