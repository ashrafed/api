package Auth;
import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class main_Class {
    private RestActions apiobject;
    public static final String BASE_URL = System.getProperty("provider_base_url");

    public static final int success_code = 200;

    private String login_URL = "v1/auth/login";

    public main_Class(RestActions apiobject){
        this.apiobject = apiobject;
    }



    public void login(String mobile , String password){

        JSONObject authentication_login = new JSONObject();
        authentication_login.put("mobile", mobile);
        authentication_login.put("password", password);

        Response cREAT_tOKEN_login_response = apiobject.buildNewRequest(login_URL, RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Host", "<calculated when request is sent>")
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .setRequestBody(authentication_login)
                .performRequest();

        String token = RestActions.getResponseJSONValue(cREAT_tOKEN_login_response, "data.token");
        apiobject.addHeaderVariable("Authorization" ,"Bearer " + token);
    }
}
