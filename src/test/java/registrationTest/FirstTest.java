package registrationTest;

import org.junit.jupiter.api.Test;
import registrationTest.pages.RegistrationPage;
import static com.codeborne.selenide.Selenide.open;


public class FirstTest extends BaseTest {
RegistrationPage registrationPage =new RegistrationPage();
    TestData testData = new TestData();
    @Test
    void fillFormTest() {
        open("/automation-practice-form");
        registrationPage.openPage()
                .setfirstName(testData.firstName)
                .setLastName(testData.lastName)
                .setEmail(testData.email)
                .setGenderRadio(testData.gender)
                .setPhoneNumber(testData.phoneNumber)
                .setDateOfBirth(testData.day,testData.month,testData.year)
                .setSubjectsField(testData.subject)
                .setHobby(testData.hobby)
                .downloadThePicture(testData.picture)
                .setCurrentAddressField(testData.address)
                .setState(testData.state)
                .setCity(testData.city)
                .submit();

        registrationPage.modalformFieldCheck("Student Name",testData.firstName+" "+ testData.lastName)
                .modalformFieldCheck("Student Email",testData.email)
                .modalformFieldCheck("Gender",testData.gender)
                .modalformFieldCheck("Mobile",testData.phoneNumber)
                .modalformFieldCheck("Date of Birth",testData.day=" "+ testData.month+","+testData.year)
                .modalformFieldCheck("Subjects",testData.subject)
                .modalformFieldCheck("Hobbies",testData.hobby)
                .modalformFieldCheck("Picture",testData.picture)
                .modalformFieldCheck("Address",testData.address)
                .modalformFieldCheck("State and City",testData.state+" "+testData.city)
                .closeModalformField();
    }
}
