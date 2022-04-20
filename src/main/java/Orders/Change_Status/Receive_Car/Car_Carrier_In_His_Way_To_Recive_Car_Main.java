package Orders.Change_Status.Receive_Car;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class Car_Carrier_In_His_Way_To_Recive_Car_Main {
    private RestActions apiobject;
    private String Car_Carrier_In_His_Way_To_Recive_Car_Main_URL = "v1/order/1/status";

    public Car_Carrier_In_His_Way_To_Recive_Car_Main(RestActions apiobject) {
        this.apiobject = apiobject;
    }
    public Response Success_Car_Carrier_In_His_Way_To_Recive_Car(String status) {
        JSONObject Success_Car_Carrier_In_His_Way_To_Recive_Car_Body = new JSONObject();
        Success_Car_Carrier_In_His_Way_To_Recive_Car_Body.put("status", status);
        return apiobject.buildNewRequest(Car_Carrier_In_His_Way_To_Recive_Car_Main_URL, RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept", "application/json")
                .setTargetStatusCode(501)
                .setRequestBody(Success_Car_Carrier_In_His_Way_To_Recive_Car_Body)
                .performRequest();
    }
}
