package Orders.List;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Get_order_details_Main {
    private RestActions apiobject;
    private String Get_order_details_URL= "v1/order/300";

    public Get_order_details_Main(RestActions apiobject){this.apiobject = apiobject;
    }
    public Response SuccessGet_order_details(){
        return apiobject.buildNewRequest(Get_order_details_URL , RestActions.RequestType.GET)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept-Language" , "ar")
                .performRequest();
    }
}
