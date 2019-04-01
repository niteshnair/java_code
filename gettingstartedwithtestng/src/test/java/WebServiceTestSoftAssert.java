import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

import static org.apache.http.entity.ContentType.getOrDefault;

public class WebServiceTestSoftAssert
{
    @Test
    public void hardAssertStopsImmediately() throws IOException {
        CloseableHttpClient client = HttpClientBuilder.create().build();
        SoftAssert sa = new SoftAssert();


        CloseableHttpResponse response = client.execute(new HttpGet("http://api.github.com/"));

        System.out.println("First Assert");
        sa.assertEquals(response.getStatusLine().getStatusCode(), 404);

        System.out.println("Second Assert");
        sa.assertEquals(getOrDefault(response.getEntity()).getMimeType(),"application/xml");

        System.out.println("Third Assert");
        sa.assertEquals(getOrDefault(response.getEntity()).getCharset().toString(), "UTF-8");

        sa.assertAll();

        client.close();
        response.close();
    }
}
