package Orders.List;

import Auth.Login_Main;
import Orders.List.Get_order_details_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Get_order_details {
    private RestActions apiobject;
    private Login_Main login_main;
    private Get_order_details_Main get_order_details_Main;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        get_order_details_Main = new Get_order_details_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);
    }
    @Test
    @Description("Success Get order details")
    public void Success_Get_order_details(){
        Response Success_Get_order_details_Respone = get_order_details_Main.SuccessGet_order_details();
        Validations.assertThat().response(Success_Get_order_details_Respone)
                .extractedJsonValue("message")
                .contains("Get Order Details.")
                .perform();
    }
    @Test
    @Description("Success Get status code")
    public void Success_Get_status_code(){
        Response Success_Get_order_details_Respone = get_order_details_Main.SuccessGet_order_details();
        Validations.assertThat().response(Success_Get_order_details_Respone)
                .extractedJsonValue("status_code")
                .contains("200")
                .perform();
    }
    @Test
    @Description("Success Get order number")
    public void Success_Get_order_number(){
        Response Success_Get_order_details_Respone = get_order_details_Main.SuccessGet_order_details();
        Validations.assertThat().response(Success_Get_order_details_Respone)
                .extractedJsonValue("data.order_no")
                .contains("")
                .perform();
    }
    @Test
    @Description("Success Get otp receive car from customer")
    public void Success_Get_otp_receive_car_from_customer(){
        Response Success_Get_order_details_Respone = get_order_details_Main.SuccessGet_order_details();
        Validations.assertThat().response(Success_Get_order_details_Respone)
                .extractedJsonValue("data.otp_receive_car_from_customer")
                .contains("")
                .perform();
    }
    @Test
    @Description("Success Get invitation expire at")
    public void Success_Get_invitation_expire_at(){
        Response Success_Get_order_details_Respone = get_order_details_Main.SuccessGet_order_details();
        Validations.assertThat().response(Success_Get_order_details_Respone)
                .extractedJsonValue("data.invitation_expire_at")
                .contains("")
                .perform();
    }
    @Test
    @Description("Success Get updated at")
    public void Success_Get_updated_at(){
        Response Success_Get_order_details_Respone = get_order_details_Main.SuccessGet_order_details();
        Validations.assertThat().response(Success_Get_order_details_Respone)
                .extractedJsonValue("data.updated_at")
                .contains("")
                .perform();
    }
}
