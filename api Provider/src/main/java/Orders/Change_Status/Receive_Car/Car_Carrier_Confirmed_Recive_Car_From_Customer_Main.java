package Orders.Change_Status.Receive_Car;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class Car_Carrier_Confirmed_Recive_Car_From_Customer_Main {
    private RestActions apiobject;
    private String Car_Carrier_Confirmed_Recive_Car_From_Customer_URL = "v1/order/1/status";

    public Car_Carrier_Confirmed_Recive_Car_From_Customer_Main(RestActions apiobject) {
        this.apiobject = apiobject;
    }
    public Response Success_Car_Carrier_Confirmed_Recive_Car_From_Customer(String status) {
        JSONObject Car_Carrier_Confirmed_Recive_Car_From_Customer_Body = new JSONObject();
        Car_Carrier_Confirmed_Recive_Car_From_Customer_Body.put("status", status);
        return apiobject.buildNewRequest(Car_Carrier_Confirmed_Recive_Car_From_Customer_URL, RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept", "application/json")
                .setTargetStatusCode(501)
                .setRequestBody(Car_Carrier_Confirmed_Recive_Car_From_Customer_Body)
                .performRequest();
    }
}
