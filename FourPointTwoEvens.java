/*
 * Name: Jack Brashier
 * Date: 04/02/2017
 * Purpose: To show understanding of Loops in Java.
 */
public class FourPointTwoEvens {
	public static void main(String [] args) {
		int output = 2;
		int count = 1;
		do {
			System.out.print(output + " ");
			count++;
			output += 2;
		} while (count < 101);
	}
}

