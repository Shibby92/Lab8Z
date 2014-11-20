public class Power {
	public static void main(String[] args) {
		int baza = TextIO.getInt();
		int exp = TextIO.getInt();
		int rez = 1;
		while (exp != 0) {
			rez *= baza;
			exp--;
		}
		System.out.println(rez);
	}
}
