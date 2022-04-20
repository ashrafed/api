package Notifications;

import Auth.main_Class;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Mark_one_notification_as_seen {
    private RestActions apiobject ;
    private main_Class maain_Class;
    private Mark_one_notification_as_seen_Main mark_one_notification_as_seen_main;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(main_Class.BASE_URL);
        maain_Class = new main_Class(apiobject);
        mark_one_notification_as_seen_main = new Mark_one_notification_as_seen_Main(apiobject);
        maain_Class.login("966506425181" , "123456");

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