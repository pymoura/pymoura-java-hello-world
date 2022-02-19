import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testHelloWorld(){
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("{\"hello\":\"world\"}", helloWorld.sayHello());

    }

}
