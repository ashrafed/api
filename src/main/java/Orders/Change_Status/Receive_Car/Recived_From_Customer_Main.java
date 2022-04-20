package Orders.Change_Status.Receive_Car;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class Recived_From_Customer_Main {
    private RestActions apiobject;
    private String Recived_From_Customer_Main_URL= "v1/order/1/status";
    public Recived_From_Customer_Main(RestActions apiobject){this.apiobject = apiobject;
    }
    public Response Success_Recived_From_Customer(String status){
        JSONObject  Recived_From_Customer_Body =new  JSONObject();
        Recived_From_Customer_Body.put("status" ,status);
        return apiobject.buildNewRequest(Recived_From_Customer_Main_URL , RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept" , "application/json")
                .setTargetStatusCode(501)
                .setRequestBody(Recived_From_Customer_Body)
                .performRequest();
    }
}