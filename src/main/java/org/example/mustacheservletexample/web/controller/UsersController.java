package org.example.mustacheservletexample.web.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.MustacheFactory;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.mustacheservletexample.domain.entities.User;

@WebServlet(value = "/users")
public class UsersController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        MustacheFactory mf = new DefaultMustacheFactory();
        var f = mf.compile("templates/users.html");
        var users = List.of(
                new User("Anton", "Antonov", "German", 32),
                new User("Arca", "Vuchich", "Bulgary", 31),
                new User("Gera", "Peterov", "Rusland", 33)
        );
        f.execute(response.getWriter(), Map.of("users", users));
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
