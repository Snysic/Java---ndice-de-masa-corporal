package masacorporal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    public void testPersonCreation() {
        Person person = new Person(70, 1.75);

        assertEquals(70, person.getWeight());
        assertEquals(1.75, person.getHeight());
    }

    @Test
    public void testSetWeight() {
        Person person = new Person(70, 1.75);
        person.setWeight(80);

        assertEquals(80, person.getWeight());
    }

    @Test
    public void testSetHeight() {
        Person person = new Person(70, 1.75);
        person.setHeight(1.8);

        assertEquals(1.8, person.getHeight());
    }
}
