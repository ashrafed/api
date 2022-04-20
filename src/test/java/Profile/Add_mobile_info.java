package Profile;

import Auth.main_Class;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Add_mobile_info {
    private RestActions apiobject ;
    private Add_mobile_info_main add_mobile_info_main;
    private main_Class maain_Class;


    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(main_Class.BASE_URL);
        maain_Class = new main_Class(apiobject);
        add_mobile_info_main = new Add_mobile_info_main(apiobject);

        maain_Class.login("966506425181" , "123456");
    }

    @Test
    @Description("check_fcm_token_for_Add_mobile_info")
    public void check_fcm_token_for_Add_mobile_info(){
       Response Add_mobile_info_Respons = add_mobile_info_main.add_mobile_info(
                "update fcmtokenfcmtoken",
                1 ,
                "0.11.0" ,
                "2021-05-25 23:32:09" ,
                "25.882083" ,
                "45.303154"
                );

        Validations.assertThat().response(Add_mobile_info_Respons).extractedJsonValue("message")
                .contains("Updated Success")
                .perform();
    }



    @Test
    @Description("check_Mobile_Types_for_Add_mobile_info")
    public void check_Mobile_Types_for_Add_mobile_info(){
        Response Add_mobile_info_Respons = add_mobile_info_main.add_mobile_info(
                "update fcmtokenfcmtoken",
                2 ,
                "0.11.0" ,
                "2021-05-25 23:32:09" ,
                "25.882083" ,
                "45.303154"
        );

        Validations.assertThat().response(Add_mobile_info_Respons)
                .extractedJsonValue("message")
                .contains("Updated Success")
                .perform();
    }

    @Test
    @Description("check_last_used_at_for_Add_mobile_info")
    public void check_last_used_at_for_Add_mobile_info(){
        Response Add_mobile_info_Respons = add_mobile_info_main.add_mobile_info(
                "update fcmtokenfcmtoken",
                1 ,
                "0.11.0" ,
                "2021-05-25 23:32:09" ,
                "25.882083" ,
                "45.303154"
        );

        Validations.assertThat().response(Add_mobile_info_Respons)
                .extractedJsonValue("message")
                .contains("Updated Success")
                .perform();
    }




}
