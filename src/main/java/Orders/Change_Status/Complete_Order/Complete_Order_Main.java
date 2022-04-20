package Orders.Change_Status.Complete_Order;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class Complete_Order_Main {
    private RestActions apiobject;
    private String Complete_Order_Main_URL= "v1/order/1/status";
    public Complete_Order_Main(RestActions apiobject){
        this.apiobject = apiobject;
    }

    public Response Success_Complete_Order_Main(String status,String otp){
        JSONObject Complete_Order_Main_Body =new  JSONObject();
        Complete_Order_Main_Body.put("status" ,status);
        Complete_Order_Main_Body.put("otp" ,otp);
        return apiobject.buildNewRequest(Complete_Order_Main_URL , RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept" , "application/json")
                .setTargetStatusCode(501)
                .setRequestBody(Complete_Order_Main_Body)
                .performRequest();
    }
}
