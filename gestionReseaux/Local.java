/**
 * 
 */
package gestionReseaux;

/**
 * @author 21408172
 *
 */
public class Local extends Objet{

	private String description;
	private String lieu;

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
	/**
	 * @return the lieu
	 */
	public String getLieu() {
		return lieu;
	}
	/**
	 * @param lieu the lieu to set
	 */
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	
	public Local(int identifiantLocal, String nom, String description, String lieu) {
		super(identifiantLocal, nom);
		this.description = description;
		this.lieu = lieu;
	}
}
