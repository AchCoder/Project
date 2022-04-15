package aiac.gi18.personne;

public class Etudiant implements Comparable<Etudiant>{
	
	private int id; 
	private String nom;
	private double note;
	public Etudiant(int id, String nom)
	{
		this.nom=nom;
		this.id=id;
		this.note=10;
	
	}
	public String toString()
	{
	 return (nom+":"+note);
	}
	public boolean equals(Object Obj)
	{
		if( !(Obj instanceof Etudiant)) return false;
		return ((Etudiant)Obj).id==this.id;  
	}
		public int compareTo(Etudiant e)
		{
			if(this.note==e.note) return 0;
			if(this.note>e.note) return 1;
			return -1;
		}
	
	
		public boolean estVrai(Etudiant e) 
		{
			if(e instanceof Etudiant) return true;
			return false;
		}
		
	}
	
	


