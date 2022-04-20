package Orders.Purshase;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class Cancel_Purshase_Main {
    private RestActions apiobject;
    private String List_Order_Purshases_Main_URL= "v1/order/65/purchase/PO00978";
    public Cancel_Purshase_Main(RestActions apiobject){
        this.apiobject = apiobject;
    }

    public Response Success_Cancel_Purshase_Main(String reason){
        JSONObject Cancel_Purshase_Body =new  JSONObject();
        Cancel_Purshase_Body.put("reason" ,reason);
        return apiobject.buildNewRequest(List_Order_Purshases_Main_URL , RestActions.RequestType.DELETE)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept" , "application/json")
                .setTargetStatusCode(404)
                .setRequestBody(Cancel_Purshase_Body)
                .performRequest();
    }
}
