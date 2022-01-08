
public class InvertedHalfPyramidofStarsPattern {
	public static void main (String[]args) {
		int row;
		int star = 0;

		for (row = 5; row >= 1; row--) {
			for (star = 1; star<=row; star++) {
				System.out.print ("* ");
			}

			System.out.println();
		}
	}
}