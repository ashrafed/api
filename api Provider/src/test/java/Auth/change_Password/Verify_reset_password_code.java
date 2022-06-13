package Auth.change_Password;

import Auth.Login_Main;
import Auth.change_password.Verify_reset_password_code_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Verify_reset_password_code {
    private RestActions apiobject ;
    private Verify_reset_password_code_Main verify_reset_password_code_Main;
    private Login_Main maain_Class;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        maain_Class = new Login_Main(apiobject);
        verify_reset_password_code_Main = new Verify_reset_password_code_Main(apiobject);
    }
    @Test
    @Description("validate on message")
    public void Verify_reset_password_code_successfully_Vaildate_on_message(){
        Response Verify_reset_password_code_Response = verify_reset_password_code_Main.Verify_reset_password_code_successfully("966506425181","9531");
        Validations.assertThat().response(Verify_reset_password_code_Response)
                .extractedJsonValue("message")
                .contains("user not found.")
                .perform();
    }
    @Test
    @Description("validate on errors")
    public void Verify_reset_password_code_successfully_Vaildate_on_errors(){
        Response Verify_reset_password_code_Response = verify_reset_password_code_Main.Verify_reset_password_code_successfully("966506425181","9531");
        Validations.assertThat().response(Verify_reset_password_code_Response)
                .extractedJsonValue("errors[0]")
                .contains("err_auth_verify_reset_password_wrong_verification_code")
                .perform();
    }
    @Test
    @Description("validate on status code")
    public void Verify_reset_password_code_successfully_Vaildate_on_status_code(){
        Response Verify_reset_password_code_Response = verify_reset_password_code_Main.Verify_reset_password_code_successfully("966506425181","9531");
        Validations.assertThat().response(Verify_reset_password_code_Response)
                .extractedJsonValue("status_code")
                .contains("404")
                .perform();
    }
    @Test
    @Description("validate on message when mobile is null")
    public void Verify_reset_password_code_successfully_Vaildate_on_message_mobile_null(){
        Response Verify_reset_password_code_Response = verify_reset_password_code_Main.Verify_reset_password_code_Failed("","9531");
        Validations.assertThat().response(Verify_reset_password_code_Response)
                .extractedJsonValue("message")
                .contains("invalid input data")
                .perform();
    }
    @Test
    @Description("validate on message when errors is null")
    public void Verify_reset_password_code_successfully_Vaildate_on_errors_mobile_null(){
        Response Verify_reset_password_code_Response = verify_reset_password_code_Main.Verify_reset_password_code_Failed("","9531");
        Validations.assertThat().response(Verify_reset_password_code_Response)
                .extractedJsonValue("errors[0]")
                .contains("err_auth_verify_reset_password_mobile_mandatory")
                .perform();
    }
    @Test
    @Description("validate on message when reset password verification code is null")
    public void Verify_reset_password_code_successfully_Vaildate_on_message_verification_code_null(){
        Response Verify_reset_password_code_Response = verify_reset_password_code_Main.Verify_reset_password_code_Failed("966506425181","");
        Validations.assertThat().response(Verify_reset_password_code_Response)
                .extractedJsonValue("message")
                .contains("invalid input data")
                .perform();
    }
    @Test
    @Description("validate on message when reset password verification code is null")
    public void Verify_reset_password_code_successfully_Vaildate_on_errors_verification_code_null(){
        Response Verify_reset_password_code_Response = verify_reset_password_code_Main.Verify_reset_password_code_Failed("966506425181","");
        Validations.assertThat().response(Verify_reset_password_code_Response)
                .extractedJsonValue("errors[0]")
                .contains("err_auth_verify_reset_password_verification_code_mandatory")
                .perform();
    }
    @Test
    @Description("validate on message")
    public void Verify_reset_password_code_failed_Vaildate_on_message(){
        Response Verify_reset_password_code_Response = verify_reset_password_code_Main.Verify_reset_password_code_Failed("966500000000","1948");
        Validations.assertThat().response(Verify_reset_password_code_Response)
                .extractedJsonValue("message")
                .contains("invalid input data")
                .perform();
    }
    @Test
    @Description("validate on message")
    public void Verify_reset_password_code_failed_Vaildate_on_errors(){
        Response Verify_reset_password_code_Response = verify_reset_password_code_Main.Verify_reset_password_code_Failed("966500000000","1948");
        Validations.assertThat().response(Verify_reset_password_code_Response)
                .extractedJsonValue("errors[0]")
                .contains("err_auth_verify_reset_password_mobile_not_exists")
                .perform();
    }
}
