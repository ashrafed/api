package Users_Flows;

import Auth.Login_Main;
import Orders.List.Get_Filters_Main;
import Orders.List.Get_Old_Orders_Main;
import Orders.List.Get_Pending_orders_Main;
import Orders.List.Get_order_details_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CP_1061_Login_$_Orders_$_Get_Old_Orders_$_Get_pending_orders_$_Get_order_details_$_Get_filters {
    private RestActions apiobject ;
    private Login_Main login_main ;
    private Get_Old_Orders_Main get_old_orders_main;
    private Get_Pending_orders_Main get_pending_orders_main;
    private Get_order_details_Main get_order_details_main;
    private Get_Filters_Main get_filters_main;

    @BeforeClass
    public void beforeclass() {
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        get_old_orders_main = new Get_Old_Orders_Main(apiobject);
        get_pending_orders_main = new Get_Pending_orders_Main(apiobject);
        get_order_details_main = new Get_order_details_Main(apiobject);
        get_filters_main = new Get_Filters_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);
    }
    @Test
    @Description("Get Old Orders")
    public void Success_Get_Old_Orders(){
        Response Success_Get_Old_Orders_Respone = get_old_orders_main.Success_Get_Old_Orders();

        Validations.assertThat().response(Success_Get_Old_Orders_Respone)
                .extractedJsonValue("message")
                .contains("Success List Old Orders.")
                .perform();
    }
    @Test (dependsOnMethods = {"Success_Get_Old_Orders"})
    @Description("Get Pending orders")
    public void Success_Get_Pending_orders_message(){
        Response Success_Get_Pending_orders_Respone = get_pending_orders_main.Success_Get_Pending_orders();

        Validations.assertThat().response(Success_Get_Pending_orders_Respone)
                .extractedJsonValue("message")
                .contains("Success List Pending Orders.")
                .perform();
    }
    @Test
    @Description("Success Get order details")
    public void Success_Get_order_details(){
        Response Success_Get_order_details_Respone = get_order_details_main.SuccessGet_order_details();
        Validations.assertThat().response(Success_Get_order_details_Respone)
                .extractedJsonValue("message")
                .contains("Get Order Details.")
                .perform();
    }
    @Test
    @Description("Success_Get_Old_Orders")
    public void Success_Get_Filters(){
        Response Success_Get_Filters_Response = get_filters_main.Success_Accept_Order_Invitation_Request("2");
        Validations.assertThat().response(Success_Get_Filters_Response)
                .extractedJsonValue("message")
                .contains("Success get order filters.")
                .perform();
    }

}
