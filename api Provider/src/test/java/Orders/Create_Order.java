package Orders;

import Auth.Login_Main;
import Orders.Create_Order_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Create_Order {
    private RestActions apiobject ;
    private Create_Order_Main create_Order_Main;
    private Login_Main login_main;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        create_Order_Main = new Create_Order_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);
    }
    @Test
    @Description("body written as postman no changes in parameters")
    public void Create_Order_Happy_scenario(){
        Response Create_Order_Main_Response = create_Order_Main
                .Success_Create_Order("123","24.7681554","46.6844987","pickup addres",
                "1","anything","9","11","54","98", "123.doc",
                "1","10","2012","KMHFH41H1CA123542", "24.7681554",
                "46.6844987","deliver address addres", "Mohamed Nasee","2022-01-01 10:30:00");
        Validations.assertThat().response(Create_Order_Main_Response).
                extractedJsonValue("message")
                .contains("invalid input data")
                .perform();
        Validations.assertThat().response(Create_Order_Main_Response).
                extractedJsonValue("errors[0]")
                .contains("err_order_create_order_malfunctions_mandatory")
                .perform();
    }
    @Test
    @Description("test cases on postman there are mandatory parameters in body we will validate on it")
    public void Create_Order_validate_on_mandatory_just(){
        Response Create_Order_Main_Response = create_Order_Main
                .Success_Create_Order("123","24.7681554","46.6844987","",
                        "","","9","","54","98", "",
                        "1","","","", "",
                        "","", "","");
        Validations.assertThat().response(Create_Order_Main_Response).
                extractedJsonValue("message")
                .contains("invalid input data")
                .perform();
        Validations.assertThat().response(Create_Order_Main_Response).
                extractedJsonValue("errors[0]")
                .contains("err_order_create_order_pickup_address_mandatory")
                .perform();
        Validations.assertThat().response(Create_Order_Main_Response).
                extractedJsonValue("errors[1]")
                .contains("?????? ???? ???????? ?????????? delivery address ??????.")
                .perform();
        Validations.assertThat().response(Create_Order_Main_Response).
                extractedJsonValue("errors[2]")
                .contains("?????? ???? ???????? ?????? ???? delivery address ?????? ?????????? 3 ??????????/??????????")
                .perform();
        Validations.assertThat().response(Create_Order_Main_Response).
                extractedJsonValue("errors[3]")
                .contains("err_order_create_order_transfer_type_incorrect")
                .perform();
        Validations.assertThat().response(Create_Order_Main_Response).
                extractedJsonValue("errors[4]")
                .contains("err_order_create_order_malfunctions_mandatory")
                .perform();
        Validations.assertThat().response(Create_Order_Main_Response).
                extractedJsonValue("errors[5]")
                .contains("err_order_create_order_vehicle_color_id_not_valid")
                .perform();
        Validations.assertThat().response(Create_Order_Main_Response).
                extractedJsonValue("errors[6]")
                .contains("err_order_create_order_order_no_should_be_unique")
                .perform();
        Validations.assertThat().response(Create_Order_Main_Response).
                extractedJsonValue("errors[7]")
                .contains("???? ???????????? ?????????? car delivery date ???? ?????????? Y-m-d H:i:s.")
                .perform();
    }
    @Test
    @Description("CHECK ORDER NUMBER WHEN EQUAL ZERO OR JUST ONE NUMBER")
    public void Check_Create_Order_number_One_Number(){
        Response Create_Order_Main_Response = create_Order_Main
                .Success_Create_Order("0","24.7681554","46.6844987","pickup addres",
                        "1","anything","9","11","54","98", "123.doc",
                        "1","10","2012","KMHFH41H1CA123542", "24.7681554",
                        "46.6844987","deliver address addres", "Mohamed Nasee","2022-01-01 10:30:00");
        Validations.assertThat().response(Create_Order_Main_Response).
                extractedJsonValue("message")
                .contains("invalid input data")
                .perform();
    }
    @Test
    @Description("Check Order Number When Equal Two Numbers or more")
    public void Check_Create_Order_number_Two_Numbers(){
        Response Create_Order_Main_Response = create_Order_Main
                .Success_Create_Order("0","24.7681554","46.6844987","pickup addres",
                        "1","anything","9","11","54","98", "123.doc",
                        "1","10","2012","KMHFH41H1CA123542", "24.7681554",
                        "46.6844987","deliver address addres", "Mohamed Nasee","2022-01-01 10:30:00");
        Validations.assertThat().response(Create_Order_Main_Response).
                extractedJsonValue("message")
                .contains("invalid input data")
                .perform();
        Validations.assertThat().response(Create_Order_Main_Response).
                extractedJsonValue("errors[0]")
                .contains("err_order_create_order_malfunctions_mandatory")
                .perform();
    }
    @Test
    @Description("Check transfer type just include numbers '1&2' as shown in test cases on postman")
    public void Check_transfer_type_includes_Number_One(){
        Response Create_Order_Main_Response = create_Order_Main
                .Success_Create_Order("0","24.7681554","46.6844987","pickup addres",
                        "1","anything","9","11","54","98", "123.doc",
                        "1","10","2012","KMHFH41H1CA123542", "24.7681554",
                        "46.6844987","deliver address addres", "Mohamed Nasee","2022-01-01 10:30:00");
        Validations.assertThat().response(Create_Order_Main_Response).
                extractedJsonValue("message")
                .contains("invalid input data")
                .perform();
        Validations.assertThat().response(Create_Order_Main_Response).
                extractedJsonValue("errors[0]")
                .contains("err_order_create_order_malfunctions_mandatory")
                .perform();
    }
    @Test
    @Description("Check transfer type just include numbers '1&2' as shown in test cases on postman")
    public void Check_transfer_type_includes_Number_Two(){
        Response Create_Order_Main_Response = create_Order_Main
                .Success_Create_Order("0","24.7681554","46.6844987","pickup addres",
                        "2","anything","9","11","54","98", "123.doc",
                        "1","10","2012","KMHFH41H1CA123542", "24.7681554",
                        "46.6844987","deliver address addres", "Mohamed Nasee","2022-01-01 10:30:00");
        Validations.assertThat().response(Create_Order_Main_Response).
                extractedJsonValue("message")
                .contains("invalid input data")
                .perform();
        Validations.assertThat().response(Create_Order_Main_Response).
                extractedJsonValue("errors[0]")
                .contains("err_order_create_order_malfunctions_mandatory")
                .perform();
    }
}
