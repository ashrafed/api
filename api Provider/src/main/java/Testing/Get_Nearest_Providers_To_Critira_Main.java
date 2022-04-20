package Testing;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class Get_Nearest_Providers_To_Critira_Main {
    private RestActions apiobject;

    private String Get_Nearest_Providers_To_Critira_URL = "v1/testing/nearest-providers";

    public Get_Nearest_Providers_To_Critira_Main(RestActions apiobject){this.apiobject = apiobject;
    }
    public Response Get_Nearest_Providers_To_Critira_Successfully(String latitude ,
                    String orderType ,String brand_id,String malfunctions){

        JSONObject Get_Nearest_Providers_To_Critira_Body =new  JSONObject();
        Get_Nearest_Providers_To_Critira_Body.put("latitude" ,latitude);
        Get_Nearest_Providers_To_Critira_Body.put("orderType" ,orderType);
        Get_Nearest_Providers_To_Critira_Body.put("brand_id" ,brand_id);
        Get_Nearest_Providers_To_Critira_Body.put("malfunctions" ,malfunctions);

        return apiobject.buildNewRequest(Get_Nearest_Providers_To_Critira_URL, RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept", "application/json")
                .setRequestBody(Get_Nearest_Providers_To_Critira_Body)
                .setTargetStatusCode(500)
                .performRequest();
    }
}
