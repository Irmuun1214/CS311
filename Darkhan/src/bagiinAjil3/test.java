package bagiinAjil3;
import java.util.*;

public class test {
    public static void main(String[] args) {
        Servers controller = new Servers();
        List<Employee> employees = controller.ulaanbaatarServerEmployees();
        List<Employee> selectedEmployees = new ArrayList<>();
        System.out.println("Улаабаатар сервер:");
        printEmployees(employees);
        for (Employee emp : employees) {
            if (emp.getAge() >= 35 && emp.getGender() == 'M') {
                selectedEmployees.add(emp);
            }
        }
        System.out.println("Шилжүүлэr:");
        controller.transferUlaanbaatarToDarkhan(selectedEmployees);
        System.out.println();
        System.out.println("Улаабаатар сервер:");
        printEmployees(controller.ulaanbaatarServerEmployees());
        System.out.println("Дархан сервер:");
        printEmployees(controller.darkhanServerEmployees());
    }
    public static void printEmployees(List<Employee> employees) {
        for (Employee emp : employees) {
            System.out.println(emp);
        }
        System.out.println();
    }
}
