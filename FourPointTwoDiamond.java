/*
 * Name: Jack Brashier
 * Date: 04/02/2017
 * Purpose: To show understanding of Loops in Java.
 */
public class FourPointTwoDiamond {
	public static void main(String [] args) {
		int s = 2;
		int instantS = s;
		int a = 1;
		int instantA = a;
		int l = 5;
		while (l > 2) {
			while (instantS > 0) {
				System.out.print(" ");
				instantS--;
			}
			while (instantA > 0) {
				System.out.print("*");
				instantA--;
			}
			if (l != 3) {
			a += 2;
			s--;
			instantA = a;
			instantS = s;
			}
			l--;
			System.out.print("\n");
		}
		while (l > 0) {
			a -= 2;
			l--;
			s++;
			instantA = a;
			instantS = s;
			while (instantS > 0) {
				System.out.print(" ");
				instantS--;
			}
			while (instantA > 0) {
				System.out.print("*");
				instantA--;
			}
			System.out.print("\n");
		}
	}
}

