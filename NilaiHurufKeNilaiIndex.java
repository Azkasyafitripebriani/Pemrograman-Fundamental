import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nilaiHuruf;
        
        System.out.println("Masukkan nilai huruf: ");
        nilaiHuruf = input.nextLine();

        if (nilaiHuruf = A) {
            nilaiIndex = 4.0;
        } else if (nilaiHuruf = B) {
            nilaiIndex = 3.0;
        } else if (nilaiHuruf =C) {
            nilaiIndex = 2.0;
        } else if (nilaiHuruf = D) {
            nilaiIndex = 1.0;
        } else {
            nilaiIndex = 0.0;
        }

        System.out.println("nilai index adalah: " + nilaiIndex);
		
    }
}