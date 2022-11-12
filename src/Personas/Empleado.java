package Personas;

import Personas.tipos.TipoPermiso;
import Personas.tipos.tipoDocumento;

public class Empleado extends Personas {

    private TipoPermiso tipoPermiso;


    public Empleado(String nombre, int edad, tipoDocumento tipoDocumento, String documento, String telefono, String direccion) {
        super(nombre, edad, tipoDocumento, documento, telefono, direccion);
    }


    public TipoPermiso getTipoPermiso() {
        return tipoPermiso;
    }

    public void setTipoPermiso(TipoPermiso tipoPermiso) {
        this.tipoPermiso = tipoPermiso;
    }
}
