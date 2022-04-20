package Testing;

import Auth.main_Class;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Import_Carefer_Shops {
    private RestActions apiobject ;
    private main_Class maain_Class;
    private Import_Carefer_Shops_Main import_Carefer_Shops_Main;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(main_Class.BASE_URL);
        maain_Class = new main_Class(apiobject);
        import_Carefer_Shops_Main = new Import_Carefer_Shops_Main(apiobject);
        maain_Class.login("966506425181" , "123456");
    }
    @Test
    @Description("check_get_provider_info_successfully")
    public void get_provider_info(){
        Response Import_Carefer_Shops_Response = import_Carefer_Shops_Main.Import_Carefer_Shops();
        Validations.assertThat().
                response(Import_Carefer_Shops_Response)
                .extractedJsonValue("message")
                .contains("Sorry you can not use this API.")
                .perform();

    }

}
