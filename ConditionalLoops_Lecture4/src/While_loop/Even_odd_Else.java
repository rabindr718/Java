package While_loop;
import java.util.Scanner;

public class Even_odd_Else {

		
		public static void main (String[] args) {
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int  rem = n % 2;
			if(rem == 0) {
				System.out.println("Even");
			}
			else {
			System.out.println("Odd");
		}
	 }
}

