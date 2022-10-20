/**
 * 
 */
package ldvh.bouchons;

import ldvh.livre.GestionLivre;
import ldvh.livre.Livre;
import ldvh.livre.Section;

import java.util.ArrayList;
import java.util.Arrays;

import ldvh.itf.ILivre;

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author Ramy
* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
*/
public class GestionBouchonLivre extends GestionLivre implements ILivre {
	public GestionBouchonLivre() {
		this.setLivre(new Livre("Notre petite histoire", Arrays.asList("Steve Jackson","Victor Hugo"),
				new ArrayList<>(), new Section(1, "Le debut d'une histoire palpitante", new ArrayList<>()), new ArrayList<>()));
		try {
			this.addObjetsLivre(Arrays.asList("Epee","Cle","Collier","Bouclier"));
			this.addObjetsSection(1, Arrays.asList("Epee"));
			this.addSection(2, "La suite de cette histoire", Arrays.asList("Cle"));
			this.addSection(3, "Presque la fin de cette histoire", Arrays.asList("Collier"));
			this.addSection(4, "La fin de cette histoire", new ArrayList<>());
			this.addEnchainement(1, 2, "Un petit enchainement", Arrays.asList("Epee"));
			this.addEnchainement(2, 3, "Un second enchainement", Arrays.asList("Cle"));
			// TODO Module de remplacement de constructeur auto-généré
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}