package Profile.Working_Hours;

import com.shaft.api.RestActions;
import com.shaft.cli.FileActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Add_Working_Hours_Main {
    private RestActions apiobject;
    private String Add_Working_Hours_URL = "v1/working-hours" ;
    private String add_Working_Hours_Body_json_file_path = "src/main/java/Profile/Working_Hours/Add_Working_Hours_Body_File.json";

    public Add_Working_Hours_Main(RestActions apiobject){
        this.apiobject=apiobject;
    }


    public Response add_Working_Hours(){
        String add_Working_Hours_Body = FileActions.getInstance().readFromFile(add_Working_Hours_Body_json_file_path);

        return apiobject.buildNewRequest(Add_Working_Hours_URL, RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .setRequestBody(add_Working_Hours_Body)
                .performRequest();
    }
}
