package Auth;
import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
public class Login_Main {
    private RestActions apiobject;
    public static final String BASE_URL = System.getProperty("provider_base_url");
    public static final int success_code = 200;

    public static final String Mobile_Number = "966505566778";
    public static final String Password = "12345678";

    private String login_URL = "v1/auth/login";


    public Login_Main(RestActions apiobject){
        this.apiobject = apiobject;
    }

    public Response login(String mobile , String password){

        JSONObject authentication_login = new JSONObject();
        authentication_login.put("mobile", mobile);
        authentication_login.put("password", password);

        Response cREAT_tOKEN_login_response = apiobject.buildNewRequest(login_URL, RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .setRequestBody(authentication_login)
                .performRequest();

        String token = RestActions.getResponseJSONValue(cREAT_tOKEN_login_response, "data.token");
        apiobject.addHeaderVariable("Authorization" ,"Bearer " + token);
        return cREAT_tOKEN_login_response;
    }
}
