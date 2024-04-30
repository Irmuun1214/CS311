package bagiinAjil3;

import java.util.*;

public class test2 {
    public static void main(String[] args) {
        Servers controller = new Servers();
        List<Employee> employees = controller.ulaanbaatarServerEmployees();
        List<Employee> selectedEmployees = new ArrayList<>();
        System.out.println("Улаабаатар сервер::");
        printEmployees(controller.ulaanbaatarServerEmployees());
        System.out.println("Шилжүүлэr:");
    
        controller.transferServerToDarkhan(employees);
        List<Employee> employees2 = controller.darkhanServerEmployees();
        
        System.out.println("Үлдсэн: ");
         for (Employee emp : employees2) {
            if (emp.getAge() >= 35 && emp.getGender() == 'M') {
            	System.out.println(emp.toString());
            }else {
            	selectedEmployees.add(emp);
            }
        }
    
    
        System.out.println("Шилжүүлэr:");
        controller.transferBackupToUlaanbaatar(selectedEmployees);
        System.out.println("Улаабаатар сервер::");
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
