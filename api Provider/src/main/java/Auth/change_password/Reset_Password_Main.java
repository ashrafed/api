package Auth.change_password;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class Reset_Password_Main {
    private RestActions apiobject;
    private String Reset_Password_Main_URL = "v1/auth/reset-password";
    public Reset_Password_Main(RestActions apiobject){this.apiobject = apiobject;
    }

    public Response Reset_Password_successfully(String mobile,String password,String password_confirmation){
        JSONObject Reset_Password_Body =new  JSONObject();
        Reset_Password_Body.put("mobile" ,mobile);
        Reset_Password_Body.put("password" ,password);
        Reset_Password_Body.put("password_confirmation" ,password_confirmation);
        return apiobject.buildNewRequest(Reset_Password_Main_URL, RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept", "application/json")
                .setTargetStatusCode(422)
                .setRequestBody(Reset_Password_Body)
                .performRequest();
    }
    public Response Reset_Password_Failed(String mobile,String password,String password_confirmation) {
        JSONObject Reset_Password_Body = new JSONObject();
        Reset_Password_Body.put("mobile", mobile);
        Reset_Password_Body.put("password" ,password);
        Reset_Password_Body.put("password_confirmation" ,password_confirmation);
        return apiobject.buildNewRequest(Reset_Password_Main_URL, RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept", "application/json")
                .setTargetStatusCode(422)
                .setRequestBody(Reset_Password_Body)
                .performRequest();
    }
}
