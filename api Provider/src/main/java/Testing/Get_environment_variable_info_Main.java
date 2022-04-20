package Testing;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class Get_environment_variable_info_Main {
    private RestActions apiobject;

    private String Get_environment_variable_info_URL = "v1/testing/variable/GOOGLE_CLIENT_SECRET";

    public Get_environment_variable_info_Main(RestActions apiobject){this.apiobject = apiobject;
    }

    public Response Get_environment_variable_info_Successfully(String user_id){

        JSONObject Get_environment_variable_info_Body =new  JSONObject();
        Get_environment_variable_info_Body.put("user_id" ,user_id);

        return apiobject.buildNewRequest(Get_environment_variable_info_URL, RestActions.RequestType.GET)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept", "application/json")
                .setRequestBody(Get_environment_variable_info_Body)
                .performRequest();
    }

}
