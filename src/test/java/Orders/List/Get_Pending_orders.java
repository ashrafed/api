package Orders.List;

import Auth.main_Class;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Get_Pending_orders {
    private RestActions apiobject;
    private main_Class maain_class;
    private Get_Pending_orders_Main get_Pending_orders_Main;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(main_Class.BASE_URL);
        maain_class = new main_Class(apiobject);
        get_Pending_orders_Main = new Get_Pending_orders_Main(apiobject);
        maain_class.login("966506425181" , "123456");
    }
    @Test
    @Description("Validate on message")
    public void Success_Get_Pending_orders_message(){
        Response Success_Get_Pending_orders_Respone = get_Pending_orders_Main.Success_Get_Pending_orders();

        Validations.assertThat().response(Success_Get_Pending_orders_Respone)
                .extractedJsonValue("message")
                .contains("can not find order")
                .perform();
    }
    @Test
    @Description("Validate on status code")
    public void Success_Get_Pending_orders_status_code() {
        Response Success_Get_Pending_orders_Respone = get_Pending_orders_Main.Success_Get_Pending_orders();

        Validations.assertThat().response(Success_Get_Pending_orders_Respone)
                .extractedJsonValue("status_code")
                .contains("404")
                .perform();
    }
}
