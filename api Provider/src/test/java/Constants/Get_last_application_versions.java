package Constants;

import Auth.Login_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Get_last_application_versions {
    private RestActions apiobject;
    private Login_Main maain_Class;
    private Get_last_application_versions_Main get_last_application_versions_Main;

    @BeforeClass
    public void beforeclass() {
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        maain_Class = new Login_Main(apiobject);
        get_last_application_versions_Main = new Get_last_application_versions_Main(apiobject);
    }
    @Test
    @Description(" check getting policy successfully")
    public void Get_last_application_versions_successfully(){
        Response Get_last_application_versions_Response  = get_last_application_versions_Main.Get_last_application_versions_successfully();
        Validations.assertThat().response(Get_last_application_versions_Response)
                .extractedJsonValue("status_code")
                .contains("200")
                .perform();
    }
    @Test
    @Description(" check getting policy failed")
    public void Get_last_application_versions_failed(){
        Response Get_last_application_versions_Response  = get_last_application_versions_Main.Get_last_application_versions_failed();
        Validations.assertThat().response(Get_last_application_versions_Response)
                .extractedJsonValue("data.android")
                .contains("")
                .perform();
        Validations.assertThat().response(Get_last_application_versions_Response)
                .extractedJsonValue("data.IOS")
                .contains("")
                .perform();
    }
}
