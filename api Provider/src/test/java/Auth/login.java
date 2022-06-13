package Auth;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import io.netty.handler.codec.spdy.SpdyWindowUpdateFrame;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class login {
    private RestActions apiobject;
    private Login_Main login_main;


    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);
    }

    @Test
    public void login(){
        Response login_respons = login_main.login(Login_Main.Mobile_Number, Login_Main.Password);;
    }
}



