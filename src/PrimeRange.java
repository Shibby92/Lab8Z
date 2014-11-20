public class PrimeRange {
	public static void main(String[] args) {
		int broj = TextIO.getInt();
		for (int j = 2; j <= broj; j++) {
			int brojac = 0;
			for (int i = 1; i <= j; i++) {
				if (j % i == 0)
					brojac++;
			}
			if (brojac == 2)
				System.out.println(j);
		}

	}

}
