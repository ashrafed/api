package Profile.Working_Hours;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Get_Working_Hours_Main {

    private RestActions apiobject;
    private String Get_Working_Hours_URL = "v1/working-hours";


    public Get_Working_Hours_Main(RestActions apiobject){
        this.apiobject = apiobject;
    }

    public Response Get_Working_Hours(){
        return apiobject.buildNewRequest(Get_Working_Hours_URL , RestActions.RequestType.GET)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .performRequest();
    }
}
