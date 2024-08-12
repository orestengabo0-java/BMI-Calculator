import java.text.DecimalFormat;

public class BMIReport {
    private final double bmi;
    private final String category;

    public BMIReport(String category, double bmi) {
        this.category = category;
        this.bmi = bmi;
    }

    public void printBMI() {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println();
        System.out.println("Your BMI: " + df.format(bmi));
        System.out.println("Category: " + category);
    }
}
