package Notifications;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Get_Notifications_Main {

    private RestActions apiobject;
    private String Get_Notifications_URL = "v1/notification?language=en&page=2";


    public Get_Notifications_Main(RestActions apiobject){
        this.apiobject = apiobject;
    }

    public Response Get_Notifications(){
        return apiobject.buildNewRequest(Get_Notifications_URL , RestActions.RequestType.GET)
                .setContentType(ContentType.JSON)
                .addHeader("Host", "<calculated when request is sent>")
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .performRequest();
    }
}
