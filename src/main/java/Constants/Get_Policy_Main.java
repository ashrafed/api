package Constants;

import com.shaft.api.RestActions;
import com.shaft.cli.FileActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Get_Policy_Main {
    private RestActions apiobject;
    private String Get_Policy_URL = "v1/constant/policy";

    public Get_Policy_Main(RestActions apiobject){
        this.apiobject = apiobject;
    }

    public Response Get_Policy_successfully(){
        return apiobject.buildNewRequest(Get_Policy_URL , RestActions.RequestType.GET)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept-Language", "ar")
                .performRequest();
    }
    public Response Get_Policy_failed(){
        return apiobject.buildNewRequest(Get_Policy_URL , RestActions.RequestType.GET)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept-Language", "arw")
                .performRequest();
    }
}
