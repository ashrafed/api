package Orders.Purshase;

import Auth.Login_Main;
import Orders.Purshase.List_Order_Purshases_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class List_Order_Purshases {
    private RestActions apiobject;
    private Login_Main login_main;
    private List_Order_Purshases_Main list_Order_Purshases_Main;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        list_Order_Purshases_Main = new List_Order_Purshases_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);
    }
    @Test
    @Description("Validate on message")
    public void Success_Get_List_Order_Purshases_Validate_on_message(){
        Response Success_Get_List_Order_Purshases_Respone = list_Order_Purshases_Main.Success_List_Order_Purshases_Main();
        Validations.assertThat().response(Success_Get_List_Order_Purshases_Respone)
                .extractedJsonValue("message")
                .contains("There Is No Purchases For This Order")
                .perform();
    }
    @Test
    @Description("Validate on status code")
    public void Success_Get_List_Order_Purshases_Validate_on_status_code(){
        Response Success_Get_List_Order_Purshases_Respone = list_Order_Purshases_Main.Success_List_Order_Purshases_Main();
        Validations.assertThat().response(Success_Get_List_Order_Purshases_Respone)
                .extractedJsonValue("status_code")
                .contains("200")
                .perform();
    }
}
