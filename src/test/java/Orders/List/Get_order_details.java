package Orders.List;

import Auth.main_Class;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Get_order_details {
    private RestActions apiobject;
    private main_Class maain_class;
    private Get_order_details_Main get_order_details_Main;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(main_Class.BASE_URL);
        maain_class = new main_Class(apiobject);
        get_order_details_Main = new Get_order_details_Main(apiobject);
        maain_class.login("966506425181" , "123456");
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
                .contains("8174")
                .perform();
    }
    @Test
    @Description("Success Get otp receive car from customer")
    public void Success_Get_otp_receive_car_from_customer(){
        Response Success_Get_order_details_Respone = get_order_details_Main.SuccessGet_order_details();
        Validations.assertThat().response(Success_Get_order_details_Respone)
                .extractedJsonValue("data.otp_receive_car_from_customer")
                .contains("5126")
                .perform();
    }
    @Test
    @Description("Success Get invitation expire at")
    public void Success_Get_invitation_expire_at(){
        Response Success_Get_order_details_Respone = get_order_details_Main.SuccessGet_order_details();
        Validations.assertThat().response(Success_Get_order_details_Respone)
                .extractedJsonValue("data.invitation_expire_at")
                .contains("0")
                .perform();
    }
    @Test
    @Description("Success Get updated at")
    public void Success_Get_updated_at(){
        Response Success_Get_order_details_Respone = get_order_details_Main.SuccessGet_order_details();
        Validations.assertThat().response(Success_Get_order_details_Respone)
                .extractedJsonValue("data.updated_at")
                .contains("2021-12-28 08:07:11")
                .perform();
    }
}
