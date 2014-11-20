
public class PrimeFactors {
	public static void main(String[] args) {
		int broj= TextIO.getInt();
		int brojac=0;
		for(int i =1;i<=broj;i++){
			if (broj%i==0)
			System.out.println(i);
		}
	}

}
