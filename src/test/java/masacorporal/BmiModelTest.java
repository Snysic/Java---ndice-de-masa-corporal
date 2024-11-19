package masacorporal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BmiModelTest {

    @Test
    public void testCalculateBMI_validInput() {
        Person person = new Person(70, 1.75); 
        BmiModel model = new BmiModel(person);

        double bmi = model.calculateBMI();

    
        assertEquals(22.86, bmi, 0.01); 
    }

    @Test
    public void testCalculateBMI_invalidHeight() {
        Person person = new Person(70, 0); 
        BmiModel model = new BmiModel(person);


        assertThrows(IllegalArgumentException.class, model::calculateBMI);
    }

    @Test
    public void testGiveResultsBMI() {
        Person person = new Person(70, 1.75); // Вес 70 кг, рост 1.75 м
        BmiModel model = new BmiModel(person);

        double bmi = model.calculateBMI();

        assertEquals("Normal weight", model.giveResultsBMI(bmi));


        assertEquals("Severe thinness", model.giveResultsBMI(15.0));
        assertEquals("Moderate thinness", model.giveResultsBMI(16.5));
        assertEquals("Mild thinness", model.giveResultsBMI(17.5));
        assertEquals("Overweight", model.giveResultsBMI(27.0));
        assertEquals("Mild obesity", model.giveResultsBMI(32.0));
        assertEquals("Moderate obesity", model.giveResultsBMI(37.0));
        assertEquals("Morbid Obesity", model.giveResultsBMI(45.0));
    }
}
