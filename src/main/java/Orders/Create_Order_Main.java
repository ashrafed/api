package Orders;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class Create_Order_Main {
    private RestActions apiobject;
    private String Create_Order_Main_URL= "v1/order";

    public Create_Order_Main(RestActions apiobject){this.apiobject = apiobject;
    }
    public Response Success_Create_Order(String order_no, String pickup_latitude, String pickup_longitude, String pickup_address,
            String transfer_type, String comment, String malfunctions0, String malfunctions1, String brand_id,
            String model_id, String attachments0, String order_type, String vehicle_color_id, String vehicle_make_year,
            String vehicle_vin, String delivery_latitude, String delivery_longitude, String delivery_address,
            String customer_name, String car_delivery_date){
        JSONObject Create_Order_Body =new  JSONObject();
        Create_Order_Body.put("order_no" ,order_no);
        Create_Order_Body.put("pickup_latitude" ,pickup_latitude);
        Create_Order_Body.put("pickup_longitude" ,pickup_longitude);
        Create_Order_Body.put("pickup_address" ,pickup_address);
        Create_Order_Body.put("transfer_type" ,transfer_type);
        Create_Order_Body.put("comment" ,comment);
        Create_Order_Body.put("malfunctions[0]" ,malfunctions0);
        Create_Order_Body.put("malfunctions[1]" ,malfunctions1);
        Create_Order_Body.put("brand_id" ,brand_id);
        Create_Order_Body.put("model_id" ,model_id);
        Create_Order_Body.put("attachments[0]" ,attachments0);
        Create_Order_Body.put("order_type" ,order_type);
        Create_Order_Body.put("vehicle_color_id" ,vehicle_color_id);
        Create_Order_Body.put("vehicle_make_year" ,vehicle_make_year);
        Create_Order_Body.put("vehicle_vin" ,vehicle_vin);
        Create_Order_Body.put("delivery_latitude" ,delivery_latitude);
        Create_Order_Body.put("delivery_longitude" ,delivery_longitude);
        Create_Order_Body.put("delivery_address" ,delivery_address);
        Create_Order_Body.put("customer_name" ,customer_name);
        Create_Order_Body.put("car_delivery_date" ,car_delivery_date);
        return apiobject.buildNewRequest(Create_Order_Main_URL , RestActions.RequestType.POST)
                .setContentType(ContentType.JSON)
                .addHeader("Platform", "careferProviderApplication2Ej!%")
                .addHeader("Accept-Language", "ar")
                .addHeader("Accept" , "application/json")
                .setTargetStatusCode(422)
                .setRequestBody(Create_Order_Body)
                .performRequest();
    }
}