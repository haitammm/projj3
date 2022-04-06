import org.junit.Assert;
import org.junit.Test;

public class automationTest {

    @Test
    public void getUrlTest() {
        automationPractice test = new automationPractice("C:/Users/haitam/Desktop/chromedriver.exe");
        Assert.assertEquals(test.SignInAutomathion(), "http://automationpractice.com/index.php");
    }

    @Test
    public void signUpTest() throws InterruptedException {
        automationPractice test = new automationPractice("C:/Users/haitam/Desktop/chromedriver.exe");
        Assert.assertEquals(test.signIn(), "My account - My Store");
    }
}
