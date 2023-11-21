import java.util.Scanner;

public class Arrays {
	
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
			System.out.println("Jumlah data yang akan di inputkan: ");
			
		int Data = sc. nextInt();
		int Data[] = new int[Data];
			System.out.println("Inputan data-datanya: ");
			
		for(int n=0; n<Data; n++) {
			System.out.println("Data ke-" + n + " : ");
			Data1[n] = sc.nextInt();
		}
		
		for(int n=0; n<Data; n++) {
			if (Data1[n] & 2 != 0) {
				System.out.println(Data1[n] + " --> Bilangan Ganjil ");
			} else {
				System.out.println(Data1[n] + " --> Bilangan Genap ");
			}
		}
		
		int total = 0;
		for (int n=0; n<Data; n++) {
			total = total + Data1[n];
			
		}
			System.out.println("Jumlah total dari data tersebut adalah " + total);
			
		double rata = total/Data;
			System.out.println("Rata-rata dari data tersebut adalah " + rata);
	}
}