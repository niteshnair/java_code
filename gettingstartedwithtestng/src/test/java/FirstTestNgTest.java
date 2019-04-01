import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNgTest
{
    UserManager m;
    @BeforeTest
    public void setup()
    {
        m = new UserManager();
    }

    @Test
    public void successfulAddUserReturnsTrue()
    {

        boolean result = m.addUser("niteshnair@email.com");

        Assert.assertTrue(result);
    }
    @Test
    public void getUserReturnsExistingSavedUser()
    {
        m.addUser("niteshnair@email.com");

        String user = m.getUser("niteshnair@email.com");

        Assert.assertEquals(user, "niteshnair@email.com");
    }
    @Test
    public void getNonExistingUserReturnsNull()
    {
        String user = m.getUser("nair@email.com");

        Assert.assertNull(user);
    }
}
