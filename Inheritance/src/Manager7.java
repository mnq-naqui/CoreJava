class Manager4 {
	static {
		System.out.println("Manager4-SIB");
	}

	public static void main(String[] args) {
		System.out.println("Manager4-main");
	}
}

class Manager5 extends Manager4 {
	static {
		System.out.println("Manager5-SIB");
	}
}

class Manager6 {
	static {
		System.out.println("Manager6-SIB");
	}

	public static void main(String[] args) {
		System.out.println("Manager6-main-b");
		Manager4.main(args);
		System.out.println("Manager6-main-e");
	}
}

public class Manager7 {
	static {
		System.out.println("Manager7-SIB");
	}
	public static void main(String[] args) {
		System.out.println("Manager7-main-b");
		Manager5.main(args);
		System.out.println("----------------");
		Manager4.main(args);
		System.out.println("Manager7-main-e");
		
		
	}

}
