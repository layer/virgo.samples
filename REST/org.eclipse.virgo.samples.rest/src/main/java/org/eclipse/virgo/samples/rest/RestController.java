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

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

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
 * <p/>
 * GET requests specify a user id, e.g.:
 * 
 * <pre>
 * GET /rest/users/roy HTTP/1.1
 * Accept: application/json
 * </pre>
 * 
 * whereas PUT requests specify a user id, a name, and a web site, e.g.:
 * 
 * <pre>
 * PUT /rest/users/glyn/Glyn%20Normington/underlap.blogspot.com HTTP/1.1
 * </pre>
 * 
 * Note: the web site parameter must not include "http://" since Tomcat rejects the proper encoding of this string.
 * </p>
 * you can use curl to drive this program as follows:
 * 
 * <pre>
 * curl -i -H "Accept: application/json" http://localhost:8080/rest/users/roy
 * curl -i -X PUT http://localhost:8080/rest/users/glyn/Glyn%20Normington/underlap.blogspot.com
 * curl -i -H "Accept: application/json" http://localhost:8080/rest/users/glyn
 * </pre>
 * 
 * The implementation is deliberately primitive. Please consult the following for more information:
 * <p/>
 * <ul>
 * <li><a href="http://en.wikipedia.org/wiki/Representational_state_transfer">Representational State Transfer</a> (Wikipedia article)
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

    private Map<String, Info> model = Collections.synchronizedMap(new HashMap<String, Info>());

    public RestController() {
        this.model.put("roy", new Info("Roy T. Fielding", "roy.gbiv.com"));
    }

    @RequestMapping(value = "/users/{userId}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public ResponseEntity<String> getUser(@PathVariable("userId") String userId) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json; charset=utf-8");
        Info info = model.get(userId);
        if (info != null) {
            return new ResponseEntity<String>(info.toJson(), headers, HttpStatus.OK);
        } else {
            return new ResponseEntity<String>("", headers, HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/users/{userId}/{name}/{site}", method = RequestMethod.PUT)
    public void putUser(@PathVariable("userId") String userId, @PathVariable("name") String name, @PathVariable("site") String site,
        HttpServletResponse httpServletResponse) {
        this.model.put(userId, new Info(name, site));
        httpServletResponse.setStatus(HttpServletResponse.SC_OK);
    }

    private class Info {

        private String name;

        private String site;

        Info(String name, String site) {
            this.name = name;
            this.site = site;
        }

        String toJson() {
            return "{ \"name\" : \"" + this.name + "\", \"site\" : \"http://" + this.site + "\" }";
        }
    }
}

