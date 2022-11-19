import Personas.Empleado;
import Personas.tipos.TipoPermiso;
import Personas.tipos.tipoDocumento;
import Vehiculos.Particular;
import Vehiculos.Publico;
import Vehiculos.Tipos.TipoMarca;
import Vehiculos.Tipos.TipoPublico;
import Vehiculos.Vehiculo;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Empleado> empleados = new ArrayList<>();
    private static ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public static void main(String[] args) {
        generarEmpleados();
        menuPrincipal();
    }

    private static void menuPrincipal() {
        System.out.println("         ****************************************************************");
        System.out.println("********************************CONCESIONARIO UDEV********************************");
        System.out.println("         ****************************************************************");
        String mensaje = "Elija una opcion: \n" +
                "1. Venta de vehiculo \n" +
                "2, Ingreso de vehiculo \n" +
                "3. salir";
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        switch (opcion) {
            case 1:
                ventaVehiculo();
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                break;
        }
    }

    private static void generarEmpleados() {
        //Primer empleado
        Empleado miEmpleadito1 = new Empleado("Zanguetsu", 19, tipoDocumento.CEDULA, "123456",
                "3111234567", "calle 0 #1-13");
        miEmpleadito1.setTipoPermiso(TipoPermiso.VENTA);

        //Segundo empleado
        Empleado miEmpleadito2 = new Empleado("Manuel", 21, tipoDocumento.CEDULA, "123756",
                "3231234567", "calleo 10 #1-23");
        miEmpleadito2.setTipoPermiso(TipoPermiso.COMPRA);

        //Tercer empleado
        Empleado miEmpleadito3 = new Empleado("Juliana", 20, tipoDocumento.CEDULA, "176556",
                "3167234567", "calle 26c #15-17");
        miEmpleadito3.setTipoPermiso(TipoPermiso.TODOS);

        //Cuarto empleado
        Empleado miEmpleadito4 = new Empleado("Cristian", 18, tipoDocumento.CEDULA, "8765432243",
                "31012345670", "calle 0 #123-12");
        miEmpleadito4.setTipoPermiso(TipoPermiso.VENTA);

        empleados.add(miEmpleadito1);
        empleados.add(miEmpleadito2);
        empleados.add(miEmpleadito3);
        empleados.add(miEmpleadito4);

    }

    private static void ventaVehiculo() {
        if (vehiculos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error, no hay vehiculos en lista,", "VEHICULOS NO DISPONIBLES",
                    JOptionPane.ERROR_MESSAGE);
            menuPrincipal();
        } else {
            if (preguntaTipoVehiculo()){
                int vehi = mostrarVehiculosParticulares();
                vehiculos.remove(vehi);
                mostrarTodosLosVehiculos();
            } else {

            }

        }
    }

    private static void ingresoVehiculo() {
        TipoMarca marca = null;
        int modelo = 0;
        String placa = "";
        String color = "";
        int precio = 0;
        if (preguntaTipoVehiculo()) {
            Particular particular = new Particular(elegirMarcaVehiculo(),
                    Integer.parseInt(JOptionPane.showInputDialog("ingrese el modelo")),
                    JOptionPane.showInputDialog("ingrese la placa"),
                    JOptionPane.showInputDialog("ingrese el color"),
                    Integer.parseInt(JOptionPane.showInputDialog("ingrese el precio")));
        } else {
            Publico publico = new Publico(elegirMarcaVehiculo(),
                    Integer.parseInt(JOptionPane.showInputDialog("ingrese el modelo")),
                    JOptionPane.showInputDialog("ingrese la placa"),
                    JOptionPane.showInputDialog("ingrese el color"),
                    Integer.parseInt(JOptionPane.showInputDialog("ingrese el precio")));
            publico.setNumeroPlanilla(
                    Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de planilla")));
            publico.setTipoPublico(
                    elegirTipoPublico()
            );
            vehiculos.add(publico);
        }
    }

    private static boolean preguntaTipoVehiculo() {
        int tipo = Integer.parseInt(JOptionPane.showInputDialog(
                "¿que tipo de vehiculo desea? \n" +
                        "1. particular \n" +
                        "2. publico"
        ));
        return tipo == 1;
    }

    private static TipoPublico elegirTipoPublico() {
        int tipo = Integer.parseInt(JOptionPane.showInputDialog("que tipo de vehiculo desea\n" +
                "1. taxi\n" +
                "2. bus"));

        TipoPublico miTipito = null;

        switch (tipo) {
            case 1:
                miTipito = TipoPublico.TAXI;
                break;
            case 2:
                miTipito = TipoPublico.BUS;
                break;
            default:
                JOptionPane.showMessageDialog(null, "opcion no valida",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return miTipito;
    }

    private static TipoMarca elegirMarcaVehiculo() {
        TipoMarca miMarquita = null;

        int opcion = Integer.parseInt(
                JOptionPane.showInputDialog("ingresar marca: \n" +
                        "1. KIA \n" +
                        "2. CHEVROLET \n" +
                        "3. RENAULT \n" +
                        "4. TOYOTA \n" +
                        "5. NISSAN")
        );
        switch (opcion) {
            case 1:
                miMarquita = TipoMarca.KIA;
                break;
            case 2:
                miMarquita = TipoMarca.CHEVROLET;
                break;
            case 3:
                miMarquita = TipoMarca.RENAULT;
                break;
            case 4:
                miMarquita = TipoMarca.TOYOTA;
                break;
            case 5:
                miMarquita = TipoMarca.NISSAN;
                break;
            default:
                JOptionPane.showMessageDialog(null, "opcion no valida",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return miMarquita;
    }
    private static void mostrarTodosLosVehiculos(){
        String mensaje = "";
        for (Vehiculo vehiculo: vehiculos){
            mensaje = mensaje + vehiculo.getColor()+"\n"+ vehiculo.getPlaca() +"\n"+ vehiculo.getMarca() +"\n"+ vehiculo.getModelo()+"\n";
        }
        JOptionPane.showMessageDialog(null,mensaje);

    }

    private static int mostrarVehiculosParticulares(){
        int indice = 0;

        String mensaje = "";
        for (int i = 0; i < vehiculos.size(); i++){

            if (vehiculos.get(i)instanceof Particular){

                mensaje= mensaje + vehiculos.get(i).getModelo()+"\n"+ vehiculos.get(i).getColor() +"\n"+ vehiculos.get(i).getPlaca() +"\n"+ vehiculos.get(i).getPrecio()+"\n";
            }
        }
        indice = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        return indice;
    }
}