public class CalculateBMI {
    private final double weight;
    private final double height;

    public CalculateBMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double calculateBMI() {
        return weight / (height * height);
    }
}
