/**
 * 
 */
package gestionReseaux;

/**
 * @author 21408172
 *
 */
public class Interface extends Objet{

	private String adresseMac;
	private boolean etatInterface;

	/**
	 * @return the adresseMac
	 */
	public String getAdresseMac() {
		return adresseMac;
	}
	/**
	 * @param adresseMac the adresseMac to set
	 */
	public void setAdresseMac(String adresseMac) {
		this.adresseMac = adresseMac;
	}
	/**
	 * @return the etatInterface
	 */
	public boolean isEtatInterface() {
		return etatInterface;
	}
	/**
	 * @param etatInterface the etatInterface to set
	 */
	public void setEtatInterface(boolean etatInterface) {
		this.etatInterface = etatInterface;
	}
	
	public Interface(int identifiantInterface, String nom, String adresseMac, boolean etatInterface) {
		super(identifiantInterface, nom);
		this.adresseMac = adresseMac;
		this.etatInterface = etatInterface;
	}
}
