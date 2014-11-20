public class Palindrome {
	public static void main(String[] args) {
		int broj = TextIO.getInt();
		int tmp = broj;
		int brojac = 0;
		boolean palindrome = true;
		while (tmp != 0) {
			tmp /= 10;
			brojac++;
		}
		System.out.println(brojac);
		for (int i = 1; i <= brojac; i++) {
			if (broj % (Math.pow(10, i)) != broj % (Math.pow(10, brojac)))
				palindrome = false;
			else
				brojac--;
		}
		System.out.println(palindrome);
	}

}
