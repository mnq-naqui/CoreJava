package mnq.naqui;

import java.util.Comparator;

public class Employee implements Comparator{
	int id;
	String name;
	String department;

	public Employee() {

	}
	
	public int compare(Object obj1, Object obj2){
		Employee myboj1=(Employee)obj1;
		Employee myboj2=(Employee)obj2;
		return myboj1.id-myboj2.id;
	}
	
	public Employee(int id, String name, String department) {

		this.id = id;
		this.name = name;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String toString() {
		return " id=" + id + " name=" + name + " department=" + department + " ";
	}

}