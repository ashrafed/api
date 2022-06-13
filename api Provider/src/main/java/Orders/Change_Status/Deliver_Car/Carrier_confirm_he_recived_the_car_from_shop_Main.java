package Orders.Change_Status.Deliver_Car;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class Carrier_confirm_he_recived_the_car_from_shop_Main {
    private RestActions apiobject;
    private String Carrier_confirm_he_recived_the_car_from_shop_URL= "v1/order/1/status";
    public Carrier_confirm_he_recived_the_car_from_shop_Main(RestActions apiobject){
        this.apiobject = apiobject;
    }
    public Response Success_Carrier_confirm_he_recived_the_car_from_shop_Main(String status, String otp) {
        JSONObject Carrier_confirm_he_recived_the_car_from_shop_Body = new JSONObject();
        Carrier_confirm_he_recived_the_car_from_shop_Body.put("status", status);
        Carrier_confirm_he_recived_the_car_from_shop_Body.put("otp", otp);
        return apiobject.buildNewRequest(Carrier_confirm_he_recived_the_car_from_shop_URL, RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept", "application/json")
                .setTargetStatusCode(501)
                .setRequestBody(Carrier_confirm_he_recived_the_car_from_shop_Body)
                .performRequest();
    }
    public Response Failed_Carrier_confirm_he_recived_the_car_from_shop_Main(String status, String otp) {
        JSONObject Carrier_confirm_he_recived_the_car_from_shop_Body = new JSONObject();
        Carrier_confirm_he_recived_the_car_from_shop_Body.put("status", status);
        Carrier_confirm_he_recived_the_car_from_shop_Body.put("otp", otp);
        return apiobject.buildNewRequest(Carrier_confirm_he_recived_the_car_from_shop_URL, RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept", "application/json")
                .setTargetStatusCode(501)
                .setRequestBody(Carrier_confirm_he_recived_the_car_from_shop_Body)
                .performRequest();
    }
}
