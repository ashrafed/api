package Notifications;

import Auth.Login_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Mark_notifications_seen {
        private RestActions apiobject ;
        private Login_Main login_main;
        private Mark_notifications_seen_Main mark_notifications_seen_main;

        @BeforeClass
        public void beforclass(){
            apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
            login_main = new Login_Main(apiobject);
            mark_notifications_seen_main = new Mark_notifications_seen_Main(apiobject);
            login_main.login(Login_Main.Mobile_Number, Login_Main.Password);
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
