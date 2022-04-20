package Orders.Change_Status.Complete_Order;

import Auth.main_Class;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Complete_Order {
    private RestActions apiobject;
    private main_Class maain_class;
    private Complete_Order_Main complete_Order_Main;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(main_Class.BASE_URL);
        maain_class = new main_Class(apiobject);
        complete_Order_Main = new Complete_Order_Main(apiobject);
        maain_class.login("966506425181" , "123456");
    }
    @Test
    @Description("Validate on message Body = 'status:90 , otp:9531' ")
    public void Success_Complete_Order_Validate_on_message(){
        Response Complete_Order_Respone = complete_Order_Main.Success_Complete_Order_Main("90","9531");
        Validations.assertThat().response(Complete_Order_Respone)
                .extractedJsonValue("message")
                .contains("You Are Not Allowed To Change This Order Status")
                .perform();
    }
    @Test
    @Description("Validate on message Body = 'status:90 , otp:9531' ")
    public void Success_Complete_Order_Validate_on_errors(){
        Response Complete_Order_Respone = complete_Order_Main.Success_Complete_Order_Main("90","9531");
        Validations.assertThat().response(Complete_Order_Respone)
                .extractedJsonValue("errors")
                .contains("err_order_status_provider_not_allowed")
                .perform();
    }
    @Test
    @Description("Validate on message Body = 'status:80' ")
    public void Success_Complete_Order_Validate_on_otp_errors(){
        Response Complete_Order_Respone = complete_Order_Main.Success_Complete_Order_Main("80","");
        Validations.assertThat().response(Complete_Order_Respone)
                .extractedJsonValue("errors")
                .contains("[err_order_status_provider_not_allowed]")
                .perform();
    }
    @Test
    @Description("Validate on message Body = 'status:80' ")
    public void Success_Complete_Order_Validate_on_otp_message(){
        Response Complete_Order_Respone = complete_Order_Main.Success_Complete_Order_Main("80","");
        Validations.assertThat().response(Complete_Order_Respone)
                .extractedJsonValue("message")
                .contains("You Are Not Allowed To Change This Order Status")
                .perform();
    }
}
