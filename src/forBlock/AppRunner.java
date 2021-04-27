package forBlock;

public class AppRunner {

	static int a;
	
	public static void main(String[] args) {

		System.out.println("This statement belongs to main method. Static block got executed already.!!!");
		System.out.println("a = " + a);

	}

	static {
		
		System.out.println("This statement belongs to Static block. It will be called before main method.!!!");
		
		a = 5;
	}

}
