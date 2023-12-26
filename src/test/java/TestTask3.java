import org.junit.Test;

import com.example.task3.ProxyImage;
import com.example.task3.RealImage;

import static org.junit.Assert.assertTrue;

public class TestTask3 {

    @Test
    public void testRealImageLoadingTime() {
        long startTime = System.currentTimeMillis();
        RealImage realImage = new RealImage("./src/main/java/com/example/task3/StarWars.jpg");
        realImage.display();
        long endTime = System.currentTimeMillis();
        long loadingTime = endTime - startTime;
        assertTrue(loadingTime > 0);
    }

    @Test
    public void testProxyImageLoadingTime() {
        long startTime = System.currentTimeMillis();
        new ProxyImage("./src/main/java/com/example/task3/StarWars.jpg");
        long endTime = System.currentTimeMillis();
        long loadingTime = endTime - startTime;

        assertTrue(loadingTime > 0);
        assertTrue(loadingTime < getRealImageLoadingTime());
    }

    public long getRealImageLoadingTime() {
        long startTime = System.currentTimeMillis();
        new RealImage("./src/main/java/com/example/task3/StarWars.jpg");
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}