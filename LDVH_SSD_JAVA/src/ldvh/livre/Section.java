/**
 * 
 */
package ldvh.livre;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author SSD
* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
*/
public class Section {
	
	public Section(Integer numero, String texte, List<Objet> objetsSection) {
		this.numero = numero;
		this.texte = texte;
		this.objetsSection = new HashMap<>();
		for(Objet o : objetsSection)
			this.objetsSection.put(o.getNom(), o);
		this.enchainementEntree = new ArrayList<>();
		this.enchainementSortie = new ArrayList<>();
	}
	
	
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Integer numero;
	
	/** 
	* @return numero
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Integer getNumero() {
		// begin-user-code
		return numero;
		// end-user-code
	}

	/** 
	* @param numero numero à définir
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setNumero(Integer numero) {
		// begin-user-code
		this.numero = numero;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private String texte;

	/** 
	* @return texte
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public String getTexte() {
		// begin-user-code
		return texte;
		// end-user-code
	}

	/** 
	* @param texte texte à définir
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setTexte(String texte) {
		// begin-user-code
		this.texte = texte;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private HashMap<String, Objet> objetsSection;

	/** 
	* @return objetsSection
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public HashMap<String, Objet> getObjetsSection() {
		// begin-user-code
		return objetsSection;
		// end-user-code
	}

	/** 
	* @param objetsSection objetsSection à définir
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setObjetsSection(HashMap<String, Objet> objetsSection) {
		// begin-user-code
		this.objetsSection = objetsSection;
		// end-user-code
	}
	
	private List<Enchainement> enchainementEntree;											//Enchainement où la section est destination
	
	public List<Enchainement> getEnchainementEntree() {
		return enchainementEntree;
	}

	public void setEnchainementEntree(List<Enchainement> enchainementEntree) {
		this.enchainementEntree = enchainementEntree;
	}

	public List<Enchainement> getEnchainementSortie() {
		return enchainementSortie;
	}

	public void setEnchainementSortie(List<Enchainement> enchainementSortie) {
		this.enchainementSortie = enchainementSortie;
	}

	private List<Enchainement> enchainementSortie;										//Enchainement où la section est départ
}