package Notifications;

import Auth.Login_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Mark_one_notification_as_seen {
    private RestActions apiobject ;
    private Login_Main login_main;
    private Mark_one_notification_as_seen_Main mark_one_notification_as_seen_main;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        mark_one_notification_as_seen_main = new Mark_one_notification_as_seen_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);

    }

    @Test
    @Description("Check Mark Notifications Seen is Any Number")
    public void Mark_notifications_seen_is_Any_Number(){
        Response Mark_notifications_seen_Response = mark_one_notification_as_seen_main
                .Mark_one_notification_as_seen();

        Validations.assertThat().response(Mark_notifications_seen_Response)
                .extractedJsonValue("message")
                .contains("success seen notification")
                .perform();
    }
}