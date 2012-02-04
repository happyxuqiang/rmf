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

package org.eclipse.rmf.reqif10.xsd.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.rmf.reqif10.xsd.ReqifPackage;
import org.eclipse.rmf.reqif10.xsd.SOURCEType;
import org.eclipse.rmf.reqif10.xsd.SPECOBJECT;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SOURCE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.SOURCETypeImpl#getSPECOBJECTREF <em>SPECOBJECTREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SOURCETypeImpl extends EObjectImpl implements SOURCEType {
	/**
	 * The cached value of the '{@link #getSPECOBJECTREF() <em>SPECOBJECTREF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPECOBJECTREF()
	 * @generated
	 * @ordered
	 */
	protected SPECOBJECT sPECOBJECTREF;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SOURCETypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqifPackage.Literals.SOURCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECOBJECT getSPECOBJECTREF() {
		return sPECOBJECTREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPECOBJECTREF(SPECOBJECT newSPECOBJECTREF) {
		SPECOBJECT oldSPECOBJECTREF = sPECOBJECTREF;
		sPECOBJECTREF = newSPECOBJECTREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqifPackage.SOURCE_TYPE__SPECOBJECTREF, oldSPECOBJECTREF, sPECOBJECTREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReqifPackage.SOURCE_TYPE__SPECOBJECTREF:
				return getSPECOBJECTREF();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ReqifPackage.SOURCE_TYPE__SPECOBJECTREF:
				setSPECOBJECTREF((SPECOBJECT)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ReqifPackage.SOURCE_TYPE__SPECOBJECTREF:
				setSPECOBJECTREF((SPECOBJECT)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ReqifPackage.SOURCE_TYPE__SPECOBJECTREF:
				return sPECOBJECTREF != null;
		}
		return super.eIsSet(featureID);
	}

} //SOURCETypeImpl
