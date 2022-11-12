package Personas;

import Personas.tipos.TipoCliente;
import Personas.tipos.tipoDocumento;

public class Cliente extends Personas {

    private TipoCliente tipoCliente;

    public Cliente(String nombre, int edad, tipoDocumento tipoDocumento, String documento, String telefono, String direccion) {
        super(nombre, edad, tipoDocumento, documento, telefono, direccion);
    }
}
