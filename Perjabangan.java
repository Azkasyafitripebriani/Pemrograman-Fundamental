import java.util.Scanner;

public class Percabangan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan nilai huruf : ");
		char nilaiHuruf = Scanner.next();
		
		if (nilaiHuruf >= 'A' && nilaiHuruf <= 'E') {
			char nilaiHuruf;
			double nilaiIndeks;
			
			if (nilaiHuruf = 'A') {
				nilaiIndeks = 4.0;
			} else if (nilaiHuruf = ('B')) {
				nilaiIndeks = 3.0;
			} else if (nilaiHuruf = ('C')) {
				nilaiIndeks = 2.0;
			} else if (nilaiHuruf = ('D')) {
				nilaiIndeks = 1.0;
			} else {
				nilaiHuruf = ('E');
				nilaiIndeks = 0.0;
			}	
			
			System.out.println("Nilai Huruf: "+ nilaiIndeks);
		} else {
			System.out.println("Maaf, konversi nilai tidak diketahui.");
		}	
		
		input.close();
	}	
}