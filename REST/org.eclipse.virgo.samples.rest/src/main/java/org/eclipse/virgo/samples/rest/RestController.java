/*******************************************************************************
 * Copyright (c) 2013 VMware Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   VMware Inc. - initial contribution
 *******************************************************************************/

package org.eclipse.virgo.samples.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <p>
 * TODO Document AppController
 * </p>
 *
 * <strong>Concurrent Semantics</strong><br />
 *
 * TODO Document concurrent semantics of AppController
 *
 */
@Controller
@RequestMapping("/users")
public final class RestController {

    @RequestMapping(value="/{userId}", method = RequestMethod.GET)
    public String getUser(@PathVariable("userId") String userId) {
        return null;
    }

}
