public class SquareTriangle {
	public static void main(String[] args) {
		int broj = TextIO.getInt();
		for (int i = 0; i < broj; i++) {

			for (int j = 0; j < broj; j++) {
				if ((i == 0) || (i == broj - 1) || (j == 0) || (j == broj - 1))
					System.out.print("*");
				else
					System.out.print(" ");

			}

			System.out.println();
		}
	}

}
