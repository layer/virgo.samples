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

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * {@link RestController} is a Spring MVC controller class which handles REST requests.
 * </p>
 * Drive this, for example, as follows:
 * 
 * <pre>
 * curl -i -H "Accept: application/json" http://localhost:8080/rest/users/roy
 * </pre>
 * 
 * The implementation is deliberately primitive. Please consult the following for more information:
 * <p/>
 * <ul>
 * <li><a href="http://www.ics.uci.edu/~fielding/pubs/dissertation/top.htm">Architectural Styles and the Design of
 * Network-based Software Architectures</a> (Roy Fielding's REST dissertation)</li>
 * <li><a href="http://static.springsource.org/spring/docs/3.1.0.RELEASE/reference/html/mvc.html">Spring Web MVC
 * framework<a/></li>
 * <li><a href="http://static.springsource.org/spring-roo/reference/html/base-json.html">Spring Roo JSON Add-On</a></li>
 * </ul>
 * <p/>
 * 
 * <strong>Concurrent Semantics</strong><br />
 * 
 * Thread safe.
 * 
 */
@Controller
public final class RestController {

    @RequestMapping(value = "/users/{userId}", method = RequestMethod.GET, produces="application/json")
    @ResponseBody
    public ResponseEntity<String> getUser(@PathVariable("userId") String userId) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json; charset=utf-8");
        if ("roy".equals(userId)) {
            return new ResponseEntity<String>("{ \"name\" : \"Roy T. Fielding\", \"site\" : \"http://roy.gbiv.com/\" }", headers, HttpStatus.OK);
        } else {
            return new ResponseEntity<String>("", headers, HttpStatus.NOT_FOUND);
        }
    }

}
