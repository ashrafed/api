package Orders.Change_Status.Receive_Car;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class Confirm_Recive_From_Carrier_Main {
    private RestActions apiobject;
    private String Confirm_Recive_From_Carrier_URL = "v1/order/1/status";

    public Confirm_Recive_From_Carrier_Main(RestActions apiobject) {
        this.apiobject = apiobject;
    }
    public Response Success_Confirm_Recive_From_Carrier(String status , String otp) {
        JSONObject Confirm_Recive_From_Carrier_Main_Body = new JSONObject();
        Confirm_Recive_From_Carrier_Main_Body.put("status", status);
        Confirm_Recive_From_Carrier_Main_Body.put("otp", otp);
        return apiobject.buildNewRequest(Confirm_Recive_From_Carrier_URL, RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept", "application/json")
                .setTargetStatusCode(501)
                .setRequestBody(Confirm_Recive_From_Carrier_Main_Body)
                .performRequest();
    }
}
