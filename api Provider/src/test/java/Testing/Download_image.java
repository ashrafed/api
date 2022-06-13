package Testing;

import Auth.Login_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Download_image {
    private RestActions apiobject ;
    private Login_Main login_main;
    private Download_image_Main download_image_Main;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        download_image_Main = new Download_image_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);
    }
    @Test
    @Description("check_Download_image_successfully")
    public void Download_image(){
        Response Download_image_Response = download_image_Main.Download_image();
    }
}
