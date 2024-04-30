package bagiinAjil3;

import java.util.ArrayList;
import java.util.List;

class Servers {
    static List<Employee> ulaanbaatarServerEmployees = new ArrayList<>();
    static List<Employee> darkhanServerEmployees = new ArrayList<>();

    public Servers() {
        ulaanbaatarServerEmployees.add(new Employee("k001", "John", 35, 'M', "Ulaanbaatar"));
        ulaanbaatarServerEmployees.add(new Employee("k002", "Alice", 28, 'F', "Ulaanbaatar"));
        ulaanbaatarServerEmployees.add(new Employee("C001", "Bob", 42, 'M', "Ulaanbaatar"));
    }

    public List<Employee> ulaanbaatarServerEmployees() {
        return ulaanbaatarServerEmployees;
    }

    public List<Employee> darkhanServerEmployees() {
        return darkhanServerEmployees;
    }

    public void transferUlaanbaatarToDarkhan(List<Employee> employees) {
        List<Employee> toRemove = new ArrayList<>();
        for (Employee emp : employees) {
            if (ulaanbaatarServerEmployees.contains(emp)) {
                toRemove.add(emp);
            }
        }

        for (Employee emp : toRemove) {
            ulaanbaatarServerEmployees.remove(emp);
            darkhanServerEmployees.add(emp);
            System.out.println(emp.toString() + " Дарханлуу шилжүүлсэн");
        }
    }

    public void transferDarkhanToUlaanbaatar(List<Employee> employees) {
        List<Employee> toRemove = new ArrayList<>();
        for (Employee emp : employees) {
            if (darkhanServerEmployees.contains(emp)) {
                
                toRemove.add(emp);
            }
        }
        for (Employee emp : toRemove) {
            darkhanServerEmployees.remove(emp);
            ulaanbaatarServerEmployees.add(emp);
            System.out.println(emp.toString() + " Улаанбаатарлуу шилжүүлсэн");
        }
    }
}