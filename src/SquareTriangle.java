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
		for(int i = 1; i <= broj; i++){
			
			for(int j = 1; j <= (2*(broj-i)) / 2; j++){
				System.out.print(" ");
			}
			
			for(int j = 1; j < 2*i; j++){
				System.out.print("*");
			}
	
			System.out.println();
	}

}
