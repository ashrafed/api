package Users_Flows;

import Auth.Login_Main;
import Orders.Change_Status.Maintenance.Finish_Maintance_Main;
import Orders.Change_Status.Maintenance.Start_Maintance_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import org.testng.annotations.BeforeClass;

public class CP_1069_Login_$_Order_$_Change_Status_$_Deliver_Car_$_Shop_Deliver_to_Customer_$_Resend_Complete_Order_Confirmation_code_to_Customer {
    private RestActions apiobject ;
    private Login_Main login_main ;
    private Start_Maintance_Main start_maintance_main;
    private Finish_Maintance_Main finish_maintance_main;

    @BeforeClass
    public void beforeclass() {
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        start_maintance_main = new Start_Maintance_Main(apiobject);
        finish_maintance_main = new Finish_Maintance_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);
    }
}