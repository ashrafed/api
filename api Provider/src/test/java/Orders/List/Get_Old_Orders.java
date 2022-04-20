package Orders.List;

import Auth.main_Class;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Get_Old_Orders {
    private RestActions apiobject;
    private main_Class maain_class;
    private Get_Old_Orders_Main get_old_orders_main;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(main_Class.BASE_URL);
        maain_class = new main_Class(apiobject);
        get_old_orders_main = new Get_Old_Orders_Main(apiobject);
        maain_class.login("966506425181" , "123456");
    }

    @Test
    @Description("Success_Get_Old_Orders")
    public void Success_Get_Old_Orders(){
        Response Success_Get_Old_Orders_Respone = get_old_orders_main.Success_Get_Old_Orders();

        Validations.assertThat().response(Success_Get_Old_Orders_Respone)
                .extractedJsonValue("message")
                .contains("Success List Old Orders.")
                .perform();
    }


    @Test
    @Description("check Success_Get_Old_Orders with status_code")
    public void Success_Get_Old_Orders_status_code(){
        Response Success_Get_Old_Orders_Respone = get_old_orders_main.Success_Get_Old_Orders();

        Validations.assertThat().response(Success_Get_Old_Orders_Respone)
                .extractedJsonValue("status_code")
                .contains("200")
                .perform();
    }


    @Test
    @Description("check Success_Get_Old_Orders with order_no")
    public void Success_Get_Old_Orders_order_no(){
        Response Success_Get_Old_Orders_Respone = get_old_orders_main.Success_Get_Old_Orders();

        Validations.assertThat().response(Success_Get_Old_Orders_Respone)
                .extractedJsonValue("data[0].order_no")
                .contains("8384")
                .perform();
    }

    @Test
    @Description("check Success_Get_Old_Orders with otp_receive_car_from_customer")
    public void Success_Get_Old_Orders_otp_receive_car_from_customer(){
        Response Success_Get_Old_Orders_Respone = get_old_orders_main.Success_Get_Old_Orders();

        Validations.assertThat().response(Success_Get_Old_Orders_Respone)
                .extractedJsonValue("data[0].otp_receive_car_from_customer")
                .contains("8904")
                .perform();
    }

    @Test
    @Description("check Success_Get_Old_Orders with delivery_address")
    public void Success_Get_Old_Orders_delivery_address(){
        Response Success_Get_Old_Orders_Respone = get_old_orders_main.Success_Get_Old_Orders();

        Validations.assertThat().response(Success_Get_Old_Orders_Respone)
                .extractedJsonValue("data[0].delivery_address")
                .contains("P7F6 MR ضرما السعودية")
                .perform();
    }

    @Test
    @Description("check Success_Get_Old_Orders with invitation_expire_at")
    public void Success_Get_Old_Orders_invitation_expire_at(){
        Response Success_Get_Old_Orders_Respone = get_old_orders_main.Success_Get_Old_Orders();

        Validations.assertThat().response(Success_Get_Old_Orders_Respone)
                .extractedJsonValue("data[0].invitation_expire_at")
                .contains("0")
                .perform();
    }

    @Test
    @Description("check Success_Get_Old_Orders with created_at")
    public void Success_Get_Old_Orders_created_at(){
        Response Success_Get_Old_Orders_Respone = get_old_orders_main.Success_Get_Old_Orders();

        Validations.assertThat().response(Success_Get_Old_Orders_Respone)
                .extractedJsonValue("data[0].created_at")
                .contains("2022-02-06 15:17:00")
                .perform();
    }

    @Test
    @Description("check Success_Get_Old_Orders with car_delivery_date")
    public void Success_Get_Old_Orders_car_delivery_date(){
        Response Success_Get_Old_Orders_Respone = get_old_orders_main.Success_Get_Old_Orders();

        Validations.assertThat().response(Success_Get_Old_Orders_Respone)
                .extractedJsonValue("data[0].car_delivery_date")
                .contains("2022-02-17 07:00:00")
                .perform();
    }


    @Test
    @Description("check Success_Get_Old_Orders with vehicle_make_year")
    public void Success_Get_Old_Orders_vehicle_make_year(){
        Response Success_Get_Old_Orders_Respone = get_old_orders_main.Success_Get_Old_Orders();

        Validations.assertThat().response(Success_Get_Old_Orders_Respone)
                .extractedJsonValue("data[0].vehicle_make_year")
                .contains("2012")
                .perform();
    }

    @Test
    @Description("check Success_Get_Old_Orders with vehicle_vin")
    public void Success_Get_Old_Orders_vehicle_vin(){
        Response Success_Get_Old_Orders_Respone = get_old_orders_main.Success_Get_Old_Orders();

        Validations.assertThat().response(Success_Get_Old_Orders_Respone)
                .extractedJsonValue("data[0].vehicle_vin")
                .contains("KMHFH41H1CA123542")
                .perform();
    }

    @Test
    @Description("check Success_Get_Old_Orders with id")
    public void Success_Get_Old_Orders_id(){
        Response Success_Get_Old_Orders_Respone = get_old_orders_main.Success_Get_Old_Orders();

        Validations.assertThat().response(Success_Get_Old_Orders_Respone)
                .extractedJsonValue("data[0].id")
                .contains("511")
                .perform();
    }

    @Test
    @Description("check Success_Get_Old_Orders with vehicle_color_id")
    public void Success_Get_Old_Orders_vehicle_color_id(){
        Response Success_Get_Old_Orders_Respone = get_old_orders_main.Success_Get_Old_Orders();

        Validations.assertThat().response(Success_Get_Old_Orders_Respone)
                .extractedJsonValue("data[0].vehicle_color_id")
                .contains("1")
                .perform();
    }


    @Test
    @Description("check Success_Get_Old_Orders with order_type")
    public void Success_Get_Old_Orders_order_type(){
        Response Success_Get_Old_Orders_Respone = get_old_orders_main.Success_Get_Old_Orders();

        Validations.assertThat().response(Success_Get_Old_Orders_Respone)
                .extractedJsonValue("data[0].order_type")
                .contains("2")
                .perform();
    }


    @Test
    @Description("check Success_Get_Old_Orders with vehicle_id")
    public void Success_Get_Old_Orders_vehicle_id(){
        Response Success_Get_Old_Orders_Respone = get_old_orders_main.Success_Get_Old_Orders();

        Validations.assertThat().response(Success_Get_Old_Orders_Respone)
                .extractedJsonValue("data[0].vehicle_id")
                .contains("125")
                .perform();
    }


    @Test
    @Description("check Success_Get_Old_Orders with brand.name")
    public void Success_Get_Old_Orders_brand_name(){
        Response Success_Get_Old_Orders_Respone = get_old_orders_main.Success_Get_Old_Orders();

        Validations.assertThat().response(Success_Get_Old_Orders_Respone)
                .extractedJsonValue("data[0].brand.name")
                .contains("هيونداي")
                .perform();
    }

    @Test
    @Description("check Success_Get_Old_Orders with customer_mobile")
    public void Success_Get_Old_Orders_customer_mobile(){
        Response Success_Get_Old_Orders_Respone = get_old_orders_main.Success_Get_Old_Orders();

        Validations.assertThat().response(Success_Get_Old_Orders_Respone)
                .extractedJsonValue("data[0].customer_mobile")
                .contains("966519876543")
                .perform();
    }

    @Test
    @Description("check Success_Get_Old_Orders with model_id")
    public void Success_Get_Old_Orders_model_id(){
        Response Success_Get_Old_Orders_Respone = get_old_orders_main.Success_Get_Old_Orders();

        Validations.assertThat().response(Success_Get_Old_Orders_Respone)
                .extractedJsonValue("data[0].model_id")
                .contains("98")
                .perform();
    }

    @Test
    @Description("check Success_Get_Old_Orders with customer_name")
    public void Success_Get_Old_Orders_customer_name(){
        Response Success_Get_Old_Orders_Respone = get_old_orders_main.Success_Get_Old_Orders();

        Validations.assertThat().response(Success_Get_Old_Orders_Respone)
                .extractedJsonValue("data[0].customer_name")
                .contains("Soha")
                .perform();
    }

    @Test
    @Description("check Success_Get_Old_Orders with status")
    public void Success_Get_Old_Orders_status(){
        Response Success_Get_Old_Orders_Respone = get_old_orders_main.Success_Get_Old_Orders();

        Validations.assertThat().response(Success_Get_Old_Orders_Respone)
                .extractedJsonValue("data[0].status")
                .contains("5")
                .perform();
    }

}
