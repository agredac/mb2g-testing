package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JunitHelloWorldTest {

    @Test
    void getHello() {
        JunitHelloWorld junitHelloWorld = new JunitHelloWorld();
        assertEquals("Hello World",junitHelloWorld.getHello());
    }
}