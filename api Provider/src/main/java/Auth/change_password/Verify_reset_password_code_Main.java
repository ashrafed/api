package Auth.change_password;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class Verify_reset_password_code_Main {
    private RestActions apiobject;
    private String Verify_reset_password_code_Main_URL = "v1/auth/verify-reset-password-code";
    public Verify_reset_password_code_Main(RestActions apiobject){this.apiobject = apiobject;
    }

    public Response Verify_reset_password_code_successfully(String mobile,String reset_password_verification_code){
        JSONObject Verify_reset_password_code_Body =new  JSONObject();
        Verify_reset_password_code_Body.put("mobile" ,mobile);
        Verify_reset_password_code_Body.put("reset_password_verification_code" ,reset_password_verification_code);
        return apiobject.buildNewRequest(Verify_reset_password_code_Main_URL, RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept", "application/json")
                .setTargetStatusCode(404)
                .setRequestBody(Verify_reset_password_code_Body)
                .performRequest();
    }
    public Response Verify_reset_password_code_Failed(String mobile,String reset_password_verification_code) {
        JSONObject Verify_reset_password_code_Body = new JSONObject();
        Verify_reset_password_code_Body.put("mobile", mobile);
        Verify_reset_password_code_Body.put("reset_password_verification_code" ,reset_password_verification_code);
        return apiobject.buildNewRequest(Verify_reset_password_code_Main_URL, RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept", "application/json")
                .setTargetStatusCode(422)
                .setRequestBody(Verify_reset_password_code_Body)
                .performRequest();
    }
}
