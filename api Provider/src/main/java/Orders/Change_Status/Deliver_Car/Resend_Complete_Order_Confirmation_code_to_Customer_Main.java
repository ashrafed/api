package Orders.Change_Status.Deliver_Car;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class Resend_Complete_Order_Confirmation_code_to_Customer_Main {
    private RestActions apiobject;
    private String Resend_Complete_Order_Confirmation_code_to_Customer_URL= "v1/order/1/status";
    public Resend_Complete_Order_Confirmation_code_to_Customer_Main(RestActions apiobject){
        this.apiobject = apiobject;
    }
    public Response Success_Resend_Complete_Order_Confirmation_code_to_Customer_Main(String status) {
        JSONObject Resend_Complete_Order_Confirmation_code_to_Customer_Body = new JSONObject();
        Resend_Complete_Order_Confirmation_code_to_Customer_Body.put("status", status);
        return apiobject.buildNewRequest(Resend_Complete_Order_Confirmation_code_to_Customer_URL, RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept", "application/json")
                .setTargetStatusCode(501)
                .setRequestBody(Resend_Complete_Order_Confirmation_code_to_Customer_Body)
                .performRequest();
    }
    public Response Failed_Resend_Complete_Order_Confirmation_code_to_Customer_Main(String status) {
        JSONObject Resend_Complete_Order_Confirmation_code_to_Customer_Body = new JSONObject();
        Resend_Complete_Order_Confirmation_code_to_Customer_Body.put("status", status);
        return apiobject.buildNewRequest(Resend_Complete_Order_Confirmation_code_to_Customer_URL, RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept", "application/json")
                .setTargetStatusCode(501)
                .setRequestBody(Resend_Complete_Order_Confirmation_code_to_Customer_Body)
                .performRequest();
    }
}
