package Constants;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Get_Brands_Main {
    private RestActions apiobject;
    private String Get_Brands_Main_URL = "v1/constant/brand";

    public Get_Brands_Main(RestActions apiobject){
        this.apiobject = apiobject;
    }

    public Response Get_Brands_successfully() {
        return apiobject.buildNewRequest(Get_Brands_Main_URL, RestActions.RequestType.GET)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept-Language", "ar")
                .performRequest();
    }
}
