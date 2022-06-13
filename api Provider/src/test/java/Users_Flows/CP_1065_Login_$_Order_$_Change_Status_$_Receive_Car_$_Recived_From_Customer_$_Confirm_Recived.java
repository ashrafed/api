package Users_Flows;
import Auth.Login_Main;
import Orders.Change_Status.Receive_Car.Confirm_Recived_From_Customer_Main;
import Orders.Change_Status.Receive_Car.Recived_From_Customer_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CP_1065_Login_$_Order_$_Change_Status_$_Receive_Car_$_Recived_From_Customer_$_Confirm_Recived{
    private RestActions apiobject ;
    private Login_Main login_main ;
    private Recived_From_Customer_Main recived_from_customer_main;
    private Confirm_Recived_From_Customer_Main confirm_recived_from_customer_main;

    @BeforeClass
    public void beforeclass() {
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        recived_from_customer_main = new Recived_From_Customer_Main(apiobject);
        confirm_recived_from_customer_main = new Confirm_Recived_From_Customer_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);
    }
    @Test
    @Description("validate on message when status equal 10")
    public void Recived_From_Customer_check_message(){
        Response Recived_From_Customer_Main_Response = recived_from_customer_main
                .Success_Recived_From_Customer("10");
        Validations.assertThat().response(Recived_From_Customer_Main_Response).
                extractedJsonValue("message")
                .contains("You Are Not Allowed To Change This Order Status")
                .perform();
    }
    @Test (dependsOnMethods = {"Recived_From_Customer_check_message"})
    @Description("check message with the true indexes on postman")
    public void confirm_Recived_From_Customer_check_message_with_all_indexes(){
        Response Confirm_Recived_From_Customer_Main_Response = confirm_recived_from_customer_main
                .Success_Confirm_Recived_From_Customer("20","9531");
        Validations.assertThat().response(Confirm_Recived_From_Customer_Main_Response).
                extractedJsonValue("message")
                .contains("You Are Not Allowed To Change This Order Status")
                .perform();
    }

}
