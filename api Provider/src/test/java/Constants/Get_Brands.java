package Constants;

import Auth.Login_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Get_Brands {
    private RestActions apiobject;
    private Login_Main maain_Class;
    private Get_Brands_Main get_Brands_Main;

    @BeforeClass
    public void beforeclass() {
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        maain_Class = new Login_Main(apiobject);
        get_Brands_Main = new Get_Brands_Main(apiobject);


    }

    @Test
    @Description("Get Brands check on  *image/image_url/name_ar/name_en/id* ")
    public void Get_Brands_check_everything_successfully() {
        Response Get_Brands_Main_Response = get_Brands_Main.Get_Brands_successfully();
        Validations.assertThat().response(Get_Brands_Main_Response)
                .containsFileContent("src/test/java/Constants/Get_Brands.json").perform();

    }
}
