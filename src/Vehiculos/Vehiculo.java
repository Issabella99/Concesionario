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

    public TipoMarca getMarca() {
        return marca;
    }

    public void setMarca(TipoMarca marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    private TipoMarca marca;
    private int modelo;
    private String placa;
    private String color;
    private int precio;
}
