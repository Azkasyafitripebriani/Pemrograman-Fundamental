import static java.lang.System.in;
import static java.lang.System.out
import java.util.Scaner;
import java.until.Random;

public class DontTellThemTheyLost {
	
	public static void main(String[] args){
		Scaner keyboard = new Scaner(in);
		
		out.print ("Enter an int from 1 to 10: ");
		
		int inputNUmber = keyboard.nextInt();
		int randomNumber = new Random().nextInt (10) + 1;
		
		if (inputNUmber == randomNumber){
			out.println("*You win.*")
		}
		
		out.println("That was a very good guess :-) ");
		out.println("The random number was");
		out.println(randomNumber + ".");
		out.println("Thank you for playing.");
	}
	
}