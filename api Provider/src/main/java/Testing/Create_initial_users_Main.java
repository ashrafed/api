package Testing;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class Create_initial_users_Main {
    private RestActions apiobject;

    private String create_initial_users_URL = "v1/testing/initial-users";

    public Create_initial_users_Main(RestActions apiobject){this.apiobject = apiobject;
    }

    public Response Create_initial_users_Successfully(int user_id){

        JSONObject create_initial_users_Body =new  JSONObject();
        create_initial_users_Body.put("user_id" ,user_id);
        return apiobject.buildNewRequest(create_initial_users_URL, RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept", "application/json")
                .setRequestBody(create_initial_users_Body)
                .performRequest();
    }

    public Response Push_Test_Notifications_failed(int user_id){

        JSONObject create_initial_users_Body =new  JSONObject();
        create_initial_users_Body.put("user_id" ,user_id);
        return apiobject.buildNewRequest(create_initial_users_URL, RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept", "application/json")
                .setRequestBody(create_initial_users_Body)
                .performRequest();
    }

}
