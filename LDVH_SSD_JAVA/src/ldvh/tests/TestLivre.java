/**
 * 
 */
package ldvh.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import ldvh.bouchons.GestionBouchonLivre;
import ldvh.factory.ComposantFactory;
import ldvh.itf.ILivre;
import ldvh.livre.GestionLivre;
import ldvh.livre.Livre;
import ldvh.livre.Section;

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author Ramy
* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
*/
public class TestLivre {

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param objets
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	@Test
	public void testAddObjetsLivre() throws Exception{
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		assertEquals(4, livre.getObjetsLivre().size());
		livre.addObjetsLivre(Arrays.asList("Objet1", "Objet2"));
		assertEquals(6, livre.getObjetsLivre().size());
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param objets
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	@Test
	public void testDeleteObjetsLivre() {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		assertEquals(4, livre.getObjetsLivre().size());
		livre.deleteObjetsLivre(Arrays.asList("Cle","Collier"));
		assertEquals(2, livre.getObjetsLivre().size());
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param idSection
	* @param objets
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	@Test
	public void testAddObjetsSection() {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param idSection
	* @param objets
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	@Test
	public void testDeleteObjetsSection() {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		
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
	@Test
	public void testAddObjetsEnchainement() {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		
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
	@Test
	public void testDeleteObjetsEnchainement() {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		
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
	@Test
	public void testAddEnchainement() throws Exception {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param idSectionDepart
	* @param idSectionDestination
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	@Test
	public void testDeleteEnchainement() {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		
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
	@Test
	public void testEditTextEnchainement() {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
	
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
	@Test
	public void testEditDepartEnchainement() {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		
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
	@Test
	public void testEditDestinationEnchainement() {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		
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
	public void testAddSection() {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param idSection
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void testDeleteSection() {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param idSection
	* @param newText
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void testEditTextSection() {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param idSection
	* @param newIdSection
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void testEditIdSection() {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param newTitre
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void testEditTitreLivre() {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param auteurs
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void testEditAuteursLivre() {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param nomFichier
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void testParseLivre() {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private ILivre livre;
	public TestLivre() {
		this.livre = ComposantFactory.createLivre();
	}
	
	@Before
	public void init(){
		((GestionLivre) this.livre).setLivre(new Livre("Notre petite histoire", Arrays.asList("Steve Jackson","Victor Hugo"),
				new ArrayList<>(), new Section(1, "Le debut d'une histoire palpitante", new ArrayList<>()), new ArrayList<>()));
		try {
			this.livre.addObjetsLivre(Arrays.asList("Epee","Cle","Collier","Bouclier"));
			this.livre.addObjetsSection(1, Arrays.asList("Epee"));
			this.livre.addSection(2, "La suite de cette histoire", Arrays.asList("Cle"));
			this.livre.addSection(5, "Presque la fin de cette histoire", Arrays.asList("Collier"));
			this.livre.addSection(4, "La fin de cette histoire", new ArrayList<>());
			this.livre.addEnchainement(1, 2, "Un petit enchainement", Arrays.asList("Epee"));
			this.livre.addEnchainement(2, 5, "Un second enchainement", Arrays.asList("Cle"));
			// TODO Module de remplacement de constructeur auto-généré
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDefinirSection() throws Exception {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		assertEquals(4,livre.getObjetsLivre().size());
		assertEquals(4, livre.getSection().size());
		this.livre.addSection(3, "foret", Arrays.asList("Bouclier"));
		assertEquals(5, livre.getSection().size());
		assertEquals(1, livre.getSectionId(3).getObjetsSection().size());
		this.livre.addObjetsSection(3, Arrays.asList("Cle"));
		this.livre.addObjetsSection(3, Arrays.asList("Collier"));
		assertEquals(3, livre.getSectionId(3).getObjetsSection().size());
		// end-user-code
	}
}