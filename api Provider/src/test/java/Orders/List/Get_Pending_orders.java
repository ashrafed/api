package Orders.List;
import Auth.Login_Main;
import Orders.List.Get_Pending_orders_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Get_Pending_orders {
    private RestActions apiobject;
    private Login_Main maain_class;
    private Get_Pending_orders_Main get_Pending_orders_Main;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        maain_class = new Login_Main(apiobject);
        get_Pending_orders_Main = new Get_Pending_orders_Main(apiobject);
        maain_class.login("966556677888" , "123456");
    }
    @Test
    @Description("Validate on message")
    public void Success_Get_Pending_orders_message(){
        Response Success_Get_Pending_orders_Respone = get_Pending_orders_Main.Success_Get_Pending_orders();

        Validations.assertThat().response(Success_Get_Pending_orders_Respone)
                .extractedJsonValue("message")
                .contains("Success List Pending Orders.")
                .perform();
    }
    @Test
    @Description("Validate on status code")
    public void Success_Get_Pending_orders_status_code() {
        Response Success_Get_Pending_orders_Response = get_Pending_orders_Main.Success_Get_Pending_orders();
        Validations.assertThat().response(Success_Get_Pending_orders_Response)
                .extractedJsonValue("status_code")
                .contains("200")
                .perform();
    }
}
