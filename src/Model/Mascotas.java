package Model;

public class Mascotas {

    private String nombre;
    private String nombreHumano;
    private boolean esPerro;
    private int edad;
    private Razas raza;
    private boolean vacunasAlDia;
    private boolean comeBalanceado;
    private boolean tieneAlergias;

    public Mascotas(String nombre, String nombreHumano, boolean esPerro, int edad, Razas raza, boolean vacunasAlDia, boolean comeBalanceado, boolean tieneAlergias) {
        this.nombre = nombre;
        this.nombreHumano = nombreHumano;
        this.esPerro = esPerro;
        this.edad = edad;
        this.raza = raza;
        this.vacunasAlDia = vacunasAlDia;
        this.comeBalanceado = comeBalanceado;
        this.tieneAlergias = tieneAlergias;
    }

    public Mascotas() {
    }

    public Mascotas(String nombre, String nombreHumano, int edad, Razas raza) {
        this.nombre = nombre;
        this.nombreHumano = nombreHumano;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreHumano() {
        return nombreHumano;
    }

    public void setNombreHumano(String nombreHumano) {
        this.nombreHumano = nombreHumano;
    }

    public boolean isEsPerro() {
        return esPerro;
    }

    public void setEsPerro(boolean esPerro) {
        this.esPerro = esPerro;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Razas getRaza() {
        return raza;
    }

    public void setRaza(Razas raza) {
        this.raza = raza;
    }

    public boolean isVacunasAlDia() {
        return vacunasAlDia;
    }

    public void setVacunasAlDia(boolean vacunasAlDia) {
        this.vacunasAlDia = vacunasAlDia;
    }

    public boolean isComeBalanceado() {
        return comeBalanceado;
    }

    public void setComeBalanceado(boolean comeBalanceado) {
        this.comeBalanceado = comeBalanceado;
    }

    public boolean isTieneAlergias() {
        return tieneAlergias;
    }

    public void setTieneAlergias(boolean tieneAlergias) {
        this.tieneAlergias = tieneAlergias;
    }
}
