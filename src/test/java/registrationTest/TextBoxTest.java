package registrationTest;

import org.junit.jupiter.api.Test;
import registrationTest.pages.TextBoxPage;

public class TextBoxTest extends BaseTest {
    TextBoxPage page = new TextBoxPage();

    @Test
    void fillFormTest() {
        page.openPage()
                .setUserName("Alex Egorov")
                .setUserEmail("alex@egorov.com")
                .setCurrentAddress("Some address 1")
                .setPermamentAddress("Another address 1")
                .submit();

        page.checkUserName("Alex Egorov")
                .checkUserEmail("alex@egorov.com")
                .checkCurrentAddress("Some address 1")
                .checkPermamentAddress("Another address 1");
    }
}
