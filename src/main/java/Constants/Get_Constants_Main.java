package Constants;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Get_Constants_Main {
    private RestActions apiobject;
    private String Get_Constants_URL = "v1/constant";

    public Get_Constants_Main(RestActions apiobject){
        this.apiobject = apiobject;
    }

    public Response Get_Constants_successfully(){
        return apiobject.buildNewRequest(Get_Constants_URL , RestActions.RequestType.GET)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept-Language", "ar")
                .performRequest();
    }
    public Response Get_Constants_failed(){
        return apiobject.buildNewRequest(Get_Constants_URL , RestActions.RequestType.GET)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept-Language", "arw")
                .setTargetStatusCode(404)
                .performRequest();
    }
}
