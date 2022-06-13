package Auth.change_Password;

import Auth.Login_Main;
import Auth.change_password.Forget_Password_Main;
import Auth.change_password.Reset_Password_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Reset_Password {
    private RestActions apiobject ;
    private Reset_Password_Main reset_Password_Main;
    private Login_Main maain_Class;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        maain_Class = new Login_Main(apiobject);
        reset_Password_Main = new Reset_Password_Main(apiobject);
    }
    @Test
    @Description("validate on message")
    public void Reset_Password_successfully_validate_on_message(){
        Response Reset_Password_Response = reset_Password_Main.Reset_Password_successfully("966506425181","111111111","121212121");
        Validations.assertThat().response(Reset_Password_Response)
                .extractedJsonValue("message")
                .contains("invalid input data")
                .perform();
    }
    @Test
    @Description("validate on errors")
    public void Reset_Password_successfully_validate_on_errors(){
        Response Reset_Password_Response = reset_Password_Main.Reset_Password_successfully("966506425181","111111111","121212121");
        Validations.assertThat().response(Reset_Password_Response)
                .extractedJsonValue("errors[0]")
                .contains("err_auth_reset_password_password_confirmation_mismatch")
                .perform();
    }
    @Test
    @Description("validate on errors")
    public void Reset_Password_successfully_validate_on_status_code(){
        Response Reset_Password_Response = reset_Password_Main.Reset_Password_successfully("966506425181","111111111","121212121");
        Validations.assertThat().response(Reset_Password_Response)
                .extractedJsonValue("status_code")
                .contains("422")
                .perform();
    }
    @Test
    @Description("validate on errors when mobile is null")
    public void Reset_Password_successfully_validate_on_errors_1_mobile_null(){
        Response Reset_Password_Response = reset_Password_Main.Reset_Password_successfully("","111111111","121212121");
        Validations.assertThat().response(Reset_Password_Response)
                .extractedJsonValue("errors[0]")
                .contains("err_auth_reset_password_mobile_mandatory")
                .perform();
    }
    @Test
    @Description("validate on errors when mobile is null")
    public void Reset_Password_successfully_validate_on_errors_2_mobile_null(){
        Response Reset_Password_Response = reset_Password_Main.Reset_Password_successfully("","111111111","121212121");
        Validations.assertThat().response(Reset_Password_Response)
                .extractedJsonValue("errors[1]")
                .contains("err_auth_reset_password_password_confirmation_mismatch")
                .perform();
    }
    @Test
    @Description("validate on errors when password is null")
    public void Reset_Password_successfully_validate_on_errors_password_null(){
        Response Reset_Password_Response = reset_Password_Main.Reset_Password_successfully("966506425181","","121212121");
        Validations.assertThat().response(Reset_Password_Response)
                .extractedJsonValue("errors[0]")
                .contains("err_auth_reset_password_password_mandatory")
                .perform();
    }
    @Test
    @Description("validate on errors when password is null")
    public void Reset_Password_successfully_validate_on_errors_password__confirmation_null(){
        Response Reset_Password_Response = reset_Password_Main.Reset_Password_successfully("966506425181","111111111","");
        Validations.assertThat().response(Reset_Password_Response)
                .extractedJsonValue("errors[0]")
                .contains("الحقل تأكيد كلمة المرور إذا توفّر كلمة المرور.")
                .perform();
    }
    @Test
    @Description("validate on errors when password is null")
    public void Reset_Password_failed_validate_on_errors(){
        Response Reset_Password_Response = reset_Password_Main.Reset_Password_Failed("966506425181","111111111","121212121");
        Validations.assertThat().response(Reset_Password_Response)
                .extractedJsonValue("errors[0]")
                .contains("err_auth_reset_password_password_confirmation_mismatch")
                .perform();
    }
}
