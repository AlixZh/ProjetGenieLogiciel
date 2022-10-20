/**
 * 
 */
package ldvh.livre;

import java.util.List;
/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author SSD
* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
*/
public class Enchainement {
	
	public Enchainement(int sectionDepart, int sectionDestination, List<Objet> conditions, String texte) {
		this.sectionDepart = sectionDepart;
		this.sectionDestination = sectionDestination;
		this.conditions = conditions;
		this.texte = texte;
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private int sectionDepart;

	/** 
	* @return sectionDepart
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public int getSectionDepart() {
		// begin-user-code
		return sectionDepart;
		// end-user-code
	}

	/** 
	* @param sectionDepart sectionDepart à définir
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setSectionDepart(int sectionDepart) {
		// begin-user-code
		this.sectionDepart = sectionDepart;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private int sectionDestination;

	/** 
	* @return sectionDestination
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public int getSectionDestination() {
		// begin-user-code
		return sectionDestination;
		// end-user-code
	}

	/** 
	* @param sectionDestination sectionDestination à définir
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setSectionDestination(int sectionDestination) {
		// begin-user-code
		this.sectionDestination = sectionDestination;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private List<Objet> conditions;

	/** 
	* @return conditions
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public List<Objet> getConditions() {
		// begin-user-code
		return conditions;
		// end-user-code
	}

	/** 
	* @param conditions conditions à définir
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setConditions(List<Objet> conditions) {
		// begin-user-code
		this.conditions = conditions;
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
}