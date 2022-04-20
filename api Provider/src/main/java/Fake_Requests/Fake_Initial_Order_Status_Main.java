package Fake_Requests;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Fake_Initial_Order_Status_Main {
    private RestActions apiobject;
    private String Fake_Initial_Order_Status_URL = "v1/fake/initial-order-status";


    public Fake_Initial_Order_Status_Main(RestActions apiobject){
        this.apiobject = apiobject;
    }

    public Response Get_Notifications(){
        return apiobject.buildNewRequest(Fake_Initial_Order_Status_URL , RestActions.RequestType.GET)
                .setContentType(ContentType.JSON)
                .addHeader("Host", "<calculated when request is sent>")
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .setTargetStatusCode(500)
                .performRequest();
    }
}
