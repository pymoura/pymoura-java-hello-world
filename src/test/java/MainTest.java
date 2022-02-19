import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MainTest {
    private HelloWorld helloWorld;

    @BeforeEach
    public void init(){
        helloWorld = new HelloWorld();
    }

    @Test
    public void testHelloWorld(){
        Assertions.assertEquals("{\"hello\":\"world\"}", helloWorld.helloWorld());

    }

}
