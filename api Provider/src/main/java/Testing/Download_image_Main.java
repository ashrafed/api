package Testing;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Download_image_Main {
    private RestActions apiobject;
    private String  Download_image_URL= "v1/testing/download-image";


    public Download_image_Main(RestActions apiobject){
        this.apiobject = apiobject;
    }

    public Response Download_image() {
        return apiobject.buildNewRequest(Download_image_URL, RestActions.RequestType.GET)
                .setContentType(ContentType.JSON)
                .addHeader("Accept", "application/json")
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .performRequest();
    }
}
