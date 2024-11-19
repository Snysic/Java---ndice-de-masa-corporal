package masacorporal;

public final class AppBmi {
    public static void main(String[] args) {
        System.out.println("Welcome to BMI Calculator!");
        System.out.println("--------------------------");

        BmiView view = new BmiView();

        BmiController controller = new BmiController(view);

        controller.start();
    }
}
