package Model;

public class Razas {

    private int idRaza;
    private String nombreRaza;
    private String origenRaza;

    public Razas(int idRaza, String nombreRaza, String origenRaza) {
        this.idRaza = idRaza;
        this.nombreRaza = nombreRaza;
        this.origenRaza = origenRaza;
    }

    public Razas() {
    }

    public int getIdRaza() {
        return idRaza;
    }

    public void setIdRaza(int idRaza) {
        this.idRaza = idRaza;
    }

    public String getNombreRaza() {
        return nombreRaza;
    }

    public void setNombreRaza(String nombreRaza) {
        this.nombreRaza = nombreRaza;
    }

    public String getOrigenRaza() {
        return origenRaza;
    }

    public void setOrigenRaza(String origenRaza) {
        this.origenRaza = origenRaza;
    }
}
