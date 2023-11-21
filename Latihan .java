import java.util.Scanner;

public class HitungPresentasePenjualan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan modal penjualan: ");
        double totalmodal = input.nextDouble();

        System.out.print("Masukkan presentase keuntungan: ");
        double nilaipresentase = input.nextDouble();

        double presentase = (nilaipresentase / totalmodal) * 100;

        System.out.println("keuntungan: " + presentase);

        input.close();
	}

}