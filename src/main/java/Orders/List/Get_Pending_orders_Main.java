package Orders.List;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Get_Pending_orders_Main {
    private RestActions apiobject;
    private String Get_Pending_orders_URL= "v1/order/pending";

    public Get_Pending_orders_Main(RestActions apiobject){
        this.apiobject = apiobject;
    }
    public Response Success_Get_Pending_orders(){
        return apiobject.buildNewRequest(Get_Pending_orders_URL , RestActions.RequestType.GET)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept-Language" , "ar")
                .addHeader("Accept", "application/json")
                .setTargetStatusCode(404)
                .performRequest();
    }
}
