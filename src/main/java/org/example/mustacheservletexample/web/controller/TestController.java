package org.example.mustacheservletexample.web.controller;

import java.io.IOException;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.MustacheFactory;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.mustacheservletexample.domain.entities.User;

@WebServlet(value = "/test")
public class TestController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        MustacheFactory mf = new DefaultMustacheFactory();
        var f = mf.compile("templates/bootstrap/profile.html");
        var user = new User("Anton", "Antonov", "Germany", 32);

        f.execute(response.getWriter(), user);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
    }


    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) {
    }


    @Override
    protected void doPatch(HttpServletRequest request, HttpServletResponse response) {
    }


    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) {
    }

}
