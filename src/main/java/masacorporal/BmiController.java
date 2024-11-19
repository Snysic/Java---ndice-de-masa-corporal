package masacorporal;

public class BmiController {

    private final BmiView view;

    public BmiController(BmiView view) {
        this.view = view;
    }

    public void start() {
        System.out.println("Start method invoked");

        double weight = view.askWeight();
        double height = view.askHeight();

        Person person = new Person(weight, height);
        System.out.println("Person created: " + person.getWeight() + "kg, " + person.getHeight() + "m");

        BmiModel model = new BmiModel(person);
        double bmi = model.calculateBMI();
        System.out.println("Calculated BMI: " + bmi);

        String classification = model.giveResultsBMI(bmi);
        System.out.println("BMI Category: " + classification);

        view.showResults(bmi, classification);
    }
}