package Testing;

import Auth.main_Class;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Download_image {
    private RestActions apiobject ;
    private main_Class maain_Class;
    private Download_image_Main download_image_Main;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(main_Class.BASE_URL);
        maain_Class = new main_Class(apiobject);
        download_image_Main = new Download_image_Main(apiobject);
        maain_Class.login("966506425181" , "123456");
    }
    @Test
    @Description("check_Download_image_successfully")
    public void Download_image(){
        Response Download_image_Response = download_image_Main.Download_image();
    }
}
