package Orders.Invitation;

import Auth.Login_Main;
import Orders.Invitation.Accept_Order_Invitation_Request_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Accept_Order_Invitation_Request {
    private RestActions apiobject ;
    private Accept_Order_Invitation_Request_Main accept_Order_Invitation_Request_Main;
    private Login_Main login_main;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        accept_Order_Invitation_Request_Main = new Accept_Order_Invitation_Request_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);
    }
    @Test
    @Description("Accept Order Invitation Request body = 1")
    public void Accept_Order_Invitation_Request_message_1(){
        Response Accept_Order_Invitation_Request_Response = accept_Order_Invitation_Request_Main.
                Success_Accept_Order_Invitation_Request(1);
        Validations.assertThat().response(Accept_Order_Invitation_Request_Response).
                extractedJsonValue("message")
                .contains("Provider Not Activated By Admin")
                .perform();
    }
    @Test
    @Description("Accept Order Invitation Request body = 1")
    public void Accept_Order_Invitation_Request_errors_1(){
        Response Accept_Order_Invitation_Request_Response = accept_Order_Invitation_Request_Main.
                Success_Accept_Order_Invitation_Request(1);
        Validations.assertThat().response(Accept_Order_Invitation_Request_Response).
                extractedJsonValue("errors[0]")
                .contains("err_order_response_provider_not_activated")
                .perform();
    }
    @Test
    @Description("Accept Order Invitation Request body = 1")
    public void Accept_Order_Invitation_Request_status_code_1() {
        Response Accept_Order_Invitation_Request_Response = accept_Order_Invitation_Request_Main.
                Success_Accept_Order_Invitation_Request(1);
        Validations.assertThat().response(Accept_Order_Invitation_Request_Response).
                extractedJsonValue("status_code")
                .contains("406")
                .perform();
    }
    @Test
    @Description("Accept Order Invitation Request body = 2")
    public void Accept_Order_Invitation_Request_message_2() {
        Response Accept_Order_Invitation_Request_Response = accept_Order_Invitation_Request_Main.
                Success_Accept_Order_Invitation_Request(2);
        Validations.assertThat().response(Accept_Order_Invitation_Request_Response).
                extractedJsonValue("message")
                .contains("Provider Not Activated By Admin")
                .perform();
    }
    @Test
    @Description("Accept Order Invitation Request body = 2")
    public void Accept_Order_Invitation_Request_errors_2(){
        Response Accept_Order_Invitation_Request_Response = accept_Order_Invitation_Request_Main.
                Success_Accept_Order_Invitation_Request(2);
        Validations.assertThat().response(Accept_Order_Invitation_Request_Response).
                extractedJsonValue("errors[0]")
                .contains("err_order_response_provider_not_activated")
                .perform();
    }
    @Test
    @Description("Accept Order Invitation Request body = 2")
    public void Accept_Order_Invitation_Request_status_code_2() {
        Response Accept_Order_Invitation_Request_Response = accept_Order_Invitation_Request_Main.
                Success_Accept_Order_Invitation_Request(2);
        Validations.assertThat().response(Accept_Order_Invitation_Request_Response).
                extractedJsonValue("status_code")
                .contains("406")
                .perform();
    }
    @Test
    @Description("Accept Order Invitation Request body = 0")
    public void Accept_Order_Invitation_Request_message(){
        Response Accept_Order_Invitation_Request_Response = accept_Order_Invitation_Request_Main.
                Failed_Accept_Order_Invitation_Request(0);
        Validations.assertThat().response(Accept_Order_Invitation_Request_Response).
                extractedJsonValue("message")
                .contains("invalid input data")
                .perform();
    }
    @Test
    @Description("Accept Order Invitation Request body = 0")
    public void Accept_Order_Invitation_Request_errors(){
        Response Accept_Order_Invitation_Request_Response = accept_Order_Invitation_Request_Main.
                Failed_Accept_Order_Invitation_Request(0);
        Validations.assertThat().response(Accept_Order_Invitation_Request_Response).
                extractedJsonValue("errors[0]")
                .contains("الحقل status لاغٍ")
                .perform();
    }
    @Test
    @Description("Accept Order Invitation Request body = 0")
    public void Accept_Order_Invitation_Request_status_code(){
        Response Accept_Order_Invitation_Request_Response = accept_Order_Invitation_Request_Main.
                Failed_Accept_Order_Invitation_Request(0);
        Validations.assertThat().response(Accept_Order_Invitation_Request_Response).
                extractedJsonValue("status_code")
                .contains("422")
                .perform();
    }
}