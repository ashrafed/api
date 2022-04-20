package Fake_Requests;

import Auth.main_Class;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Create_Dump_Orders {
    private RestActions apiobject;
    private main_Class maain_Class;
    private Create_Dump_Orders_Main create_Dump_Orders_Main;


    @BeforeClass
    public void beforeclass() {
        apiobject = DriverFactory.getAPIDriver(main_Class.BASE_URL);
        maain_Class = new main_Class(apiobject);
        create_Dump_Orders_Main = new Create_Dump_Orders_Main(apiobject);

        maain_Class.login("966506425181" , "123456");
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
