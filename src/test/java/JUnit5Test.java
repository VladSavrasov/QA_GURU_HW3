
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class JUnit5Test {
    @Test
    public void shouldSeeSoftAssertionsPage(){
        open("https://github.com");

        $(".search-input-container").click();
        $("#query-builder-test").setValue("selenide").pressEnter();
        $(By.linkText("selenide/selenide")).click();
        $("#wiki-tab").click();
        $("#wiki-pages-box").$(".wiki-more-pages-link").$(".f6").click();
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
        $("#wiki-pages-box").$(byText("SoftAssertions")).click();
        $("a#user-content-3-using-junit5-extend-test-class").parent().sibling(0).shouldHave(text("@ExtendWith({SoftAssertsExtension.class})\n" +
                "class Tests {\n" +
                "  @Test\n" +
                "  void test() {\n" +
                "    Configuration.assertionMode = SOFT;\n" +
                "    open(\"page.html\");\n" +
                "\n" +
                "    $(\"#first\").should(visible).click();\n" +
                "    $(\"#second\").should(visible).click();\n" +
                "  }\n" +
                "}"));
    }
}
