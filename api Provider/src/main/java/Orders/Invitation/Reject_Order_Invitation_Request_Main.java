package Orders.Invitation;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class Reject_Order_Invitation_Request_Main {
    private RestActions apiobject;
    private String Reject_Order_Invitation_Request_Main_URL= "v1/order/87/response";

    public Reject_Order_Invitation_Request_Main(RestActions apiobject){this.apiobject = apiobject;
    }
    public Response Success_Reject_Order_Invitation_Request(int status){
        JSONObject Reject_Order_Invitation_Request_Body =new  JSONObject();
        Reject_Order_Invitation_Request_Body.put("status" ,status);
        return apiobject.buildNewRequest(Reject_Order_Invitation_Request_Main_URL , RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept" , "application/json")
                .setTargetStatusCode(406)
                .setRequestBody(Reject_Order_Invitation_Request_Body)
                .performRequest();
    }
    public Response Failed_Reject_Order_Invitation_Request(int status){
        JSONObject Reject_Order_Invitation_Request_Body =new  JSONObject();
        Reject_Order_Invitation_Request_Body.put("status" ,status);
        return apiobject.buildNewRequest(Reject_Order_Invitation_Request_Main_URL , RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept" , "application/json")
                .setTargetStatusCode(422)
                .setRequestBody(Reject_Order_Invitation_Request_Body)
                .performRequest();
    }

}
