public class FullTimeEmployee extends Employee {
    private final double hourlyRate;

    public FullTimeEmployee(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getHourlyRate() {
        System.out.println("FULLTIME employee...");
        return hourlyRate;
    }
}
