package Model.DAO;

import Controller.Conexion;
import Controller.Controlador;
import Model.Mascotas;
import Model.Razas;

import java.sql.*;
import java.util.ArrayList;

public class MascotasDB {
    public static void insertMascota(Razas raza, String nombreMascota, String nombreHumano, String tipo, int edad, String[] extras) {
    }

    public static ArrayList<Mascotas> spver_mascotas(String letras) {

        ArrayList<Mascotas> mascotas = new ArrayList<Mascotas>();
        String nombreMascota;
        String nombreHumano;
        int edad = 0;
        String raza;

        try {
            Connection conn = Conexion.getConnection();
            CallableStatement stmt = conn.prepareCall("{call spver_mascotas (?, ?, ?, ?, ?)}");
            stmt.setString(1, letras);
            stmt.registerOutParameter(2, Types.VARCHAR);
            stmt.registerOutParameter(3, Types.VARCHAR);
            stmt.registerOutParameter(4, Types.INTEGER);
            stmt.registerOutParameter(5, Types.VARCHAR);
            ResultSet rs = stmt.executeQuery();

            while(rs.next()) {
               nombreMascota = stmt.getString(2);
               nombreHumano = stmt.getString(3);
               edad = Integer.parseInt(stmt.getString(4));
               raza = stmt.getString(5);

               Razas razaAux = Controlador.consultaRaza(raza);

               Mascotas mascota = new Mascotas(nombreMascota, nombreHumano, edad, razaAux);
               mascotas.add(mascota);
            }
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return mascotas;
    }

    public static void updateNombreHumano(String nombreMascota, String registro) {

        try {

            Connection conn = Conexion.getConnection();
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("UPDATE Mascotas SET nombreHumano='" + registro + "' WHERE nombreMascota=" + nombreMascota + "");

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateEdad(String nombreMascota, String registro) {

        try {

            Connection conn = Conexion.getConnection();
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("UPDATE Mascotas SET edad=" + Integer.parseInt(registro) + " WHERE nombreMascota=" + nombreMascota + "");

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
