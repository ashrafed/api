package Orders.List;

import Auth.Login_Main;
import Orders.List.Get_Old_Orders_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Get_Old_Orders {
    private RestActions apiobject;
    private Login_Main login_main;
    private Get_Old_Orders_Main get_old_orders_main;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        get_old_orders_main = new Get_Old_Orders_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);
    }

    @Test
    @Description("Success_Get_Old_Orders")
    public void Success_Get_Old_Orders(){
        Response Success_Get_Old_Orders_Respone = get_old_orders_main.Success_Get_Old_Orders();

        Validations.assertThat().response(Success_Get_Old_Orders_Respone)
                .extractedJsonValue("message")
                .contains("Success List Old Orders.")
                .perform();
    }
    @Test
    @Description("check Success_Get_Old_Orders with status_code")
    public void Success_Get_Old_Orders_status_code(){
        Response Success_Get_Old_Orders_Respone = get_old_orders_main.Success_Get_Old_Orders();

        Validations.assertThat().response(Success_Get_Old_Orders_Respone)
                .extractedJsonValue("status_code")
                .contains("200")
                .perform();
    }
}
