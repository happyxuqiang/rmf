/**
 */
package org.eclipse.rmf.reqif10.pror.configuration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.rmf.reqif10.Specification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pror Spec View Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.pror.configuration.ProrSpecViewConfiguration#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.pror.configuration.ProrSpecViewConfiguration#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.pror.configuration.ProrSpecViewConfiguration#getLeftHeaderColumn <em>Left Header Column</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage#getProrSpecViewConfiguration()
 * @model
 * @generated
 */
public interface ProrSpecViewConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' reference.
	 * @see #isSetSpecification()
	 * @see #unsetSpecification()
	 * @see #setSpecification(Specification)
	 * @see org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage#getProrSpecViewConfiguration_Specification()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	Specification getSpecification();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.pror.configuration.ProrSpecViewConfiguration#getSpecification <em>Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' reference.
	 * @see #isSetSpecification()
	 * @see #unsetSpecification()
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(Specification value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.pror.configuration.ProrSpecViewConfiguration#getSpecification <em>Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpecification()
	 * @see #getSpecification()
	 * @see #setSpecification(Specification)
	 * @generated
	 */
	void unsetSpecification();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.pror.configuration.ProrSpecViewConfiguration#getSpecification <em>Specification</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Specification</em>' reference is set.
	 * @see #unsetSpecification()
	 * @see #getSpecification()
	 * @see #setSpecification(Specification)
	 * @generated
	 */
	boolean isSetSpecification();

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.pror.configuration.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see #isSetColumns()
	 * @see #unsetColumns()
	 * @see org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage#getProrSpecViewConfiguration_Columns()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="name='columns' kind='element' namespace='##targetNamespace'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='columns' featureWrapperElement='true' featureElement='false' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	EList<Column> getColumns();

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.pror.configuration.ProrSpecViewConfiguration#getColumns <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetColumns()
	 * @see #getColumns()
	 * @generated
	 */
	void unsetColumns();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.pror.configuration.ProrSpecViewConfiguration#getColumns <em>Columns</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Columns</em>' containment reference list is set.
	 * @see #unsetColumns()
	 * @see #getColumns()
	 * @generated
	 */
	boolean isSetColumns();

	/**
	 * Returns the value of the '<em><b>Left Header Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Header Column</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Header Column</em>' containment reference.
	 * @see #isSetLeftHeaderColumn()
	 * @see #unsetLeftHeaderColumn()
	 * @see #setLeftHeaderColumn(Column)
	 * @see org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage#getProrSpecViewConfiguration_LeftHeaderColumn()
	 * @model containment="true" unsettable="true" required="true"
	 *        extendedMetaData="name='leftHeaderColumn' kind='element' namespace='##targetNamespace'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='leftHeaderColumn' featureWrapperElement='true' featureElement='false' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	Column getLeftHeaderColumn();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.pror.configuration.ProrSpecViewConfiguration#getLeftHeaderColumn <em>Left Header Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Header Column</em>' containment reference.
	 * @see #isSetLeftHeaderColumn()
	 * @see #unsetLeftHeaderColumn()
	 * @see #getLeftHeaderColumn()
	 * @generated
	 */
	void setLeftHeaderColumn(Column value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.pror.configuration.ProrSpecViewConfiguration#getLeftHeaderColumn <em>Left Header Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLeftHeaderColumn()
	 * @see #getLeftHeaderColumn()
	 * @see #setLeftHeaderColumn(Column)
	 * @generated
	 */
	void unsetLeftHeaderColumn();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.pror.configuration.ProrSpecViewConfiguration#getLeftHeaderColumn <em>Left Header Column</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Left Header Column</em>' containment reference is set.
	 * @see #unsetLeftHeaderColumn()
	 * @see #getLeftHeaderColumn()
	 * @see #setLeftHeaderColumn(Column)
	 * @generated
	 */
	boolean isSetLeftHeaderColumn();

} // ProrSpecViewConfiguration
