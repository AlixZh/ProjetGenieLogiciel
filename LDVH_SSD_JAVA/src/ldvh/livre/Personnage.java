/**
 * 
 */
package ldvh.livre;

import java.util.ArrayList;
import java.util.List;

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author SSD
* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
*/
public class Personnage {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private List<Objet> objet = new ArrayList<Objet>();

	/** 
	* @return objet
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public List<Objet> getObjet() {
		// begin-user-code
		return objet;
		// end-user-code
	}

	/** 
	* @param objet objet à définir
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setObjet(List<Objet> objet) {
		// begin-user-code
		this.objet = objet;
		// end-user-code
	}
}