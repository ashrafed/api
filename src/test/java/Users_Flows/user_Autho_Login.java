package Users_Flows;

import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class user_Autho_Login {


    @Test
    public void delebooking() {
        RestActions apioject = DriverFactory.getAPIDriver("https://restful-booker.herokuapp.com/");

        JSONObject authancication = new JSONObject();
        authancication.put("username", " admin");
        authancication.put(" password", "password123");

        //////////////


        Response creatToken = apioject.buildNewRequest("auth", RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .setRequestBody(authancication)
               // .setRequestBody(apioject)
                .performRequest();


}}
