package tp2;

public class mainLivre {

	public static void main(String[] args) {
		livre l1= new livre ("Coelho","l'alchimiste",25);
		livre l2= new livre("la tunisie",508);
		livre l3= new livre("JK Rowling","Harry Potter");
		livre tab[]= new livre[3];
		tab[0]=l1;
		tab[1]=l2;
		tab[2]=l3;
		
		for(int i=0;i<3;i++)
		{
			System.out.println(tab[i]);
		}
		tab[1].setAuteur("Paulo Coelho");
		tab[2].setnbPages(461);
		tab[0].decrire();
		tab[1].decrire();
		tab[2].decrire();
		
		livre l4= new livre("JK Rowling","Harry Potter",15,15.20);
		l4.setPrix(20.00);
        System.out.println(l4);
		
		
		
		

	}

}