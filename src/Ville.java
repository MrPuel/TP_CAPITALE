
public class Ville {

	private String nom;
	private int nbHabitants;
	private int superficie;
	
	
	public Ville(String unNom, int unNbHabitant, int uneSuperficie){
		this.nom=unNom;
		this.nbHabitants=unNbHabitant;
		this.superficie=uneSuperficie;
	}
	
	public String getNom() {
		return this.nom;
	}
	public void setNom(String unNom) {
		this.nom = unNom;
	}
	
	public int getNbHabitants() {
		return this.nbHabitants;
	}
	public void setNbHabitants(int unNbHabitant) {
		this.nbHabitants = unNbHabitant;
	}
	
	public int getSuperficie() {
		return this.superficie;
	}
	public void setSuperficie(int uneSuperficie) {
		this.superficie = uneSuperficie;
	}
	
public String toString(){
		
		return ("nom: "+this.nom +" nbHabitants: "+this.nbHabitants +" superficie: "+this.superficie );	
	
	}
}
