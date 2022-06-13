package Users_Flows;

import Auth.Login_Main;
import Notifications.Get_Notifications_Main;
import Notifications.Mark_one_notification_as_seen;
import Notifications.Mark_one_notification_as_seen_Main;
import Profile.Get_provider_info_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CP_1051_Login_$_Profile_$_Get_provider_info_$_Get_notifications_$_Mark_one_notification_as_seen {
    private RestActions apiobject ;
    private Login_Main login_main ;
    private Get_provider_info_Main get_provider_info_main;
    private Get_Notifications_Main get_notifications_main;
    private Mark_one_notification_as_seen_Main mark_one_notification_as_seen_main;

    @BeforeClass
    public void beforeclass() {
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        get_provider_info_main = new Get_provider_info_Main(apiobject);
        get_notifications_main = new Get_Notifications_Main(apiobject);
        mark_one_notification_as_seen_main = new Mark_one_notification_as_seen_Main(apiobject);
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
    @Description("Mark one notification as seen")
    public void Mark_notifications_seen_is_Any_Number(){
        Response Mark_notifications_seen_Response = mark_one_notification_as_seen_main
                .Mark_one_notification_as_seen();
        Validations.assertThat().response(Mark_notifications_seen_Response)
                .extractedJsonValue("message")
                .contains("success seen notification")
                .perform();
    }
}
