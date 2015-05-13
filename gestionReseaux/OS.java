/**
 * 
 */
package gestionReseaux;

/**
 * @author 21408172
 *
 */
public class OS extends Objet{

	private String version;

	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}
	/**
	 * @param version the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}
	
	public OS(int identifiantOS, String nom, String version) {
		super(identifiantOS, nom);
		this.version = version;
	}

}
