package Profile.Change_mobile_number;

import Auth.Login_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Change_mobile_number {
    private RestActions apiobject ;
    private Login_Main login_main;
    private Change_mobile_number_Main change_mobile_number_Main;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        change_mobile_number_Main = new Change_mobile_number_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);
    }
    @Test
    @Description("check err_profile_change_mobile_old_mobile_number_mandatory")
    public void check_Change_old_mobile_number_is_mandatory(){
        Response Change_mobile_number_Response = change_mobile_number_Main
                .Change_mobile_number("","966556677888" ,"1");

        Validations.assertThat().response(Change_mobile_number_Response)
                .extractedJsonValue("errors[1]")
                .contains("err_profile_change_mobile_old_mobile_number_mandatory")
                .perform();

    }
    @Test
    @Description("check err_profile_change_mobile_new_mobile_number_mandatory")
    public void check_Change_New_mobile_number_is_mandatory(){
        Response Change_mobile_number_Response = change_mobile_number_Main
                .Change_mobile_number("966556677888","" ,"1");

        Validations.assertThat().response(Change_mobile_number_Response)
                .extractedJsonValue("errors[0]")
                .contains("err_profile_change_mobile_new_mobile_number_mandatory")
                .perform();

        Validations.assertThat().response(Change_mobile_number_Response)
                .extractedJsonValue("status_code")
                .contains("422")
                .perform();
    }

    @Test
    @Description("check err_profile_change_mobile_Verify_Type_mobile_number_mandatory")
    public void check_Change_Verify_Type_mobile_number_is_mandatory(){
        Response Change_mobile_number_Response = change_mobile_number_Main
                .Change_mobile_number("966556677888","966556677887" ,"");

        Validations.assertThat().response(Change_mobile_number_Response)
                .extractedJsonValue("errors[2]")
                .contains("")
                .perform();

        Validations.assertThat().response(Change_mobile_number_Response)
                .extractedJsonValue("status_code")
                .contains("422")
                .perform();
    }

    @Test
    @Description("check err_profile_change_mobile_old_mobile_support_english_numbers_only")
    public void check_err_profile_change_mobile_old_mobile_support_english_numbers_only(){
        Response Change_mobile_number_Response = change_mobile_number_Main
                .Change_mobile_number("Test assss","966556677887" ,"");

        Validations.assertThat().response(Change_mobile_number_Response)
                .extractedJsonValue("errors[1]")
                .contains("err_profile_change_mobile_old_mobile_support_english_numbers_only")
                .perform();

        Validations.assertThat().response(Change_mobile_number_Response)
                .extractedJsonValue("status_code")
                .contains("422")
                .perform();
    }

    @Test
    @Description("check err_profile_change_mobile_new_mobile_support_english_numbers_only")
    public void check_err_profile_change_mobile_new_mobile_support_english_numbers_only(){
        Response Change_mobile_number_Response = change_mobile_number_Main
                .Change_mobile_number("966556677887","test" ,"");

        Validations.assertThat().response(Change_mobile_number_Response)
                .extractedJsonValue("errors[0]")
                .contains("err_profile_change_mobile_new_mobile_support_english_numbers_only")
                .perform();

        Validations.assertThat().response(Change_mobile_number_Response)
                .extractedJsonValue("status_code")
                .contains("422")
                .perform();
    }

    @Test
    @Description("check err_profile_change_mobile_verify_type_support_english_numbers_only")
    public void check_err_profile_change_mobile_verify_type_support_english_numbers_only(){
        Response Change_mobile_number_Response = change_mobile_number_Main
                .Change_mobile_number("966556677887","966556677882" ,"test");

        Validations.assertThat().response(Change_mobile_number_Response)
                .extractedJsonValue("errors[2]")
                .contains("err_profile_change_mobile_verify_type_support_english_numbers_only")
                .perform();

        Validations.assertThat().response(Change_mobile_number_Response)
                .extractedJsonValue("status_code")
                .contains("422")
                .perform();
    }
}
