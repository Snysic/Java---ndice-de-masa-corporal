package masacorporal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BmiControllerTest {

    @Test
    public void testStart() {
        String input = "70.0\n1.75\n";  // Вес: 70.0, Рост: 1.75
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        BmiView view = new BmiView();
        BmiController controller = new BmiController(view);


        controller.start();

        String output = out.toString();
        assertTrue(output.contains("Your BMI is: 22.86"));
        assertTrue(output.contains("Your BMI category is: Normal weight"));
    }
}
