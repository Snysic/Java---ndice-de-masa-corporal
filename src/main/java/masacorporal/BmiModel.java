package masacorporal;

public class BmiModel {

    private final Person person;

    public BmiModel(Person person) {
        this.person = person;
    }

    public double calculateBMI() {
        double weight = person.getWeight();
        double height = person.getHeight();

        if (height <= 0) {
            throw new IllegalArgumentException("Height must be greater than 0");
        }

        return Math.round((weight / (height * height)) * 100.0) / 100.0;
    }

    public String giveResultsBMI(double bmi) {
        if (bmi < 16) {
            return "Severe thinness";
        } else if (bmi < 17) {
            return "Moderate thinness";
        } else if (bmi < 18.5) {
            return "Mild thinness";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else if (bmi < 35) {
            return "Mild obesity";
        } else if (bmi < 40) {
            return "Moderate obesity";
        } else {
            return "Morbid Obesity";
        }
    }
}
