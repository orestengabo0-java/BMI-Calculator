public class Categories {
    private final double bmi;
    public Categories(double bmi) {
        this.bmi = bmi;
    }
    public String categorizeBMI() {
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi >= 18.5 && bmi < 24.9)
            return "Normal weight";
        else if (bmi >= 25 && bmi < 29.9)
            return "Overweight";
        else
            return "Obese";
    }
}
