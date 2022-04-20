package Profile.Working_Hours;

import Auth.main_Class;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Get_Working_Hours {
    private RestActions apiobject;
    private main_Class maain_Class;
    private Get_Working_Hours_Main get_Working_Hours_Main;


    @BeforeClass
    public void beforeclass() {
        apiobject = DriverFactory.getAPIDriver(main_Class.BASE_URL);
        maain_Class = new main_Class(apiobject);
        get_Working_Hours_Main = new Get_Working_Hours_Main(apiobject);

        maain_Class.login("966506425181" , "123456");
    }

    @Test
    @Description(" check success get working hours")
    public void check_massage_get_Working_Hours(){
        Response get_Working_Hours_Respons  = get_Working_Hours_Main.Get_Working_Hours();

        Validations.assertThat().response(get_Working_Hours_Respons)
                .extractedJsonValue("message")
                .contains("success get working hours")
                .perform();
    }


    @Test
    @Description(" check massage success get working hours")
    public void check_status_code_get_Working_Hours(){
        Response get_Working_Hours_Respons  = get_Working_Hours_Main.Get_Working_Hours();

        Validations.assertThat().response(get_Working_Hours_Respons)
                .extractedJsonValue("status_code")
                .contains("200")
                .perform();
    }



}
