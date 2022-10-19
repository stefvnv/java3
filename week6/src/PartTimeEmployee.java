public class PartTimeEmployee extends Employee {
    private final double hourlyRate;

    public PartTimeEmployee(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getHourlyRate() {
        System.out.println("PARTTIME employee...");
        return hourlyRate;
    }
}
