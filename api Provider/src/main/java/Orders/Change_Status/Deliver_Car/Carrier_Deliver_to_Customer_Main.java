package Orders.Change_Status.Deliver_Car;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class Carrier_Deliver_to_Customer_Main {
    private RestActions apiobject;
    private String Carrier_Deliver_to_Customer_Main_URL= "v1/order/1/status";
    public Carrier_Deliver_to_Customer_Main(RestActions apiobject){
        this.apiobject = apiobject;
    }
    public Response Success_Carrier_Deliver_to_Customer_Main(String status) {
        JSONObject Carrier_Deliver_to_Customer_Main_Body = new JSONObject();
        Carrier_Deliver_to_Customer_Main_Body.put("status", status);
        return apiobject.buildNewRequest(Carrier_Deliver_to_Customer_Main_URL, RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept", "application/json")
                .setTargetStatusCode(501)
                .setRequestBody(Carrier_Deliver_to_Customer_Main_Body)
                .performRequest();
    }
    public Response Failed_Carrier_Deliver_to_Customer_Main(String status) {
        JSONObject Carrier_Deliver_to_Customer_Main_Body = new JSONObject();
        Carrier_Deliver_to_Customer_Main_Body.put("status", status);
        return apiobject.buildNewRequest(Carrier_Deliver_to_Customer_Main_URL, RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept", "application/json")
                .setTargetStatusCode(501)
                .setRequestBody(Carrier_Deliver_to_Customer_Main_Body)
                .performRequest();
    }
}
