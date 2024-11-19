package masacorporal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BmiViewTest {

    @Test
    public void testShowResults() {
      
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        
        BmiView view = new BmiView();
        view.showResults(22.86, "Normal weight");

       
        String output = out.toString();

       
        assertTrue(output.contains("Your BMI is: 22.86"));
        assertTrue(output.contains("Your BMI category is: Normal weight"));
    }
}