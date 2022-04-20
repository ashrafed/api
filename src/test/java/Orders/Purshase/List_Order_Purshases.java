package Orders.Purshase;

import Auth.main_Class;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class List_Order_Purshases {
    private RestActions apiobject;
    private main_Class maain_class;
    private List_Order_Purshases_Main list_Order_Purshases_Main;

    @BeforeClass
    public void beforclass(){
        apiobject = DriverFactory.getAPIDriver(main_Class.BASE_URL);
        maain_class = new main_Class(apiobject);
        list_Order_Purshases_Main = new List_Order_Purshases_Main(apiobject);
        maain_class.login("966506425181" , "123456");
    }
    @Test
    @Description("Validate on message")
    public void Success_Get_List_Order_Purshases_Validate_on_message(){
        Response Success_Get_List_Order_Purshases_Respone = list_Order_Purshases_Main.Success_List_Order_Purshases_Main();
        Validations.assertThat().response(Success_Get_List_Order_Purshases_Respone)
                .extractedJsonValue("message")
                .contains("There Is No Purchases For This Order")
                .perform();
    }
    @Test
    @Description("Validate on status code")
    public void Success_Get_List_Order_Purshases_Validate_on_status_code(){
        Response Success_Get_List_Order_Purshases_Respone = list_Order_Purshases_Main.Success_List_Order_Purshases_Main();
        Validations.assertThat().response(Success_Get_List_Order_Purshases_Respone)
                .extractedJsonValue("status_code")
                .contains("200")
                .perform();
    }
}
