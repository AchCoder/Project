package aiac.gi18.personne;

public class Etudiant {
	
	private int id; 
	private String nom;
	private double note;
	public Etudiant(int id, String nom)
	{
		double note=10;
	
	}
	public String toString()
	{
	 return this.nom+":"+ this.note;
	}
	public boolean equals(Object Obj)
	{
		if( !(Obj instanceof Etudiant)) return false;
		return ((Etudiant)Obj).id==this.id;  
	}
	public class Etudiant implements Comparablae<Etudiant>
	{
		public int compareTo(Etudiant e)
		{
			if(this.note==e.note) return 0;
			if(this.note>o.note) return 1;
		}
	}
	
	

}
