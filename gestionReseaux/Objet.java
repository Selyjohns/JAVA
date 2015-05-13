/**
 * 
 */
package gestionReseaux;

/**
 * @author 21408172
 *
 */
public class Objet {

	/**
	 * @param args
	 */

	private int identifiantObjet;
	private String nomObjet;
	
	/**
	 * @return the identifiantObjet
	 */
	public int getIdentifiantObjet() {
		return identifiantObjet;
	}

	/**
	 * @param identifiantObjet the identifiantObjet to set
	 */
	public void setIdentifiantObjet(int identifiantObjet) {
		this.identifiantObjet = identifiantObjet;
	}

	/**
	 * @return the nomObjet
	 */
	public String getNomObjet() {
		return nomObjet;
	}

	/**
	 * @param nomObjet the nomObjet to set
	 */
	public void setNomObjet(String nomObjet) {
		this.nomObjet = nomObjet;
	}
	
	
	public Objet(int identifiantObjet, String nomObjet){
		super();
		this.identifiantObjet = identifiantObjet;
		this.nomObjet = nomObjet;
	}


}
