package Testing;

import Auth.main_Class;
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
    private main_Class maain_Class;


    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(main_Class.BASE_URL);
        maain_Class = new main_Class(apiobject);
        get_environment_variable_info_Main = new Get_environment_variable_info_Main(apiobject);
        maain_Class.login("966506425181" , "123456");
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
