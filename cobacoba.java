import java.util.Scanner;

public class HitungRataRata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan: ");
        int jumlahBilangan = scanner.nextInt();

        int total = 0;

        for (int i = 1; i <= jumlahBilangan; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            int bilangan = scanner.nextInt();
            total += bilangan;
        }

        double rataRata = (double) total / jumlahBilangan;

        System.out.println("Rata-rata: " + rataRata);

        scanner.close();
	}
}