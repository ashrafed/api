package Testing;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class Push_Test_Notifications_Main {
    private RestActions apiobject;

    private String Push_Test_Notifications_URL = "v1/testing/push-notification";

    public Push_Test_Notifications_Main(RestActions apiobject){this.apiobject = apiobject;
    }

    public Response Push_Test_Notifications_Successfully(int user_id){

        JSONObject  Push_Test_Notifications_Body =new  JSONObject();
        Push_Test_Notifications_Body.put("user_id" ,user_id);
        return apiobject.buildNewRequest(Push_Test_Notifications_URL, RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept", "application/json")
                .setRequestBody(Push_Test_Notifications_Body)
                .performRequest();
    }

    public Response Push_Test_Notifications_Failed(String user_id){

        JSONObject  Push_Test_Notifications_Body =new  JSONObject();
        Push_Test_Notifications_Body.put("user_id" ,user_id);
        return apiobject.buildNewRequest(Push_Test_Notifications_URL, RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept", "application/json")
                .setRequestBody(Push_Test_Notifications_Body)
                .setTargetStatusCode(500)
                .performRequest();
    }
}
