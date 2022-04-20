package Fake_Requests;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Create_Dump_Orders_Main {
    private RestActions apiobject;
    private String Create_Dump_Orders_URL = "v1/fake/orders";


    public Create_Dump_Orders_Main(RestActions apiobject){
        this.apiobject = apiobject;
    }

    public Response Get_Notifications(){
        return apiobject.buildNewRequest(Create_Dump_Orders_URL , RestActions.RequestType.GET)
                .setContentType(ContentType.JSON)
                .addHeader("Host", "<calculated when request is sent>")
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .performRequest();
    }
}
