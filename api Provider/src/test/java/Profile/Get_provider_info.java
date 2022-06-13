package Profile;

import Auth.Login_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Get_provider_info {
    private RestActions apiobject ;

    private Login_Main login_main;

    private Get_provider_info_Main get_provider_info;



    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        get_provider_info = new Get_provider_info_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);
    }

    @Test
    @Description("check_get_provider_info_successfully")
    public void get_provider_info(){
        Response get_provider_info_Response = get_provider_info.Get_provider_info();

        Validations.assertThat().
                response(get_provider_info_Response)
                .extractedJsonValue("status_code")
                .contains(200)
                .perform();

    }

    @Test
    @Description("check_get_provider_info_when_user_Unauthenticated")
    public void get_provider_info_Unauthenticated(){
        Response get_provider_info_Response = get_provider_info.Get_provider_info();

        Validations.assertThat().
                response(get_provider_info_Response)
                .extractedJsonValue("status_code")
                .contains(200)
                .perform();

    }

}
