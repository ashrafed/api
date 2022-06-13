package Testing;

import Auth.Login_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Import_Carefer_Shops {
    private RestActions apiobject ;
    private Login_Main login_main;
    private Import_Carefer_Shops_Main import_Carefer_Shops_Main;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        import_Carefer_Shops_Main = new Import_Carefer_Shops_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);
    }
    @Test
    @Description("check_get_provider_info_successfully")
    public void get_provider_info(){
        Response Import_Carefer_Shops_Response = import_Carefer_Shops_Main.Import_Carefer_Shops();
        Validations.assertThat().
                response(Import_Carefer_Shops_Response)
                .extractedJsonValue("message")
                .contains("Sorry you can not use this API.")
                .perform();

    }

}
