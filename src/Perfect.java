public class Perfect {

	public static void main(String[] args) {
		int broj = TextIO.getInt();
		int suma = 0;
		for (int i = 1; i < broj; i++) {
			if (broj % i == 0)
				suma += i;
		}
		if (broj == suma)
			System.out.println("Perfect number");
		else
			System.out.println("Not a perfect number");
	}

}
