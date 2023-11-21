import java.util.Scanner;

public class Presentase {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int modal = sc.nextInt();
	double perkeuntungan = sc.nextDouble();
	double hargajual = modal + (modal * perkeuntungan);
	double profit = hargajual - modal;
	
	System.out.println(modal);
	System.out.println(hargajual);
	System.out.println(profit);
	}
}