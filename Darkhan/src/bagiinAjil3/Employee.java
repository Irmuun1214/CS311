package bagiinAjil3;

public class Employee {
	 private String emp_id;
	    private String name;
	    private int age;
	    private char gender;
	    private String location;

	    public Employee(String emp_id, String name, int age, char gender, String location) {
	        this.emp_id = emp_id;
	        this.name = name;
	        this.age = age;
	        this.gender = gender;
	        this.location = location;
	    }

	    public String getId() {
	        return emp_id;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public char getGender() {
	        return gender;
	    }

	    public String getLocation() {
	        return location;
	    }

	    @Override
	    public String toString() {
	        return "  Id: " + emp_id + ", Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Location: " + location;
	    }
}
