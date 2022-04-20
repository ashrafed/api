package Orders.Change_Status.Receive_Car;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class Car_Under_examination_Main {
    private RestActions apiobject;
    private String Car_Under_examination_Main_URL= "v1/order/1/status";
    public Car_Under_examination_Main(RestActions apiobject){this.apiobject = apiobject;
    }
    public Response Success_Car_Under_examination(String status){
        JSONObject Car_Under_examination_Body =new  JSONObject();
        Car_Under_examination_Body.put("status" ,status);
        return apiobject.buildNewRequest(Car_Under_examination_Main_URL , RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept" , "application/json")
                .setTargetStatusCode(501)
                .setRequestBody(Car_Under_examination_Body)
                .performRequest();
    }
}
