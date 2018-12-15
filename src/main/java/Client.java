public class Client {
    public static void main(String[] args) {
        Employees employees = new Employees();
        employees.loadData();
        Employees prototype = (Employees) employees.clone();
        System.out.println(prototype.getEmpList());
    }
}
