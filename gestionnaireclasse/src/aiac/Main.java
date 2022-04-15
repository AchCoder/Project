package aiac;

import java.util.ArrayList;

import aiac.gi18.personne.Etudiant;
import aiac.gi18.personne.ListEtudiant;

public class Main {
	
	public static void main(String[]args)
	{
		Etudiant e1=new Etudiant(1,"hamid");
		Etudiant e2=new Etudiant(2,"driss");
		Etudiant e3=new Etudiant(1,"youssef");
		System.out.println(e1+"\n"+e2);
		ArrayList <Etudiant> l =new ListEtudiant();
		l.add(e1);l.add(e2);l.add(e3);
		System.out.println(l);
		
		
		
		
		
	}
			
}
