package Constants;

import Auth.main_Class;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Get_Backend_Error_Translations {
    private RestActions apiobject;
    private main_Class maain_Class;
    private Get_Backend_Error_Translations_Main get_Backend_Error_Translations_Main;

    @BeforeClass
    public void beforeclass() {
        apiobject = DriverFactory.getAPIDriver(main_Class.BASE_URL);
        maain_Class = new main_Class(apiobject);
        get_Backend_Error_Translations_Main = new Get_Backend_Error_Translations_Main(apiobject);
    }

    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 0")
    public void Get_Backend_Error_Translations_successfully_0() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[0].key")
                .contains("err_auth_register_contact_number_format")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 1")
    public void Get_Backend_Error_Translations_successfully_1() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[1].key")
                .contains("err_auth_register_mobile_already_exists")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 2")
    public void Get_Backend_Error_Translations_successfully_2() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[2].key")
                .contains("err_auth_register_mobile_format")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 3")
    public void Get_Backend_Error_Translations_successfully_3() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[3].key")
                .contains("err_auth_register_mobile_mandatory")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 4")
    public void Get_Backend_Error_Translations_successfully_4() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[4].key")
                .contains("err_auth_register_name_length")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 5")
    public void Get_Backend_Error_Translations_successfully_5() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[5].key")
                .contains("err_auth_register_name_mandatory")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 6")
    public void Get_Backend_Error_Translations_successfully_6() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[6].key")
                .contains("err_auth_register_password_confirmation_mismatch")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 7")
    public void Get_Backend_Error_Translations_successfully_7() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[7].key")
                .contains("err_auth_register_password_length")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 8")
    public void Get_Backend_Error_Translations_successfully_8() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[8].key")
                .contains("err_auth_register_password_mandatory")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 9")
    public void Get_Backend_Error_Translations_successfully_9() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[9].key")
                .contains("err_auth_register_responsible_person_length")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 10")
    public void Get_Backend_Error_Translations_successfully_10() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[10].key")
                .contains("err_auth_register_responsible_person_mandatory")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 11")
    public void Get_Backend_Error_Translations_successfully_11() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[11].key")
                .contains("err_auth_register_is_accept_terms_and_conditions_should_be_accepted")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 12")
    public void Get_Backend_Error_Translations_successfully_12() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[12].key")
                .contains("err_auth_verify_verification_code_length")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 13")
    public void Get_Backend_Error_Translations_successfully_13() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[13].key")
                .contains("err_auth_verify_verification_code_mandatory")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 14")
    public void Get_Backend_Error_Translations_successfully_14() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[14].key")
                .contains("err_auth_verify_verification_code_wrong")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 15")
    public void Get_Backend_Error_Translations_successfully_15() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[15].key")
                .contains("err_auth_login_mobile_format")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 16")
    public void Get_Backend_Error_Translations_successfully_16() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[16].key")
                .contains("err_auth_login_mobile_mandatory")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 17")
    public void Get_Backend_Error_Translations_successfully_17() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[17].key")
                .contains("err_auth_login_mobile_not_exists")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 18")
    public void Get_Backend_Error_Translations_successfully_18() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[18].key")
                .contains("err_auth_login_password_length")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 19")
    public void Get_Backend_Error_Translations_successfully_19() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[19].key")
                .contains("err_auth_login_password_mandatory")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 20")
    public void Get_Backend_Error_Translations_successfully_20() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[20].key")
                .contains("err_auth_login_password_wrong")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 21")
    public void Get_Backend_Error_Translations_successfully_21() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[21].key")
                .contains("err_auth_forget_password_mobile_format")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 22")
    public void Get_Backend_Error_Translations_successfully_22() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[22].key")
                .contains("err_auth_forget_password_mobile_mandatory")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 23")
    public void Get_Backend_Error_Translations_successfully_23() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[23].key")
                .contains("err_auth_forget_password_mobile_not_exists")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 24")
    public void Get_Backend_Error_Translations_successfully_24() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[24].key")
                .contains("err_auth_reset_password_confirmation_password_mandatory")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 25")
    public void Get_Backend_Error_Translations_successfully_25() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[25].key")
                .contains("err_auth_reset_password_mobile_format")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 26")
    public void Get_Backend_Error_Translations_successfully_26() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[26].key")
                .contains("err_auth_reset_password_mobile_mandatory")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 27")
    public void Get_Backend_Error_Translations_successfully_27() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[27].key")
                .contains("err_auth_reset_password_mobile_not_exists")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 28")
    public void Get_Backend_Error_Translations_successfully_28() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[28].key")
                .contains("err_auth_reset_password_password_confirmation_length")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 29")
    public void Get_Backend_Error_Translations_successfully_29() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[29].key")
                .contains("err_auth_reset_password_password_confirmation_mismatch")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 30")
    public void Get_Backend_Error_Translations_successfully_30() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[30].key")
                .contains("err_auth_reset_password_password_length")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 31")
    public void Get_Backend_Error_Translations_successfully_31() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[31].key")
                .contains("err_auth_reset_password_password_mandatory")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 32")
    public void Get_Backend_Error_Translations_successfully_32() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[32].key")
                .contains("err_auth_verify_reset_password_verification_code_length")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 33")
    public void Get_Backend_Error_Translations_successfully_33() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[33].key")
                .contains("err_auth_verify_reset_password_verification_code_mandatory")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 34")
    public void Get_Backend_Error_Translations_successfully_34() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[34].key")
                .contains("err_auth_verify_reset_password_wrong_verification_code")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 35")
    public void Get_Backend_Error_Translations_successfully_35() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[35].key")
                .contains("err_profile_update_profile_contact_number_format")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 36")
    public void Get_Backend_Error_Translations_successfully_36() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[36].key")
                .contains("err_profile_update_profile_cr_number_length_invalid")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 37")
    public void Get_Backend_Error_Translations_successfully_37() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[37].key")
                .contains("err_profile_update_profile_latitude_invalid")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 38")
    public void Get_Backend_Error_Translations_successfully_38() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[38].key")
                .contains("err_profile_update_profile_longitude_invalid")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 39")
    public void Get_Backend_Error_Translations_successfully_39() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[39].key")
                .contains("err_profile_update_profile_name_length")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 40")
    public void Get_Backend_Error_Translations_successfully_40() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[40].key")
                .contains("err_profile_update_profile_responsible_person_length")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 41")
    public void Get_Backend_Error_Translations_successfully_41() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[41].key")
                .contains("err_profile_update_profile_responsible_person_mandatory")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 42")
    public void Get_Backend_Error_Translations_successfully_42() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[42].key")
                .contains("err_media_upload_file_mandatory")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 43")
    public void Get_Backend_Error_Translations_successfully_43() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[43].key")
                .contains("err_media_upload_file_size_exceed_length")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 44")
    public void Get_Backend_Error_Translations_successfully_44() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[44].key")
                .contains("err_media_upload_type_invalid")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 45")
    public void Get_Backend_Error_Translations_successfully_45() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[45].key")
                .contains("err_order_response_comment_max_length")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 46")
    public void Get_Backend_Error_Translations_successfully_46() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[46].key")
                .contains("err_order_status_can_not_change_order_to_this_status")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 47")
    public void Get_Backend_Error_Translations_successfully_47() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[47].key")
                .contains("err_order_status_otp_invalid")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 48")
    public void Get_Backend_Error_Translations_successfully_48() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[48].key")
                .contains("err_order_status_otp_is_mandatory")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 49")
    public void Get_Backend_Error_Translations_successfully_49() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[49].key")
                .contains("err_order_status_otp_should_be_number")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 50")
    public void Get_Backend_Error_Translations_successfully_50() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[50].key")
                .contains("err_profile_cr_number_mandatory")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 51")
    public void Get_Backend_Error_Translations_successfully_51() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[51].key")
                .contains("err_profile_picture_main_picture_mandatory")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 52")
    public void Get_Backend_Error_Translations_successfully_52() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[52].key")
                .contains("err_profile_min_pictures_minimum_three")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 53")
    public void Get_Backend_Error_Translations_successfully_53() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[53].key")
                .contains("err_profile_update_profile_name_mandatory")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 54")
    public void Get_Backend_Error_Translations_successfully_54() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[54].key")
                .contains("err_profile_update_profile_contact_number_mandatory")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 55")
    public void Get_Backend_Error_Translations_successfully_55() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[55].key")
                .contains("err_profile_update_profile_contact_number_already_exists")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 56")
    public void Get_Backend_Error_Translations_successfully_56() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[56].key")
                .contains("err_profile_car_brand_mandatory")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 57")
    public void Get_Backend_Error_Translations_successfully_57() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[57].key")
                .contains("err_profile_services_services_mandatory")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 58")
    public void Get_Backend_Error_Translations_successfully_58() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[58].key")
                .contains("err_profile_services_brand_list_minimum_one")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 59")
    public void Get_Backend_Error_Translations_successfully_59() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[59].key")
                .contains("err_profile_services_brand_list_no_result")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 60")
    public void Get_Backend_Error_Translations_successfully_60() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[60].key")
                .contains("err_order_response_provider_not_activated")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 61")
    public void Get_Backend_Error_Translations_successfully_61() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[61].key")
                .contains("err_orders_current_details_maintanance_tab_pictures_minimum_three")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 62")
    public void Get_Backend_Error_Translations_successfully_62() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[62].key")
                .contains("err_profile_working_hours_to_after_from")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 63")
    public void Get_Backend_Error_Translations_successfully_63() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[63].key")
                .contains("err_profile_working_hours_mandatory")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 64")
    public void Get_Backend_Error_Translations_successfully_64() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[64].key")
                .contains("err_orders_current_details_maintanance_tab_receive_attachment_mandatory")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 65")
    public void Get_Backend_Error_Translations_successfully_65() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[65].key")
                .contains("err_profile_working_hours_from_mandatory")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 66")
    public void Get_Backend_Error_Translations_successfully_66() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[66].key")
                .contains("err_profile_working_hours_to_mandatory")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 67")
    public void Get_Backend_Error_Translations_successfully_67() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[67].key")
                .contains("")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 68")
    public void Get_Backend_Error_Translations_successfully_68() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[68].key")
                .contains("")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 69")
    public void Get_Backend_Error_Translations_successfully_69() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[69].key")
                .contains("")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 70")
    public void Get_Backend_Error_Translations_successfully_70() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[70].key")
                .contains("")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 71")
    public void Get_Backend_Error_Translations_successfully_71() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[71].key")
                .contains("")
                .perform();
    }
    @Test
    @Description("check_Getting_Backend_Error_Translations successfully 72")
    public void Get_Backend_Error_Translations_successfully_72() {
        Response Get_Backend_Error_Translations_Response = get_Backend_Error_Translations_Main.Get_Backend_Error_Translations_successfully();
        Validations.assertThat().response(Get_Backend_Error_Translations_Response)
                .extractedJsonValue("data[72].key")
                .contains("")
                .perform();
    }
}