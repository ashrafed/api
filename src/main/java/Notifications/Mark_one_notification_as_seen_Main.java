package Notifications;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class Mark_one_notification_as_seen_Main {

    private RestActions apiobject;
    private String mark_one_notification_as_seen_URL = "v1/notification/1/seen";

    public Mark_one_notification_as_seen_Main(RestActions apiobject) {this.apiobject = apiobject;}

    public Response Mark_one_notification_as_seen(){
        return apiobject.buildNewRequest(mark_one_notification_as_seen_URL , RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Accept","application/json")
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .performRequest();
    }
}


