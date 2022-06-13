package Users_Flows;

import Auth.Login_Main;
import Profile.Add_mobile_info_main;
import Profile.Get_provider_info_Main;
import Profile.Working_Hours.Add_Working_Hours_Main;
import Profile.Working_Hours.Get_Working_Hours_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CP_1047_Login_$_Add_Working_Hours_$_Get_Working_Hours_$_Add_mobile_info_$_Get_provider_info {
    private RestActions apiobject ;
    private Login_Main login_main ;
    private Add_Working_Hours_Main add_working_hours_main;
    private Get_Working_Hours_Main get_working_hours_main;
    private Add_mobile_info_main add_mobile_info_main;
    private Get_provider_info_Main get_provider_info_main;


    @BeforeClass
    public void beforeclass() {
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        add_working_hours_main = new Add_Working_Hours_Main(apiobject);
        get_working_hours_main = new Get_Working_Hours_Main(apiobject);
        add_mobile_info_main = new Add_mobile_info_main(apiobject);
        get_provider_info_main = new Get_provider_info_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);
    }
    @Test
    @Description("Add Working Hours")
    public void Add_Working_Hours_success() {
        Response Add_Working_Hours_Respons = add_working_hours_main.add_Working_Hours();
        Validations.assertThat().response(Add_Working_Hours_Respons)
                .extractedJsonValue("message")
                .contains("success add working hours")
                .perform();
    }

    @Test (dependsOnMethods = {"Add_Working_Hours_success"})
    @Description("Get Working Hours")
    public void check_massage_get_Working_Hours() {
        Response get_Working_Hours_Respons = get_working_hours_main.Get_Working_Hours();
        Validations.assertThat().response(get_Working_Hours_Respons)
                .extractedJsonValue("message")
                .contains("success get working hours")
                .perform();
    }
    @Test (dependsOnMethods = {"check_massage_get_Working_Hours"})
    @Description("Add mobile info")
    public void check_fcm_token_for_Add_mobile_info(){
        Response Add_mobile_info_Respons = add_mobile_info_main.add_mobile_info(
                "update fcmtokenfcmtoken",
                1 ,
                "0.11.0" ,
                "2021-05-25 23:32:09" ,
                "25.882083" ,
                "45.303154"
        );
        Validations.assertThat().response(Add_mobile_info_Respons).extractedJsonValue("message")
                .contains("Updated Success")
                .perform();
    }
    @Test (dependsOnMethods = {"check_fcm_token_for_Add_mobile_info"})
    @Description("Get provider info")
    public void get_provider_info(){
        Response get_provider_info_Response = get_provider_info_main.Get_provider_info();

        Validations.assertThat().
                response(get_provider_info_Response)
                .extractedJsonValue("status_code")
                .contains(200)
                .perform();

    }

}
