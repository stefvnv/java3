public class EmployeeFactory {
    public static Employee getEmployee(int hoursAllowcated, double hourlyRate){

        if (hoursAllowcated >= 40){
            return new FullTimeEmployee(hourlyRate);
        }else {
            return new PartTimeEmployee(hourlyRate);
        }
    }
}
