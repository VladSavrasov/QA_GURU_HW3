package registrationTest;

import org.junit.jupiter.api.Test;
import registrationTest.pages.RegistrationPage;
import static com.codeborne.selenide.Selenide.open;


public class FirstTest extends BaseTest {
RegistrationPage registrationPage =new RegistrationPage();
    @Test
    void fillFormTest() {
        open("/automation-practice-form");
        registrationPage.openPage()
                .setfirstName("Vladius")
                .setLastName("Vladivikovich")
                .setEmail("vsvsvs08@rambler.ru")
                .setGenderRadio("Male")
                .setPhoneNumber("8909890099").setDateOfBirth("11","January","2002")
                .setSubjectsField("e")
                .setHobby("Music")
                .downloadThePicture("photo_5440751325626355282_x.jpg")
                .setCurrentAddressField("Some text")
                .setState("uttar")
                .setCity("ag")
                .submit();

        registrationPage.modalformFieldCheck("Student Name","Vladius Vladivikovich")
                .modalformFieldCheck("Student Email","vsvsvs08@rambler.ru")
                .modalformFieldCheck("Gender","Male")
                .modalformFieldCheck("Mobile","8909890099")
                .modalformFieldCheck("Date of Birth","11 January,2002")
                .modalformFieldCheck("Subjects","English")
                .modalformFieldCheck("Hobbies","Music")
                .modalformFieldCheck("Picture","photo_5440751325626355282_x.jpg")
                .modalformFieldCheck("Address","Some text")
                .modalformFieldCheck("State and City","Uttar Pradesh Agra")
                .closeModalformField();

//        $(id("firstName")).setValue("Vladius");
//        $("#lastName").setValue("Vladivikovich");
//        $("#userEmail").setValue("vsvsvs08@rambler.ru");
//        $("#genterWrapper").$(byText("Male")).click();
//        $("[id=userNumber]").setValue("8909890099");
//        $("#dateOfBirthInput").click();
//        $(".react-datepicker__month-select").click();
//        $(byText("January")).click();
//        $(".react-datepicker__year-select").click();
//        $(byText("2002")).click();
//        $(".react-datepicker__year-select").click();
//        $(".react-datepicker__day--011").click();
//        $(".subjects-auto-complete__value-container--is-multi").click();
//        $("#subjectsInput").setValue("e").pressEnter();
//        $("#hobbiesWrapper").$(byText("Sports")).click();
//        $("#hobbiesWrapper").$(byText("Reading")).click();
//        $("#hobbiesWrapper").$(byText("Music")).click();
//        $("#uploadPicture").uploadFile(new File("src/test/resources/photo_5440751325626355282_x.jpg"));
//        $("textarea[id=currentAddress]").click();
//        $("textarea[id=currentAddress]").setValue("Some text");
//        $("#state").click();
//        $("#react-select-3-input").setValue("uttar").pressEnter();
//        $(byText("Select City")).click();
//        $("#react-select-4-input").setValue("ag").pressEnter();
//        $("#submit").click();

//        $(".table-responsive").$(byText("Student Name")).parent().shouldHave(text("Vladius Vladivikovich"));
//        $(".table-responsive").$(byText("Student Email")).parent().shouldHave(text("vsvsvs08@rambler.ru"));
//        $(".table-responsive").$(byText("Gender")).parent().shouldHave(text("Male"));
//        $(".table-responsive").$(byText("Mobile")).parent().shouldHave(text("8909890099"));
//        $(".table-responsive").$(byText("Date of Birth")).parent().shouldHave(text("11 January,2002"));
//        $(".table-responsive").$(byText("Subjects")).parent().shouldHave(text("English"));
//        $(".table-responsive").$(byText("Hobbies")).parent().shouldHave(text("Music"));
//        $(".table-responsive").$(byText("Picture")).parent().shouldHave(text("photo_5440751325626355282_x.jpg"));
//        $(".table-responsive").$(byText("Address")).parent().shouldHave(text("Some text"));
//        $(".table-responsive").$(byText("State and City")).parent().shouldHave(text("Uttar Pradesh Agra"));
//        $("#closeLargeModal").click();

    }
}
