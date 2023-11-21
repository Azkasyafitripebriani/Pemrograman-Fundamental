public class HitungIp {
	public static void main(String[] args) {
		int sksPF = 4;
		int sksKalkulus = 3;
		int sksPkn = 2;
		int totalSks = sksPF + sksKalkulus + sksPkn;  
		double nilaiIndexPF = 3.7;
		double nilaiIndexKalkulus = 3.75;
		double nilaiIndexPkn = 3.0;
		double totalIndex = (sksPF * nilaiIndexPF) + (sksKalkulus * nilaiIndexKalkulus) + (sksPkn * nilaiIndexPkn);
		double ip = totalIndex / totalSks;
		System.out.println("IP Anda adalah " + ip);
		
	}
	
}