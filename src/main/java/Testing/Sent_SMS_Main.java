package Testing;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class Sent_SMS_Main {
    private RestActions apiobject;

    private String Sent_SMS_URL = "v1/testing/sms";

    public Sent_SMS_Main(RestActions apiobject){this.apiobject = apiobject;
    }

    public Response Sent_SMS_Successfully(String to ,
                                          String message){

        JSONObject Sent_SMS_Body =new  JSONObject();
        Sent_SMS_Body.put("to" ,to);
        Sent_SMS_Body.put("message" ,message);

        return apiobject.buildNewRequest(Sent_SMS_URL, RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept", "application/json")
                .setRequestBody(Sent_SMS_Body)
                .performRequest();
    }
}
