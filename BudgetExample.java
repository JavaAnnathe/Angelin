import java.util.Scanner;

public class BudgetExample {
	public static void main(String[] args) {
		float r,f,o;
		float total;
		Scanner s = new Scanner(System.in);
		System.out.println("Price of rice: ");
		r = s.nextFloat();
		System.out.println("Price of flour: ");
		f = s.nextFloat();
		System.out.println("Price of oil: ");
		o = s.nextFloat();
		total = r+f+o;
		System.out.println("The total cost is "+total);
	}

}
