package Profile.Change_mobile_number;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class Change_mobile_number_Main {
    private RestActions apiobject;
    private String change_mobile_number_request_URL= "v1/profile/change-mobile-request";


    public Change_mobile_number_Main(RestActions apiobject){
        this.apiobject = apiobject;
    }

    public Response Change_mobile_number(String old_mobile ,
                                         String new_mobile ,
                                         String verify_type){

        JSONObject Change_mobile_number_Body = new JSONObject();
        Change_mobile_number_Body.put("old_mobile" ,old_mobile);
        Change_mobile_number_Body.put("new_mobile" , new_mobile);
        Change_mobile_number_Body.put("verify_type" , verify_type);

        return apiobject.buildNewRequest(change_mobile_number_request_URL , RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Host", "<calculated when request is sent>")
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .setRequestBody(Change_mobile_number_Body)
                .setTargetStatusCode(422)
                .performRequest();
    }
}
