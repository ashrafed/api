package Notifications;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class Mark_notifications_seen_Main {
    private RestActions apiobject;
    private String mark_notifications_seen_URL = "v1/notification/seen";

    public Mark_notifications_seen_Main(RestActions apiobject) {this.apiobject = apiobject;}

        public Response Mark_notifications_seen(String notification_id){

            JSONObject Mark_notifications_seen_Body = new JSONObject();
            Mark_notifications_seen_Body.put("notification_id", notification_id);

            return apiobject.buildNewRequest(mark_notifications_seen_URL , RestActions.RequestType.POST)
                    .setContentType(ContentType.JSON)
                    .addHeader("Accept","application/json")
                    .addHeader("Platform", "careferProviderApplication2Ej!%")
                    .setRequestBody(Mark_notifications_seen_Body)
                    .performRequest();
    }
}
