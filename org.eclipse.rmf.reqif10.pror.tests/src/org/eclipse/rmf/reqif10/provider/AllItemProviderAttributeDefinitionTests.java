/*******************************************************************************
 * Copyright (c) 2011, 2012 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Lukas Ladenberger - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.provider;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ AttributeDefinitionBooleanTest.class,
		AttributeDefinitionDateTest.class,
		AttributeDefinitionEnumerationTest.class,
		AttributeDefinitionIntegerTest.class,
		AttributeDefinitionRealTest.class, AttributeDefinitionStringTest.class })
public class AllItemProviderAttributeDefinitionTests {

}
