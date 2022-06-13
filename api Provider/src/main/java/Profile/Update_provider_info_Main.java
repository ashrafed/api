package Profile;

import com.shaft.api.RestActions;
import com.shaft.cli.FileActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class Update_provider_info_Main {
    private RestActions apiobject;
    private String Update_provider_info_URL = "v1/profile";
    private String Update_provider_info_Body_File_Path = "src/main/java/Profile/Update_provider_info_Body_File.Json";

    public Update_provider_info_Main(RestActions apiobject){
        this.apiobject=apiobject;
    }

    public Response update_provider_info(){
        String update_provider_info_Body = FileActions.getInstance().readFromFile(Update_provider_info_Body_File_Path);

        return apiobject.buildNewRequest(Update_provider_info_URL, RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Accept", "careferProviderApplication2Ej!%")
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .setRequestBody(update_provider_info_Body)
                .setTargetStatusCode(422)
                .performRequest();
    }

    public Response update_provider_info_failed(String name, String description, String favorite_language,
            String place_type_id, String responsible_person, String cr_number, String cr_picture,
            String is_provide_warranty, String is_provide_replace_parts, String latitude, String longitude,
            String main_image, String city_id, String images, String brands, String specialized_brands,
            String order_type, String malfunctions){

        JSONObject update_provider_info_Body =new  JSONObject();
        update_provider_info_Body.put("name" ,name);
        update_provider_info_Body.put("description", description);
        update_provider_info_Body.put("favorite_language", favorite_language);
        update_provider_info_Body.put("place_type_id", place_type_id);
        update_provider_info_Body.put("responsible_person", responsible_person);
        update_provider_info_Body.put("cr_number", cr_number);
        update_provider_info_Body.put("cr_picture" ,cr_picture);
        update_provider_info_Body.put("is_provide_warranty" ,is_provide_warranty);
        update_provider_info_Body.put("is_provide_replace_parts" ,is_provide_replace_parts);
        update_provider_info_Body.put("latitude" ,latitude);
        update_provider_info_Body.put("longitude" ,longitude);
        update_provider_info_Body.put("main_image" ,main_image);
        update_provider_info_Body.put("city_id" ,city_id);
        update_provider_info_Body.put("images" ,images);
        update_provider_info_Body.put("brands" ,brands);
        update_provider_info_Body.put("specialized_brands" ,specialized_brands);
        update_provider_info_Body.put("order_type" ,order_type);
        update_provider_info_Body.put("malfunctions" ,malfunctions);
        return apiobject.buildNewRequest(Update_provider_info_URL, RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Accept", "careferProviderApplication2Ej!%")
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .setRequestBody(update_provider_info_Body)
                .setTargetStatusCode(422)
                .performRequest();
    }
}
