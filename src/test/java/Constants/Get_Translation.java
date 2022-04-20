package Constants;

import Auth.main_Class;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Get_Translation {
    private RestActions apiobject;
    private main_Class maain_Class;
    private Get_Translations_Main get_Translations_Main;

    @BeforeClass
    public void beforeclass() {
        apiobject = DriverFactory.getAPIDriver(main_Class.BASE_URL);
        maain_Class = new main_Class(apiobject);
        get_Translations_Main = new Get_Translations_Main(apiobject);
    }
    @Test
    @Description("check getting Translation successfully 0")
    public void check_getting_Translation_successfully_0(){
        Response get_Translation_Response  = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[0].key").contains("ttl_login").perform();
    }
    @Test
    @Description(" check getting Translation successfully_1")
    public void check_getting_Translation_successfully_1(){
        Response get_Translation_Response  = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[1].key").contains("txt_login_mobile").perform();
    }
    @Test
    @Description(" check getting Translation successfully_2")
    public void check_getting_Translation_successfully_2(){
        Response get_Translation_Response  = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[2].key").contains("txt_login_mobile_hint").perform();
    }
    @Test
    @Description(" check getting Translation successfully_3")
    public void check_getting_Translation_successfully_3(){
        Response get_Translation_Response  = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[3].key").contains("txt_login_password").perform();
    }
    @Test
    @Description(" check getting Translation successfully_4")
    public void check_getting_Translation_successfully_4(){
        Response get_Translation_Response  = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[4].key").contains("txt_login_password_hint").perform();
    }
    @Test
    @Description(" check getting Translation successfully_5")
    public void check_getting_Translation_successfully_5(){
        Response get_Translation_Response  = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[5].key").contains("btn_login_forget").perform();
    }
    @Test
    @Description(" check getting Translation successfully_6")
    public void check_getting_Translation_successfully_6(){
        Response get_Translation_Response  = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[6].key").contains("btn_login_login").perform();
    }
    @Test
    @Description(" check getting Translation successfully_7")
    public void check_getting_Translation_successfully_7(){
        Response get_Translation_Response  = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[7].key").contains("btn_login_register").perform();
    }
    @Test
    @Description(" check getting Translation successfully_8")
    public void check_getting_Translation_successfully_8(){
        Response get_Translation_Response  = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[8].key").contains("ttl_forget_password").perform();
    }
    @Test
    @Description(" check getting Translation successfully_9")
    public void check_getting_Translation_successfully_9(){
        Response get_Translation_Response  = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[9].key").contains("txt_forget_password_message").perform();
    }
    @Test
    @Description(" check getting Translation successfully_10")
    public void check_getting_Translation_successfully_10(){
        Response get_Translation_Response  = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[10].key").contains("txt_forget_password_mobile").perform();
    }
    @Test
    @Description(" check getting Translation successfully_11")
    public void check_getting_Translation_successfully_11(){
        Response get_Translation_Response  = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[1].key").contains("txt_login_mobile").perform();
    }
    @Test
    @Description(" check getting Translation successfully_12")
    public void check_getting_Translation_successfully_12(){
        Response get_Translation_Response  = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[12].key").contains("btn_forget_password_reset").perform();
    }
    @Test
    @Description(" check getting Translation successfully_13")
    public void check_getting_Translation_successfully_13(){
        Response get_Translation_Response  = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[13].key").contains("ttl_forget_password_otp").perform();
    }
    @Test
    @Description(" check getting Translation successfully_14")
    public void check_getting_Translation_successfully_14(){
        Response get_Translation_Response  = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[14].key").contains("txt_forget_password_otp_mobile").perform();
    }
    @Test
    @Description(" check getting Translation successfully_15")
    public void check_getting_Translation_successfully_15(){
        Response get_Translation_Response  = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[15].key").contains("txt_forget_password_otp_message").perform();
    }
    @Test
    @Description(" check getting Translation successfully_16")
    public void check_getting_Translation_successfully_16(){
        Response get_Translation_Response  = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[16].key").contains("btn_forget_password_otp_resend").perform();
    }
    @Test
    @Description(" check getting Translation successfully_17")
    public void check_getting_Translation_successfully_17(){
        Response get_Translation_Response  = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[17].key").contains("btn_forget_password_otp_verify").perform();
    }
    @Test
    @Description(" check getting Translation successfully_18")
    public void check_getting_Translation_successfully_18(){
        Response get_Translation_Response  = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[18].key").contains("ttl_forget_password_new").perform();
    }
    @Test
    @Description(" check getting Translation successfully_19")
    public void check_getting_Translation_successfully_19(){
        Response get_Translation_Response  = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[19].key").contains("txt_forget_password_new_password").perform();
    }
    @Test
    @Description(" check getting Translation successfully_20")
    public void check_getting_Translation_successfully_20(){
        Response get_Translation_Response  = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[20].key").contains("txt_forget_password_new_password_hint").perform();
    }
    @Test
    @Description(" check getting Translation successfully_21")
    public void check_getting_Translation_successfully_21(){
        Response get_Translation_Response  = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[21].key").contains("txt_forget_password_new_password_again").perform();
    }
    @Test
    @Description(" check getting Translation successfully_22")
    public void check_getting_Translation_successfully_22(){
        Response get_Translation_Response  = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[22].key").contains("txt_forget_password_new_password_again_hint").perform();
    }
    @Test
    @Description(" check getting Translation successfully_23")
    public void check_getting_Translation_successfully_23(){
        Response get_Translation_Response  = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[23].key").contains("btn_forget_password_new_change").perform();
    }
    @Test
    @Description(" check getting Translation successfully_24")
    public void check_getting_Translation_successfully_24(){
        Response get_Translation_Response  = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[24].key").contains("ttl_registration").perform();
    }
    @Test
    @Description(" check getting Translation successfully_25")
    public void check_getting_Translation_successfully_25(){
        Response get_Translation_Response  = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[25].key").contains("txt_registration_shop_name").perform();
    }
    @Test
    @Description(" check getting Translation successfully_26")
    public void check_getting_Translation_successfully_26(){
        Response get_Translation_Response  = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[26].key").contains("txt_registration_shop_name_hint").perform();
    }
    @Test
    @Description(" check getting Translation successfully_27")
    public void check_getting_Translation_successfully_27(){
        Response get_Translation_Response  = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[27].key").contains("txt_registration_person_name").perform();
    }
    @Test
    @Description(" check getting Translation successfully_28")
    public void check_getting_Translation_successfully_28(){
        Response get_Translation_Response  = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[28].key").contains("txt_registration_person_name_hint").perform();
    }
    @Test
    @Description(" check getting Translation successfully_29")
    public void check_getting_Translation_successfully_29(){
        Response get_Translation_Response  = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[29].key").contains("txt_registration_mobile").perform();
    }
    @Test
    @Description(" check getting Translation successfully_30")
    public void check_getting_Translation_successfully_30(){
        Response get_Translation_Response  = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[30].key").contains("txt_registration_mobile_hint").perform();
    }
    @Test
    @Description(" check getting Translation successfully_31")
    public void check_getting_Translation_successfully_31(){
        Response get_Translation_Response  = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[31].key").contains("txt_registration_password").perform();
    }
    @Test
    @Description(" check getting Translation successfully_32")
    public void check_getting_Translation_successfully_32() {
        Response get_Translation_Response = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[32].key").contains("txt_registration_password_hint").perform();
    }
    @Test
    @Description(" check getting Translation successfully_33")
    public void check_getting_Translation_successfully_33() {
        Response get_Translation_Response = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[33].key").contains("txt_registration_password_confirm").perform();
    }
    @Test
    @Description(" check getting Translation successfully_34")
    public void check_getting_Translation_successfully_34() {
        Response get_Translation_Response = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[34].key").contains("txt_registration_password_confirm_hint").perform();
    }
    @Test
    @Description(" check getting Translation successfully_35")
    public void check_getting_Translation_successfully_35() {
        Response get_Translation_Response = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[35].key").contains("txt_registration_agree").perform();
    }
    @Test
    @Description(" check getting Translation successfully_36")
    public void check_getting_Translation_successfully_36() {
        Response get_Translation_Response = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[36].key").contains("btn_registration_terms_conditions").perform();
    }
    @Test
    @Description(" check getting Translation successfully_37")
    public void check_getting_Translation_successfully_37() {
        Response get_Translation_Response = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[37].key").contains("btn_registration_register").perform();
    }
    @Test
    @Description(" check getting Translation successfully_38")
    public void check_getting_Translation_successfully_38() {
        Response get_Translation_Response = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[38].key").contains("ttl_registration_terms").perform();
    }
    @Test
    @Description(" check getting Translation successfully_39")
    public void check_getting_Translation_successfully_39() {
        Response get_Translation_Response = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[39].key").contains("ttl_registration_otp").perform();
    }
    @Test
    @Description(" check getting Translation successfully_40")
    public void check_getting_Translation_successfully_40() {
        Response get_Translation_Response = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[40].key").contains("txt_registration_otp_mobile").perform();
    }
    @Test
    @Description(" check getting Translation successfully_41")
    public void check_getting_Translation_successfully_41() {
        Response get_Translation_Response = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[41].key").contains("txt_registration_otp_message").perform();
    }
    @Test
    @Description(" check getting Translation successfully_42")
    public void check_getting_Translation_successfully_42() {
        Response get_Translation_Response = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[42].key").contains("btn_registration_otp_resend").perform();
    }
    @Test
    @Description(" check getting Translation successfully_43")
    public void check_getting_Translation_successfully_43() {
        Response get_Translation_Response = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[43].key").contains("btn_registration_otp_verify").perform();
    }
    @Test
    @Description(" check getting Translation successfully_44")
    public void check_getting_Translation_successfully_44() {
        Response get_Translation_Response = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[44].key").contains("ttl_profile").perform();
    }
    @Test
    @Description(" check getting Translation successfully_45")
    public void check_getting_Translation_successfully_45() {
        Response get_Translation_Response = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[45].key").contains("txt_profile_status_pending").perform();
    }
    @Test
    @Description(" check getting Translation successfully_46")
    public void check_getting_Translation_successfully_46() {
        Response get_Translation_Response = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[46].key").contains("txt_profile_shop_name").perform();
    }
    @Test
    @Description(" check getting Translation successfully_47")
    public void check_getting_Translation_successfully_47() {
        Response get_Translation_Response = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[47].key").contains("txt_profile_shop_name_hint").perform();
    }
    @Test
    @Description(" check getting Translation successfully_48")
    public void check_getting_Translation_successfully_48() {
        Response get_Translation_Response = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[48].key").contains("txt_profile_person_name").perform();
    }
    @Test
    @Description(" check getting Translation successfully_49")
    public void check_getting_Translation_successfully_49() {
        Response get_Translation_Response = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[49].key").contains("txt_profile_person_name_hint").perform();
    }
    @Test
    @Description(" check getting Translation successfully_50")
    public void check_getting_Translation_successfully_50() {
        Response get_Translation_Response = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[50].key").contains("txt_profile_mobile").perform();
    }
    @Test
    @Description(" check getting Translation successfully_51")
    public void check_getting_Translation_successfully_51() {
        Response get_Translation_Response = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[51].key").contains("txt_profile_mobile_hint").perform();
    }
    @Test
    @Description(" check getting Translation successfully_52")
    public void check_getting_Translation_successfully_52() {
        Response get_Translation_Response = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[52].key").contains("btn_profile_location").perform();
    }
    @Test
    @Description(" check getting Translation successfully_53")
    public void check_getting_Translation_successfully_53() {
        Response get_Translation_Response = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[53].key").contains("btn_profile_services").perform();
    }
    @Test
    @Description(" check getting Translation successfully_54")
    public void check_getting_Translation_successfully_54() {
        Response get_Translation_Response = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[54].key").contains("btn_profile_cr").perform();
    }
    @Test
    @Description(" check getting Translation successfully_55")
    public void check_getting_Translation_successfully_55() {
        Response get_Translation_Response = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[55].key").contains("btn_profile_pictures").perform();
    }
    @Test
    @Description(" check getting Translation successfully_56")
    public void check_getting_Translation_successfully_56() {
        Response get_Translation_Response = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[56].key").contains("btn_profile_save").perform();
    }
    @Test
    @Description(" check getting Translation successfully_57")
    public void check_getting_Translation_successfully_57() {
        Response get_Translation_Response = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[57].key").contains("ttl_profile_location").perform();
    }
    @Test
    @Description(" check getting Translation successfully_58")
    public void check_getting_Translation_successfully_58() {
        Response get_Translation_Response = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[58].key").contains("txt_profile_location_type").perform();
    }
    @Test
    @Description(" check getting Translation successfully_59")
    public void check_getting_Translation_successfully_59() {
        Response get_Translation_Response = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[59].key").contains("txt_profile_location_address").perform();
    }
    @Test
    @Description(" check getting Translation successfully_60")
    public void check_getting_Translation_successfully_60() {
        Response get_Translation_Response = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[60].key").contains("txt_profile_location_address_hint").perform();
    }
    @Test
    @Description(" check getting Translation successfully_61")
    public void check_getting_Translation_successfully_61() {
        Response get_Translation_Response = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[61].key").contains("btn_profile_location_save").perform();
    }
    @Test
    @Description(" check getting Translation successfully_62")
    public void check_getting_Translation_successfully_62() {
        Response get_Translation_Response = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[62].key").contains("ttl_profile_services").perform();
    }
    @Test
    @Description(" check getting Translation successfully_63")
    public void check_getting_Translation_successfully_63() {
        Response get_Translation_Response = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[63].key").contains("txt_profile_services_brands").perform();
    }
    @Test
    @Description(" check getting Translation successfully_64")
    public void check_getting_Translation_successfully_64() {
        Response get_Translation_Response = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[64].key").contains("txt_profile_services_brands_hint").perform();
    }
    @Test
    @Description(" check getting Translation successfully_65")
    public void check_getting_Translation_successfully_65() {
        Response get_Translation_Response = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[65].key").contains("ttl_profile_services_brands_list").perform();
    }
    @Test
    @Description(" check getting Translation successfully_66")
    public void check_getting_Translation_successfully_66() {
        Response get_Translation_Response = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[66].key").contains("txt_profile_services_brands_list_search").perform();
    }
    @Test
    @Description(" check getting Translation successfully_67")
    public void check_getting_Translation_successfully_67() {
        Response get_Translation_Response = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[67].key").contains("txt_profile_services_brands_list_search_hint").perform();
    }
    @Test
    @Description(" check getting Translation successfully_68")
    public void check_getting_Translation_successfully_68() {
        Response get_Translation_Response = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[68].key").contains("btn_profile_services_brands_list_save").perform();
    }
    @Test
    @Description(" check getting Translation successfully_69")
    public void check_getting_Translation_successfully_69() {
        Response get_Translation_Response = get_Translations_Main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[69].key").contains("txt_profile_services_brands_specialized").perform();
    }
    @Test
    @Description(" check getting Translation failed")
    public void Get_Translations_failed() {
    Response get_Translation_Response = get_Translations_Main.Get_Translations_successfully();
    Validations.assertThat().response(get_Translation_Response)
            .extractedJsonValue("message").contains("").perform();
    }
}