package mnq.naqui;

import java.util.Comparator;

public class Footballer

{
	private int age;
	private String name;
	private int goalsScored;
	private double range;

	public Footballer(int age, String name, int goalsScored, double range) {
		this.age = age;
		this.name = name;
		this.goalsScored = goalsScored;
		this.range = range;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGoalsScored() {
		return goalsScored;
	}

	public void setGoalsScored(int goalsScored) {
		this.goalsScored = goalsScored;
	}

	public double getRange() {
		return range;
	}

	public void setRange(double range) {
		this.range = range;
	}

	@Override
	public String toString() {
		return "Footballer [age=" + age + ", name=" + name + ", goalsScored=" + goalsScored + ", range=" + range + "]";
	}

	static class SortBYAge implements Comparator {

		@Override
		public int compare(Object o1, Object o2) {
			Footballer f1 = (Footballer) o1;
			Footballer f2 = (Footballer) o2;
			return f1.age - f2.age;
		}
	}

	static class SortByGoal implements Comparator {

		@Override
		public int compare(Object o1, Object o2) {
			Footballer f1 = (Footballer) o1;
			Footballer f2 = (Footballer) o2;
			return f1.goalsScored - f2.goalsScored;
		}
	}
}
