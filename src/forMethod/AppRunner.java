package forMethod;

public class AppRunner {

	public static void main(String[] args) {
		
	    StaticDemo d1 = new StaticDemo();
	    d1.display();
	    StaticDemo.display();
	    System.out.println("--- Above both are doing same ---\n===========");

	    StaticDemo d2 = new StaticDemo();
	    d2.display();
	    
	    StaticDemo d3 = new StaticDemo();
	    StaticDemo.display();
		
	}

}
