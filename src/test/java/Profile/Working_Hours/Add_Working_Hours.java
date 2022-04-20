package Profile.Working_Hours;

import Auth.main_Class;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Add_Working_Hours {
    private RestActions apiobject;
    private main_Class maain_Class;
    private Add_Working_Hours_Main add_Working_Hours_Main;



    @BeforeClass
    public void beforeclass() {
        apiobject = DriverFactory.getAPIDriver(main_Class.BASE_URL);
        maain_Class = new main_Class(apiobject);
        add_Working_Hours_Main = new Add_Working_Hours_Main(apiobject);
        maain_Class.login("966506425181" , "123456");
    }



    @Test
    @Description("check Add_Working_Hours success")
    public void Add_Working_Hours_success(){
        Response Add_Working_Hours_Respons = add_Working_Hours_Main.add_Working_Hours();

        Validations.assertThat().response(Add_Working_Hours_Respons)
                .extractedJsonValue("message")
                .contains("invalid input data")
                .perform();
    }

}
