package Orders.Purshase;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class List_Order_Purshases_Main {
    private RestActions apiobject;
    private String List_Order_Purshases_Main_URL= "v1/order/114/purchase";
    public List_Order_Purshases_Main(RestActions apiobject){
        this.apiobject = apiobject;
    }

    public Response Success_List_Order_Purshases_Main(){
        return apiobject.buildNewRequest(List_Order_Purshases_Main_URL , RestActions.RequestType.GET)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept" , "application/json")
                .performRequest();
    }
}
