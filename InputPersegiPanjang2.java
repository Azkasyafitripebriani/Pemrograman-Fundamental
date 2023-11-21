import javax.swing.*;

public class InputPersegiPanjang2 {
	public static void main(String[] args){
		double panjang, lebar, luas, keliling;
		panjang = Double.parseDouble(JOptionPane.showInputDialog("Masukkan panjang persegi panjang: "));
		lebar = Double.parseDouble(JOptionPane.showInputDialog("Masukkan lebar persegi panjang: "));
		luas = panjang * lebar;
		keliling = (panjang + lebar) * 2;
		JOptionPane.showMessageDialog(null, "Luas persegi panjang = " + luas);
		JOptionPane.showMessageDialog(null, "Keliling persegi panjang = " + keliling);
	}
}