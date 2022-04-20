package Constants;

import Auth.main_Class;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Get_Constants {
    private RestActions apiobject;
    private main_Class maain_Class;
    private Get_Constants_Main get_Constants_Main;

    @BeforeClass
    public void beforeclass() {
        apiobject = DriverFactory.getAPIDriver(main_Class.BASE_URL);
        maain_Class = new main_Class(apiobject);
        get_Constants_Main = new Get_Constants_Main(apiobject);
    }
    @Test
    @Description("Get Constants successfully")
    public void Get_Constants_successfully(){
    Response Get_last_application_versions_Response  = get_Constants_Main.Get_Constants_successfully();
        Validations.assertThat().response(Get_last_application_versions_Response)
                .extractedJsonValue("message")
                .contains("")
                .perform();
        Validations.assertThat().response(Get_last_application_versions_Response)
                .extractedJsonValue("success")
                .contains("true")
                .perform();
        Validations.assertThat().response(Get_last_application_versions_Response)
                .extractedJsonValue("status_code")
                .contains("200")
                .perform();
    }
    @Test
    @Description("Get Constants failed")
    public void Get_Constants_failed(){
        Response Get_last_application_versions_Response  = get_Constants_Main.Get_Constants_failed();
        Validations.assertThat().response(Get_last_application_versions_Response)
                .extractedJsonValue("message")
                .contains("unsupported language.")
                .perform();
    }
}

