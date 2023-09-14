import com.codeborne.selenide.Configuration;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.io.File;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.id;

public class FirstTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void fillFormTest() {
        open("/automation-practice-form");

        $(id("firstName")).setValue("Vladius");
        $("#lastName").setValue("Vladivikovich");
        $("#userEmail").setValue("vsvsvs08@rambler.ru");
        $("#genterWrapper").$(byText("Male")).click();
        $("[id=userNumber]").setValue("8909890099");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").click();
        $(byText("January")).click();
        $(".react-datepicker__year-select").click();
        $(byText("2002")).click();
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__day--011").click();
        $(".subjects-auto-complete__value-container--is-multi").click();
        $("#subjectsInput").setValue("e").pressEnter();
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#hobbiesWrapper").$(byText("Reading")).click();
        $("#hobbiesWrapper").$(byText("Music")).click();
        $("#uploadPicture").uploadFile(new File("src/test/resources/photo_5440751325626355282_x.jpg"));
        $("textarea[id=currentAddress]").click();
        $("textarea[id=currentAddress]").setValue("Some text");
        $("#state").click();
        $("#react-select-3-input").setValue("uttar").pressEnter();
        $(byText("Select City")).click();
        $("#react-select-4-input").setValue("ag").pressEnter();
        $("#submit").click();

        $(".table-responsive").$(byText("Student Name")).parent().shouldHave(text("Vladius Vladivikovich"));
        $(".table-responsive").$(byText("Student Email")).parent().shouldHave(text("vsvsvs08@rambler.ru"));
        $(".table-responsive").$(byText("Gender")).parent().shouldHave(text("Male"));
        $(".table-responsive").$(byText("Mobile")).parent().shouldHave(text("8909890099"));
        $(".table-responsive").$(byText("Date of Birth")).parent().shouldHave(text("11 January,2002"));
        $(".table-responsive").$(byText("Subjects")).parent().shouldHave(text("English"));
        $(".table-responsive").$(byText("Hobbies")).parent().shouldHave(text("Sports, Reading, Music"));
        $(".table-responsive").$(byText("Picture")).parent().shouldHave(text("photo_5440751325626355282_x.jpg"));
        $(".table-responsive").$(byText("Address")).parent().shouldHave(text("Some text"));
        $(".table-responsive").$(byText("State and City")).parent().shouldHave(text("Uttar Pradesh Agra"));
        $("#closeLargeModal").click();

    }
}
