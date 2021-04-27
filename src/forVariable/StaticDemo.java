package forVariable;

public class StaticDemo {

	private int i = 5;
	private static int j = 5;

	public void display() {
		i++;
		j++;
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("===========");

	}

}
