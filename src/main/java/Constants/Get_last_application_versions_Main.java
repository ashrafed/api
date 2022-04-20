package Constants;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Get_last_application_versions_Main {
    private RestActions apiobject;
    private String Get_last_application_versions_URL = "v1/constant/app-version/latest";

    public Get_last_application_versions_Main(RestActions apiobject){
        this.apiobject = apiobject;
    }

    public Response Get_last_application_versions_successfully(){
        return apiobject.buildNewRequest(Get_last_application_versions_URL , RestActions.RequestType.GET)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept-Language", "ar")
                .performRequest();
    }
    public Response Get_last_application_versions_failed(){
        return apiobject.buildNewRequest(Get_last_application_versions_URL , RestActions.RequestType.GET)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept-Language", "arw")
                .performRequest();
    }
}
