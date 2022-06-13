package Profile.Working_Hours;

import Auth.Login_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Add_Working_Hours {
    private RestActions apiobject;
    private Login_Main login_main;
    private Add_Working_Hours_Main add_Working_Hours_Main;

    public Add_Working_Hours (RestActions apiobject){
        this.apiobject = apiobject;
    }



    @BeforeClass
    public void beforeclass() {
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        add_Working_Hours_Main = new Add_Working_Hours_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);
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
