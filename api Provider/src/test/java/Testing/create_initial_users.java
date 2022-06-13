package Testing;

import Auth.Login_Main;
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
    private Login_Main login_main;


    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        create_initial_users_Main = new Create_initial_users_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);
    }
    @Test
    @Description("check Push Test Notifications")
    public void check_Create_initial_users_Main_Successfully(){
        Response Create_initial_users_Main_Response = create_initial_users_Main.Create_initial_users_Successfully(1);

        Validations.assertThat().response(Create_initial_users_Main_Response).extractedJsonValue("message")
                .contains("success add users ")
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



