package Orders.Change_Status.Receive_Car;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class Car_Under_examination_Main_2 {
    private RestActions apiobject;
    private String Car_Under_examination_Main_2_URL= "v1/order/1/status";
    public Car_Under_examination_Main_2(RestActions apiobject){this.apiobject = apiobject;
    }
    public Response Success_Car_Under_examination_Main_2(String status){
        JSONObject Car_Under_examination_Main_2_Body =new  JSONObject();
        Car_Under_examination_Main_2_Body.put("status" ,status);
        return apiobject.buildNewRequest(Car_Under_examination_Main_2_URL , RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept" , "application/json")
                .setTargetStatusCode(501)
                .setRequestBody(Car_Under_examination_Main_2_Body)
                .performRequest();
    }
}
