import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

<<<<<<< HEAD:src/test/java/HelloWorldTest.java
public class HelloWorldTest {
    private HelloWorld helloWorld;

    @BeforeEach
    public void init(){
        helloWorld = new HelloWorld();
    }
=======
public class MainTest {
>>>>>>> 3d54193a7e185e54c19bae236615d9a21dac93b4:src/test/java/MainTest.java

    @Test
    public void testHelloWorld(){
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("{\"hello\":\"world\"}", helloWorld.sayHello());

    }

}
