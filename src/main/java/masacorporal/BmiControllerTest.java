package masacorporal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BmiControllerTest {

    @Test
    public void testStart() {
        BmiView view = new BmiView();

        BmiController controller = new BmiController(view);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));


        BmiView viewWithOverrides = new BmiView() {
            @Override
            public double askWeight() {
                return 70.0;
            }

            @Override
            public double askHeight() {
                return 1.75; 
            }
        };

        BmiController controllerWithOverrides = new BmiController(viewWithOverrides);

        controllerWithOverrides.start();

        String output = out.toString();

        assertTrue(output.contains("Start method invoked"));
        assertTrue(output.contains("Person created: 70.0kg, 1.75m"));
        assertTrue(output.contains("Calculated BMI:"));
        assertTrue(output.contains("BMI Category:"));

        assertTrue(output.contains("Calculated BMI: 22.86"));
        assertTrue(output.contains("BMI Category: Normal weight"));
    }
}