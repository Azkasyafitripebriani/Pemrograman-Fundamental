import java.util.Scanner;

public class array {
    public static void main(String[] args) {
		int[] arr = new int [6];
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Data ke-" + (i+1) + ": ");
			arr [i] = input.nextInt();
		}
		
		System.out.println("Data genap: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
		
		System.out.println("Data ganjil: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.println(arr[i]);
			}
		}
	}
}	