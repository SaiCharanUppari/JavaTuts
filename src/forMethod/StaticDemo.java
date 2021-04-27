package forMethod;

public class StaticDemo {

	private static int i = 5;
	private static int j = 5;

	public static void display() {
		i++;
		j++;
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("===========");

	}

}
