package Fake_Requests;

import Auth.Login_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Create_Dump_Orders {
    private RestActions apiobject;
    private Login_Main login_main;
    private Create_Dump_Orders_Main create_Dump_Orders_Main;


    @BeforeClass
    public void beforeclass() {
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        create_Dump_Orders_Main = new Create_Dump_Orders_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);
    }

    @Test
    @Description(" check Creating a dump  Orders")
    public void check_Creating_dump_Orders(){
        Response create_Dump_Orders_Response  = create_Dump_Orders_Main.Get_Notifications();

        Validations.assertThat().response(create_Dump_Orders_Response)
                .extractedJsonValue("message")
                .contains("Sorry we can not generate more fake orders you can use Carefer application to create orders.")
                .perform();
    }
}
