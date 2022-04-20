package Testing;

import Auth.main_Class;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class create_initial_users {
    private RestActions apiobject ;
    private Create_initial_users_Main create_initial_users_Main;
    private main_Class maain_Class;


    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(main_Class.BASE_URL);
        maain_Class = new main_Class(apiobject);
        create_initial_users_Main = new Create_initial_users_Main(apiobject);
        maain_Class.login("966506425181" , "123456");
    }
    @Test
    @Description("check Push Test Notifications")
    public void check_Create_initial_users_Main_Successfully(){
        Response Create_initial_users_Main_Response = create_initial_users_Main.Create_initial_users_Successfully(1);

        Validations.assertThat().response(Create_initial_users_Main_Response).extractedJsonValue("message")
                .contains("Integrity constraint violation")
                .perform();
    }
    @Test
    @Description("check Push Test Notifications")
    public void check_Create_initial_users_Main_Failed(){
        Response Create_initial_users_Main_Response = create_initial_users_Main.Push_Test_Notifications_failed(1);

        Validations.assertThat().response(Create_initial_users_Main_Response).extractedJsonValue("message")
                .doesNotContain("negative")
                .perform();
    }
}



