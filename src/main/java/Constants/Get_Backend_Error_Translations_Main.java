package Constants;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Get_Backend_Error_Translations_Main {
    private RestActions apiobject;
    private String Get_Backend_Error_Translations_URL = "v1/constant/translations?language=ar&category=0";

    public Get_Backend_Error_Translations_Main(RestActions apiobject){
        this.apiobject = apiobject;
    }

    public Response Get_Backend_Error_Translations_successfully(){
        return apiobject.buildNewRequest(Get_Backend_Error_Translations_URL , RestActions.RequestType.GET)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept-Language", "ar")
                .performRequest();
    }
}
