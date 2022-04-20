package Orders.Change_Status.Maintenance;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class Finish_Maintance_Main {
    private RestActions apiobject;
    private String Finish_Maintance_Main_URL= "v1/order/1/status";
    public Finish_Maintance_Main(RestActions apiobject){
        this.apiobject = apiobject;
    }

    public Response Success_Finish_Maintance_Main(int status){
        JSONObject Finish_Maintance_Body =new  JSONObject();
        Finish_Maintance_Body.put("status" ,status);
        return apiobject.buildNewRequest(Finish_Maintance_Main_URL , RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept" , "application/json")
                .setTargetStatusCode(501)
                .setRequestBody(Finish_Maintance_Body)
                .performRequest();
    }
}