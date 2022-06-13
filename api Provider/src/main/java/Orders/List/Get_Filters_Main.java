package Orders.List;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class Get_Filters_Main {
    private RestActions apiobject;
    private String Get_Old_Orders_URL= "v1/order/filters";

    public Get_Filters_Main(RestActions apiobject){
        this.apiobject = apiobject;
    }
    public Response Success_Accept_Order_Invitation_Request(String screen_type){
        JSONObject Accept_Order_Invitation_Request_Body =new  JSONObject();
        Accept_Order_Invitation_Request_Body.put("screen_type" ,screen_type);
        return apiobject.buildNewRequest(Get_Old_Orders_URL , RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Accept", "application/json")
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept-Language" , "ar")
                .setRequestBody(Accept_Order_Invitation_Request_Body)
                .performRequest();
    }
}
