package com.sayub;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class Application {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);

        WebAppContext context = new WebAppContext();
        context.setContextPath("/");
        
        // Point to your webapp resources (if you have web.xml or static files)
        context.setResourceBase("src/main/webapp"); 
        
        // Enable annotation scanning for Servlet 3.0+ annotations
        context.setConfigurationDiscovered(true);
        
        // Enable scanning of classes in this project (including annotated servlets)
        context.setAttribute(
            "org.eclipse.jetty.server.webapp.ContainerIncludeJarPattern", 
            ".*/target/classes/.*"); // Adjust path to your compiled classes

        server.setHandler(context);
        server.start();
        server.join();
    }
}