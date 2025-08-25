import java.util.Scanner;

public class Assignment6 {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		int[] arr1 = new int[5];
		int[] arr2 = new int[5];
		
		for (int i=0;i<arr1.length;i++) {
			arr1[i] = s.nextInt();
			System.out.print(arr1[i]+" ");
		}
		
		for (int i=0;i<arr2.length;i++) {
			arr2[i] = s.nextInt();
			System.out.print(arr2[i]+" ");
		}
		
		System.out.println();
		
		for (int i=0;i<arr1.length;i++) {
			for (int j=0;j<arr2.length;j++) {
				if (arr1[i]==arr2[j]) {
					System.out.print(arr1[i]+" ");
				}
			}
		}
	}
}
