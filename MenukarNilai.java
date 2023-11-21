public class MenukarNilai {
	public static void main (String[] args){
		int a = 15;
		int b = 20;
		int c = 10;
		
		System.out.println("Sebelum ditukar, nilai a = " + a + "dan nilai b = " + b);
		
		a = b;
		b = c;
		c = a;
		
		System.out.println("Setelah ditukar, nilai a = " + a + "dan nilai b = "+ b);
		
	}
	
}