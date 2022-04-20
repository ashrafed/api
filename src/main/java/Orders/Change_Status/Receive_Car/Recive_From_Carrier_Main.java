package Orders.Change_Status.Receive_Car;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class Recive_From_Carrier_Main {
    private RestActions apiobject;
    private String Recive_From_Carrier_Main_URL = "v1/order/1/status";

    public Recive_From_Carrier_Main(RestActions apiobject) {
        this.apiobject = apiobject;
    }

    public Response Success_Recive_From_Carrier(String status) {
        JSONObject Recive_From_Carrier_Body = new JSONObject();
        Recive_From_Carrier_Body.put("status", status);
        return apiobject.buildNewRequest(Recive_From_Carrier_Main_URL, RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept", "application/json")
                .setTargetStatusCode(501)
                .setRequestBody(Recive_From_Carrier_Body)
                .performRequest();
    }
}
