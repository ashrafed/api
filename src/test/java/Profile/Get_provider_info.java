package Profile;

import Auth.main_Class;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Get_provider_info {
    private RestActions apiobject ;

    private main_Class maain_Class;

    private Get_provider_info_Main get_provider_info;



    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(main_Class.BASE_URL);
        maain_Class = new main_Class(apiobject);
        get_provider_info = new Get_provider_info_Main(apiobject);
        maain_Class.login("966506425181" , "123456");
    }

    @Test
    @Description("check_get_provider_info_successfully")
    public void get_provider_info(){
        Response get_provider_info_Response = get_provider_info.Get_provider_info();

        Validations.assertThat().
                response(get_provider_info_Response)
                .extractedJsonValue("status_code")
                .contains(200)
                .perform();

    }

    @Test
    @Description("check_get_provider_info_when_user_Unauthenticated")
    public void get_provider_info_Unauthenticated(){
        Response get_provider_info_Response = get_provider_info.Get_provider_info();

        Validations.assertThat().
                response(get_provider_info_Response)
                .extractedJsonValue("status_code")
                .contains(200)
                .perform();

    }

}
