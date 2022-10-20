/**
 * 
 */
package ldvh.livre;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ldvh.itf.ILivre;

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author SSD
* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
*/
public class GestionLivre implements ILivre {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Livre livre = new Livre();

	/** 
	* @return livre
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Livre getLivre() {
		// begin-user-code
		return livre;
		// end-user-code
	}

	/** 
	* @param livre livre à définir
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setLivre(Livre livre) {
		// begin-user-code
		this.livre = livre;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param objets
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void addObjetsLivre(List<String> objets) throws Exception {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		for(String s : objets) {
			if (livre.getObjet().containsKey(s))
				throw new Exception("ObjetExiste");
			livre.getObjet().put(s, (new Objet(s,new ArrayList<Enchainement>())));			//Un objet n'est associé à aucun enchainement au départ.
		}
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param objets
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void deleteObjetsLivre(List<String> objets) {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		for(String s : objets)
			livre.getObjet().remove(s);
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param idSection
	* @param objets
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void addObjetsSection(Integer idSection, List<String> objets) {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		if(idSection == 1)
			for(String s : objets)
				livre.getSectionDebut().getObjetsSection().put(s,livre.getObjet().get(s));
		else
			for(String s : objets)
				livre.getSections().get(idSection).getObjetsSection().put(s,livre.getObjet().get(s));
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param idSection
	* @param objets
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void deleteObjetsSection(Integer idSection, List<String> objets) {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		if(idSection == 1)
			for(String s : objets)
				livre.getSectionDebut().getObjetsSection().remove(s);
		for(String s : objets) {
			livre.getSections().get(idSection).getObjetsSection().remove(s);
		}
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param idSectionDepart
	* @param idSectionDestination
	* @param objets
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void addObjetsEnchainement(Integer idSectionDepart, Integer idSectionDestination, List<String> objets) { //Ajout des objets qui conditionnent un enchainement
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		Section sectionDepart = null;
		if(idSectionDepart == 1)
			sectionDepart = livre.getSectionDebut();
		else
			sectionDepart = livre.getSections().get(idSectionDepart);
		if(sectionDepart != null) {
			Enchainement enchainement = null;
			livre.getSections().get(idSectionDepart);
			for(Enchainement e : sectionDepart.getEnchainementSortie())
				if(e.getSectionDestination() == idSectionDestination)
					enchainement = e;
			if(enchainement != null)
				for(String s : objets) {
					Objet o = livre.getObjet().get(s);
					enchainement.getConditions().add(o);
					o.getEnchainement().add(enchainement);
				}
		}
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param idSectionDepart
	* @param idSectionDestination
	* @param objets
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void deleteObjetsEnchainement(Integer idSectionDepart, Integer idSectionDestination, List<String> objets) {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		Section sectionDepart;
		if(idSectionDepart == 1)
			 sectionDepart = livre.getSectionDebut();
		else
			sectionDepart = livre.getSections().get(idSectionDepart);
		if(sectionDepart != null) {
			Enchainement enchainement = null;
			 livre.getSections().get(idSectionDepart);
			for(Enchainement e : sectionDepart.getEnchainementSortie())
				if(e.getSectionDestination() == idSectionDestination)
					enchainement = e;
			if(enchainement != null)
				for(String s : objets) {
					Objet o = livre.getObjet().get(s);
					enchainement.getConditions().remove(o);
					o.getEnchainement().remove(enchainement);
				}
		}
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param idSectionDepart
	* @param idSectionDestination
	* @param texte
	* @param objets
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void addEnchainement(Integer idSectionDepart, Integer idSectionDestination, String texte, List<String> objets) throws Exception {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		Section sectionDepart = null;
		if(idSectionDepart == 1)
			sectionDepart = livre.getSectionDebut();
		else
			sectionDepart = livre.getSections().get(idSectionDepart);
		for(Enchainement e : sectionDepart.getEnchainementSortie()) {
			if(e.getSectionDestination() == idSectionDestination)
				throw new Exception("EnchainementExiste");
		}
		Section sectionDestination = null;
		if(idSectionDestination == 1)
			sectionDestination = livre.getSectionDebut();
		else
			sectionDestination = livre.getSections().get(idSectionDestination);
		ArrayList<Objet> listObjets = new ArrayList<Objet>();
		for(String s : objets)
			listObjets.add(livre.getObjet().get(s));
		if(sectionDepart != null && sectionDestination != null) {
			Enchainement e = new Enchainement(idSectionDepart, idSectionDestination, listObjets, texte);
			sectionDepart.getEnchainementSortie().add(e);
			sectionDestination.getEnchainementEntree().add(e);
			for(Objet o : listObjets)
				o.getEnchainement().add(e);
		}
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param idSectionDepart
	* @param idSectionDestination
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void deleteEnchainement(Integer idSectionDepart, Integer idSectionDestination) {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		Section sectionDepart = null;
		if(idSectionDepart == 1)
			sectionDepart = livre.getSectionDebut();
		else
			sectionDepart = livre.getSections().get(idSectionDepart);
		Section sectionDestination = null;
		if(idSectionDestination == 1)
			sectionDestination = livre.getSectionDebut();
		else
			sectionDestination = livre.getSections().get(idSectionDestination);
		if(sectionDepart != null && sectionDestination != null) {
			for(Enchainement e : sectionDepart.getEnchainementSortie()) {
				if(e.getSectionDestination() == idSectionDestination) {
					for(Objet o : e.getConditions())
						o.getEnchainement().remove(e);
					sectionDepart.getEnchainementSortie().remove(e);
					sectionDestination.getEnchainementEntree().remove(e);
					break;
				}
		}
		
		}
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param idSectionDepart
	* @param idSectionDestination
	* @param newText
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void editTextEnchainement(Integer idSectionDepart, Integer idSectionDestination, String newText) {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		Section sectionDepart = null;
		if(idSectionDepart == 1)
			sectionDepart = livre.getSectionDebut();
		else
			sectionDepart = livre.getSections().get(idSectionDepart);
		Section sectionDestination = null;
		if(idSectionDestination == 1)
			sectionDestination = livre.getSectionDebut();
		else
			sectionDestination = livre.getSections().get(idSectionDestination);
		if(sectionDepart != null && sectionDestination != null) {
			for(Enchainement e : sectionDepart.getEnchainementSortie()) {
				if(e.getSectionDestination() == idSectionDestination) {
					e.setTexte(newText);
					break;
				}
			}
		}
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param idSectionDepart
	* @param idSectionDestination
	* @param newIdSection
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void editDepartEnchainement(Integer idSectionDepart, Integer idSectionDestination, Integer newIdSection) {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		Section sectionDepart = null;
		if(idSectionDepart == 1)
			sectionDepart = livre.getSectionDebut();
		else
			sectionDepart = livre.getSections().get(idSectionDepart);
		Section sectionDestination = null;
		if(idSectionDestination == 1)
			sectionDestination = livre.getSectionDebut();
		else
			sectionDestination = livre.getSections().get(idSectionDestination);
		if(sectionDepart != null && sectionDestination != null) {
			for(Enchainement e : sectionDepart.getEnchainementSortie()) {
				if(e.getSectionDestination() == idSectionDestination) {
					e.setSectionDepart(newIdSection);
					break;
				}
			}
		}
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param idSectionDepart
	* @param idSectionDestination
	* @param newIdSection
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void editDestinationEnchainement(Integer idSectionDepart, Integer idSectionDestination,
			Integer newIdSection) {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		Section sectionDepart = null;
		if(idSectionDepart == 1)
			sectionDepart = livre.getSectionDebut();
		else
			sectionDepart = livre.getSections().get(idSectionDepart);
		Section sectionDestination = null;
		if(idSectionDestination == 1)
			sectionDestination = livre.getSectionDebut();
		else
			sectionDestination = livre.getSections().get(idSectionDestination);
		if(sectionDepart != null && sectionDestination != null) {
			for(Enchainement e : sectionDepart.getEnchainementSortie()) {
				if(e.getSectionDestination() == idSectionDestination) {
					e.setSectionDestination(newIdSection);
					sectionDepart.getEnchainementSortie().remove(e);
					livre.getSections().get(idSectionDestination).getEnchainementSortie().add(e);
					break;
				}
			}
		}
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param idSection
	* @param texte
	* @param objets
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void addSection(Integer idSection, String texte, List<String> objets) throws Exception {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		
		if((idSection == 1 && livre.getSectionDebut() != null) || (livre.getSections().containsKey(idSection))) {
				throw new Exception("SectionExiste");
			}
		ArrayList<Objet> o = new ArrayList<Objet>();
		for(String s : objets)
			o.add(new Objet(s,new ArrayList<Enchainement>()));
		if(idSection == 1)
			livre.setSectionDebut(new Section(1,texte, o));
		else
			livre.getSections().put(idSection, (new Section(idSection,texte, o)));
					
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param idSection
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void deleteSection(Integer idSection) {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		if(idSection == 1)
			livre.setSectionDebut(null);
		else
			livre.getSections().remove(idSection);
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param idSection
	* @param newText
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void editTextSection(Integer idSection, String newText) {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		if(idSection == 1)
			livre.getSectionDebut().setTexte(newText);
		else
			livre.getSections().get(idSection).setTexte(newText);
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param idSection
	* @param newIdSection
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void editIdSection(Integer idSection, Integer newIdSection) throws Exception{
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		if(idSection == newIdSection)
			return;
		if(livre.getSections().containsKey(newIdSection) || (newIdSection == 1 && livre.getSectionDebut() != null) )
			throw new Exception("SectionExiste");
		if(idSection == 1) {
				Section newSection = new Section(newIdSection, livre.getSectionDebut().getTexte(),new ArrayList<>(livre.getSectionDebut().getObjetsSection().values()));
				newSection.setEnchainementEntree(livre.getSectionDebut().getEnchainementEntree());
				newSection.setEnchainementSortie(livre.getSectionDebut().getEnchainementSortie());
				livre.setSectionDebut(null);
				for(Enchainement e : newSection.getEnchainementEntree())													//On modifie l'ID de la section dans les enchainements aussi
					e.setSectionDestination(newIdSection);
				for(Enchainement e : newSection.getEnchainementSortie())
					e.setSectionDepart(newIdSection);
				livre.getSections().put(newIdSection, newSection);
				return;
		}
		else {
			if(newIdSection == 1) {
				Section section = livre.getSections().remove(idSection);
				section.setNumero(newIdSection);
				for(Enchainement e : livre.getSections().get(newIdSection).getEnchainementEntree())								//On modifie l'ID de la section dans les enchainements aussi
					e.setSectionDestination(newIdSection);
				for(Enchainement e : livre.getSections().get(newIdSection).getEnchainementSortie())
					e.setSectionDepart(newIdSection);
				livre.setSectionDebut(section);
				return;
			}else {
				Section section = livre.getSections().remove(idSection);
				section.setNumero(newIdSection);
				for(Enchainement e : livre.getSections().get(newIdSection).getEnchainementEntree())								//On modifie l'ID de la section dans les enchainements aussi
					e.setSectionDestination(newIdSection);
				for(Enchainement e : livre.getSections().get(newIdSection).getEnchainementSortie())
					e.setSectionDepart(newIdSection);
				livre.getSections().put(newIdSection, section);
				return;
			}
			
		}
			
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param newTitre
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void editTitreLivre(String newTitre) {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		livre.setTitre(newTitre);
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param auteurs
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void editAuteursLivre(List<String> auteurs) {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		livre.setNomAuteur(auteurs);
		// end-user-code
	}
	
	public List<Enchainement> getEnchainements(){
		List<Enchainement> enchainements = new ArrayList<>();
		if(livre.getSectionDebut() != null)
			enchainements.addAll(livre.getSectionDebut().getEnchainementEntree());
		for(Section s : livre.getSections().values())
			enchainements.addAll(s.getEnchainementEntree());
		return enchainements;
	}
	
	public List<Section> getSection(){
		List<Section> sections = new ArrayList<>();
		sections.add(livre.getSectionDebut());
		sections.addAll(livre.getSections().values());
		return sections;
	}
	
	public Section getSectionId(int idSection){
		if(idSection == 1)
			return livre.getSectionDebut();
		else
			return livre.getSections().get(idSection);
	}


	public Map<String,Objet> getObjetsLivre(){
		return livre.getObjet();
	}
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param nomFichier
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void parseLivre(String nomFichier) {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
																		//???????????
		// end-user-code
	}
}