package guru.springframework;

import org.junit.Test;

import static org.junit.Assert.*;

public class Junit4HelloWorldTest {

    @Test
    public void getHello() {

        Junit4HelloWorld junit4HelloWorld = new Junit4HelloWorld();

        assertEquals("Hello World", junit4HelloWorld.getHello());
    }
}