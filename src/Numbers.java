public class Numbers {
	public static void main(String[] args) {
		double broj1, broj2;
		do {
			broj1 = TextIO.getDouble();
			broj2 = TextIO.getDouble();
			System.out.printf("%f %f %f %f", broj1 + broj2, broj1 - broj2,
					broj1 / broj2, broj1 % broj2);
		} while ((broj1 != 0) || (broj2 != 0));
	}
}
