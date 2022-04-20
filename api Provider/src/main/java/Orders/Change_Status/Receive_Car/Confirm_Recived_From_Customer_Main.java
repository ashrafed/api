package Orders.Change_Status.Receive_Car;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class Confirm_Recived_From_Customer_Main {
    private RestActions apiobject;
    private String Confirm_Recived_From_Customer_Main_URL= "v1/order/1/status";
    public Confirm_Recived_From_Customer_Main(RestActions apiobject){this.apiobject = apiobject;
    }
    public Response Success_Confirm_Recived_From_Customer(String status,String otp){
        JSONObject Confirm_Recived_From_Customer_Body =new  JSONObject();
        Confirm_Recived_From_Customer_Body.put("status" ,status);
        Confirm_Recived_From_Customer_Body.put("otp" ,otp);
        return apiobject.buildNewRequest(Confirm_Recived_From_Customer_Main_URL , RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept" , "application/json")
                .setTargetStatusCode(501)
                .setRequestBody(Confirm_Recived_From_Customer_Body)
                .performRequest();
    }
}
