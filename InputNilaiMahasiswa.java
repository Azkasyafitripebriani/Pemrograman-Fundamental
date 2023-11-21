import static java.lang.System.out;
public class InputDataMahasiswa {
	
	public static void main(String args[]) {
		String nim,nama, matkul;
		double presentasi, Tugas, UAS;
		
		Scanner dataScanner = new scanner(System.in);
		
		System.out.println("===== Input Nilai Mahasiswa =====");
		
		System.out.println("Masukkan NIM Anda");
		nim = dataScanner.nextLine();
		
		System.out.println("Masukkan Nama Anda");
		nama = dataScanner.nextLine();
		
		System.out.println("Masukkan Mata Kuliah");
		matkul = dataScanner.nextLine();
		
		System.out.println("Masukkan Nilai Presentasi");
		presentasi = dataScanner.nextLine();
		
		System.out.println("Masukkan Nilai Tugas");
		Tugas = dataScanner.nextLine();
		
		System.out.println("Masukkan Nilai UAS");
		UAS = dataScanner.nextLine();
		
		// bobot nilai
		double bobotPresentasi = 3;
		double bobotTugas = 3;
		double bobotUAS = 4;
		
		// hitung nilai rata-rata
		double nilaiPresentasi = bobotPresentasi * Presentasi;
		double nilaiTugas = bobotTugas * Tugas;
		double nilaiUAS = bobotUAS * UAS;
		
		dauble rataRata = (nilaiPresentasi + nilaiTugas + nilaiUAS) / (bobotPresentasi + bobotTugas + bobotUAS);
		System.out.println("Masukan nilai rata-rata: " + rataRata);
		
		// menampilkan hasil semuanya 
		System.out.println("======== Data Mahasiswa ========");
		System.out.println("|| NIM \t\t\t: " + nim + "\t||\n");
		System.out.println("|| Nama \t\t\t: " + nama + "\t||\n");
		System.out.println("|| Mata Kuliah \t\t\t: " + matkul + "\t||\n");
		System.out.println("|| Nilai Presentasi \t\t\t: " + presentasi + "\t||\n");
		System.out.println("|| Nilai Tugas \t\t\t: " + Tugas + "\t||\n");
		System.out.println("|| Nilai UAS \t\t\t: " + UAS + "\t||\n");
		System.out.println("|| Rata-rata \t\t\t: " + rataRata + "\t||\n");
		
		dataScanner.close();
	}
	
}