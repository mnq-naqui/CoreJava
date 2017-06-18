package mnq.naqui;

final class ImmutableClass3 {
	
	private final Integer id;
	private final String field;
	private final Footballer footballer;
	
	private ImmutableClass3(Integer id, String field, Footballer footballer) {
		this.id = id;
		this.field = field;
		this.footballer = new Footballer(footballer.getAge(),footballer.getName(), footballer.getGoalsScored(), 
				footballer.getRange());
	}
	
	public Integer getId() {
		return id;
	}
	public String getField() {
		return field;
	}
	public Footballer getFootballer() {
		return new Footballer(footballer.getAge(),footballer.getName(), footballer.getGoalsScored(), 
				footballer.getRange());
	}
	
	public static ImmutableClass3 getInstance(Integer id, String field, Footballer footballer){
		return new ImmutableClass3(id, field, footballer);		
	}

	@Override
	public String toString() {
		return "ImmutableClass3 [id=" + id + ", field=" + field + ", footballer=" + footballer + "]";
	}
}

public class ImmutableClass0{
	public static void main(String[] args) {
		Footballer fb1=new Footballer(28, "Messi", 678, 35);
		//ImmutableClass3 im3=new ImmutableClass3(1, "field1", fb1);
		ImmutableClass3 instance = ImmutableClass3.getInstance(1, "field1", fb1);
		System.out.println(instance);
		fb1.setName("Ronaldo");
		instance.getFootballer().setName("Neymar");;
		System.out.println(instance);
	}
}
