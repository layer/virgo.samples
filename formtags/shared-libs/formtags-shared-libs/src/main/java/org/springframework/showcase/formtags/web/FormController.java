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

package org.springframework.showcase.formtags.web;



import org.springframework.core.enums.StaticLabeledEnumResolver;

import org.springframework.showcase.formtags.domain.Colour;

import org.springframework.showcase.formtags.domain.Country;

import org.springframework.showcase.formtags.domain.User;

import org.springframework.showcase.formtags.service.UserManager;

import org.springframework.ui.ModelMap;

import org.springframework.validation.Errors;

import org.springframework.web.bind.ServletRequestDataBinder;

import org.springframework.web.bind.ServletRequestUtils;

import org.springframework.web.servlet.mvc.SimpleFormController;



import javax.servlet.http.HttpServletRequest;

import java.beans.PropertyEditorSupport;

import java.util.Map;



/**

 * The central form controller for this showcase application.

 *


 */

public class FormController extends SimpleFormController {



	private UserManager userManager;





	/**

	 * Sets the {@link UserManager} to which this presentation component

	 * delegates in order to perform complex business logic.

	 * @param userManager the {@link UserManager} to which this presentation

	 *                    component delegatesin order to perform complex business logic

	 */

	public void setUserManager(UserManager userManager) {

		this.userManager = userManager;

	}





    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {

        binder.registerCustomEditor(Country.class, new CountryEditor(this.userManager));

        binder.registerCustomEditor(Colour.class, new PropertyEditorSupport() {

            public void setAsText(String string) throws IllegalArgumentException {

                Short code = new Short(string);

                StaticLabeledEnumResolver resolver = new StaticLabeledEnumResolver();

                setValue(resolver.getLabeledEnumByCode(Colour.class, code));

            }

        });

    }



    protected Map referenceData(HttpServletRequest request, Object command, Errors errors) throws Exception {

        return new ModelMap(this.userManager.findAllCountries())

            .addObject("skills", getSkills())

            .addObject(this.userManager.findAll());

    }



    protected Object formBackingObject(HttpServletRequest request) throws Exception {

        int id = ServletRequestUtils.getRequiredIntParameter(request, "id");

        return this.userManager.findById(new Integer(id));

    }



    protected void doSubmitAction(Object managedResource) throws Exception {

        this.userManager.save((User) managedResource);

    }





    private String[] getSkills() {

        return new String[]{

                "Potions",

                "Herbology",

                "Quidditch"

        };

    }



}

