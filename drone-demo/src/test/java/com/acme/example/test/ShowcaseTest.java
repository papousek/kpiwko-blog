package com.acme.example.test;

import java.io.File;
import java.net.URL;

import org.jboss.arquillian.ajocado.framework.AjaxSelenium;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class ShowcaseTest {

    @ArquillianResource
    URL contextPath;

    @Deployment(testable = false)
    public static WebArchive createTestArchive() {

        WebArchive war = ShrinkWrap.createFromZipFile(WebArchive.class, new File("target/showcase.war"));
        return war;
    }

    @Test
    public void xhrAjocadoTest(@Drone AjaxSelenium ajocado) {
        ajocado.open(contextPath);
    }

}
