package Profile;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.openqa.selenium.json.Json;

public class Add_mobile_info_main {
    private RestActions apiobject;

    private String add_mobile_info_URL = "v1/profile/app/121dee-33dd3e121dee-33dd3e121";

    public Add_mobile_info_main(RestActions apiobject){
        this.apiobject = apiobject;
    }


    public Response add_mobile_info(String fcm_token ,
                                    int type ,
                                    String version,
                                    String last_used_at,
                                    String latitude,
                                    String longitude){

        JSONObject add_mobile_info_Body =new  JSONObject();
        add_mobile_info_Body.put("fcm_token" ,fcm_token);
        add_mobile_info_Body.put("type", type);
        add_mobile_info_Body.put("version", version);
        add_mobile_info_Body.put("last_used_at", last_used_at);
        add_mobile_info_Body.put("latitude", latitude);
        add_mobile_info_Body.put("longitude", longitude);
        return apiobject.buildNewRequest(add_mobile_info_URL, RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .setRequestBody(add_mobile_info_Body)
                .performRequest();
    }
}
