/**
 * 
 */
package ldvh.livre;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author SSD
* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
*/
public class Livre {
	
	public Livre() {
		this.titre = "";
		this.nomAuteur = new ArrayList<>();
		this.sections = new HashMap<>();
		this.objet = new HashMap<>();
		this.sectionDebut = new Section(1,"",new ArrayList<>());
	}
	
	
	public Livre(String titre, List<String> nomAuteur, List<Section> sections, Section sectionDebut,
			List<Objet> objet) {
		this.titre = titre;
		this.nomAuteur = nomAuteur;
		this.sections = new HashMap<>();
		this.objet = new HashMap<>();
		for(Section s : sections)
			this.sections.put(s.getNumero(),s);
		this.sectionDebut = sectionDebut;
		for(Objet o : objet)
			this.objet.put(o.getNom(), o);
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private String titre;

	/** 
	* @return titre
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public String getTitre() {
		// begin-user-code
		return titre;
		// end-user-code
	}

	/** 
	* @param titre titre à définir
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setTitre(String titre) {
		// begin-user-code
		this.titre = titre;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private List<String> nomAuteur;

	/** 
	* @return nomAuteur
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public List<String> getNomAuteur() {
		// begin-user-code
		return nomAuteur;
		// end-user-code
	}

	/** 
	* @param nomAuteur nomAuteur à définir
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setNomAuteur(List<String> nomAuteur) {
		// begin-user-code
		this.nomAuteur = nomAuteur;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Map<Integer, Section> sections;

	/** 
	* @return sections
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Map<Integer, Section> getSections() {
		// begin-user-code
		return sections;
		// end-user-code
	}

	/** 
	* @param sections sections à définir
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setSections(List<Section> sections) {
		// begin-user-code
		for(Section s : sections)
			this.sections.put(s.getNumero(),s);
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Section sectionDebut;

	/** 
	* @return sectionDebut
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Section getSectionDebut() {
		// begin-user-code
		return sectionDebut;
		// end-user-code
	}

	/** 
	* @param sectionDebut sectionDebut à définir
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setSectionDebut(Section sectionDebut) {
		// begin-user-code
		this.sectionDebut = sectionDebut;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Map<String, Objet> objet;

	/** 
	* @return objet
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Map<String, Objet> getObjet() {
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
		for(Objet o : objet)
			this.objet.put(o.getNom(), o);
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private final Personnage personnage = new Personnage();

	/** 
	* @return personnage
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Personnage getPersonnage() {
		// begin-user-code
		return personnage;
		// end-user-code
	}

	/** 
	* @param personnage personnage à définir
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
}