package aiac.gi18.personne;
import java.util.ArrayList;

public class ListEtudiant extends ArrayList<Etudiant> {
	
public boolean add(Etudiant e) {
		if(this.contains(e)) return false;
		return super.add(e);
        }

}
public interface Comparable
{
	public boolean estVrai(Etudiant e);
	
}



