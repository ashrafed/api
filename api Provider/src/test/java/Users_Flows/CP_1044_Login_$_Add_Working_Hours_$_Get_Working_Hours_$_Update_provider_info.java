package Users_Flows;

import Auth.Login_Main;
import Profile.Update_provider_info_Main;
import Profile.Working_Hours.Add_Working_Hours_Main;
import Profile.Working_Hours.Get_Working_Hours_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CP_1044_Login_$_Add_Working_Hours_$_Get_Working_Hours_$_Update_provider_info {
    private RestActions apiobject ;
    private Login_Main login_main ;
    private Add_Working_Hours_Main add_working_hours_main;
    private Get_Working_Hours_Main get_working_hours_main;
    private Update_provider_info_Main update_provider_info_main;


    @BeforeClass
    public void beforeclass() {
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        add_working_hours_main = new Add_Working_Hours_Main(apiobject);
        get_working_hours_main = new Get_Working_Hours_Main(apiobject);
        update_provider_info_main = new Update_provider_info_Main(apiobject);
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
    @Description("Update provider info")
    public void Update_provider_info_successfully() {
        Response Update_provider_info_Response = update_provider_info_main.update_provider_info();
    }
}
