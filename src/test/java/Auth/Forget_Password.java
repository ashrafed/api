package Auth;

import Profile.Add_mobile_info_main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Forget_Password {
    private RestActions apiobject ;
    private Forget_Password_Main forget_Password_Main;
    private main_Class maain_Class;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(main_Class.BASE_URL);
        maain_Class = new main_Class(apiobject);
        forget_Password_Main = new Forget_Password_Main(apiobject);
    }
    @Test
    @Description("check_forget_Password_with_true_indexes")
    public void check_forget_Password_successfully(){
        Response Forget_Password_Response = forget_Password_Main.forget_Password_successfully("966506425181");
        Validations.assertThat().response(Forget_Password_Response).extractedJsonValue("message")
                .contains("Success Sent Reset Password Verification Code.")
                .perform();
    }
    @Test
    @Description("check forget Password with Different Mobile Format Validation will be on message")
    public void forget_Password_With_Different_Mobile_Format_Validate_On_Message() {
        Response Forget_Password_Response = forget_Password_Main.forget_Password_Failed("01096700012");
        Validations.assertThat().response(Forget_Password_Response).extractedJsonValue("message")
                .contains("invalid input data")
                .perform();
    }
    @Test
    @Description("check forget Password with Different Mobile Format Validation will be on errors")
    public void forget_Password_With_Different_Mobile_Format_Validate_On_errors() {
        Response Forget_Password_Response = forget_Password_Main.forget_Password_Failed("01096700012");
        Validations.assertThat().response(Forget_Password_Response).extractedJsonValue("errors[0]")
                .contains("err_auth_forget_password_mobile_format")
                .perform();
    }
    @Test
    @Description("check forget Password with No Entries Validation will be on message")
    public void forget_Password_With_No_Entries_Validate_On_message() {
        Response Forget_Password_Response = forget_Password_Main.forget_Password_Failed("");
        Validations.assertThat().response(Forget_Password_Response).extractedJsonValue("message")
                .contains("invalid input data")
                .perform();
    }
    @Test
    @Description("check forget Password with No Entries Validation will be on errors")
    public void forget_Password_With_No_Entries_Validate_On_errors() {
        Response Forget_Password_Response = forget_Password_Main.forget_Password_Failed("");
        Validations.assertThat().response(Forget_Password_Response).extractedJsonValue("errors[0]")
                .contains("err_auth_forget_password_mobile_mandatory")
                .perform();
    }
    @Test
    @Description("check forget Password with Arabic Numbers Validation will be on message")
    public void forget_Password_With_Arabic_Numbers_Validate_On_message() {
        Response Forget_Password_Response = forget_Password_Main.forget_Password_Failed("۹٦٦٥۰٦٤۲٥۱۸۱");
        Validations.assertThat().response(Forget_Password_Response).extractedJsonValue("message")
                .contains("invalid input data")
                .perform();
    }
    @Test
    @Description("check forget Password with Arabic Numbers Validation will be on errors")
    public void forget_Password_With_Arabic_Numbers_Validate_On_errors() {
        Response Forget_Password_Response = forget_Password_Main.forget_Password_Failed("۹٦٦٥۰٦٤۲٥۱۸۱");
        Validations.assertThat().response(Forget_Password_Response).extractedJsonValue("errors[0]")
                .contains("err_auth_forget_password_mobile_support_english_numbers_only")
                .perform();
    }
    @Test
    @Description("check forget Password with characters Validation will be on errors")
    public void forget_Password_With_characters_Validate_On_message() {
        Response Forget_Password_Response = forget_Password_Main.forget_Password_Failed("ABCDEFG");
        Validations.assertThat().response(Forget_Password_Response).extractedJsonValue("message")
                .contains("invalid input data")
                .perform();
    }
    @Test
    @Description("check forget Password with characters Validation will be on errors")
    public void forget_Password_With_characters_Validate_On_errors() {
        Response Forget_Password_Response = forget_Password_Main.forget_Password_Failed("ABCDEFG");
        Validations.assertThat().response(Forget_Password_Response).extractedJsonValue("errors[0]")
                .contains("err_auth_forget_password_mobile_support_english_numbers_only")
                .perform();
    }
    @Test
    @Description("check forget Password with Symbols Validation will be on errors")
    public void forget_Password_With_Symbols_Validate_On_message() {
        Response Forget_Password_Response = forget_Password_Main.forget_Password_Failed("!@#$%");
        Validations.assertThat().response(Forget_Password_Response).extractedJsonValue("message")
                .contains("invalid input data")
                .perform();
    }
    @Test
    @Description("check forget Password with Symbols Validation will be on errors")
    public void forget_Password_With_Symbols_Validate_On_errors() {
        Response Forget_Password_Response = forget_Password_Main.forget_Password_Failed("!@#$%");
        Validations.assertThat().response(Forget_Password_Response).extractedJsonValue("errors[0]")
                .contains("err_auth_forget_password_mobile_support_english_numbers_only")
                .perform();
    }
}