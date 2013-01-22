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
import org.springframework.web.bind.annotation.ResponseBody;

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
@RequestMapping("/rest")
public final class RestController {

    @RequestMapping(value="/users/{userId}", method = RequestMethod.GET)
    @ResponseBody
    public String getUser(@PathVariable("userId") String userId) {
        return userId;
    }

}
