package Testing;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Import_Carefer_Shops_Main {
    private RestActions apiobject;
    private String  Import_Carefer_Shops_URL= "v1/testing/carefer-shops";


    public Import_Carefer_Shops_Main(RestActions apiobject){
        this.apiobject = apiobject;
    }

    public Response Import_Carefer_Shops() {
        return apiobject.buildNewRequest(Import_Carefer_Shops_URL, RestActions.RequestType.GET)
                .setContentType(ContentType.JSON)
                .addHeader("Accept", "application/json")
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .performRequest();
    }
}
