package Testing;

import Auth.main_Class;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Get_Nearest_Providers_To_Critira {
    private RestActions apiobject ;
    private Get_Nearest_Providers_To_Critira_Main get_Nearest_Providers_To_Critira_Main;
    private main_Class maain_Class;


    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(main_Class.BASE_URL);
        maain_Class = new main_Class(apiobject);
        get_Nearest_Providers_To_Critira_Main = new Get_Nearest_Providers_To_Critira_Main(apiobject);
        maain_Class.login("966506425181" , "123456");
    }
    @Test
    @Description("check Sent SMS")
    public void check_Sent_SMS(){
        Response Get_Nearest_Providers_To_Critira_Main_Response = get_Nearest_Providers_To_Critira_Main
                .Get_Nearest_Providers_To_Critira_Successfully("24.703969","5","54","1");
        Validations.assertThat().response(Get_Nearest_Providers_To_Critira_Main_Response).extractedJsonValue("message")
                .contains("Undefined array key \"longitude\"")
                .perform();
    }
}