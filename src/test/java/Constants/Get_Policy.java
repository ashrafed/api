package Constants;

import Auth.main_Class;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Get_Policy {
    private RestActions apiobject;
    private main_Class maain_Class;
    private Get_Policy_Main get_Policy_Main;

    @BeforeClass
    public void beforeclass() {
        apiobject = DriverFactory.getAPIDriver(main_Class.BASE_URL);
        maain_Class = new main_Class(apiobject);
        get_Policy_Main = new Get_Policy_Main(apiobject);
    }
    @Test
    @Description(" check getting policy successfullly")
    public void check_getting_policy_successfullly(){
        Response get_policy_Response  = get_Policy_Main.Get_Policy_successfully();
        Validations.assertThat().response(get_policy_Response)
                .extractedJsonValue("success")
                .contains("true")
                .perform();
        Validations.assertThat().response(get_policy_Response)
                .extractedJsonValue("status_code")
                .contains("200")
                .perform();
        Validations.assertThat().response(get_policy_Response)
                .extractedJsonValue("data.title")
                .contains("اتفاقية انضمام الورشة في تطبيق كاريفر")

                .perform();

    }
    @Test
    @Description(" check getting policy failed")
    public void check_getting_policy_failed(){
        Response get_policy_Response  = get_Policy_Main.Get_Policy_failed();
        Validations.assertThat().response(get_policy_Response)
                .extractedJsonValue("success")
                .contains("false")
                .perform();
        Validations.assertThat().response(get_policy_Response)
                .extractedJsonValue("status_code")
                .contains("200")
                .perform();
        Validations.assertThat().response(get_policy_Response)
                .extractedJsonValue("message")
                .contains("unsupported language")
                .perform();
    }
}
