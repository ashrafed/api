package Notifications;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Get_unseen_notifications_count_Main {
    private RestActions apiobject;
    private String Get_unseen_notifications_count_URL = "v1/notification/count";


    public Get_unseen_notifications_count_Main(RestActions apiobject){
        this.apiobject = apiobject;
    }

    public Response Get_Working_Hours(){
        return apiobject.buildNewRequest(Get_unseen_notifications_count_URL , RestActions.RequestType.GET)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .performRequest();
    }
}
