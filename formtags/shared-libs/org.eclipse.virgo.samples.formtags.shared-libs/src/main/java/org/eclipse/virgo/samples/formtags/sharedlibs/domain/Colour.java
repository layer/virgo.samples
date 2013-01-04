/*******************************************************************************
 * Copyright (c) 2008, 2010 VMware Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   VMware Inc. - initial contribution
 *******************************************************************************/

package org.eclipse.virgo.samples.formtags.sharedlibs.domain;



import org.springframework.core.enums.ShortCodedLabeledEnum;



/**

 * Simple enumeration for common colors.

 *


 */

public class Colour extends ShortCodedLabeledEnum {





    public static final Colour RED = new Colour(0, "RED");

    public static final Colour GREEN = new Colour(1, "GREEN");

    public static final Colour BLUE = new Colour(2, "BLUE");





    private Colour(int code, String label) {

        super(code, label);

    }



}

