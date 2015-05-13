/**
 * 
 */
package gestionReseaux;

/**
 * @author 21408172
 *
 */
public class Salle extends Objet{

	private String description;

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Salle(int identifiantSalle, String nom, String description) {
		super(identifiantSalle, nom);
		this.description = description;
	}
}
