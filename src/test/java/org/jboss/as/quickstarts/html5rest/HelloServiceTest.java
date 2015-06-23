package org.jboss.as.quickstarts.html5rest;

import org.jboss.as.quickstarts.html5rest.HelloService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
* HelloService Tester. 
* 
* @author <Brad Thurber>
* @since <pre>Jun 23, 2015</pre> 
* @version 1.0 
*/ 
public class HelloServiceTest { 

    HelloService helloService=new HelloService();
    String helloMessage=helloService.createHelloMessage("Brad");
    String testHelloMessage="Hello Brad!";

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: createHelloMessage(String name) 
* 
*/ 
@Test
public void testCreateHelloMessage() throws Exception { 
    System.out.println("@Test CreateHelloMessage(): " + helloMessage + " = " + testHelloMessage);
    Assert.assertEquals(helloMessage, testHelloMessage);
} 


} 
