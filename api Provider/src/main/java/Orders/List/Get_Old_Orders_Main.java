package Orders.List;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Get_Old_Orders_Main {
    private RestActions  apiobject;
    private String Get_Old_Orders_URL= "v1/order/old";

    public Get_Old_Orders_Main(RestActions apiobject){
        this.apiobject = apiobject;
    }

    public Response Success_Get_Old_Orders(){
        return apiobject.buildNewRequest(Get_Old_Orders_URL , RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept-Language" , "ar")
                .performRequest();
    }
}
