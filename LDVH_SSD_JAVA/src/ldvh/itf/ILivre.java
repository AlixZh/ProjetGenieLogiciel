/**
 * 
 */
package ldvh.itf;

import java.util.List;
import java.util.Map;

import ldvh.livre.Enchainement;
import ldvh.livre.Objet;
import ldvh.livre.Section;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author SSD
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public interface ILivre {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param objets
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void addObjetsLivre(List<String> objets)  throws Exception;

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param objets
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void deleteObjetsLivre(List<String> objets);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param idSection
	* @param objets
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void addObjetsSection(Integer idSection, List<String> objets);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param idSection
	* @param objets
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void deleteObjetsSection(Integer idSection, List<String> objets);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param idSectionDepart
	* @param idSectionDestination
	* @param objets
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void addObjetsEnchainement(Integer idSectionDepart, Integer idSectionDestination, List<String> objets);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param idSectionDepart
	* @param idSectionDestination
	* @param objets
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void deleteObjetsEnchainement(Integer idSectionDepart, Integer idSectionDestination, List<String> objets);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param idSectionDepart
	* @param idSectionDestination
	* @param texte
	* @param objets
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void addEnchainement(Integer idSectionDepart, Integer idSectionDestination, String texte, List<String> objets) throws Exception;

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param idSectionDepart
	* @param idSectionDestination
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void deleteEnchainement(Integer idSectionDepart, Integer idSectionDestination);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param idSectionDepart
	* @param idSectionDestination
	* @param newText
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void editTextEnchainement(Integer idSectionDepart, Integer idSectionDestination, String newText);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param idSectionDepart
	* @param idSectionDestination
	* @param newIdSection
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void editDepartEnchainement(Integer idSectionDepart, Integer idSectionDestination, Integer newIdSection);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param idSectionDepart
	* @param idSectionDestination
	* @param newIdSection
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void editDestinationEnchainement(Integer idSectionDepart, Integer idSectionDestination,
			Integer newIdSection);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param idSection
	* @param texte
	* @param objets
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void addSection(Integer idSection, String texte, List<String> objets) throws Exception;

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param idSection
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void deleteSection(Integer idSection);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param idSection
	* @param newText
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void editTextSection(Integer idSection, String newText);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param idSection
	* @param newIdSection
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void editIdSection(Integer idSection, Integer newIdSection) throws Exception;

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param newTitre
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void editTitreLivre(String newTitre);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param auteurs
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void editAuteursLivre(List<String> auteurs);
	
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	
	public List<Enchainement> getEnchainements();
	
	public List<Section> getSection();
	
	public Section getSectionId(int idSection);
	
	public Map<String,Objet> getObjetsLivre();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param nomFichier
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void parseLivre(String nomFichier);
}