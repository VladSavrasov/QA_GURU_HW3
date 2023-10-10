package registrationtest.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxPage {
    SelenideElement userNameInput = $("#userName"),
            userEmailInput = $("#userEmail"),
            currentAddressInput = $("#currentAddress"),
            permamentAddressInput = $("#permanentAddress"),
            submitButton = $("#submit"),
            outputName = $("#output #name"),
            outputEmail = $("#output #email"),
            outputCurrentAddress = $("#output #currentAddress"),
            outputPermamentAddress = $("#output #permanentAddress");
    public TextBoxPage openPage() {
        open("/text-box");
        $(".main-header").shouldHave(text("Text Box"));
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }
    public TextBoxPage setUserName(String value) {
        userNameInput.setValue(value);
        return this;
    }
    public TextBoxPage setUserEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }
    public TextBoxPage setCurrentAddress(String value) {
        currentAddressInput.setValue(value);
        return this;
    }
    public TextBoxPage setPermamentAddress(String value) {
        permamentAddressInput.setValue(value);
        return this;
    }
    public void submit() {
        submitButton.click();
    }
    public TextBoxPage checkUserName(String value) {
        outputName.shouldHave(text(value));
        return this;
    }
    public TextBoxPage checkUserEmail(String value) {
        outputEmail.shouldHave(text(value));
        return this;
    }
    public TextBoxPage checkCurrentAddress(String value) {
        outputCurrentAddress.shouldHave(text(value));
        return this;
    }
    public TextBoxPage checkPermamentAddress(String value) {
        outputPermamentAddress.shouldHave(text(value));
        return this;
    }


}
