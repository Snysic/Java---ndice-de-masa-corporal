package masacorporal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BmiModelTest {

    // Тестируем метод calculateBMI
    @Test
    public void testCalculateBMI_validInput() {
        Person person = new Person(70, 1.75); // Вес 70 кг, рост 1.75 м
        BmiModel model = new BmiModel(person);

        double bmi = model.calculateBMI();

        // Проверяем, что BMI правильно вычисляется
        assertEquals(22.86, bmi, 0.01); // Ожидаемое значение BMI - 22.86 с точностью до двух знаков
    }

    // Тестируем метод calculateBMI на неправильный ввод (высота <= 0)
    @Test
    public void testCalculateBMI_invalidHeight() {
        Person person = new Person(70, 0); // Невозможная высота (0)
        BmiModel model = new BmiModel(person);

        // Ожидаем, что будет выброшено исключение IllegalArgumentException
        assertThrows(IllegalArgumentException.class, model::calculateBMI);
    }

    // Тестируем метод giveResultsBMI для разных значений BMI
    @Test
    public void testGiveResultsBMI() {
        Person person = new Person(70, 1.75); // Вес 70 кг, рост 1.75 м
        BmiModel model = new BmiModel(person);

        double bmi = model.calculateBMI();

        // Проверяем, что категория для BMI 22.86 соответствует "Normal weight"
        assertEquals("Normal weight", model.giveResultsBMI(bmi));

        // Проверяем для других значений BMI
        assertEquals("Severe thinness", model.giveResultsBMI(15.0));
        assertEquals("Moderate thinness", model.giveResultsBMI(16.5));
        assertEquals("Mild thinness", model.giveResultsBMI(17.5));
        assertEquals("Overweight", model.giveResultsBMI(27.0));
        assertEquals("Mild obesity", model.giveResultsBMI(32.0));
        assertEquals("Moderate obesity", model.giveResultsBMI(37.0));
        assertEquals("Morbid Obesity", model.giveResultsBMI(45.0));
    }
}
