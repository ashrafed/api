package Orders.Change_Status.Receive_Car;

import Auth.Login_Main;
import Orders.Change_Status.Receive_Car.Recived_From_Customer_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Recived_From_Customer {
    private RestActions apiobject ;
    private Recived_From_Customer_Main recived_From_Customer_Main;
    private Login_Main login_main;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        recived_From_Customer_Main = new Recived_From_Customer_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);
    }
    @Test
    @Description("validate on message when status equal 10")
    public void Recived_From_Customer_check_message(){
        Response Recived_From_Customer_Main_Response = recived_From_Customer_Main
                .Success_Recived_From_Customer("10");
        Validations.assertThat().response(Recived_From_Customer_Main_Response).
                extractedJsonValue("message")
                .contains("You Are Not Allowed To Change This Order Status")
                .perform();
    }
    @Test
    @Description("validate on errors when status equal 10")
    public void Recived_From_Customer_check_errors(){
        Response Recived_From_Customer_Main_Response = recived_From_Customer_Main
                .Success_Recived_From_Customer("10");
        Validations.assertThat().response(Recived_From_Customer_Main_Response).
                extractedJsonValue("errors[0]")
                .contains("err_order_status_provider_not_allowed")
                .perform();
    }
    @Test
    @Description("validate on status code that = 501")
    public void Recived_From_Customer_check_status_code(){
        Response Recived_From_Customer_Main_Response = recived_From_Customer_Main
                .Success_Recived_From_Customer("10");
        Validations.assertThat().response(Recived_From_Customer_Main_Response).
                extractedJsonValue("status_code")
                .contains("501")
                .perform();
    }
    @Test
    @Description("validate on status 'body' that don’t accept letters / 'message' ")
    public void Recived_From_Customer_check_status_entries___message___(){
        Response Recived_From_Customer_Main_Response = recived_From_Customer_Main
                .Success_Recived_From_Customer("letters");
        Validations.assertThat().response(Recived_From_Customer_Main_Response).
                extractedJsonValue("message")
                .contains("Failed Change Order Status")
                .perform();
    }
    @Test
    @Description("validate on status 'body' that don’t accept letters / 'errors' ")
    public void Recived_From_Customer_check_status_entries___errors___(){
        Response Recived_From_Customer_Main_Response = recived_From_Customer_Main
                .Success_Recived_From_Customer("letters");
        Validations.assertThat().response(Recived_From_Customer_Main_Response).
                extractedJsonValue("errors[0]")
                .contains("err_order_status_status_not_valid")
                .perform();
    }
}
