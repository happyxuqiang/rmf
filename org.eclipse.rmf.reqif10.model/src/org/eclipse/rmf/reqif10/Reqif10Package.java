/*******************************************************************************
 * Copyright (c) 2011 itemis GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nirmal Sasidharan - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.reqif10;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.rmf.reqif10.Reqif10Factory
 * @model kind="package"
 * @generated
 */
public interface Reqif10Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "reqif10";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.omg.org/spec/ReqIF/20101201";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "reqif10";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Reqif10Package eINSTANCE = org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.IdentifiableImpl <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.IdentifiableImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getIdentifiable()
	 * @generated
	 */
	int IDENTIFIABLE = 1;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__DESC = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__LAST_CHANGE = 2;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__LONG_NAME = 3;

	/**
	 * The feature id for the '<em><b>Alternative Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__ALTERNATIVE_ID = 4;

	/**
	 * The number of structural features of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.AccessControlledElementImpl <em>Access Controlled Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.AccessControlledElementImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getAccessControlledElement()
	 * @generated
	 */
	int ACCESS_CONTROLLED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROLLED_ELEMENT__DESC = IDENTIFIABLE__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROLLED_ELEMENT__IDENTIFIER = IDENTIFIABLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROLLED_ELEMENT__LAST_CHANGE = IDENTIFIABLE__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROLLED_ELEMENT__LONG_NAME = IDENTIFIABLE__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Alternative Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROLLED_ELEMENT__ALTERNATIVE_ID = IDENTIFIABLE__ALTERNATIVE_ID;

	/**
	 * The feature id for the '<em><b>Is Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROLLED_ELEMENT__IS_EDITABLE = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Access Controlled Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROLLED_ELEMENT_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.AttributeValueImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getAttributeValue()
	 * @generated
	 */
	int ATTRIBUTE_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Spec El At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE__SPEC_EL_AT = 0;

	/**
	 * The number of structural features of the '<em>Attribute Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.AttributeValueXhtmlImpl <em>Attribute Value Xhtml</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.AttributeValueXhtmlImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getAttributeValueXhtml()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_XHTML = 2;

	/**
	 * The feature id for the '<em><b>Spec El At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_XHTML__SPEC_EL_AT = ATTRIBUTE_VALUE__SPEC_EL_AT;

	/**
	 * The feature id for the '<em><b>Is Simplified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_XHTML__IS_SIMPLIFIED = ATTRIBUTE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Definition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_XHTML__OWNING_DEFINITION = ATTRIBUTE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_XHTML__DEFINITION = ATTRIBUTE_VALUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>The Original Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_XHTML__THE_ORIGINAL_VALUE = ATTRIBUTE_VALUE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>The Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_XHTML__THE_VALUE = ATTRIBUTE_VALUE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Attribute Value Xhtml</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_XHTML_FEATURE_COUNT = ATTRIBUTE_VALUE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.SpecElementWithAttributesImpl <em>Spec Element With Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.SpecElementWithAttributesImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getSpecElementWithAttributes()
	 * @generated
	 */
	int SPEC_ELEMENT_WITH_ATTRIBUTES = 4;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_ELEMENT_WITH_ATTRIBUTES__DESC = IDENTIFIABLE__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_ELEMENT_WITH_ATTRIBUTES__IDENTIFIER = IDENTIFIABLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_ELEMENT_WITH_ATTRIBUTES__LAST_CHANGE = IDENTIFIABLE__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_ELEMENT_WITH_ATTRIBUTES__LONG_NAME = IDENTIFIABLE__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Alternative Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_ELEMENT_WITH_ATTRIBUTES__ALTERNATIVE_ID = IDENTIFIABLE__ALTERNATIVE_ID;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_ELEMENT_WITH_ATTRIBUTES__VALUES = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Spec Element With Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_ELEMENT_WITH_ATTRIBUTES_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.AttributeDefinitionImpl <em>Attribute Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.AttributeDefinitionImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getAttributeDefinition()
	 * @generated
	 */
	int ATTRIBUTE_DEFINITION = 6;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION__DESC = ACCESS_CONTROLLED_ELEMENT__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION__IDENTIFIER = ACCESS_CONTROLLED_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION__LAST_CHANGE = ACCESS_CONTROLLED_ELEMENT__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION__LONG_NAME = ACCESS_CONTROLLED_ELEMENT__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Alternative Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION__ALTERNATIVE_ID = ACCESS_CONTROLLED_ELEMENT__ALTERNATIVE_ID;

	/**
	 * The feature id for the '<em><b>Is Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION__IS_EDITABLE = ACCESS_CONTROLLED_ELEMENT__IS_EDITABLE;

	/**
	 * The feature id for the '<em><b>Spec Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION__SPEC_TYPE = ACCESS_CONTROLLED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_FEATURE_COUNT = ACCESS_CONTROLLED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.AttributeDefinitionXhtmlImpl <em>Attribute Definition Xhtml</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.AttributeDefinitionXhtmlImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getAttributeDefinitionXhtml()
	 * @generated
	 */
	int ATTRIBUTE_DEFINITION_XHTML = 5;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_XHTML__DESC = ATTRIBUTE_DEFINITION__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_XHTML__IDENTIFIER = ATTRIBUTE_DEFINITION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_XHTML__LAST_CHANGE = ATTRIBUTE_DEFINITION__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_XHTML__LONG_NAME = ATTRIBUTE_DEFINITION__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Alternative Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_XHTML__ALTERNATIVE_ID = ATTRIBUTE_DEFINITION__ALTERNATIVE_ID;

	/**
	 * The feature id for the '<em><b>Is Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_XHTML__IS_EDITABLE = ATTRIBUTE_DEFINITION__IS_EDITABLE;

	/**
	 * The feature id for the '<em><b>Spec Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_XHTML__SPEC_TYPE = ATTRIBUTE_DEFINITION__SPEC_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_XHTML__TYPE = ATTRIBUTE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_XHTML__DEFAULT_VALUE = ATTRIBUTE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Definition Xhtml</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_XHTML_FEATURE_COUNT = ATTRIBUTE_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.SpecTypeImpl <em>Spec Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.SpecTypeImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getSpecType()
	 * @generated
	 */
	int SPEC_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_TYPE__DESC = IDENTIFIABLE__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_TYPE__IDENTIFIER = IDENTIFIABLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_TYPE__LAST_CHANGE = IDENTIFIABLE__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_TYPE__LONG_NAME = IDENTIFIABLE__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Alternative Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_TYPE__ALTERNATIVE_ID = IDENTIFIABLE__ALTERNATIVE_ID;

	/**
	 * The feature id for the '<em><b>Core Content</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_TYPE__CORE_CONTENT = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Spec Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_TYPE__SPEC_ATTRIBUTES = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Spec Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_TYPE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.ReqIfContentImpl <em>Req If Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.ReqIfContentImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getReqIfContent()
	 * @generated
	 */
	int REQ_IF_CONTENT = 8;

	/**
	 * The feature id for the '<em><b>Document Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_IF_CONTENT__DOCUMENT_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Spec Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_IF_CONTENT__SPEC_OBJECTS = 1;

	/**
	 * The feature id for the '<em><b>Specifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_IF_CONTENT__SPECIFICATIONS = 2;

	/**
	 * The feature id for the '<em><b>Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_IF_CONTENT__DATATYPES = 3;

	/**
	 * The feature id for the '<em><b>Spec Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_IF_CONTENT__SPEC_RELATIONS = 4;

	/**
	 * The feature id for the '<em><b>Spec Relation Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_IF_CONTENT__SPEC_RELATION_GROUPS = 5;

	/**
	 * The feature id for the '<em><b>Spec Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_IF_CONTENT__SPEC_TYPES = 6;

	/**
	 * The number of structural features of the '<em>Req If Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_IF_CONTENT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.ReqIfImpl <em>Req If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.ReqIfImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getReqIf()
	 * @generated
	 */
	int REQ_IF = 9;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_IF__LANG = 0;

	/**
	 * The feature id for the '<em><b>The Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_IF__THE_HEADER = 1;

	/**
	 * The feature id for the '<em><b>Tool Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_IF__TOOL_EXTENSIONS = 2;

	/**
	 * The feature id for the '<em><b>Core Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_IF__CORE_CONTENT = 3;

	/**
	 * The number of structural features of the '<em>Req If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_IF_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.ReqIfHeaderImpl <em>Req If Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.ReqIfHeaderImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getReqIfHeader()
	 * @generated
	 */
	int REQ_IF_HEADER = 10;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_IF_HEADER__COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Creation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_IF_HEADER__CREATION_TIME = 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_IF_HEADER__IDENTIFIER = 2;

	/**
	 * The feature id for the '<em><b>Repository Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_IF_HEADER__REPOSITORY_ID = 3;

	/**
	 * The feature id for the '<em><b>Req If Tool Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_IF_HEADER__REQ_IF_TOOL_ID = 4;

	/**
	 * The feature id for the '<em><b>Req If Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_IF_HEADER__REQ_IF_VERSION = 5;

	/**
	 * The feature id for the '<em><b>Source Tool Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_IF_HEADER__SOURCE_TOOL_ID = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_IF_HEADER__TITLE = 7;

	/**
	 * The feature id for the '<em><b>Document Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_IF_HEADER__DOCUMENT_ROOT = 8;

	/**
	 * The number of structural features of the '<em>Req If Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_IF_HEADER_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.ReqIfToolExtensionImpl <em>Req If Tool Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.ReqIfToolExtensionImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getReqIfToolExtension()
	 * @generated
	 */
	int REQ_IF_TOOL_EXTENSION = 11;

	/**
	 * The feature id for the '<em><b>Document Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_IF_TOOL_EXTENSION__DOCUMENT_ROOT = 0;

	/**
	 * The number of structural features of the '<em>Req If Tool Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_IF_TOOL_EXTENSION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.SpecObjectImpl <em>Spec Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.SpecObjectImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getSpecObject()
	 * @generated
	 */
	int SPEC_OBJECT = 12;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT__DESC = SPEC_ELEMENT_WITH_ATTRIBUTES__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT__IDENTIFIER = SPEC_ELEMENT_WITH_ATTRIBUTES__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT__LAST_CHANGE = SPEC_ELEMENT_WITH_ATTRIBUTES__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT__LONG_NAME = SPEC_ELEMENT_WITH_ATTRIBUTES__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Alternative Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT__ALTERNATIVE_ID = SPEC_ELEMENT_WITH_ATTRIBUTES__ALTERNATIVE_ID;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT__VALUES = SPEC_ELEMENT_WITH_ATTRIBUTES__VALUES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT__TYPE = SPEC_ELEMENT_WITH_ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Core Content</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT__CORE_CONTENT = SPEC_ELEMENT_WITH_ATTRIBUTES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Spec Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT_FEATURE_COUNT = SPEC_ELEMENT_WITH_ATTRIBUTES_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.SpecObjectTypeImpl <em>Spec Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.SpecObjectTypeImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getSpecObjectType()
	 * @generated
	 */
	int SPEC_OBJECT_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT_TYPE__DESC = SPEC_TYPE__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT_TYPE__IDENTIFIER = SPEC_TYPE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT_TYPE__LAST_CHANGE = SPEC_TYPE__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT_TYPE__LONG_NAME = SPEC_TYPE__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Alternative Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT_TYPE__ALTERNATIVE_ID = SPEC_TYPE__ALTERNATIVE_ID;

	/**
	 * The feature id for the '<em><b>Core Content</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT_TYPE__CORE_CONTENT = SPEC_TYPE__CORE_CONTENT;

	/**
	 * The feature id for the '<em><b>Spec Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT_TYPE__SPEC_ATTRIBUTES = SPEC_TYPE__SPEC_ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Spec Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT_TYPE_FEATURE_COUNT = SPEC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.SpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.SpecificationImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getSpecification()
	 * @generated
	 */
	int SPECIFICATION = 14;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__DESC = SPEC_ELEMENT_WITH_ATTRIBUTES__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__IDENTIFIER = SPEC_ELEMENT_WITH_ATTRIBUTES__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__LAST_CHANGE = SPEC_ELEMENT_WITH_ATTRIBUTES__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__LONG_NAME = SPEC_ELEMENT_WITH_ATTRIBUTES__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Alternative Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__ALTERNATIVE_ID = SPEC_ELEMENT_WITH_ATTRIBUTES__ALTERNATIVE_ID;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__VALUES = SPEC_ELEMENT_WITH_ATTRIBUTES__VALUES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__TYPE = SPEC_ELEMENT_WITH_ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__CHILDREN = SPEC_ELEMENT_WITH_ATTRIBUTES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Core Content</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__CORE_CONTENT = SPEC_ELEMENT_WITH_ATTRIBUTES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_FEATURE_COUNT = SPEC_ELEMENT_WITH_ATTRIBUTES_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.SpecificationTypeImpl <em>Specification Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.SpecificationTypeImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getSpecificationType()
	 * @generated
	 */
	int SPECIFICATION_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_TYPE__DESC = SPEC_TYPE__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_TYPE__IDENTIFIER = SPEC_TYPE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_TYPE__LAST_CHANGE = SPEC_TYPE__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_TYPE__LONG_NAME = SPEC_TYPE__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Alternative Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_TYPE__ALTERNATIVE_ID = SPEC_TYPE__ALTERNATIVE_ID;

	/**
	 * The feature id for the '<em><b>Core Content</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_TYPE__CORE_CONTENT = SPEC_TYPE__CORE_CONTENT;

	/**
	 * The feature id for the '<em><b>Spec Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_TYPE__SPEC_ATTRIBUTES = SPEC_TYPE__SPEC_ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Specification Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_TYPE_FEATURE_COUNT = SPEC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.SpecHierarchyImpl <em>Spec Hierarchy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.SpecHierarchyImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getSpecHierarchy()
	 * @generated
	 */
	int SPEC_HIERARCHY = 16;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY__DESC = ACCESS_CONTROLLED_ELEMENT__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY__IDENTIFIER = ACCESS_CONTROLLED_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY__LAST_CHANGE = ACCESS_CONTROLLED_ELEMENT__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY__LONG_NAME = ACCESS_CONTROLLED_ELEMENT__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Alternative Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY__ALTERNATIVE_ID = ACCESS_CONTROLLED_ELEMENT__ALTERNATIVE_ID;

	/**
	 * The feature id for the '<em><b>Is Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY__IS_EDITABLE = ACCESS_CONTROLLED_ELEMENT__IS_EDITABLE;

	/**
	 * The feature id for the '<em><b>Is Table Internal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY__IS_TABLE_INTERNAL = ACCESS_CONTROLLED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY__OBJECT = ACCESS_CONTROLLED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY__PARENT = ACCESS_CONTROLLED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY__CHILDREN = ACCESS_CONTROLLED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Editable Atts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY__EDITABLE_ATTS = ACCESS_CONTROLLED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY__ROOT = ACCESS_CONTROLLED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Spec Hierarchy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY_FEATURE_COUNT = ACCESS_CONTROLLED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.DatatypeDefinitionImpl <em>Datatype Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.DatatypeDefinitionImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getDatatypeDefinition()
	 * @generated
	 */
	int DATATYPE_DEFINITION = 17;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION__DESC = IDENTIFIABLE__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION__IDENTIFIER = IDENTIFIABLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION__LAST_CHANGE = IDENTIFIABLE__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION__LONG_NAME = IDENTIFIABLE__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Alternative Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION__ALTERNATIVE_ID = IDENTIFIABLE__ALTERNATIVE_ID;

	/**
	 * The feature id for the '<em><b>Core Content</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION__CORE_CONTENT = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Datatype Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.SpecRelationImpl <em>Spec Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.SpecRelationImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getSpecRelation()
	 * @generated
	 */
	int SPEC_RELATION = 18;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION__DESC = SPEC_ELEMENT_WITH_ATTRIBUTES__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION__IDENTIFIER = SPEC_ELEMENT_WITH_ATTRIBUTES__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION__LAST_CHANGE = SPEC_ELEMENT_WITH_ATTRIBUTES__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION__LONG_NAME = SPEC_ELEMENT_WITH_ATTRIBUTES__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Alternative Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION__ALTERNATIVE_ID = SPEC_ELEMENT_WITH_ATTRIBUTES__ALTERNATIVE_ID;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION__VALUES = SPEC_ELEMENT_WITH_ATTRIBUTES__VALUES;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION__TARGET = SPEC_ELEMENT_WITH_ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION__SOURCE = SPEC_ELEMENT_WITH_ATTRIBUTES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION__TYPE = SPEC_ELEMENT_WITH_ATTRIBUTES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Core Content</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION__CORE_CONTENT = SPEC_ELEMENT_WITH_ATTRIBUTES_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Spec Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION_FEATURE_COUNT = SPEC_ELEMENT_WITH_ATTRIBUTES_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.SpecRelationTypeImpl <em>Spec Relation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.SpecRelationTypeImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getSpecRelationType()
	 * @generated
	 */
	int SPEC_RELATION_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION_TYPE__DESC = SPEC_TYPE__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION_TYPE__IDENTIFIER = SPEC_TYPE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION_TYPE__LAST_CHANGE = SPEC_TYPE__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION_TYPE__LONG_NAME = SPEC_TYPE__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Alternative Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION_TYPE__ALTERNATIVE_ID = SPEC_TYPE__ALTERNATIVE_ID;

	/**
	 * The feature id for the '<em><b>Core Content</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION_TYPE__CORE_CONTENT = SPEC_TYPE__CORE_CONTENT;

	/**
	 * The feature id for the '<em><b>Spec Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION_TYPE__SPEC_ATTRIBUTES = SPEC_TYPE__SPEC_ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Spec Relation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION_TYPE_FEATURE_COUNT = SPEC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.RelationGroupImpl <em>Relation Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.RelationGroupImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getRelationGroup()
	 * @generated
	 */
	int RELATION_GROUP = 20;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_GROUP__DESC = SPEC_ELEMENT_WITH_ATTRIBUTES__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_GROUP__IDENTIFIER = SPEC_ELEMENT_WITH_ATTRIBUTES__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_GROUP__LAST_CHANGE = SPEC_ELEMENT_WITH_ATTRIBUTES__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_GROUP__LONG_NAME = SPEC_ELEMENT_WITH_ATTRIBUTES__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Alternative Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_GROUP__ALTERNATIVE_ID = SPEC_ELEMENT_WITH_ATTRIBUTES__ALTERNATIVE_ID;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_GROUP__VALUES = SPEC_ELEMENT_WITH_ATTRIBUTES__VALUES;

	/**
	 * The feature id for the '<em><b>Spec Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_GROUP__SPEC_RELATIONS = SPEC_ELEMENT_WITH_ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_GROUP__TYPE = SPEC_ELEMENT_WITH_ATTRIBUTES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_GROUP__SOURCE_SPECIFICATION = SPEC_ELEMENT_WITH_ATTRIBUTES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_GROUP__TARGET_SPECIFICATION = SPEC_ELEMENT_WITH_ATTRIBUTES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Core Content</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_GROUP__CORE_CONTENT = SPEC_ELEMENT_WITH_ATTRIBUTES_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Relation Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_GROUP_FEATURE_COUNT = SPEC_ELEMENT_WITH_ATTRIBUTES_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.RelationGroupTypeImpl <em>Relation Group Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.RelationGroupTypeImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getRelationGroupType()
	 * @generated
	 */
	int RELATION_GROUP_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_GROUP_TYPE__DESC = SPEC_TYPE__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_GROUP_TYPE__IDENTIFIER = SPEC_TYPE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_GROUP_TYPE__LAST_CHANGE = SPEC_TYPE__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_GROUP_TYPE__LONG_NAME = SPEC_TYPE__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Alternative Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_GROUP_TYPE__ALTERNATIVE_ID = SPEC_TYPE__ALTERNATIVE_ID;

	/**
	 * The feature id for the '<em><b>Core Content</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_GROUP_TYPE__CORE_CONTENT = SPEC_TYPE__CORE_CONTENT;

	/**
	 * The feature id for the '<em><b>Spec Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_GROUP_TYPE__SPEC_ATTRIBUTES = SPEC_TYPE__SPEC_ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Relation Group Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_GROUP_TYPE_FEATURE_COUNT = SPEC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.DatatypeDefinitionXhtmlImpl <em>Datatype Definition Xhtml</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.DatatypeDefinitionXhtmlImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getDatatypeDefinitionXhtml()
	 * @generated
	 */
	int DATATYPE_DEFINITION_XHTML = 22;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_XHTML__DESC = DATATYPE_DEFINITION__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_XHTML__IDENTIFIER = DATATYPE_DEFINITION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_XHTML__LAST_CHANGE = DATATYPE_DEFINITION__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_XHTML__LONG_NAME = DATATYPE_DEFINITION__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Alternative Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_XHTML__ALTERNATIVE_ID = DATATYPE_DEFINITION__ALTERNATIVE_ID;

	/**
	 * The feature id for the '<em><b>Core Content</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_XHTML__CORE_CONTENT = DATATYPE_DEFINITION__CORE_CONTENT;

	/**
	 * The number of structural features of the '<em>Datatype Definition Xhtml</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_XHTML_FEATURE_COUNT = DATATYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.AlternativeIdImpl <em>Alternative Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.AlternativeIdImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getAlternativeId()
	 * @generated
	 */
	int ALTERNATIVE_ID = 23;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_ID__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_ID__IDENT = 1;

	/**
	 * The number of structural features of the '<em>Alternative Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_ID_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.AttributeDefinitionSimpleImpl <em>Attribute Definition Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.AttributeDefinitionSimpleImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getAttributeDefinitionSimple()
	 * @generated
	 */
	int ATTRIBUTE_DEFINITION_SIMPLE = 25;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_SIMPLE__DESC = ATTRIBUTE_DEFINITION__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_SIMPLE__IDENTIFIER = ATTRIBUTE_DEFINITION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_SIMPLE__LAST_CHANGE = ATTRIBUTE_DEFINITION__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_SIMPLE__LONG_NAME = ATTRIBUTE_DEFINITION__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Alternative Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_SIMPLE__ALTERNATIVE_ID = ATTRIBUTE_DEFINITION__ALTERNATIVE_ID;

	/**
	 * The feature id for the '<em><b>Is Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_SIMPLE__IS_EDITABLE = ATTRIBUTE_DEFINITION__IS_EDITABLE;

	/**
	 * The feature id for the '<em><b>Spec Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_SIMPLE__SPEC_TYPE = ATTRIBUTE_DEFINITION__SPEC_TYPE;

	/**
	 * The number of structural features of the '<em>Attribute Definition Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_SIMPLE_FEATURE_COUNT = ATTRIBUTE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.AttributeDefinitionBooleanImpl <em>Attribute Definition Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.AttributeDefinitionBooleanImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getAttributeDefinitionBoolean()
	 * @generated
	 */
	int ATTRIBUTE_DEFINITION_BOOLEAN = 24;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_BOOLEAN__DESC = ATTRIBUTE_DEFINITION_SIMPLE__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_BOOLEAN__IDENTIFIER = ATTRIBUTE_DEFINITION_SIMPLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_BOOLEAN__LAST_CHANGE = ATTRIBUTE_DEFINITION_SIMPLE__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_BOOLEAN__LONG_NAME = ATTRIBUTE_DEFINITION_SIMPLE__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Alternative Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_BOOLEAN__ALTERNATIVE_ID = ATTRIBUTE_DEFINITION_SIMPLE__ALTERNATIVE_ID;

	/**
	 * The feature id for the '<em><b>Is Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_BOOLEAN__IS_EDITABLE = ATTRIBUTE_DEFINITION_SIMPLE__IS_EDITABLE;

	/**
	 * The feature id for the '<em><b>Spec Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_BOOLEAN__SPEC_TYPE = ATTRIBUTE_DEFINITION_SIMPLE__SPEC_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_BOOLEAN__TYPE = ATTRIBUTE_DEFINITION_SIMPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_BOOLEAN__DEFAULT_VALUE = ATTRIBUTE_DEFINITION_SIMPLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Definition Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_BOOLEAN_FEATURE_COUNT = ATTRIBUTE_DEFINITION_SIMPLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.DatatypeDefinitionSimpleImpl <em>Datatype Definition Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.DatatypeDefinitionSimpleImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getDatatypeDefinitionSimple()
	 * @generated
	 */
	int DATATYPE_DEFINITION_SIMPLE = 27;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_SIMPLE__DESC = DATATYPE_DEFINITION__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_SIMPLE__IDENTIFIER = DATATYPE_DEFINITION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_SIMPLE__LAST_CHANGE = DATATYPE_DEFINITION__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_SIMPLE__LONG_NAME = DATATYPE_DEFINITION__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Alternative Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_SIMPLE__ALTERNATIVE_ID = DATATYPE_DEFINITION__ALTERNATIVE_ID;

	/**
	 * The feature id for the '<em><b>Core Content</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_SIMPLE__CORE_CONTENT = DATATYPE_DEFINITION__CORE_CONTENT;

	/**
	 * The number of structural features of the '<em>Datatype Definition Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_SIMPLE_FEATURE_COUNT = DATATYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.DatatypeDefinitionBooleanImpl <em>Datatype Definition Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.DatatypeDefinitionBooleanImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getDatatypeDefinitionBoolean()
	 * @generated
	 */
	int DATATYPE_DEFINITION_BOOLEAN = 26;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_BOOLEAN__DESC = DATATYPE_DEFINITION_SIMPLE__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_BOOLEAN__IDENTIFIER = DATATYPE_DEFINITION_SIMPLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_BOOLEAN__LAST_CHANGE = DATATYPE_DEFINITION_SIMPLE__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_BOOLEAN__LONG_NAME = DATATYPE_DEFINITION_SIMPLE__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Alternative Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_BOOLEAN__ALTERNATIVE_ID = DATATYPE_DEFINITION_SIMPLE__ALTERNATIVE_ID;

	/**
	 * The feature id for the '<em><b>Core Content</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_BOOLEAN__CORE_CONTENT = DATATYPE_DEFINITION_SIMPLE__CORE_CONTENT;

	/**
	 * The number of structural features of the '<em>Datatype Definition Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_BOOLEAN_FEATURE_COUNT = DATATYPE_DEFINITION_SIMPLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.AttributeValueSimpleImpl <em>Attribute Value Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.AttributeValueSimpleImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getAttributeValueSimple()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_SIMPLE = 29;

	/**
	 * The feature id for the '<em><b>Spec El At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_SIMPLE__SPEC_EL_AT = ATTRIBUTE_VALUE__SPEC_EL_AT;

	/**
	 * The number of structural features of the '<em>Attribute Value Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_SIMPLE_FEATURE_COUNT = ATTRIBUTE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.AttributeValueBooleanImpl <em>Attribute Value Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.AttributeValueBooleanImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getAttributeValueBoolean()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_BOOLEAN = 28;

	/**
	 * The feature id for the '<em><b>Spec El At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_BOOLEAN__SPEC_EL_AT = ATTRIBUTE_VALUE_SIMPLE__SPEC_EL_AT;

	/**
	 * The feature id for the '<em><b>The Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_BOOLEAN__THE_VALUE = ATTRIBUTE_VALUE_SIMPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_BOOLEAN__DEFINITION = ATTRIBUTE_VALUE_SIMPLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owning Definition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_BOOLEAN__OWNING_DEFINITION = ATTRIBUTE_VALUE_SIMPLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Attribute Value Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_BOOLEAN_FEATURE_COUNT = ATTRIBUTE_VALUE_SIMPLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.AttributeDefinitionDateImpl <em>Attribute Definition Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.AttributeDefinitionDateImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getAttributeDefinitionDate()
	 * @generated
	 */
	int ATTRIBUTE_DEFINITION_DATE = 30;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_DATE__DESC = ATTRIBUTE_DEFINITION_SIMPLE__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_DATE__IDENTIFIER = ATTRIBUTE_DEFINITION_SIMPLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_DATE__LAST_CHANGE = ATTRIBUTE_DEFINITION_SIMPLE__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_DATE__LONG_NAME = ATTRIBUTE_DEFINITION_SIMPLE__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Alternative Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_DATE__ALTERNATIVE_ID = ATTRIBUTE_DEFINITION_SIMPLE__ALTERNATIVE_ID;

	/**
	 * The feature id for the '<em><b>Is Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_DATE__IS_EDITABLE = ATTRIBUTE_DEFINITION_SIMPLE__IS_EDITABLE;

	/**
	 * The feature id for the '<em><b>Spec Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_DATE__SPEC_TYPE = ATTRIBUTE_DEFINITION_SIMPLE__SPEC_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_DATE__TYPE = ATTRIBUTE_DEFINITION_SIMPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_DATE__DEFAULT_VALUE = ATTRIBUTE_DEFINITION_SIMPLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Definition Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_DATE_FEATURE_COUNT = ATTRIBUTE_DEFINITION_SIMPLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.DatatypeDefinitionDateImpl <em>Datatype Definition Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.DatatypeDefinitionDateImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getDatatypeDefinitionDate()
	 * @generated
	 */
	int DATATYPE_DEFINITION_DATE = 31;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_DATE__DESC = DATATYPE_DEFINITION_SIMPLE__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_DATE__IDENTIFIER = DATATYPE_DEFINITION_SIMPLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_DATE__LAST_CHANGE = DATATYPE_DEFINITION_SIMPLE__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_DATE__LONG_NAME = DATATYPE_DEFINITION_SIMPLE__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Alternative Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_DATE__ALTERNATIVE_ID = DATATYPE_DEFINITION_SIMPLE__ALTERNATIVE_ID;

	/**
	 * The feature id for the '<em><b>Core Content</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_DATE__CORE_CONTENT = DATATYPE_DEFINITION_SIMPLE__CORE_CONTENT;

	/**
	 * The number of structural features of the '<em>Datatype Definition Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_DATE_FEATURE_COUNT = DATATYPE_DEFINITION_SIMPLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.AttributeValueDateImpl <em>Attribute Value Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.AttributeValueDateImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getAttributeValueDate()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_DATE = 32;

	/**
	 * The feature id for the '<em><b>Spec El At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_DATE__SPEC_EL_AT = ATTRIBUTE_VALUE_SIMPLE__SPEC_EL_AT;

	/**
	 * The feature id for the '<em><b>The Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_DATE__THE_VALUE = ATTRIBUTE_VALUE_SIMPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_DATE__DEFINITION = ATTRIBUTE_VALUE_SIMPLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owning Definition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_DATE__OWNING_DEFINITION = ATTRIBUTE_VALUE_SIMPLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Attribute Value Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_DATE_FEATURE_COUNT = ATTRIBUTE_VALUE_SIMPLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.AttributeDefinitionEnumerationImpl <em>Attribute Definition Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.AttributeDefinitionEnumerationImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getAttributeDefinitionEnumeration()
	 * @generated
	 */
	int ATTRIBUTE_DEFINITION_ENUMERATION = 33;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_ENUMERATION__DESC = ATTRIBUTE_DEFINITION__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_ENUMERATION__IDENTIFIER = ATTRIBUTE_DEFINITION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_ENUMERATION__LAST_CHANGE = ATTRIBUTE_DEFINITION__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_ENUMERATION__LONG_NAME = ATTRIBUTE_DEFINITION__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Alternative Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_ENUMERATION__ALTERNATIVE_ID = ATTRIBUTE_DEFINITION__ALTERNATIVE_ID;

	/**
	 * The feature id for the '<em><b>Is Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_ENUMERATION__IS_EDITABLE = ATTRIBUTE_DEFINITION__IS_EDITABLE;

	/**
	 * The feature id for the '<em><b>Spec Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_ENUMERATION__SPEC_TYPE = ATTRIBUTE_DEFINITION__SPEC_TYPE;

	/**
	 * The feature id for the '<em><b>Multi Valued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_ENUMERATION__MULTI_VALUED = ATTRIBUTE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_ENUMERATION__TYPE = ATTRIBUTE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_ENUMERATION__DEFAULT_VALUE = ATTRIBUTE_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Attribute Definition Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_ENUMERATION_FEATURE_COUNT = ATTRIBUTE_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.DatatypeDefinitionEnumerationImpl <em>Datatype Definition Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.DatatypeDefinitionEnumerationImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getDatatypeDefinitionEnumeration()
	 * @generated
	 */
	int DATATYPE_DEFINITION_ENUMERATION = 34;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_ENUMERATION__DESC = DATATYPE_DEFINITION__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_ENUMERATION__IDENTIFIER = DATATYPE_DEFINITION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_ENUMERATION__LAST_CHANGE = DATATYPE_DEFINITION__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_ENUMERATION__LONG_NAME = DATATYPE_DEFINITION__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Alternative Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_ENUMERATION__ALTERNATIVE_ID = DATATYPE_DEFINITION__ALTERNATIVE_ID;

	/**
	 * The feature id for the '<em><b>Core Content</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_ENUMERATION__CORE_CONTENT = DATATYPE_DEFINITION__CORE_CONTENT;

	/**
	 * The feature id for the '<em><b>Specified Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_ENUMERATION__SPECIFIED_VALUES = DATATYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Datatype Definition Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_ENUMERATION_FEATURE_COUNT = DATATYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.EnumValueImpl <em>Enum Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.EnumValueImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getEnumValue()
	 * @generated
	 */
	int ENUM_VALUE = 35;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__DESC = IDENTIFIABLE__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__IDENTIFIER = IDENTIFIABLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__LAST_CHANGE = IDENTIFIABLE__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__LONG_NAME = IDENTIFIABLE__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Alternative Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__ALTERNATIVE_ID = IDENTIFIABLE__ALTERNATIVE_ID;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__PROPERTIES = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b></b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__ = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.EmbeddedValueImpl <em>Embedded Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.EmbeddedValueImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getEmbeddedValue()
	 * @generated
	 */
	int EMBEDDED_VALUE = 36;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_VALUE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Other Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_VALUE__OTHER_CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Enum Value</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_VALUE__ENUM_VALUE = 2;

	/**
	 * The number of structural features of the '<em>Embedded Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_VALUE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.AttributeValueEnumerationImpl <em>Attribute Value Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.AttributeValueEnumerationImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getAttributeValueEnumeration()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_ENUMERATION = 37;

	/**
	 * The feature id for the '<em><b>Spec El At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_ENUMERATION__SPEC_EL_AT = ATTRIBUTE_VALUE__SPEC_EL_AT;

	/**
	 * The feature id for the '<em><b>Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_ENUMERATION__VALUES = ATTRIBUTE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_ENUMERATION__DEFINITION = ATTRIBUTE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owning Definition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_ENUMERATION__OWNING_DEFINITION = ATTRIBUTE_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Attribute Value Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_ENUMERATION_FEATURE_COUNT = ATTRIBUTE_VALUE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.AttributeDefinitionIntegerImpl <em>Attribute Definition Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.AttributeDefinitionIntegerImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getAttributeDefinitionInteger()
	 * @generated
	 */
	int ATTRIBUTE_DEFINITION_INTEGER = 38;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_INTEGER__DESC = ATTRIBUTE_DEFINITION_SIMPLE__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_INTEGER__IDENTIFIER = ATTRIBUTE_DEFINITION_SIMPLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_INTEGER__LAST_CHANGE = ATTRIBUTE_DEFINITION_SIMPLE__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_INTEGER__LONG_NAME = ATTRIBUTE_DEFINITION_SIMPLE__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Alternative Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_INTEGER__ALTERNATIVE_ID = ATTRIBUTE_DEFINITION_SIMPLE__ALTERNATIVE_ID;

	/**
	 * The feature id for the '<em><b>Is Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_INTEGER__IS_EDITABLE = ATTRIBUTE_DEFINITION_SIMPLE__IS_EDITABLE;

	/**
	 * The feature id for the '<em><b>Spec Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_INTEGER__SPEC_TYPE = ATTRIBUTE_DEFINITION_SIMPLE__SPEC_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_INTEGER__TYPE = ATTRIBUTE_DEFINITION_SIMPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_INTEGER__DEFAULT_VALUE = ATTRIBUTE_DEFINITION_SIMPLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Definition Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_INTEGER_FEATURE_COUNT = ATTRIBUTE_DEFINITION_SIMPLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.DatatypeDefinitionIntegerImpl <em>Datatype Definition Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.DatatypeDefinitionIntegerImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getDatatypeDefinitionInteger()
	 * @generated
	 */
	int DATATYPE_DEFINITION_INTEGER = 39;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_INTEGER__DESC = DATATYPE_DEFINITION_SIMPLE__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_INTEGER__IDENTIFIER = DATATYPE_DEFINITION_SIMPLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_INTEGER__LAST_CHANGE = DATATYPE_DEFINITION_SIMPLE__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_INTEGER__LONG_NAME = DATATYPE_DEFINITION_SIMPLE__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Alternative Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_INTEGER__ALTERNATIVE_ID = DATATYPE_DEFINITION_SIMPLE__ALTERNATIVE_ID;

	/**
	 * The feature id for the '<em><b>Core Content</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_INTEGER__CORE_CONTENT = DATATYPE_DEFINITION_SIMPLE__CORE_CONTENT;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_INTEGER__MAX = DATATYPE_DEFINITION_SIMPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_INTEGER__MIN = DATATYPE_DEFINITION_SIMPLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Datatype Definition Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_INTEGER_FEATURE_COUNT = DATATYPE_DEFINITION_SIMPLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.AttributeValueIntegerImpl <em>Attribute Value Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.AttributeValueIntegerImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getAttributeValueInteger()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_INTEGER = 40;

	/**
	 * The feature id for the '<em><b>Spec El At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_INTEGER__SPEC_EL_AT = ATTRIBUTE_VALUE_SIMPLE__SPEC_EL_AT;

	/**
	 * The feature id for the '<em><b>The Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_INTEGER__THE_VALUE = ATTRIBUTE_VALUE_SIMPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_INTEGER__DEFINITION = ATTRIBUTE_VALUE_SIMPLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owning Definition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_INTEGER__OWNING_DEFINITION = ATTRIBUTE_VALUE_SIMPLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Attribute Value Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_INTEGER_FEATURE_COUNT = ATTRIBUTE_VALUE_SIMPLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.AttributeDefinitionRealImpl <em>Attribute Definition Real</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.AttributeDefinitionRealImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getAttributeDefinitionReal()
	 * @generated
	 */
	int ATTRIBUTE_DEFINITION_REAL = 41;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_REAL__DESC = ATTRIBUTE_DEFINITION_SIMPLE__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_REAL__IDENTIFIER = ATTRIBUTE_DEFINITION_SIMPLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_REAL__LAST_CHANGE = ATTRIBUTE_DEFINITION_SIMPLE__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_REAL__LONG_NAME = ATTRIBUTE_DEFINITION_SIMPLE__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Alternative Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_REAL__ALTERNATIVE_ID = ATTRIBUTE_DEFINITION_SIMPLE__ALTERNATIVE_ID;

	/**
	 * The feature id for the '<em><b>Is Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_REAL__IS_EDITABLE = ATTRIBUTE_DEFINITION_SIMPLE__IS_EDITABLE;

	/**
	 * The feature id for the '<em><b>Spec Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_REAL__SPEC_TYPE = ATTRIBUTE_DEFINITION_SIMPLE__SPEC_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_REAL__TYPE = ATTRIBUTE_DEFINITION_SIMPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_REAL__DEFAULT_VALUE = ATTRIBUTE_DEFINITION_SIMPLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Definition Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_REAL_FEATURE_COUNT = ATTRIBUTE_DEFINITION_SIMPLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.DatatypeDefinitionRealImpl <em>Datatype Definition Real</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.DatatypeDefinitionRealImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getDatatypeDefinitionReal()
	 * @generated
	 */
	int DATATYPE_DEFINITION_REAL = 42;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_REAL__DESC = DATATYPE_DEFINITION_SIMPLE__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_REAL__IDENTIFIER = DATATYPE_DEFINITION_SIMPLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_REAL__LAST_CHANGE = DATATYPE_DEFINITION_SIMPLE__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_REAL__LONG_NAME = DATATYPE_DEFINITION_SIMPLE__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Alternative Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_REAL__ALTERNATIVE_ID = DATATYPE_DEFINITION_SIMPLE__ALTERNATIVE_ID;

	/**
	 * The feature id for the '<em><b>Core Content</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_REAL__CORE_CONTENT = DATATYPE_DEFINITION_SIMPLE__CORE_CONTENT;

	/**
	 * The feature id for the '<em><b>Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_REAL__ACCURACY = DATATYPE_DEFINITION_SIMPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_REAL__MAX = DATATYPE_DEFINITION_SIMPLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_REAL__MIN = DATATYPE_DEFINITION_SIMPLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Datatype Definition Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_REAL_FEATURE_COUNT = DATATYPE_DEFINITION_SIMPLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.AttributeValueRealImpl <em>Attribute Value Real</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.AttributeValueRealImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getAttributeValueReal()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_REAL = 43;

	/**
	 * The feature id for the '<em><b>Spec El At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REAL__SPEC_EL_AT = ATTRIBUTE_VALUE_SIMPLE__SPEC_EL_AT;

	/**
	 * The feature id for the '<em><b>The Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REAL__THE_VALUE = ATTRIBUTE_VALUE_SIMPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REAL__DEFINITION = ATTRIBUTE_VALUE_SIMPLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owning Definition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REAL__OWNING_DEFINITION = ATTRIBUTE_VALUE_SIMPLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Attribute Value Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REAL_FEATURE_COUNT = ATTRIBUTE_VALUE_SIMPLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.AttributeDefinitionStringImpl <em>Attribute Definition String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.AttributeDefinitionStringImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getAttributeDefinitionString()
	 * @generated
	 */
	int ATTRIBUTE_DEFINITION_STRING = 44;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_STRING__DESC = ATTRIBUTE_DEFINITION_SIMPLE__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_STRING__IDENTIFIER = ATTRIBUTE_DEFINITION_SIMPLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_STRING__LAST_CHANGE = ATTRIBUTE_DEFINITION_SIMPLE__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_STRING__LONG_NAME = ATTRIBUTE_DEFINITION_SIMPLE__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Alternative Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_STRING__ALTERNATIVE_ID = ATTRIBUTE_DEFINITION_SIMPLE__ALTERNATIVE_ID;

	/**
	 * The feature id for the '<em><b>Is Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_STRING__IS_EDITABLE = ATTRIBUTE_DEFINITION_SIMPLE__IS_EDITABLE;

	/**
	 * The feature id for the '<em><b>Spec Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_STRING__SPEC_TYPE = ATTRIBUTE_DEFINITION_SIMPLE__SPEC_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_STRING__TYPE = ATTRIBUTE_DEFINITION_SIMPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_STRING__DEFAULT_VALUE = ATTRIBUTE_DEFINITION_SIMPLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Definition String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_STRING_FEATURE_COUNT = ATTRIBUTE_DEFINITION_SIMPLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.DatatypeDefinitionStringImpl <em>Datatype Definition String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.DatatypeDefinitionStringImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getDatatypeDefinitionString()
	 * @generated
	 */
	int DATATYPE_DEFINITION_STRING = 45;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_STRING__DESC = DATATYPE_DEFINITION_SIMPLE__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_STRING__IDENTIFIER = DATATYPE_DEFINITION_SIMPLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_STRING__LAST_CHANGE = DATATYPE_DEFINITION_SIMPLE__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_STRING__LONG_NAME = DATATYPE_DEFINITION_SIMPLE__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Alternative Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_STRING__ALTERNATIVE_ID = DATATYPE_DEFINITION_SIMPLE__ALTERNATIVE_ID;

	/**
	 * The feature id for the '<em><b>Core Content</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_STRING__CORE_CONTENT = DATATYPE_DEFINITION_SIMPLE__CORE_CONTENT;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_STRING__MAX_LENGTH = DATATYPE_DEFINITION_SIMPLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Datatype Definition String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_STRING_FEATURE_COUNT = DATATYPE_DEFINITION_SIMPLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.impl.AttributeValueStringImpl <em>Attribute Value String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.impl.AttributeValueStringImpl
	 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getAttributeValueString()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_STRING = 46;

	/**
	 * The feature id for the '<em><b>Spec El At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_STRING__SPEC_EL_AT = ATTRIBUTE_VALUE_SIMPLE__SPEC_EL_AT;

	/**
	 * The feature id for the '<em><b>The Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_STRING__THE_VALUE = ATTRIBUTE_VALUE_SIMPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_STRING__DEFINITION = ATTRIBUTE_VALUE_SIMPLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owning Definition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_STRING__OWNING_DEFINITION = ATTRIBUTE_VALUE_SIMPLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Attribute Value String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_STRING_FEATURE_COUNT = ATTRIBUTE_VALUE_SIMPLE_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.AccessControlledElement <em>Access Controlled Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Controlled Element</em>'.
	 * @see org.eclipse.rmf.reqif10.AccessControlledElement
	 * @generated
	 */
	EClass getAccessControlledElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.AccessControlledElement#getIsEditable <em>Is Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Editable</em>'.
	 * @see org.eclipse.rmf.reqif10.AccessControlledElement#getIsEditable()
	 * @see #getAccessControlledElement()
	 * @generated
	 */
	EAttribute getAccessControlledElement_IsEditable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see org.eclipse.rmf.reqif10.Identifiable
	 * @generated
	 */
	EClass getIdentifiable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.Identifiable#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see org.eclipse.rmf.reqif10.Identifiable#getDesc()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_Desc();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.Identifiable#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.eclipse.rmf.reqif10.Identifiable#getIdentifier()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.Identifiable#getLastChange <em>Last Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Change</em>'.
	 * @see org.eclipse.rmf.reqif10.Identifiable#getLastChange()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_LastChange();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.Identifiable#getLongName <em>Long Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long Name</em>'.
	 * @see org.eclipse.rmf.reqif10.Identifiable#getLongName()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_LongName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.reqif10.Identifiable#getAlternativeId <em>Alternative Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alternative Id</em>'.
	 * @see org.eclipse.rmf.reqif10.Identifiable#getAlternativeId()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EReference getIdentifiable_AlternativeId();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.AttributeValueXhtml <em>Attribute Value Xhtml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value Xhtml</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeValueXhtml
	 * @generated
	 */
	EClass getAttributeValueXhtml();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.AttributeValueXhtml#getIsSimplified <em>Is Simplified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Simplified</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeValueXhtml#getIsSimplified()
	 * @see #getAttributeValueXhtml()
	 * @generated
	 */
	EAttribute getAttributeValueXhtml_IsSimplified();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.rmf.reqif10.AttributeValueXhtml#getOwningDefinition <em>Owning Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Definition</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeValueXhtml#getOwningDefinition()
	 * @see #getAttributeValueXhtml()
	 * @generated
	 */
	EReference getAttributeValueXhtml_OwningDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.reqif10.AttributeValueXhtml#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeValueXhtml#getDefinition()
	 * @see #getAttributeValueXhtml()
	 * @generated
	 */
	EReference getAttributeValueXhtml_Definition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.reqif10.AttributeValueXhtml#getTheOriginalValue <em>The Original Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Original Value</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeValueXhtml#getTheOriginalValue()
	 * @see #getAttributeValueXhtml()
	 * @generated
	 */
	EReference getAttributeValueXhtml_TheOriginalValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.reqif10.AttributeValueXhtml#getTheValue <em>The Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Value</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeValueXhtml#getTheValue()
	 * @see #getAttributeValueXhtml()
	 * @generated
	 */
	EReference getAttributeValueXhtml_TheValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.AttributeValue <em>Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeValue
	 * @generated
	 */
	EClass getAttributeValue();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.reqif10.AttributeValue#getSpecElAt <em>Spec El At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Spec El At</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeValue#getSpecElAt()
	 * @see #getAttributeValue()
	 * @generated
	 */
	EReference getAttributeValue_SpecElAt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.SpecElementWithAttributes <em>Spec Element With Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Element With Attributes</em>'.
	 * @see org.eclipse.rmf.reqif10.SpecElementWithAttributes
	 * @generated
	 */
	EClass getSpecElementWithAttributes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.SpecElementWithAttributes#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see org.eclipse.rmf.reqif10.SpecElementWithAttributes#getValues()
	 * @see #getSpecElementWithAttributes()
	 * @generated
	 */
	EReference getSpecElementWithAttributes_Values();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.AttributeDefinitionXhtml <em>Attribute Definition Xhtml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Definition Xhtml</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeDefinitionXhtml
	 * @generated
	 */
	EClass getAttributeDefinitionXhtml();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.reqif10.AttributeDefinitionXhtml#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeDefinitionXhtml#getType()
	 * @see #getAttributeDefinitionXhtml()
	 * @generated
	 */
	EReference getAttributeDefinitionXhtml_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.reqif10.AttributeDefinitionXhtml#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeDefinitionXhtml#getDefaultValue()
	 * @see #getAttributeDefinitionXhtml()
	 * @generated
	 */
	EReference getAttributeDefinitionXhtml_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.AttributeDefinition <em>Attribute Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Definition</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeDefinition
	 * @generated
	 */
	EClass getAttributeDefinition();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.rmf.reqif10.AttributeDefinition#getSpecType <em>Spec Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Spec Type</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeDefinition#getSpecType()
	 * @see #getAttributeDefinition()
	 * @generated
	 */
	EReference getAttributeDefinition_SpecType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.SpecType <em>Spec Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Type</em>'.
	 * @see org.eclipse.rmf.reqif10.SpecType
	 * @generated
	 */
	EClass getSpecType();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.rmf.reqif10.SpecType#getCoreContent <em>Core Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Core Content</em>'.
	 * @see org.eclipse.rmf.reqif10.SpecType#getCoreContent()
	 * @see #getSpecType()
	 * @generated
	 */
	EReference getSpecType_CoreContent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.SpecType#getSpecAttributes <em>Spec Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spec Attributes</em>'.
	 * @see org.eclipse.rmf.reqif10.SpecType#getSpecAttributes()
	 * @see #getSpecType()
	 * @generated
	 */
	EReference getSpecType_SpecAttributes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.ReqIfContent <em>Req If Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Req If Content</em>'.
	 * @see org.eclipse.rmf.reqif10.ReqIfContent
	 * @generated
	 */
	EClass getReqIfContent();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.rmf.reqif10.ReqIfContent#getDocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Document Root</em>'.
	 * @see org.eclipse.rmf.reqif10.ReqIfContent#getDocumentRoot()
	 * @see #getReqIfContent()
	 * @generated
	 */
	EReference getReqIfContent_DocumentRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.ReqIfContent#getSpecObjects <em>Spec Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spec Objects</em>'.
	 * @see org.eclipse.rmf.reqif10.ReqIfContent#getSpecObjects()
	 * @see #getReqIfContent()
	 * @generated
	 */
	EReference getReqIfContent_SpecObjects();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.ReqIfContent#getSpecifications <em>Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specifications</em>'.
	 * @see org.eclipse.rmf.reqif10.ReqIfContent#getSpecifications()
	 * @see #getReqIfContent()
	 * @generated
	 */
	EReference getReqIfContent_Specifications();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.ReqIfContent#getDatatypes <em>Datatypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datatypes</em>'.
	 * @see org.eclipse.rmf.reqif10.ReqIfContent#getDatatypes()
	 * @see #getReqIfContent()
	 * @generated
	 */
	EReference getReqIfContent_Datatypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.ReqIfContent#getSpecRelations <em>Spec Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spec Relations</em>'.
	 * @see org.eclipse.rmf.reqif10.ReqIfContent#getSpecRelations()
	 * @see #getReqIfContent()
	 * @generated
	 */
	EReference getReqIfContent_SpecRelations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.ReqIfContent#getSpecRelationGroups <em>Spec Relation Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spec Relation Groups</em>'.
	 * @see org.eclipse.rmf.reqif10.ReqIfContent#getSpecRelationGroups()
	 * @see #getReqIfContent()
	 * @generated
	 */
	EReference getReqIfContent_SpecRelationGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.ReqIfContent#getSpecTypes <em>Spec Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spec Types</em>'.
	 * @see org.eclipse.rmf.reqif10.ReqIfContent#getSpecTypes()
	 * @see #getReqIfContent()
	 * @generated
	 */
	EReference getReqIfContent_SpecTypes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.ReqIf <em>Req If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Req If</em>'.
	 * @see org.eclipse.rmf.reqif10.ReqIf
	 * @generated
	 */
	EClass getReqIf();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.ReqIf#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.ReqIf#getLang()
	 * @see #getReqIf()
	 * @generated
	 */
	EAttribute getReqIf_Lang();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.reqif10.ReqIf#getTheHeader <em>The Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Header</em>'.
	 * @see org.eclipse.rmf.reqif10.ReqIf#getTheHeader()
	 * @see #getReqIf()
	 * @generated
	 */
	EReference getReqIf_TheHeader();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.ReqIf#getToolExtensions <em>Tool Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tool Extensions</em>'.
	 * @see org.eclipse.rmf.reqif10.ReqIf#getToolExtensions()
	 * @see #getReqIf()
	 * @generated
	 */
	EReference getReqIf_ToolExtensions();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.reqif10.ReqIf#getCoreContent <em>Core Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Core Content</em>'.
	 * @see org.eclipse.rmf.reqif10.ReqIf#getCoreContent()
	 * @see #getReqIf()
	 * @generated
	 */
	EReference getReqIf_CoreContent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.ReqIfHeader <em>Req If Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Req If Header</em>'.
	 * @see org.eclipse.rmf.reqif10.ReqIfHeader
	 * @generated
	 */
	EClass getReqIfHeader();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.ReqIfHeader#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.eclipse.rmf.reqif10.ReqIfHeader#getComment()
	 * @see #getReqIfHeader()
	 * @generated
	 */
	EAttribute getReqIfHeader_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.ReqIfHeader#getCreationTime <em>Creation Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Time</em>'.
	 * @see org.eclipse.rmf.reqif10.ReqIfHeader#getCreationTime()
	 * @see #getReqIfHeader()
	 * @generated
	 */
	EAttribute getReqIfHeader_CreationTime();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.ReqIfHeader#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.eclipse.rmf.reqif10.ReqIfHeader#getIdentifier()
	 * @see #getReqIfHeader()
	 * @generated
	 */
	EAttribute getReqIfHeader_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.ReqIfHeader#getRepositoryId <em>Repository Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repository Id</em>'.
	 * @see org.eclipse.rmf.reqif10.ReqIfHeader#getRepositoryId()
	 * @see #getReqIfHeader()
	 * @generated
	 */
	EAttribute getReqIfHeader_RepositoryId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.ReqIfHeader#getReqIfToolId <em>Req If Tool Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Req If Tool Id</em>'.
	 * @see org.eclipse.rmf.reqif10.ReqIfHeader#getReqIfToolId()
	 * @see #getReqIfHeader()
	 * @generated
	 */
	EAttribute getReqIfHeader_ReqIfToolId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.ReqIfHeader#getReqIfVersion <em>Req If Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Req If Version</em>'.
	 * @see org.eclipse.rmf.reqif10.ReqIfHeader#getReqIfVersion()
	 * @see #getReqIfHeader()
	 * @generated
	 */
	EAttribute getReqIfHeader_ReqIfVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.ReqIfHeader#getSourceToolId <em>Source Tool Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Tool Id</em>'.
	 * @see org.eclipse.rmf.reqif10.ReqIfHeader#getSourceToolId()
	 * @see #getReqIfHeader()
	 * @generated
	 */
	EAttribute getReqIfHeader_SourceToolId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.ReqIfHeader#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.ReqIfHeader#getTitle()
	 * @see #getReqIfHeader()
	 * @generated
	 */
	EAttribute getReqIfHeader_Title();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.rmf.reqif10.ReqIfHeader#getDocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Document Root</em>'.
	 * @see org.eclipse.rmf.reqif10.ReqIfHeader#getDocumentRoot()
	 * @see #getReqIfHeader()
	 * @generated
	 */
	EReference getReqIfHeader_DocumentRoot();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.ReqIfToolExtension <em>Req If Tool Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Req If Tool Extension</em>'.
	 * @see org.eclipse.rmf.reqif10.ReqIfToolExtension
	 * @generated
	 */
	EClass getReqIfToolExtension();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.rmf.reqif10.ReqIfToolExtension#getDocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Document Root</em>'.
	 * @see org.eclipse.rmf.reqif10.ReqIfToolExtension#getDocumentRoot()
	 * @see #getReqIfToolExtension()
	 * @generated
	 */
	EReference getReqIfToolExtension_DocumentRoot();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.SpecObject <em>Spec Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Object</em>'.
	 * @see org.eclipse.rmf.reqif10.SpecObject
	 * @generated
	 */
	EClass getSpecObject();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.reqif10.SpecObject#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.rmf.reqif10.SpecObject#getType()
	 * @see #getSpecObject()
	 * @generated
	 */
	EReference getSpecObject_Type();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.rmf.reqif10.SpecObject#getCoreContent <em>Core Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Core Content</em>'.
	 * @see org.eclipse.rmf.reqif10.SpecObject#getCoreContent()
	 * @see #getSpecObject()
	 * @generated
	 */
	EReference getSpecObject_CoreContent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.SpecObjectType <em>Spec Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Object Type</em>'.
	 * @see org.eclipse.rmf.reqif10.SpecObjectType
	 * @generated
	 */
	EClass getSpecObjectType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see org.eclipse.rmf.reqif10.Specification
	 * @generated
	 */
	EClass getSpecification();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.reqif10.Specification#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.rmf.reqif10.Specification#getType()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.Specification#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.rmf.reqif10.Specification#getChildren()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_Children();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.rmf.reqif10.Specification#getCoreContent <em>Core Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Core Content</em>'.
	 * @see org.eclipse.rmf.reqif10.Specification#getCoreContent()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_CoreContent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.SpecificationType <em>Specification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification Type</em>'.
	 * @see org.eclipse.rmf.reqif10.SpecificationType
	 * @generated
	 */
	EClass getSpecificationType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.SpecHierarchy <em>Spec Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Hierarchy</em>'.
	 * @see org.eclipse.rmf.reqif10.SpecHierarchy
	 * @generated
	 */
	EClass getSpecHierarchy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.SpecHierarchy#getIsTableInternal <em>Is Table Internal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Table Internal</em>'.
	 * @see org.eclipse.rmf.reqif10.SpecHierarchy#getIsTableInternal()
	 * @see #getSpecHierarchy()
	 * @generated
	 */
	EAttribute getSpecHierarchy_IsTableInternal();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.reqif10.SpecHierarchy#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object</em>'.
	 * @see org.eclipse.rmf.reqif10.SpecHierarchy#getObject()
	 * @see #getSpecHierarchy()
	 * @generated
	 */
	EReference getSpecHierarchy_Object();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.rmf.reqif10.SpecHierarchy#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.eclipse.rmf.reqif10.SpecHierarchy#getParent()
	 * @see #getSpecHierarchy()
	 * @generated
	 */
	EReference getSpecHierarchy_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.SpecHierarchy#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.rmf.reqif10.SpecHierarchy#getChildren()
	 * @see #getSpecHierarchy()
	 * @generated
	 */
	EReference getSpecHierarchy_Children();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.reqif10.SpecHierarchy#getEditableAtts <em>Editable Atts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Editable Atts</em>'.
	 * @see org.eclipse.rmf.reqif10.SpecHierarchy#getEditableAtts()
	 * @see #getSpecHierarchy()
	 * @generated
	 */
	EReference getSpecHierarchy_EditableAtts();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.rmf.reqif10.SpecHierarchy#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Root</em>'.
	 * @see org.eclipse.rmf.reqif10.SpecHierarchy#getRoot()
	 * @see #getSpecHierarchy()
	 * @generated
	 */
	EReference getSpecHierarchy_Root();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.DatatypeDefinition <em>Datatype Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Definition</em>'.
	 * @see org.eclipse.rmf.reqif10.DatatypeDefinition
	 * @generated
	 */
	EClass getDatatypeDefinition();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.rmf.reqif10.DatatypeDefinition#getCoreContent <em>Core Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Core Content</em>'.
	 * @see org.eclipse.rmf.reqif10.DatatypeDefinition#getCoreContent()
	 * @see #getDatatypeDefinition()
	 * @generated
	 */
	EReference getDatatypeDefinition_CoreContent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.SpecRelation <em>Spec Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Relation</em>'.
	 * @see org.eclipse.rmf.reqif10.SpecRelation
	 * @generated
	 */
	EClass getSpecRelation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.reqif10.SpecRelation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.rmf.reqif10.SpecRelation#getTarget()
	 * @see #getSpecRelation()
	 * @generated
	 */
	EReference getSpecRelation_Target();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.reqif10.SpecRelation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.eclipse.rmf.reqif10.SpecRelation#getSource()
	 * @see #getSpecRelation()
	 * @generated
	 */
	EReference getSpecRelation_Source();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.reqif10.SpecRelation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.rmf.reqif10.SpecRelation#getType()
	 * @see #getSpecRelation()
	 * @generated
	 */
	EReference getSpecRelation_Type();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.rmf.reqif10.SpecRelation#getCoreContent <em>Core Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Core Content</em>'.
	 * @see org.eclipse.rmf.reqif10.SpecRelation#getCoreContent()
	 * @see #getSpecRelation()
	 * @generated
	 */
	EReference getSpecRelation_CoreContent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.SpecRelationType <em>Spec Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Relation Type</em>'.
	 * @see org.eclipse.rmf.reqif10.SpecRelationType
	 * @generated
	 */
	EClass getSpecRelationType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.RelationGroup <em>Relation Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Group</em>'.
	 * @see org.eclipse.rmf.reqif10.RelationGroup
	 * @generated
	 */
	EClass getRelationGroup();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.reqif10.RelationGroup#getSpecRelations <em>Spec Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Spec Relations</em>'.
	 * @see org.eclipse.rmf.reqif10.RelationGroup#getSpecRelations()
	 * @see #getRelationGroup()
	 * @generated
	 */
	EReference getRelationGroup_SpecRelations();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.reqif10.RelationGroup#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.rmf.reqif10.RelationGroup#getType()
	 * @see #getRelationGroup()
	 * @generated
	 */
	EReference getRelationGroup_Type();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.reqif10.RelationGroup#getSourceSpecification <em>Source Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Specification</em>'.
	 * @see org.eclipse.rmf.reqif10.RelationGroup#getSourceSpecification()
	 * @see #getRelationGroup()
	 * @generated
	 */
	EReference getRelationGroup_SourceSpecification();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.reqif10.RelationGroup#getTargetSpecification <em>Target Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Specification</em>'.
	 * @see org.eclipse.rmf.reqif10.RelationGroup#getTargetSpecification()
	 * @see #getRelationGroup()
	 * @generated
	 */
	EReference getRelationGroup_TargetSpecification();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.rmf.reqif10.RelationGroup#getCoreContent <em>Core Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Core Content</em>'.
	 * @see org.eclipse.rmf.reqif10.RelationGroup#getCoreContent()
	 * @see #getRelationGroup()
	 * @generated
	 */
	EReference getRelationGroup_CoreContent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.RelationGroupType <em>Relation Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Group Type</em>'.
	 * @see org.eclipse.rmf.reqif10.RelationGroupType
	 * @generated
	 */
	EClass getRelationGroupType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.DatatypeDefinitionXhtml <em>Datatype Definition Xhtml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Definition Xhtml</em>'.
	 * @see org.eclipse.rmf.reqif10.DatatypeDefinitionXhtml
	 * @generated
	 */
	EClass getDatatypeDefinitionXhtml();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.AlternativeId <em>Alternative Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative Id</em>'.
	 * @see org.eclipse.rmf.reqif10.AlternativeId
	 * @generated
	 */
	EClass getAlternativeId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.AlternativeId#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.eclipse.rmf.reqif10.AlternativeId#getIdentifier()
	 * @see #getAlternativeId()
	 * @generated
	 */
	EAttribute getAlternativeId_Identifier();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.rmf.reqif10.AlternativeId#getIdent <em>Ident</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Ident</em>'.
	 * @see org.eclipse.rmf.reqif10.AlternativeId#getIdent()
	 * @see #getAlternativeId()
	 * @generated
	 */
	EReference getAlternativeId_Ident();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.AttributeDefinitionBoolean <em>Attribute Definition Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Definition Boolean</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeDefinitionBoolean
	 * @generated
	 */
	EClass getAttributeDefinitionBoolean();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.reqif10.AttributeDefinitionBoolean#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeDefinitionBoolean#getType()
	 * @see #getAttributeDefinitionBoolean()
	 * @generated
	 */
	EReference getAttributeDefinitionBoolean_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.reqif10.AttributeDefinitionBoolean#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeDefinitionBoolean#getDefaultValue()
	 * @see #getAttributeDefinitionBoolean()
	 * @generated
	 */
	EReference getAttributeDefinitionBoolean_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.AttributeDefinitionSimple <em>Attribute Definition Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Definition Simple</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeDefinitionSimple
	 * @generated
	 */
	EClass getAttributeDefinitionSimple();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.DatatypeDefinitionBoolean <em>Datatype Definition Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Definition Boolean</em>'.
	 * @see org.eclipse.rmf.reqif10.DatatypeDefinitionBoolean
	 * @generated
	 */
	EClass getDatatypeDefinitionBoolean();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.DatatypeDefinitionSimple <em>Datatype Definition Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Definition Simple</em>'.
	 * @see org.eclipse.rmf.reqif10.DatatypeDefinitionSimple
	 * @generated
	 */
	EClass getDatatypeDefinitionSimple();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.AttributeValueBoolean <em>Attribute Value Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value Boolean</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeValueBoolean
	 * @generated
	 */
	EClass getAttributeValueBoolean();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.AttributeValueBoolean#getTheValue <em>The Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>The Value</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeValueBoolean#getTheValue()
	 * @see #getAttributeValueBoolean()
	 * @generated
	 */
	EAttribute getAttributeValueBoolean_TheValue();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.reqif10.AttributeValueBoolean#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeValueBoolean#getDefinition()
	 * @see #getAttributeValueBoolean()
	 * @generated
	 */
	EReference getAttributeValueBoolean_Definition();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.rmf.reqif10.AttributeValueBoolean#getOwningDefinition <em>Owning Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Definition</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeValueBoolean#getOwningDefinition()
	 * @see #getAttributeValueBoolean()
	 * @generated
	 */
	EReference getAttributeValueBoolean_OwningDefinition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.AttributeValueSimple <em>Attribute Value Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value Simple</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeValueSimple
	 * @generated
	 */
	EClass getAttributeValueSimple();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.AttributeDefinitionDate <em>Attribute Definition Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Definition Date</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeDefinitionDate
	 * @generated
	 */
	EClass getAttributeDefinitionDate();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.reqif10.AttributeDefinitionDate#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeDefinitionDate#getType()
	 * @see #getAttributeDefinitionDate()
	 * @generated
	 */
	EReference getAttributeDefinitionDate_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.reqif10.AttributeDefinitionDate#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeDefinitionDate#getDefaultValue()
	 * @see #getAttributeDefinitionDate()
	 * @generated
	 */
	EReference getAttributeDefinitionDate_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.DatatypeDefinitionDate <em>Datatype Definition Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Definition Date</em>'.
	 * @see org.eclipse.rmf.reqif10.DatatypeDefinitionDate
	 * @generated
	 */
	EClass getDatatypeDefinitionDate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.AttributeValueDate <em>Attribute Value Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value Date</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeValueDate
	 * @generated
	 */
	EClass getAttributeValueDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.AttributeValueDate#getTheValue <em>The Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>The Value</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeValueDate#getTheValue()
	 * @see #getAttributeValueDate()
	 * @generated
	 */
	EAttribute getAttributeValueDate_TheValue();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.reqif10.AttributeValueDate#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeValueDate#getDefinition()
	 * @see #getAttributeValueDate()
	 * @generated
	 */
	EReference getAttributeValueDate_Definition();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.rmf.reqif10.AttributeValueDate#getOwningDefinition <em>Owning Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Definition</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeValueDate#getOwningDefinition()
	 * @see #getAttributeValueDate()
	 * @generated
	 */
	EReference getAttributeValueDate_OwningDefinition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration <em>Attribute Definition Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Definition Enumeration</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration
	 * @generated
	 */
	EClass getAttributeDefinitionEnumeration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration#getMultiValued <em>Multi Valued</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Valued</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration#getMultiValued()
	 * @see #getAttributeDefinitionEnumeration()
	 * @generated
	 */
	EAttribute getAttributeDefinitionEnumeration_MultiValued();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration#getType()
	 * @see #getAttributeDefinitionEnumeration()
	 * @generated
	 */
	EReference getAttributeDefinitionEnumeration_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration#getDefaultValue()
	 * @see #getAttributeDefinitionEnumeration()
	 * @generated
	 */
	EReference getAttributeDefinitionEnumeration_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration <em>Datatype Definition Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Definition Enumeration</em>'.
	 * @see org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration
	 * @generated
	 */
	EClass getDatatypeDefinitionEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration#getSpecifiedValues <em>Specified Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specified Values</em>'.
	 * @see org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration#getSpecifiedValues()
	 * @see #getDatatypeDefinitionEnumeration()
	 * @generated
	 */
	EReference getDatatypeDefinitionEnumeration_SpecifiedValues();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.EnumValue <em>Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Value</em>'.
	 * @see org.eclipse.rmf.reqif10.EnumValue
	 * @generated
	 */
	EClass getEnumValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.reqif10.EnumValue#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.eclipse.rmf.reqif10.EnumValue#getProperties()
	 * @see #getEnumValue()
	 * @generated
	 */
	EReference getEnumValue_Properties();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.rmf.reqif10.EnumValue#get_ <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em></em>'.
	 * @see org.eclipse.rmf.reqif10.EnumValue#get_()
	 * @see #getEnumValue()
	 * @generated
	 */
	EReference getEnumValue__();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.EmbeddedValue <em>Embedded Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Embedded Value</em>'.
	 * @see org.eclipse.rmf.reqif10.EmbeddedValue
	 * @generated
	 */
	EClass getEmbeddedValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.EmbeddedValue#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.eclipse.rmf.reqif10.EmbeddedValue#getKey()
	 * @see #getEmbeddedValue()
	 * @generated
	 */
	EAttribute getEmbeddedValue_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.EmbeddedValue#getOtherContent <em>Other Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Other Content</em>'.
	 * @see org.eclipse.rmf.reqif10.EmbeddedValue#getOtherContent()
	 * @see #getEmbeddedValue()
	 * @generated
	 */
	EAttribute getEmbeddedValue_OtherContent();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.rmf.reqif10.EmbeddedValue#getEnumValue <em>Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Enum Value</em>'.
	 * @see org.eclipse.rmf.reqif10.EmbeddedValue#getEnumValue()
	 * @see #getEmbeddedValue()
	 * @generated
	 */
	EReference getEmbeddedValue_EnumValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.AttributeValueEnumeration <em>Attribute Value Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value Enumeration</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeValueEnumeration
	 * @generated
	 */
	EClass getAttributeValueEnumeration();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.reqif10.AttributeValueEnumeration#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Values</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeValueEnumeration#getValues()
	 * @see #getAttributeValueEnumeration()
	 * @generated
	 */
	EReference getAttributeValueEnumeration_Values();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.reqif10.AttributeValueEnumeration#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeValueEnumeration#getDefinition()
	 * @see #getAttributeValueEnumeration()
	 * @generated
	 */
	EReference getAttributeValueEnumeration_Definition();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.rmf.reqif10.AttributeValueEnumeration#getOwningDefinition <em>Owning Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Definition</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeValueEnumeration#getOwningDefinition()
	 * @see #getAttributeValueEnumeration()
	 * @generated
	 */
	EReference getAttributeValueEnumeration_OwningDefinition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.AttributeDefinitionInteger <em>Attribute Definition Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Definition Integer</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeDefinitionInteger
	 * @generated
	 */
	EClass getAttributeDefinitionInteger();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.reqif10.AttributeDefinitionInteger#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeDefinitionInteger#getType()
	 * @see #getAttributeDefinitionInteger()
	 * @generated
	 */
	EReference getAttributeDefinitionInteger_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.reqif10.AttributeDefinitionInteger#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeDefinitionInteger#getDefaultValue()
	 * @see #getAttributeDefinitionInteger()
	 * @generated
	 */
	EReference getAttributeDefinitionInteger_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.DatatypeDefinitionInteger <em>Datatype Definition Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Definition Integer</em>'.
	 * @see org.eclipse.rmf.reqif10.DatatypeDefinitionInteger
	 * @generated
	 */
	EClass getDatatypeDefinitionInteger();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.DatatypeDefinitionInteger#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.eclipse.rmf.reqif10.DatatypeDefinitionInteger#getMax()
	 * @see #getDatatypeDefinitionInteger()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionInteger_Max();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.DatatypeDefinitionInteger#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.eclipse.rmf.reqif10.DatatypeDefinitionInteger#getMin()
	 * @see #getDatatypeDefinitionInteger()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionInteger_Min();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.AttributeValueInteger <em>Attribute Value Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value Integer</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeValueInteger
	 * @generated
	 */
	EClass getAttributeValueInteger();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.AttributeValueInteger#getTheValue <em>The Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>The Value</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeValueInteger#getTheValue()
	 * @see #getAttributeValueInteger()
	 * @generated
	 */
	EAttribute getAttributeValueInteger_TheValue();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.reqif10.AttributeValueInteger#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeValueInteger#getDefinition()
	 * @see #getAttributeValueInteger()
	 * @generated
	 */
	EReference getAttributeValueInteger_Definition();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.rmf.reqif10.AttributeValueInteger#getOwningDefinition <em>Owning Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Definition</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeValueInteger#getOwningDefinition()
	 * @see #getAttributeValueInteger()
	 * @generated
	 */
	EReference getAttributeValueInteger_OwningDefinition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.AttributeDefinitionReal <em>Attribute Definition Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Definition Real</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeDefinitionReal
	 * @generated
	 */
	EClass getAttributeDefinitionReal();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.reqif10.AttributeDefinitionReal#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeDefinitionReal#getType()
	 * @see #getAttributeDefinitionReal()
	 * @generated
	 */
	EReference getAttributeDefinitionReal_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.reqif10.AttributeDefinitionReal#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeDefinitionReal#getDefaultValue()
	 * @see #getAttributeDefinitionReal()
	 * @generated
	 */
	EReference getAttributeDefinitionReal_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.DatatypeDefinitionReal <em>Datatype Definition Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Definition Real</em>'.
	 * @see org.eclipse.rmf.reqif10.DatatypeDefinitionReal
	 * @generated
	 */
	EClass getDatatypeDefinitionReal();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.DatatypeDefinitionReal#getAccuracy <em>Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accuracy</em>'.
	 * @see org.eclipse.rmf.reqif10.DatatypeDefinitionReal#getAccuracy()
	 * @see #getDatatypeDefinitionReal()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionReal_Accuracy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.DatatypeDefinitionReal#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.eclipse.rmf.reqif10.DatatypeDefinitionReal#getMax()
	 * @see #getDatatypeDefinitionReal()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionReal_Max();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.DatatypeDefinitionReal#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.eclipse.rmf.reqif10.DatatypeDefinitionReal#getMin()
	 * @see #getDatatypeDefinitionReal()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionReal_Min();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.AttributeValueReal <em>Attribute Value Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value Real</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeValueReal
	 * @generated
	 */
	EClass getAttributeValueReal();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.AttributeValueReal#getTheValue <em>The Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>The Value</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeValueReal#getTheValue()
	 * @see #getAttributeValueReal()
	 * @generated
	 */
	EAttribute getAttributeValueReal_TheValue();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.reqif10.AttributeValueReal#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeValueReal#getDefinition()
	 * @see #getAttributeValueReal()
	 * @generated
	 */
	EReference getAttributeValueReal_Definition();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.rmf.reqif10.AttributeValueReal#getOwningDefinition <em>Owning Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Definition</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeValueReal#getOwningDefinition()
	 * @see #getAttributeValueReal()
	 * @generated
	 */
	EReference getAttributeValueReal_OwningDefinition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.AttributeDefinitionString <em>Attribute Definition String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Definition String</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeDefinitionString
	 * @generated
	 */
	EClass getAttributeDefinitionString();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.reqif10.AttributeDefinitionString#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeDefinitionString#getType()
	 * @see #getAttributeDefinitionString()
	 * @generated
	 */
	EReference getAttributeDefinitionString_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.reqif10.AttributeDefinitionString#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeDefinitionString#getDefaultValue()
	 * @see #getAttributeDefinitionString()
	 * @generated
	 */
	EReference getAttributeDefinitionString_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.DatatypeDefinitionString <em>Datatype Definition String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Definition String</em>'.
	 * @see org.eclipse.rmf.reqif10.DatatypeDefinitionString
	 * @generated
	 */
	EClass getDatatypeDefinitionString();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.DatatypeDefinitionString#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see org.eclipse.rmf.reqif10.DatatypeDefinitionString#getMaxLength()
	 * @see #getDatatypeDefinitionString()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionString_MaxLength();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.AttributeValueString <em>Attribute Value String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value String</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeValueString
	 * @generated
	 */
	EClass getAttributeValueString();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.AttributeValueString#getTheValue <em>The Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>The Value</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeValueString#getTheValue()
	 * @see #getAttributeValueString()
	 * @generated
	 */
	EAttribute getAttributeValueString_TheValue();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.reqif10.AttributeValueString#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeValueString#getDefinition()
	 * @see #getAttributeValueString()
	 * @generated
	 */
	EReference getAttributeValueString_Definition();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.rmf.reqif10.AttributeValueString#getOwningDefinition <em>Owning Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Definition</em>'.
	 * @see org.eclipse.rmf.reqif10.AttributeValueString#getOwningDefinition()
	 * @see #getAttributeValueString()
	 * @generated
	 */
	EReference getAttributeValueString_OwningDefinition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Reqif10Factory getReqif10Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.AccessControlledElementImpl <em>Access Controlled Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.AccessControlledElementImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getAccessControlledElement()
		 * @generated
		 */
		EClass ACCESS_CONTROLLED_ELEMENT = eINSTANCE.getAccessControlledElement();

		/**
		 * The meta object literal for the '<em><b>Is Editable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_CONTROLLED_ELEMENT__IS_EDITABLE = eINSTANCE.getAccessControlledElement_IsEditable();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.IdentifiableImpl <em>Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.IdentifiableImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getIdentifiable()
		 * @generated
		 */
		EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__DESC = eINSTANCE.getIdentifiable_Desc();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__IDENTIFIER = eINSTANCE.getIdentifiable_Identifier();

		/**
		 * The meta object literal for the '<em><b>Last Change</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__LAST_CHANGE = eINSTANCE.getIdentifiable_LastChange();

		/**
		 * The meta object literal for the '<em><b>Long Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__LONG_NAME = eINSTANCE.getIdentifiable_LongName();

		/**
		 * The meta object literal for the '<em><b>Alternative Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIABLE__ALTERNATIVE_ID = eINSTANCE.getIdentifiable_AlternativeId();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.AttributeValueXhtmlImpl <em>Attribute Value Xhtml</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.AttributeValueXhtmlImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getAttributeValueXhtml()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_XHTML = eINSTANCE.getAttributeValueXhtml();

		/**
		 * The meta object literal for the '<em><b>Is Simplified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_XHTML__IS_SIMPLIFIED = eINSTANCE.getAttributeValueXhtml_IsSimplified();

		/**
		 * The meta object literal for the '<em><b>Owning Definition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_XHTML__OWNING_DEFINITION = eINSTANCE.getAttributeValueXhtml_OwningDefinition();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_XHTML__DEFINITION = eINSTANCE.getAttributeValueXhtml_Definition();

		/**
		 * The meta object literal for the '<em><b>The Original Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_XHTML__THE_ORIGINAL_VALUE = eINSTANCE.getAttributeValueXhtml_TheOriginalValue();

		/**
		 * The meta object literal for the '<em><b>The Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_XHTML__THE_VALUE = eINSTANCE.getAttributeValueXhtml_TheValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.AttributeValueImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getAttributeValue()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE = eINSTANCE.getAttributeValue();

		/**
		 * The meta object literal for the '<em><b>Spec El At</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE__SPEC_EL_AT = eINSTANCE.getAttributeValue_SpecElAt();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.SpecElementWithAttributesImpl <em>Spec Element With Attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.SpecElementWithAttributesImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getSpecElementWithAttributes()
		 * @generated
		 */
		EClass SPEC_ELEMENT_WITH_ATTRIBUTES = eINSTANCE.getSpecElementWithAttributes();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_ELEMENT_WITH_ATTRIBUTES__VALUES = eINSTANCE.getSpecElementWithAttributes_Values();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.AttributeDefinitionXhtmlImpl <em>Attribute Definition Xhtml</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.AttributeDefinitionXhtmlImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getAttributeDefinitionXhtml()
		 * @generated
		 */
		EClass ATTRIBUTE_DEFINITION_XHTML = eINSTANCE.getAttributeDefinitionXhtml();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DEFINITION_XHTML__TYPE = eINSTANCE.getAttributeDefinitionXhtml_Type();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DEFINITION_XHTML__DEFAULT_VALUE = eINSTANCE.getAttributeDefinitionXhtml_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.AttributeDefinitionImpl <em>Attribute Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.AttributeDefinitionImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getAttributeDefinition()
		 * @generated
		 */
		EClass ATTRIBUTE_DEFINITION = eINSTANCE.getAttributeDefinition();

		/**
		 * The meta object literal for the '<em><b>Spec Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DEFINITION__SPEC_TYPE = eINSTANCE.getAttributeDefinition_SpecType();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.SpecTypeImpl <em>Spec Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.SpecTypeImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getSpecType()
		 * @generated
		 */
		EClass SPEC_TYPE = eINSTANCE.getSpecType();

		/**
		 * The meta object literal for the '<em><b>Core Content</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_TYPE__CORE_CONTENT = eINSTANCE.getSpecType_CoreContent();

		/**
		 * The meta object literal for the '<em><b>Spec Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_TYPE__SPEC_ATTRIBUTES = eINSTANCE.getSpecType_SpecAttributes();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.ReqIfContentImpl <em>Req If Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.ReqIfContentImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getReqIfContent()
		 * @generated
		 */
		EClass REQ_IF_CONTENT = eINSTANCE.getReqIfContent();

		/**
		 * The meta object literal for the '<em><b>Document Root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQ_IF_CONTENT__DOCUMENT_ROOT = eINSTANCE.getReqIfContent_DocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Spec Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQ_IF_CONTENT__SPEC_OBJECTS = eINSTANCE.getReqIfContent_SpecObjects();

		/**
		 * The meta object literal for the '<em><b>Specifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQ_IF_CONTENT__SPECIFICATIONS = eINSTANCE.getReqIfContent_Specifications();

		/**
		 * The meta object literal for the '<em><b>Datatypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQ_IF_CONTENT__DATATYPES = eINSTANCE.getReqIfContent_Datatypes();

		/**
		 * The meta object literal for the '<em><b>Spec Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQ_IF_CONTENT__SPEC_RELATIONS = eINSTANCE.getReqIfContent_SpecRelations();

		/**
		 * The meta object literal for the '<em><b>Spec Relation Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQ_IF_CONTENT__SPEC_RELATION_GROUPS = eINSTANCE.getReqIfContent_SpecRelationGroups();

		/**
		 * The meta object literal for the '<em><b>Spec Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQ_IF_CONTENT__SPEC_TYPES = eINSTANCE.getReqIfContent_SpecTypes();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.ReqIfImpl <em>Req If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.ReqIfImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getReqIf()
		 * @generated
		 */
		EClass REQ_IF = eINSTANCE.getReqIf();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQ_IF__LANG = eINSTANCE.getReqIf_Lang();

		/**
		 * The meta object literal for the '<em><b>The Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQ_IF__THE_HEADER = eINSTANCE.getReqIf_TheHeader();

		/**
		 * The meta object literal for the '<em><b>Tool Extensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQ_IF__TOOL_EXTENSIONS = eINSTANCE.getReqIf_ToolExtensions();

		/**
		 * The meta object literal for the '<em><b>Core Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQ_IF__CORE_CONTENT = eINSTANCE.getReqIf_CoreContent();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.ReqIfHeaderImpl <em>Req If Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.ReqIfHeaderImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getReqIfHeader()
		 * @generated
		 */
		EClass REQ_IF_HEADER = eINSTANCE.getReqIfHeader();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQ_IF_HEADER__COMMENT = eINSTANCE.getReqIfHeader_Comment();

		/**
		 * The meta object literal for the '<em><b>Creation Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQ_IF_HEADER__CREATION_TIME = eINSTANCE.getReqIfHeader_CreationTime();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQ_IF_HEADER__IDENTIFIER = eINSTANCE.getReqIfHeader_Identifier();

		/**
		 * The meta object literal for the '<em><b>Repository Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQ_IF_HEADER__REPOSITORY_ID = eINSTANCE.getReqIfHeader_RepositoryId();

		/**
		 * The meta object literal for the '<em><b>Req If Tool Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQ_IF_HEADER__REQ_IF_TOOL_ID = eINSTANCE.getReqIfHeader_ReqIfToolId();

		/**
		 * The meta object literal for the '<em><b>Req If Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQ_IF_HEADER__REQ_IF_VERSION = eINSTANCE.getReqIfHeader_ReqIfVersion();

		/**
		 * The meta object literal for the '<em><b>Source Tool Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQ_IF_HEADER__SOURCE_TOOL_ID = eINSTANCE.getReqIfHeader_SourceToolId();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQ_IF_HEADER__TITLE = eINSTANCE.getReqIfHeader_Title();

		/**
		 * The meta object literal for the '<em><b>Document Root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQ_IF_HEADER__DOCUMENT_ROOT = eINSTANCE.getReqIfHeader_DocumentRoot();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.ReqIfToolExtensionImpl <em>Req If Tool Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.ReqIfToolExtensionImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getReqIfToolExtension()
		 * @generated
		 */
		EClass REQ_IF_TOOL_EXTENSION = eINSTANCE.getReqIfToolExtension();

		/**
		 * The meta object literal for the '<em><b>Document Root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQ_IF_TOOL_EXTENSION__DOCUMENT_ROOT = eINSTANCE.getReqIfToolExtension_DocumentRoot();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.SpecObjectImpl <em>Spec Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.SpecObjectImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getSpecObject()
		 * @generated
		 */
		EClass SPEC_OBJECT = eINSTANCE.getSpecObject();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_OBJECT__TYPE = eINSTANCE.getSpecObject_Type();

		/**
		 * The meta object literal for the '<em><b>Core Content</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_OBJECT__CORE_CONTENT = eINSTANCE.getSpecObject_CoreContent();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.SpecObjectTypeImpl <em>Spec Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.SpecObjectTypeImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getSpecObjectType()
		 * @generated
		 */
		EClass SPEC_OBJECT_TYPE = eINSTANCE.getSpecObjectType();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.SpecificationImpl <em>Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.SpecificationImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getSpecification()
		 * @generated
		 */
		EClass SPECIFICATION = eINSTANCE.getSpecification();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__TYPE = eINSTANCE.getSpecification_Type();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__CHILDREN = eINSTANCE.getSpecification_Children();

		/**
		 * The meta object literal for the '<em><b>Core Content</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__CORE_CONTENT = eINSTANCE.getSpecification_CoreContent();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.SpecificationTypeImpl <em>Specification Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.SpecificationTypeImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getSpecificationType()
		 * @generated
		 */
		EClass SPECIFICATION_TYPE = eINSTANCE.getSpecificationType();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.SpecHierarchyImpl <em>Spec Hierarchy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.SpecHierarchyImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getSpecHierarchy()
		 * @generated
		 */
		EClass SPEC_HIERARCHY = eINSTANCE.getSpecHierarchy();

		/**
		 * The meta object literal for the '<em><b>Is Table Internal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_HIERARCHY__IS_TABLE_INTERNAL = eINSTANCE.getSpecHierarchy_IsTableInternal();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_HIERARCHY__OBJECT = eINSTANCE.getSpecHierarchy_Object();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_HIERARCHY__PARENT = eINSTANCE.getSpecHierarchy_Parent();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_HIERARCHY__CHILDREN = eINSTANCE.getSpecHierarchy_Children();

		/**
		 * The meta object literal for the '<em><b>Editable Atts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_HIERARCHY__EDITABLE_ATTS = eINSTANCE.getSpecHierarchy_EditableAtts();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_HIERARCHY__ROOT = eINSTANCE.getSpecHierarchy_Root();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.DatatypeDefinitionImpl <em>Datatype Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.DatatypeDefinitionImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getDatatypeDefinition()
		 * @generated
		 */
		EClass DATATYPE_DEFINITION = eINSTANCE.getDatatypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Core Content</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPE_DEFINITION__CORE_CONTENT = eINSTANCE.getDatatypeDefinition_CoreContent();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.SpecRelationImpl <em>Spec Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.SpecRelationImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getSpecRelation()
		 * @generated
		 */
		EClass SPEC_RELATION = eINSTANCE.getSpecRelation();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_RELATION__TARGET = eINSTANCE.getSpecRelation_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_RELATION__SOURCE = eINSTANCE.getSpecRelation_Source();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_RELATION__TYPE = eINSTANCE.getSpecRelation_Type();

		/**
		 * The meta object literal for the '<em><b>Core Content</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_RELATION__CORE_CONTENT = eINSTANCE.getSpecRelation_CoreContent();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.SpecRelationTypeImpl <em>Spec Relation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.SpecRelationTypeImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getSpecRelationType()
		 * @generated
		 */
		EClass SPEC_RELATION_TYPE = eINSTANCE.getSpecRelationType();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.RelationGroupImpl <em>Relation Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.RelationGroupImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getRelationGroup()
		 * @generated
		 */
		EClass RELATION_GROUP = eINSTANCE.getRelationGroup();

		/**
		 * The meta object literal for the '<em><b>Spec Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_GROUP__SPEC_RELATIONS = eINSTANCE.getRelationGroup_SpecRelations();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_GROUP__TYPE = eINSTANCE.getRelationGroup_Type();

		/**
		 * The meta object literal for the '<em><b>Source Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_GROUP__SOURCE_SPECIFICATION = eINSTANCE.getRelationGroup_SourceSpecification();

		/**
		 * The meta object literal for the '<em><b>Target Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_GROUP__TARGET_SPECIFICATION = eINSTANCE.getRelationGroup_TargetSpecification();

		/**
		 * The meta object literal for the '<em><b>Core Content</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_GROUP__CORE_CONTENT = eINSTANCE.getRelationGroup_CoreContent();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.RelationGroupTypeImpl <em>Relation Group Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.RelationGroupTypeImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getRelationGroupType()
		 * @generated
		 */
		EClass RELATION_GROUP_TYPE = eINSTANCE.getRelationGroupType();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.DatatypeDefinitionXhtmlImpl <em>Datatype Definition Xhtml</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.DatatypeDefinitionXhtmlImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getDatatypeDefinitionXhtml()
		 * @generated
		 */
		EClass DATATYPE_DEFINITION_XHTML = eINSTANCE.getDatatypeDefinitionXhtml();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.AlternativeIdImpl <em>Alternative Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.AlternativeIdImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getAlternativeId()
		 * @generated
		 */
		EClass ALTERNATIVE_ID = eINSTANCE.getAlternativeId();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALTERNATIVE_ID__IDENTIFIER = eINSTANCE.getAlternativeId_Identifier();

		/**
		 * The meta object literal for the '<em><b>Ident</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVE_ID__IDENT = eINSTANCE.getAlternativeId_Ident();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.AttributeDefinitionBooleanImpl <em>Attribute Definition Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.AttributeDefinitionBooleanImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getAttributeDefinitionBoolean()
		 * @generated
		 */
		EClass ATTRIBUTE_DEFINITION_BOOLEAN = eINSTANCE.getAttributeDefinitionBoolean();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DEFINITION_BOOLEAN__TYPE = eINSTANCE.getAttributeDefinitionBoolean_Type();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DEFINITION_BOOLEAN__DEFAULT_VALUE = eINSTANCE.getAttributeDefinitionBoolean_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.AttributeDefinitionSimpleImpl <em>Attribute Definition Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.AttributeDefinitionSimpleImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getAttributeDefinitionSimple()
		 * @generated
		 */
		EClass ATTRIBUTE_DEFINITION_SIMPLE = eINSTANCE.getAttributeDefinitionSimple();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.DatatypeDefinitionBooleanImpl <em>Datatype Definition Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.DatatypeDefinitionBooleanImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getDatatypeDefinitionBoolean()
		 * @generated
		 */
		EClass DATATYPE_DEFINITION_BOOLEAN = eINSTANCE.getDatatypeDefinitionBoolean();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.DatatypeDefinitionSimpleImpl <em>Datatype Definition Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.DatatypeDefinitionSimpleImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getDatatypeDefinitionSimple()
		 * @generated
		 */
		EClass DATATYPE_DEFINITION_SIMPLE = eINSTANCE.getDatatypeDefinitionSimple();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.AttributeValueBooleanImpl <em>Attribute Value Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.AttributeValueBooleanImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getAttributeValueBoolean()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_BOOLEAN = eINSTANCE.getAttributeValueBoolean();

		/**
		 * The meta object literal for the '<em><b>The Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_BOOLEAN__THE_VALUE = eINSTANCE.getAttributeValueBoolean_TheValue();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_BOOLEAN__DEFINITION = eINSTANCE.getAttributeValueBoolean_Definition();

		/**
		 * The meta object literal for the '<em><b>Owning Definition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_BOOLEAN__OWNING_DEFINITION = eINSTANCE.getAttributeValueBoolean_OwningDefinition();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.AttributeValueSimpleImpl <em>Attribute Value Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.AttributeValueSimpleImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getAttributeValueSimple()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_SIMPLE = eINSTANCE.getAttributeValueSimple();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.AttributeDefinitionDateImpl <em>Attribute Definition Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.AttributeDefinitionDateImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getAttributeDefinitionDate()
		 * @generated
		 */
		EClass ATTRIBUTE_DEFINITION_DATE = eINSTANCE.getAttributeDefinitionDate();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DEFINITION_DATE__TYPE = eINSTANCE.getAttributeDefinitionDate_Type();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DEFINITION_DATE__DEFAULT_VALUE = eINSTANCE.getAttributeDefinitionDate_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.DatatypeDefinitionDateImpl <em>Datatype Definition Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.DatatypeDefinitionDateImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getDatatypeDefinitionDate()
		 * @generated
		 */
		EClass DATATYPE_DEFINITION_DATE = eINSTANCE.getDatatypeDefinitionDate();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.AttributeValueDateImpl <em>Attribute Value Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.AttributeValueDateImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getAttributeValueDate()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_DATE = eINSTANCE.getAttributeValueDate();

		/**
		 * The meta object literal for the '<em><b>The Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_DATE__THE_VALUE = eINSTANCE.getAttributeValueDate_TheValue();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_DATE__DEFINITION = eINSTANCE.getAttributeValueDate_Definition();

		/**
		 * The meta object literal for the '<em><b>Owning Definition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_DATE__OWNING_DEFINITION = eINSTANCE.getAttributeValueDate_OwningDefinition();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.AttributeDefinitionEnumerationImpl <em>Attribute Definition Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.AttributeDefinitionEnumerationImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getAttributeDefinitionEnumeration()
		 * @generated
		 */
		EClass ATTRIBUTE_DEFINITION_ENUMERATION = eINSTANCE.getAttributeDefinitionEnumeration();

		/**
		 * The meta object literal for the '<em><b>Multi Valued</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DEFINITION_ENUMERATION__MULTI_VALUED = eINSTANCE.getAttributeDefinitionEnumeration_MultiValued();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DEFINITION_ENUMERATION__TYPE = eINSTANCE.getAttributeDefinitionEnumeration_Type();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DEFINITION_ENUMERATION__DEFAULT_VALUE = eINSTANCE.getAttributeDefinitionEnumeration_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.DatatypeDefinitionEnumerationImpl <em>Datatype Definition Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.DatatypeDefinitionEnumerationImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getDatatypeDefinitionEnumeration()
		 * @generated
		 */
		EClass DATATYPE_DEFINITION_ENUMERATION = eINSTANCE.getDatatypeDefinitionEnumeration();

		/**
		 * The meta object literal for the '<em><b>Specified Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPE_DEFINITION_ENUMERATION__SPECIFIED_VALUES = eINSTANCE.getDatatypeDefinitionEnumeration_SpecifiedValues();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.EnumValueImpl <em>Enum Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.EnumValueImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getEnumValue()
		 * @generated
		 */
		EClass ENUM_VALUE = eINSTANCE.getEnumValue();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_VALUE__PROPERTIES = eINSTANCE.getEnumValue_Properties();

		/**
		 * The meta object literal for the '<em><b></b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_VALUE__ = eINSTANCE.getEnumValue__();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.EmbeddedValueImpl <em>Embedded Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.EmbeddedValueImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getEmbeddedValue()
		 * @generated
		 */
		EClass EMBEDDED_VALUE = eINSTANCE.getEmbeddedValue();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBEDDED_VALUE__KEY = eINSTANCE.getEmbeddedValue_Key();

		/**
		 * The meta object literal for the '<em><b>Other Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBEDDED_VALUE__OTHER_CONTENT = eINSTANCE.getEmbeddedValue_OtherContent();

		/**
		 * The meta object literal for the '<em><b>Enum Value</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMBEDDED_VALUE__ENUM_VALUE = eINSTANCE.getEmbeddedValue_EnumValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.AttributeValueEnumerationImpl <em>Attribute Value Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.AttributeValueEnumerationImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getAttributeValueEnumeration()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_ENUMERATION = eINSTANCE.getAttributeValueEnumeration();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_ENUMERATION__VALUES = eINSTANCE.getAttributeValueEnumeration_Values();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_ENUMERATION__DEFINITION = eINSTANCE.getAttributeValueEnumeration_Definition();

		/**
		 * The meta object literal for the '<em><b>Owning Definition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_ENUMERATION__OWNING_DEFINITION = eINSTANCE.getAttributeValueEnumeration_OwningDefinition();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.AttributeDefinitionIntegerImpl <em>Attribute Definition Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.AttributeDefinitionIntegerImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getAttributeDefinitionInteger()
		 * @generated
		 */
		EClass ATTRIBUTE_DEFINITION_INTEGER = eINSTANCE.getAttributeDefinitionInteger();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DEFINITION_INTEGER__TYPE = eINSTANCE.getAttributeDefinitionInteger_Type();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DEFINITION_INTEGER__DEFAULT_VALUE = eINSTANCE.getAttributeDefinitionInteger_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.DatatypeDefinitionIntegerImpl <em>Datatype Definition Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.DatatypeDefinitionIntegerImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getDatatypeDefinitionInteger()
		 * @generated
		 */
		EClass DATATYPE_DEFINITION_INTEGER = eINSTANCE.getDatatypeDefinitionInteger();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_INTEGER__MAX = eINSTANCE.getDatatypeDefinitionInteger_Max();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_INTEGER__MIN = eINSTANCE.getDatatypeDefinitionInteger_Min();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.AttributeValueIntegerImpl <em>Attribute Value Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.AttributeValueIntegerImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getAttributeValueInteger()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_INTEGER = eINSTANCE.getAttributeValueInteger();

		/**
		 * The meta object literal for the '<em><b>The Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_INTEGER__THE_VALUE = eINSTANCE.getAttributeValueInteger_TheValue();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_INTEGER__DEFINITION = eINSTANCE.getAttributeValueInteger_Definition();

		/**
		 * The meta object literal for the '<em><b>Owning Definition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_INTEGER__OWNING_DEFINITION = eINSTANCE.getAttributeValueInteger_OwningDefinition();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.AttributeDefinitionRealImpl <em>Attribute Definition Real</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.AttributeDefinitionRealImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getAttributeDefinitionReal()
		 * @generated
		 */
		EClass ATTRIBUTE_DEFINITION_REAL = eINSTANCE.getAttributeDefinitionReal();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DEFINITION_REAL__TYPE = eINSTANCE.getAttributeDefinitionReal_Type();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DEFINITION_REAL__DEFAULT_VALUE = eINSTANCE.getAttributeDefinitionReal_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.DatatypeDefinitionRealImpl <em>Datatype Definition Real</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.DatatypeDefinitionRealImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getDatatypeDefinitionReal()
		 * @generated
		 */
		EClass DATATYPE_DEFINITION_REAL = eINSTANCE.getDatatypeDefinitionReal();

		/**
		 * The meta object literal for the '<em><b>Accuracy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_REAL__ACCURACY = eINSTANCE.getDatatypeDefinitionReal_Accuracy();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_REAL__MAX = eINSTANCE.getDatatypeDefinitionReal_Max();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_REAL__MIN = eINSTANCE.getDatatypeDefinitionReal_Min();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.AttributeValueRealImpl <em>Attribute Value Real</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.AttributeValueRealImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getAttributeValueReal()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_REAL = eINSTANCE.getAttributeValueReal();

		/**
		 * The meta object literal for the '<em><b>The Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_REAL__THE_VALUE = eINSTANCE.getAttributeValueReal_TheValue();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_REAL__DEFINITION = eINSTANCE.getAttributeValueReal_Definition();

		/**
		 * The meta object literal for the '<em><b>Owning Definition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_REAL__OWNING_DEFINITION = eINSTANCE.getAttributeValueReal_OwningDefinition();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.AttributeDefinitionStringImpl <em>Attribute Definition String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.AttributeDefinitionStringImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getAttributeDefinitionString()
		 * @generated
		 */
		EClass ATTRIBUTE_DEFINITION_STRING = eINSTANCE.getAttributeDefinitionString();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DEFINITION_STRING__TYPE = eINSTANCE.getAttributeDefinitionString_Type();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DEFINITION_STRING__DEFAULT_VALUE = eINSTANCE.getAttributeDefinitionString_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.DatatypeDefinitionStringImpl <em>Datatype Definition String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.DatatypeDefinitionStringImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getDatatypeDefinitionString()
		 * @generated
		 */
		EClass DATATYPE_DEFINITION_STRING = eINSTANCE.getDatatypeDefinitionString();

		/**
		 * The meta object literal for the '<em><b>Max Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_STRING__MAX_LENGTH = eINSTANCE.getDatatypeDefinitionString_MaxLength();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.impl.AttributeValueStringImpl <em>Attribute Value String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.impl.AttributeValueStringImpl
		 * @see org.eclipse.rmf.reqif10.impl.Reqif10PackageImpl#getAttributeValueString()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_STRING = eINSTANCE.getAttributeValueString();

		/**
		 * The meta object literal for the '<em><b>The Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_STRING__THE_VALUE = eINSTANCE.getAttributeValueString_TheValue();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_STRING__DEFINITION = eINSTANCE.getAttributeValueString_Definition();

		/**
		 * The meta object literal for the '<em><b>Owning Definition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_STRING__OWNING_DEFINITION = eINSTANCE.getAttributeValueString_OwningDefinition();

	}

} //ReqIfPackage
