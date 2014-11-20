public class Columns {
	public static void main(String[] args) {
		int broj = TextIO.getInt();
		for (int j = 1; j <= broj; j++) {
			int suma = 0;
			for (int i = 1; i < j; i++) {
				if (j % i == 0)
					suma += i;

			}
			System.out.printf("%d 	%d\n", j, suma);
		}
	}

}
