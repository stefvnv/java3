public class MVCTester {
    public static void main(String[] args) {
        EmployeeModel model = new EmployeeModel();

        model.setName("Monkey Man");
        model.setId("1");

        EmployeeView view = new EmployeeView();
        view.showDetails(model.getName(), model.getId());

        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();
        controller.setEmployeeName("Monkey Lady");

        controller.updateView();

        controller.showDetails();
    }
}
