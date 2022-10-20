/**
 * 
 */
package ldvh.tests;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import ldvh.bouchons.GestionBouchonLivre;
import ldvh.factory.ComposantFactory;
import ldvh.graphe.GestionGraphe;
import ldvh.itf.IGraphe;
import ldvh.itf.ILivre;
import ldvh.livre.GestionLivre;
import ldvh.livre.Livre;

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author Ramy
* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
*/
public class TestGraphe {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private IGraphe iGraphe;

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	@Test
	public void testAfficheGraphe() {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	@Test
	public void testAnalyseGraphe() throws Exception{
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		assertFalse(((GestionGraphe) iGraphe).analyseGraphe());
		((GestionGraphe) iGraphe).getiLivre().addEnchainement(4, 2, "Enchainement test", Arrays.asList("Collier"));
		assertFalse(((GestionGraphe) iGraphe).analyseGraphe());
		((GestionGraphe) iGraphe).getiLivre().addEnchainement(3, 4, "Enchainement test 2", Arrays.asList("Collier"));
		assertTrue(((GestionGraphe) iGraphe).analyseGraphe());
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	@Before
	public void init() throws Exception {
		ILivre livre = ComposantFactory.createCLivreBouchon();
		iGraphe = ComposantFactory.createGraphe(livre);
	}
	
	@Test
	public void testVisualiserGraphe() throws Exception{
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		((GestionGraphe) iGraphe).getiLivre().addEnchainement(3, 4, "Enchainement test 2", Arrays.asList("Collier"));
		assertTrue(((GestionGraphe) iGraphe).analyseGraphe());
		// end-user-code
	}
}