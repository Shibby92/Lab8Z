
public class Sum {
	public static void main(String[] args) {
		double suma=0;
		double broj ;
		int test=0;
		do{
			broj=TextIO.getDouble();
			suma+=broj;
			int brojac=0;
			for(int i =1;i<=broj;i++){
				if (broj%i==0)
					brojac++;
			}
			if((broj<0)||(brojac!=2)||((broj-(int)broj)!=0))
				test++;
				
		}while(broj!=0);
		System.out.println(suma);
		if (test==0)
			System.out.println("Svi uvjeti su ispunjeni!");
		else
			System.out.println("Svi uvjeti nisu ispinjeni");
		}
}
