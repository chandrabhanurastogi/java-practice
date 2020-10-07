package java8.udemy.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class GreetingImplTest {

    @BeforeEach
    public void setup(){
        System.out.println("Setup");
    }

    @Test
    void givenNameIsPresentThenGreetingIsExpected() {
        Greeting greeting = new GreetingImpl();
        String greet = greeting.greet("Pree");
        assertNotNull(greet);
        assertEquals("Hello Pree", greet);
    }
    @Test
    void givenNameIsBlank_Then_ThrowException() {
        Greeting greeting = new GreetingImpl();
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> greeting.greet(""));
        assertEquals("name must be present",illegalArgumentException.getMessage());
    }
    @Test
    void givenNameIsNull_Then_ThrowException() {
        Greeting greeting = new GreetingImpl();
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> greeting.greet(null));
        assertEquals("name must be present",illegalArgumentException.getMessage());
    }

    @AfterEach
    public void after(){
        System.out.println("after");
    }

}