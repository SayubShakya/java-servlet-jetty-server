package com.sayub.servlets;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "nextServlet", urlPatterns = "/next")
public class NextServlet extends HttpServlet {

    private static final Logger log = LoggerFactory.getLogger(NextServlet.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        log.info("doGet has been called for /next");
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        out.println( "{\"jankari\": \"Yo arko API\"}");
    }
}