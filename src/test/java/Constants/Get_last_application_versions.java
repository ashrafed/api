package Constants;

import Auth.main_Class;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Get_last_application_versions {
    private RestActions apiobject;
    private main_Class maain_Class;
    private Get_last_application_versions_Main get_last_application_versions_Main;

    @BeforeClass
    public void beforeclass() {
        apiobject = DriverFactory.getAPIDriver(main_Class.BASE_URL);
        maain_Class = new main_Class(apiobject);
        get_last_application_versions_Main = new Get_last_application_versions_Main(apiobject);
    }
    @Test
    @Description(" check getting policy successfully")
    public void Get_last_application_versions_successfully(){
        Response Get_last_application_versions_Response  = get_last_application_versions_Main.Get_last_application_versions_successfully();
        Validations.assertThat().response(Get_last_application_versions_Response)
                .extractedJsonValue("data.android")
                .contains("1.9.0")
                .perform();
        Validations.assertThat().response(Get_last_application_versions_Response)
                .extractedJsonValue("data.IOS")
                .contains("1.9.1")
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
