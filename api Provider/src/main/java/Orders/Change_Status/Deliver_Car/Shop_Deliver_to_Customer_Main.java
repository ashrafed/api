package Orders.Change_Status.Deliver_Car;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class Shop_Deliver_to_Customer_Main {
    private RestActions apiobject;
    private String Shop_Deliver_to_Customer_URL= "v1/order/1/status";
    public Shop_Deliver_to_Customer_Main(RestActions apiobject){
        this.apiobject = apiobject;
    }
    public Response Success_Shop_Deliver_to_Customer_Main(String status) {
        JSONObject Shop_Deliver_to_Customer_Main_Body = new JSONObject();
        Shop_Deliver_to_Customer_Main_Body.put("status", status);
        return apiobject.buildNewRequest(Shop_Deliver_to_Customer_URL, RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept", "application/json")
                .setTargetStatusCode(501)
                .setRequestBody(Shop_Deliver_to_Customer_Main_Body)
                .performRequest();
    }
    public Response Failed_Shop_Deliver_to_Customer_Main(String status) {
        JSONObject Shop_Deliver_to_Customer_Main_Body = new JSONObject();
        Shop_Deliver_to_Customer_Main_Body.put("status", status);
        return apiobject.buildNewRequest(Shop_Deliver_to_Customer_URL, RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept", "application/json")
                .setRequestBody(Shop_Deliver_to_Customer_Main_Body)
                .performRequest();
    }
}