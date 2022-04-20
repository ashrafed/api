package Auth;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class Forget_Password_Main {
    private RestActions apiobject;
    private String forget_Password_URL = "v1/auth/forget-password";
    public Forget_Password_Main(RestActions apiobject){this.apiobject = apiobject;
    }

    public Response forget_Password_successfully(String mobile){
        JSONObject forget_Password_Body =new  JSONObject();
        forget_Password_Body.put("mobile" ,mobile);
        return apiobject.buildNewRequest(forget_Password_URL, RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept", "application/json")
                .setRequestBody(forget_Password_Body)
                .performRequest();
    }
    public Response forget_Password_Failed(String mobile) {
        JSONObject forget_Password_Body = new JSONObject();
        forget_Password_Body.put("mobile", mobile);
        return apiobject.buildNewRequest(forget_Password_URL, RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept", "application/json")
                .setRequestBody(forget_Password_Body)
                .setTargetStatusCode(422)
                .performRequest();
    }
}