import java.util.Scanner;

public class program {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		double bill =  Scanner.nextDouble();
		double tip = bill * 0.15; // 15% of the bill
		System.out.println(tip);
	}
}