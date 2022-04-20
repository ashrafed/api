package Orders.Invitation;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class Accept_Order_Invitation_Request_Main {
    private RestActions apiobject;
    private String Accept_Order_Invitation_Request_URL= "v1/order/87/response";

    public Accept_Order_Invitation_Request_Main(RestActions apiobject){this.apiobject = apiobject;
    }
    public Response Success_Accept_Order_Invitation_Request(int status){
        JSONObject Accept_Order_Invitation_Request_Body =new  JSONObject();
        Accept_Order_Invitation_Request_Body.put("status" ,status);
        return apiobject.buildNewRequest(Accept_Order_Invitation_Request_URL , RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept" , "application/json")
                .setTargetStatusCode(406)
                .setRequestBody(Accept_Order_Invitation_Request_Body)
                .performRequest();
    }
    public Response Failed_Accept_Order_Invitation_Request(int status){
        JSONObject Accept_Order_Invitation_Request_Body =new  JSONObject();
        Accept_Order_Invitation_Request_Body.put("status" ,status);
        return apiobject.buildNewRequest(Accept_Order_Invitation_Request_URL , RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept" , "application/json")
                .setTargetStatusCode(422)
                .setRequestBody(Accept_Order_Invitation_Request_Body)
                .performRequest();
    }
}
