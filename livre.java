package tp2;

public class livre {
	private String titre,auteur;
	private float nbPages;
	private double prix;
	private boolean prixFixe;
	public livre (String auteur,String titre)
	{
		this.auteur=auteur;
		this.titre=titre;
		this.prix=-1;
		this.prixFixe=false;
		
	}
	String getAuteur()
	{
		return this.auteur;
	}
	void setAuteur(String ch)
	{
		this.auteur=ch;
	}
	String getTitre()
	{
		return this.titre;
	}
	void setTitre(String titre)
	{
		this.titre=titre;
	}
	float getnbPages()
	{
		return this.nbPages;
	}
	void setnbPages(float nb)
	{
		if (nb>20)
			this.nbPages=nb;
		else
			System.out.println("le nombre est faible");
	}
	public String toString()
	{
		return "livre intitule "+titre+" de "+auteur+",contenant "+nbPages+" pages.";
	}
	public void decrire()
	{
		System.out.println(toString());
	}
	public livre()
	{
		nbPages=0;
	}
	public livre (String titre,float nbPages)
	{
		this.titre=titre;
		this.nbPages=nbPages;
	}
	public livre(String auteur,String titre,float nbPages)
	{
		this.auteur=auteur;
		this.titre=titre;
		this.nbPages=nbPages;
		
	}
	double getPrix()
	{
		return this.prix;
	}
	void setPrix(double prix)
	{
		if(!prixFixe) {
		this.prix=prix;
		this.prixFixe=true;
		}
		else
			System.out.println("le prix ne soit fixe qu'une seule foix");
		
	}
	public livre(String auteur,String titre,float nbPages,double prix)
	{
		this.auteur=auteur;
		this.titre=titre;
		this.nbPages=nbPages;
		this.prix=prix;
		this.prixFixe=true;
	}
	public boolean testPrix()
	{
		    return prixFixe;
	}
	
	
}