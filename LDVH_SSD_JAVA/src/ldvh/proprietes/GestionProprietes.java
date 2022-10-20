/**
 * 
 */
package ldvh.proprietes;

import ldvh.itf.IProprietes;
import ldvh.itf.ILivre;

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author SSD
* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
*/
public class GestionProprietes implements IProprietes {
	
	
	public GestionProprietes(ILivre iLivre) {
		this.iLivre = iLivre;
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private ILivre iLivre;

	/** 
	* @return iLivre
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public ILivre getiLivre() {
		// begin-user-code
		return iLivre;
		// end-user-code
	}

	/** 
	* @param iLivre iLivre à définir
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setiLivre(ILivre iLivre) {
		// begin-user-code
		this.iLivre = iLivre;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void showProprietes() {													//Visualiser les propriétés d'un objet (les enchainements qu'il conditionne et les sections où on peut le trouver)
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		
		// end-user-code
	}
}