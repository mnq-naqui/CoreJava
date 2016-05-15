package mnq.naqui;
//Add element in the Array List to avoid duplicates(if name is same then object is duplicate)
import java.util.ArrayList;
import java.util.List;

public class Person  {
	private int id;
	private String name;
	private int age;

	@Override
	public int hashCode() {
		String s1 = name;

		int hash = s1.hashCode();

		return hash;

	}

	@Override
	public boolean equals(Object obj) {
		Person myObj = (Person) obj;
		return (obj instanceof Person && name == myObj.name);
	}
	
	
	@Override
	public String toString() {
			
			
		return " [id=" + id + ", name=" + name + ", age=" + age + "]";
			
	}

	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
		
		
	}
	
	
	
	public static void main(String[] args) {
		Person p1 = new Person(101, "Ram", 22);
		Person p2 = new Person(102, "Shyam", 24);
		Person p3 = new Person(103, "Paul", 23);
		Person p4 = new Person(101, "Ram", 28);

		/*List<Person> list = new ArrayList<Person>();
		list.add(p1);
		
		if (!(p1.equals(p2))) {
			list.add(p2);
		}
		if (!(p1.equals(p3))) {
			list.add(p3);
		}
		
		if (!(p1.equals(p4))) {
			list.add(p4);
		}
		
		System.out.println(list);
		*/

		
	}

}
