import java.util.Scanner;

public class KonversiNilaiHuruf {
    public static void main(String[] args) {
        // Membaca nilai huruf dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai huruf: ");
        char nilaiHuruf = scanner.next().charAt(0);
        scanner.close();

        double nilaiKonversi = 0.0;

        // Mengkonversi nilai huruf ke nilai indeks menggunakan if-else
        if (nilaiHuruf == 'A') {
            nilaiKonversi = 4.0;
        } else if (nilaiHuruf == 'B') {
            nilaiKonversi = 3.0;
        } else if (nilaiHuruf == 'C') {
            nilaiKonversi = 2.0;
        } else if (nilaiHuruf == 'D') {
            nilaiKonversi = 1.0;
        } else if (nilaiHuruf == 'E') {
            nilaiKonversi = 0.0;
        } else {
            System.out.println("Maaf, konversi nilai tidak diketahui");
            System.exit(1); // Keluar dari program jika nilai tidak valid
        }

        // Menampilkan hasil konversi
        System.out.println("Nilai konversi: " + nilaiKonversi);
    }
}