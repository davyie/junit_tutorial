import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void addTest() {
        assertEquals(1, 1);
    }

    @Test
    void getAge() {
        Person p = new Person(24, "David");
        assertEquals(24, p.getAge());
    }

    @Test
    void setAge() {
        Person p = new Person(24, "David");
        assertEquals(24, p.getAge());
        p.setAge(25);
        assertEquals(25, p.getAge());
    }

    @Test
    void getName() {
    }

    @Test
    void setName() {
    }

    @Test
    void testUserInput() {
        String input = "Hello";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner sc = new Scanner(System.in);
        String actualInput = sc.nextLine();

        assertEquals(input, actualInput);
    }
}