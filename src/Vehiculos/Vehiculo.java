package Vehiculos;

import Vehiculos.Tipos.TipoMarca;

public class Vehiculo {
    public Vehiculo(TipoMarca marca, int modelo, String placa, String color, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.color = color;
        this.precio = precio;
    }

    private TipoMarca marca;
    private int modelo;
    private String placa;
    private String color;
    private int precio;
}
