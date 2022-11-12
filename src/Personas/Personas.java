package Personas;

import Personas.tipos.tipoDocumento;

public class Personas {

    private String nombre;
    private int edad;
    private tipoDocumento TipoDocumento;
    private String documento;
    private String telefono;
    private String direccion;

    public Personas(String nombre, int edad, tipoDocumento tipoDocumento, String documento, String telefono, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        TipoDocumento = tipoDocumento;
        this.documento = documento;
        this.telefono = telefono;
        this.direccion = direccion;
    }
}
