import java.util.Scanner;

public class PinNumber {
	public static void main(String[] args) {
		int given = 1243;
		int user;
		Scanner s = new Scanner(System.in);
		user = s.nextInt();
		if (given==user) {
			System.out.println("Transaction successful");
		}
		else {
			System.out.println("PIN is wrong");
		}
	}

}
