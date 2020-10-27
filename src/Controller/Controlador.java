package Controller;

import Model.DAO.MascotasDB;
import Model.DAO.RazasDB;
import Model.Mascotas;
import Model.Razas;
import java.util.ArrayList;

public class Controlador {

    static ArrayList<Razas> razas = RazasDB.selectRazas();


    public static String[] getRazasST() {
        int i = 0;
        String nombres[] = new String[razas.size()];
        for (Razas r : razas) {
            nombres[i] = r.getNombreRaza();
            i++;
        }
        return nombres;
    }

    public static Razas consultaRaza(String comboRazas) {

        Razas raza = new Razas();

        return raza;
    }

    public static void ingresoMascota(Razas raza, String nombreMascota, String nombreHumano, String tipo, int edad, String[] extras) {

        MascotasDB.insertMascota(raza, nombreMascota, nombreHumano, tipo, edad, extras);
    }

    public static ArrayList<Mascotas> consultaMascotas(String letras) {

        ArrayList<Mascotas> mascotas = MascotasDB.spver_mascotas(letras);
        return mascotas;
    }
}
