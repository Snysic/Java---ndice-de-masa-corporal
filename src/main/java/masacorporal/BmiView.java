package masacorporal;

import java.util.Scanner;

public class BmiView {

    private Scanner scanner = new Scanner(System.in);

    public double askWeight(){
        System.out.println("Enter your weight in kilograms ");
        return scanner.nextDouble();
    }

    public double askHeight(){
        System.out.println("----------------------------");
        System.out.println("Enter your height in meters ");
        return scanner.nextDouble();
    }

    public void showResults(double bmi, String clasification){
        System.out.printf("Your BMI is: %.2f\n\n", bmi);

        System.out.println("Your BMI is: " + clasification);
    }
}