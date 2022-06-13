package Profile;

import Auth.Login_Main;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Update_provider_info {
    private RestActions apiobject;
    private Login_Main login_main;
    private Update_provider_info_Main update_provider_info_main;

    @BeforeClass
    public void beforclass() {
        apiobject = DriverFactory.getAPIDriver(Login_Main.BASE_URL);
        login_main = new Login_Main(apiobject);
        update_provider_info_main = new Update_provider_info_Main(apiobject);
        login_main.login(Login_Main.Mobile_Number, Login_Main.Password);
    }
    @Test
    @Description("check Update provider info successfully")
    public void Update_provider_info_successfully() {
        Response Update_provider_info_Response = update_provider_info_main.update_provider_info();

    }

    @Test
    @Description("check Update provider info Name is empty")
    public void Update_provider_info_Name_empty() {
        Response Update_provider_info_Response = update_provider_info_main.update_provider_info_failed(
                "",
                "shop description", "en", "2", "Abd elrahman",
                "1231231231", "qQ2hez8zH1RmGScBNaTGHuhXsUJB7S0A0XGG4Ori.png", "1",
                "1", "24.753690282046346", "46.76948548193361", "main123.jpg",
                "1", "asd123.png" + "asd234.jpg", "[65,66,2]", "[3,1]", "[1]", "[1,5]");
        Validations.assertThat().response(Update_provider_info_Response)
                .extractedJsonValue("message")
                .contains("invalid input data")
                .perform();
        Validations.assertThat().response(Update_provider_info_Response)
                .extractedJsonValue("errors")
                .contains("err_profile_update_profile_name_length")
                .perform();
    }

    @Test
    @Description("check Update provider info Name is <3 letters")
    public void Update_provider_info_Name_Minimum_number_Of_Letters() {
        Response Update_provider_info_Response = update_provider_info_main.update_provider_info_failed(
                "",
                "shop description", "en", "2", "Abd elrahman",
                "1231231231", "qQ2hez8zH1RmGScBNaTGHuhXsUJB7S0A0XGG4Ori.png", "1",
                "1", "24.753690282046346", "46.76948548193361", "main123.jpg",
                "1", "asd123.png" + "asd234.jpg", "[65,66,2]", "[3,1]", "[1]", "[1,5]");
        Validations.assertThat().response(Update_provider_info_Response)
                .extractedJsonValue("message")
                .contains("invalid input data")
                .perform();
        Validations.assertThat().response(Update_provider_info_Response)
                .extractedJsonValue("errors")
                .contains("err_profile_update_profile_name_length")
                .perform();
    }

    @Test
    @Description("check Update provider info Name is >150 letter")
    public void Update_provider_info_Name_Maximum_number_Of_Letters() {
        Response Update_provider_info_Response = update_provider_info_main.update_provider_info_failed(
                "Write or paste your text into this online character counter Write or paste your text into this online character counter Write or paste your text into this online character counter ",
                "shop description", "en", "2", "Abd elrahman",
                "1231231231", "qQ2hez8zH1RmGScBNaTGHuhXsUJB7S0A0XGG4Ori.png", "1",
                "1", "24.753690282046346", "46.76948548193361", "main123.jpg",
                "1", "asd123.png" + "asd234.jpg", "[65,66,2]", "[3,1]", "[1]", "[1,5]");
        Validations.assertThat().response(Update_provider_info_Response)
                .extractedJsonValue("message")
                .contains("invalid input data")
                .perform();
        Validations.assertThat().response(Update_provider_info_Response)
                .extractedJsonValue("errors")
                .contains("يجب أن لا يتجاوز طول نص الاسم 150 حروفٍ/حرفًا")
                .perform();
    }

    @Test
    @Description("check Update provider info favorite language is empty")
    public void Update_provider_info_favorite_language_empty() {
        Response Update_provider_info_Response = update_provider_info_main.update_provider_info_failed(
                "Abd elrahman updated",
                "shop description", "", "2", "Abd elrahman",
                "1231231231", "qQ2hez8zH1RmGScBNaTGHuhXsUJB7S0A0XGG4Ori.png", "1",
                "1", "24.753690282046346", "46.76948548193361", "main123.jpg",
                "1", "asd123.png" + "asd234.jpg", "[65,66,2]", "[3,1]", "[1]", "[1,5]");
        Validations.assertThat().response(Update_provider_info_Response)
                .extractedJsonValue("message")
                .contains("invalid input data")
                .perform();
        Validations.assertThat().response(Update_provider_info_Response)
                .extractedJsonValue("errors")
                .contains("err_profile_update_profile_favorite_language_invalid")
                .perform();
    }

    @Test
    @Description("check Update provider info responsible person is empty")
    public void Update_provider_info_responsible_person_empty() {
        Response Update_provider_info_Response = update_provider_info_main.update_provider_info_failed(
                "Abd elrahman updated",
                "shop description", "en", "2", "",
                "1231231231", "qQ2hez8zH1RmGScBNaTGHuhXsUJB7S0A0XGG4Ori.png", "1",
                "1", "24.753690282046346", "46.76948548193361", "main123.jpg",
                "1", "asd123.png" + "asd234.jpg", "[65,66,2]", "[3,1]", "[1]", "[1,5]");
        Validations.assertThat().response(Update_provider_info_Response)
                .extractedJsonValue("message")
                .contains("invalid input data")
                .perform();
        Validations.assertThat().response(Update_provider_info_Response)
                .extractedJsonValue("errors")
                .contains("err_profile_update_profile_responsible_person_length")
                .perform();
    }

    @Test
    @Description("check Update provider info images is empty")
    public void Update_provider_info_images_empty() {
        Response Update_provider_info_Response = update_provider_info_main.update_provider_info_failed(
                "Abd elrahman updated",
                "shop description", "en", "2", "",
                "1231231231", "qQ2hez8zH1RmGScBNaTGHuhXsUJB7S0A0XGG4Ori.png", "1",
                "1", "24.753690282046346", "46.76948548193361", "main123.jpg",
                "1", "asd123.png" + "asd234.jpg", "[65,66,2]", "[3,1]", "[1]", "[1,5]");
        Validations.assertThat().response(Update_provider_info_Response)
                .extractedJsonValue("message")
                .contains("invalid input data")
                .perform();
        Validations.assertThat().response(Update_provider_info_Response)
                .extractedJsonValue("errors")
                .contains("err_profile_update_profile_responsible_person_length")
                .perform();
    }
}
