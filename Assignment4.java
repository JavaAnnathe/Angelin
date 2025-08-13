import java.util.Scanner;
public class Assignment4 {
	public static void main(String[] args) {
		int a;
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		switch(a) {
			case 1:
				System.out.println("Read");
				break;
			case 2:
				System.out.println("Write");
				break;
			case 3:
				System.out.println("Delete");
				break;
			case 4:
				System.out.println("Fetch");
				break;
			default:
				System.out.println("Invalid number");
				break;
		}

	}
}
