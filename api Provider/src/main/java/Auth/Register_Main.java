package Auth;
import com.shaft.api.RestActions;
import com.shaft.tools.io.JSONFileManager;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class Register_Main {
    private RestActions apiobject;
    private String Register_URL = "v1/auth/register";

    JSONFileManager jsontestdatafile;

    public Register_Main(RestActions apiobject) {
        this.apiobject = apiobject;
    }

    public Response Register(String name,
                             String mobile,
                             String password ,
                             String password_confirmation ,
                             String favorite_language ,
                             String responsible_person,
                             String is_accept_terms_and_conditions ) {

        jsontestdatafile = new JSONFileManager("src/test/resources/testDataFiles/Register_Requst_Body.json");

        JSONObject authentication_register = new JSONObject();
        authentication_register.put("name", name);
        authentication_register.put("mobile" ,mobile);
        authentication_register.put("password" , password);
        authentication_register.put("password_confirmation" , password_confirmation);
        authentication_register.put("favorite_language" , favorite_language);
        authentication_register.put("responsible_person" , responsible_person);
        authentication_register.put("is_accept_terms_and_conditions" , is_accept_terms_and_conditions);

        return apiobject.buildNewRequest(Register_URL, RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .setRequestBody(jsontestdatafile)
                .setTargetStatusCode(422)
                .performRequest();
    }

}