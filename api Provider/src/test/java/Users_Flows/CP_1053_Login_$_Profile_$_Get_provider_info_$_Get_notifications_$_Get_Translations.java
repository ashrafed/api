package Users_Flows;

import Auth.Login_Main;
import Constants.Get_Translations_Main;
import Notifications.Get_Notifications_Main;
import Profile.Get_provider_info_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CP_1053_Login_$_Profile_$_Get_provider_info_$_Get_notifications_$_Get_Translations {
    private RestActions apiobject ;
    private Login_Main login_main ;
    private Get_provider_info_Main get_provider_info_main;
    private Get_Notifications_Main get_notifications_main;
    private Get_Translations_Main get_translations_main;

    @BeforeClass
    public void beforeclass() {
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        get_provider_info_main = new Get_provider_info_Main(apiobject);
        get_notifications_main = new Get_Notifications_Main(apiobject);
        get_translations_main = new Get_Translations_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);
    }
    @Test
    @Description("Get provider info")
    public void get_provider_info(){
        Response get_provider_info_Response = get_provider_info_main.Get_provider_info();
        Validations.assertThat().
                response(get_provider_info_Response)
                .extractedJsonValue("status_code")
                .contains(200)
                .perform();
    }
    @Test (dependsOnMethods = {"get_provider_info"})
    @Description("Get Notifications")
    public void check_massage_get_Working_Hours(){
        Response get_Working_Hours_Respons  = get_notifications_main.Get_Notifications();
        Validations.assertThat().response(get_Working_Hours_Respons)
                .extractedJsonValue("message")
                .contains("list notifications")
                .perform();
    }
    @Test (dependsOnMethods = {"check_massage_get_Working_Hours"})
    @Description("Get Translations")
    public void check_getting_Translation_successfully_0(){
        Response get_Translation_Response  = get_translations_main.Get_Translations_successfully();
        Validations.assertThat().response(get_Translation_Response)
                .extractedJsonValue("data[0].key").contains("ttl_login").perform();
    }
}
