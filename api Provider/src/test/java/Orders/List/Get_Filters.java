package Orders.List;

import Auth.Login_Main;
import Orders.List.Get_Filters_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Get_Filters {
    private RestActions apiobject;
    private Login_Main login_main;
    private Get_Filters_Main get_Filters_Main;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        get_Filters_Main = new Get_Filters_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);
    }
    @Test
    @Description("Success_Get_Old_Orders")
    public void Success_Get_Filters(){
        Response Success_Get_Filters_Response = get_Filters_Main.Success_Accept_Order_Invitation_Request("2");
        Validations.assertThat().response(Success_Get_Filters_Response)
                .extractedJsonValue("message")
                .contains("Success get order filters.")
                .perform();
    }

}
