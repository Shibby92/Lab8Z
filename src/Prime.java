
public class Prime {
	public static void main(String[] args) {
		int broj= TextIO.getInt();
		int brojac=0;
		for(int i =1;i<=broj;i++){
			if (broj%i==0)
				brojac++;
		}
		if (brojac==2)
			System.out.println("Prost");
		else
			System.out.println("Nije prost");
	}

}
