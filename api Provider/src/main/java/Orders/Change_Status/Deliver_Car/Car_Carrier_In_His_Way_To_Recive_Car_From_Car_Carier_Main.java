package Orders.Change_Status.Deliver_Car;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class Car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_Main {
    private RestActions apiobject;
    private String Car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_Main_URL= "v1/order/1/status";
    public Car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_Main(RestActions apiobject){
        this.apiobject = apiobject;
    }
    public Response Success_Car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_Main(String status) {
        JSONObject Car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_Body = new JSONObject();
        Car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_Body.put("status", status);
        return apiobject.buildNewRequest(Car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_Main_URL, RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept", "application/json")
                .setTargetStatusCode(501)
                .setRequestBody(Car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_Body)
                .performRequest();
    }
    public Response Failed_Car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_Main(String status) {
        JSONObject Car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_Body = new JSONObject();
        Car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_Body.put("status", status);
        return apiobject.buildNewRequest(Car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_Main_URL, RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept", "application/json")
                .setRequestBody(Car_Carrier_In_His_Way_To_Recive_Car_From_Car_Carier_Body)
                .performRequest();
    }
}
