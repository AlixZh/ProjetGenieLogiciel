/**
 * 
 */
package ldvh.graphe;

import java.util.ArrayList;
import java.util.List;

import ldvh.itf.IGraphe;
import ldvh.itf.ILivre;
import ldvh.livre.*;

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author SSD
* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
*/
public class GestionGraphe implements IGraphe {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private ILivre iLivre;
	
	public GestionGraphe(ILivre iLivre) {
		this.iLivre = iLivre;
	}

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
	* @param visualiserInatteignables
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void afficheGraphe(Boolean visualiserInatteignables) {
		if(visualiserInatteignables) {
			try {
				if(analyseGraphe()) {
					System.out.println("Des sections sont innategnables");
				}
			} catch (Exception e) {
					System.out.println("La section de depart est manquante");
			}
		}
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Boolean analyseGraphe() throws Exception {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		List<Section> sommets = new ArrayList<>();
		if(((GestionLivre) iLivre).getLivre().getSectionDebut() == null)
			throw new Exception("SectionDepartManquante");									//Si sectionDebut manquante, on lève une exception.
		sommets.addAll(((GestionLivre) iLivre).getLivre().getSections().values());
		for(Section s:sommets)
			if(s.getEnchainementEntree().isEmpty())											//Si section innateignable on retourne false.
				return false;
		return true;
		// end-user-code
	}
}