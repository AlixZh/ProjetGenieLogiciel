/**
 * 
 */
package ldvh.itf;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author SSD
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public interface IGraphe {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param visualiserInatteignables
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void afficheGraphe(Boolean visualiserInatteignables);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Boolean analyseGraphe() throws Exception;
}