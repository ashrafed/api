package Notifications;

import Auth.main_Class;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Get_unseen_notifications_count {
    private RestActions apiobject;
    private main_Class maain_Class;
    private Get_unseen_notifications_count_Main get_unseen_notifications_count_main;


    @BeforeClass
    public void beforeclass() {
        apiobject = DriverFactory.getAPIDriver(main_Class.BASE_URL);
        maain_Class = new main_Class(apiobject);
        get_unseen_notifications_count_main = new Get_unseen_notifications_count_Main(apiobject);

        maain_Class.login("966506425181" , "123456");
    }

    @Test
    @Description(" check success get working hours")
    public void check_massage_get_Working_Hours(){
        Response get_Working_Hours_Respons  = get_unseen_notifications_count_main.Get_Working_Hours();

        Validations.assertThat().response(get_Working_Hours_Respons)
                .extractedJsonValue("message")
                .contains("Notifications Count")
                .perform();
    }
}
