//Option 1:  extends HttpServlet
//http://localhost:8080/tomcat_servlet_api_war_exploded/first
package com.sayub.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FirstServlet", urlPatterns = "/first")
public class FirstServlet extends HttpServlet {

    private static final Logger log = LoggerFactory.getLogger(FirstServlet.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        log.info("doGet has been called for /first");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Welcome to first servlet by tomcat server</h1>");
    }
}

//or -- Option2:  FirstServlet implements Servlet
//package com.sayub;
//
//import java.io.*;
//import jakarta.servlet.*;
//import jakarta.servlet.annotation.*;
//
//@WebServlet(name = "firstServlet", value = "/first")
//public class FirstServlet implements Servlet {
//    private String message;
//    private ServletConfig config;
//
//    public void init(ServletConfig config) throws ServletException {
//        this.config = config;
//        message = "Welcome to first servlet by tomcat server!";
//    }
//
//    public ServletConfig getServletConfig() {
//        return config;
//    }
//
//    public void service(ServletRequest request, ServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html");
//
//        // Hello
//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>" + message + "</h1>");
//        out.println("</body></html>");
//    }
//
//    public String getServletInfo() {
//        return "HelloServlet";
//    }
//
//    public void destroy() {
//        // cleanup code if needed
//    }
//}