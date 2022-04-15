package aiac.gi18.personne;
import java.util.Comparator;

public interface ListPersonne {
	public boolean add(Personne p);
	public boolean remove(Personne p);
	public Comparator <Personne> getComparator();

}
