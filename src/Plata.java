public class Plata {
	public static void main(String[] args) {

		int satnica, brojSati, osnovica;
		satnica = TextIO.getInt();
		brojSati = TextIO.getInt();
		osnovica = TextIO.getInt();
		int plata = osnovica + satnica * brojSati;
		System.out.println(plata);
	}

}
