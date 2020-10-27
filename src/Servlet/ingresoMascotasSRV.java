package Servlet;

import Controller.Controlador;
import Model.Razas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ingresoMascotasSRV")
public class ingresoMascotasSRV {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nombreMascota = request.getParameter("nombreMascota");
        String nombreHumano = request.getParameter("nombreHumano");
        String tipo = request.getParameter("tipo");
        int edad = Integer.parseInt(request.getParameter("edad"));
        String [] extras = request.getParameterValues("extras");
        String comboRazas = request.getParameter("comboRazas");

        Razas raza = Controlador.consultaRaza(comboRazas);

            Controlador.ingresoMascota(raza, nombreMascota, nombreHumano,tipo, edad, extras);

            RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/ingresoMascotas.jsp");
            dispatcher.forward(request, response);

            PrintWriter out = response.getWriter();

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
