import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class HelloWorldTest {

    @Test
    public void testHelloWorld(){
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("{\"hello\":\"world\"}", helloWorld.sayHello());

    }

}
