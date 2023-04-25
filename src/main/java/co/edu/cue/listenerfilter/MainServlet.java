package co.edu.cue.listenerfilter;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "MainServlet", value = "/main")
public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String mensajeRequest = (String) req.getAttribute("mensaje");  // me da el mensaje de guardando algun valor para el request
        String mensajeApp = (String) getServletContext().getAttribute("mensaje"); // me da el mensaje de Hola a todos desde la application
        System.out.println("asdsad");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
