/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.as.quickstarts.html5rest;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * A simple REST service which is able to say hello to someone using HelloService Please take a look at the web.xml where JAX-RS
 * is enabled And notice the @PathParam which expects the URL to contain /json/David or /xml/Mary
 * 
 */

@Path("/")
public class HelloWorld {
    @Inject
    HelloService helloService;

	private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);
	
    @POST
    @Path("/json/{name}")
    @Produces("application/json")
    public String getHelloWorldJSON(@PathParam("name") String name) {
    	
        String JBOSS_SERVER_LOG_DIR=System.getProperty("jboss.server.log.dir");
		
        logger.trace("This is a TRACE log. jboss.server.log.dir is: "+JBOSS_SERVER_LOG_DIR);
    	logger.debug("This is a DEBUG log. We recieved name of {}.", name);
		logger.info("This is an INFO log");
		logger.warn("This is a WARN log");
		logger.error("This an ERROR log");
		
        String result="{\"result\":\"" + helloService.createHelloMessage(name) + "\"}";
        return result;
    }

    @POST
    @Path("/xml/{name}")
    @Produces("application/xml")
    public String getHelloWorldXML(@PathParam("name") String name) {
    	
    	String JBOSS_SERVER_LOG_DIR=System.getProperty("jboss.server.log.dir");
    	
        System.out.println("XML name: " + name);
		logger.debug("This is a DEBUG log");
		logger.error("This an ERROR log");
		logger.info("This is an INFO log");
		logger.trace("This is a TRACE log. jboss.server.log.dir is:  "+ JBOSS_SERVER_LOG_DIR);
		logger.warn("This is a WARN log");
        return "<xml><result>" + helloService.createHelloMessage(name) + "</result></xml>";
    }

}
