package Orders.Purshase;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Create_New_Order_Purshase_Main {
    private RestActions apiobject;
    private String Create_New_Order_Purshase_Main_URL= "v1/order/114/purchase";
    public Create_New_Order_Purshase_Main(RestActions apiobject){
        this.apiobject = apiobject;
    }

    public Response Success_Create_New_Order_Purshase_Main(){
        return apiobject.buildNewRequest(Create_New_Order_Purshase_Main_URL , RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept" , "application/json")
                .setTargetStatusCode(406)
                .performRequest();
    }
}
