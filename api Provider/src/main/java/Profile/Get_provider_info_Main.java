package Profile;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Get_provider_info_Main {
    private RestActions apiobject;
    private String  Get_provider_info_URL= "v1/profile";


    public Get_provider_info_Main(RestActions apiobject){
        this.apiobject = apiobject;
    }

    public Response Get_provider_info(){
        return apiobject.buildNewRequest(Get_provider_info_URL , RestActions.RequestType.GET)
                .setContentType(ContentType.JSON)
                .addHeader("Host", "<calculated when request is sent>")
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                //.addHeader("Authorization", "Bearer " + token)
                .performRequest();
    }
}
