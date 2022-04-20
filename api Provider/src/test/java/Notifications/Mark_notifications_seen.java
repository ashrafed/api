package Notifications;

import Auth.main_Class;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Mark_notifications_seen {
        private RestActions apiobject ;
        private main_Class maain_Class;
        private Mark_notifications_seen_Main mark_notifications_seen_main;

        @BeforeClass
        public void beforclass(){
            apiobject = DriverFactory.getAPIDriver(main_Class.BASE_URL);
            maain_Class = new main_Class(apiobject);
            mark_notifications_seen_main = new Mark_notifications_seen_Main(apiobject);
            maain_Class.login("966506425181" , "123456");
        }

        @Test
        @Description("Check Mark Notifications Seen is Any Number")
        public void Mark_notifications_seen_is_Any_Number(){
            Response Mark_notifications_seen_Response = mark_notifications_seen_main
                    .Mark_notifications_seen("3");

            Validations.assertThat().response(Mark_notifications_seen_Response)
                    .extractedJsonValue("message")
                    .contains("success seen notifications")
                    .perform();
        }

    @Test
    @Description("Check Mark Notifications Seen is letters")
    public void Mark_notifications_seen_is_letters(){
        Response Mark_notifications_seen_Response = mark_notifications_seen_main
                .Mark_notifications_seen("ABCD");

        Validations.assertThat().response(Mark_notifications_seen_Response)
                .extractedJsonValue("message")
                .contains("success seen notifications")
                .perform();
    }

    @Test
    @Description("Check Mark Notifications Seen is EMPTY")
    public void Mark_notifications_seen_is_EMPTY(){
        Response Mark_notifications_seen_Response = mark_notifications_seen_main
                .Mark_notifications_seen("");

        Validations.assertThat().response(Mark_notifications_seen_Response)
                .extractedJsonValue("message")
                .contains("success seen notifications")
                .perform();
    }

    @Test
    @Description("Check Mark Notifications Seen is symbol")
    public void Mark_notifications_seen_is_symbol(){
        Response Mark_notifications_seen_Response = mark_notifications_seen_main
                .Mark_notifications_seen("!@#$$%");

        Validations.assertThat().response(Mark_notifications_seen_Response)
                .extractedJsonValue("message")
                .contains("success seen notifications")
                .perform();
    }
}
