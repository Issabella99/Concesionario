package Vehiculos;

import Vehiculos.Tipos.TipoMarca;

public class Particular extends Vehiculo{
    public Particular(TipoMarca marca, int modelo, String placa, String color, int precio) {
        super(marca, modelo, placa, color, precio);
    }
}
