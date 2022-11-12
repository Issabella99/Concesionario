import Personas.Empleado;
import Personas.tipos.TipoPermiso;
import Personas.tipos.tipoDocumento;
import Vehiculos.Particular;
import Vehiculos.Tipos.TipoMarca;
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

    private static void generarEmpleados() {
        Empleado miEmpleadito1 = new Empleado("David", 19, tipoDocumento.CEDULA,
                "1234567809", "3111234567", "Calle 1 # 1-10");
        miEmpleadito1.setTipoPermiso(TipoPermiso.VENTA);

        Empleado miEmpleadito2 = new Empleado("Leidy", 39, tipoDocumento.CEDULA,
                "0234567809", "3111234587", "Calle 10 # 1-10");
        miEmpleadito1.setTipoPermiso(TipoPermiso.COMPRA);

        Empleado miEmpleadito3 = new Empleado("Jesus", 59, tipoDocumento.CEDULA,
                "1111111111", "2345676543", "Calle 3 # 1-10");
        miEmpleadito1.setTipoPermiso(TipoPermiso.TODOS);

        empleados.add(miEmpleadito1);
        empleados.add(miEmpleadito2);
        empleados.add(miEmpleadito1);
    }

    public static void menuPrincipal() {
        System.out.println("*****************************************************");
        System.out.println("********C O N C E S I O N A R I O   U D E V *********");
        System.out.println("*****************************************************");

        String mensaje = "Elija una opcion \n"
                + "1. Venta de vehiculo \n"
                + "2. Ingreso de Vehiculo\n"
                + "3. Salir \n";

        int opcion = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        switch (opcion) {

            case 1:
                break;
            case 2:
                break;
            case 3:
                break;

            default:
        }
    }

    private static void ventaVehiculo() {
        if (vehiculos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error; no hay vehiculos en la lista", "VEHICULOS NO DISPONIBLES", JOptionPane.ERROR_MESSAGE);


        } else {

        }

    }

    private static void ingresarVehiculo() {
        TipoMarca marca;
        int modelo;
        String placa;
        String color;
        int precio;
        if (preguntaTipoVehiculoParticular()) {
            Particular particular = new Particular();
        }

    }

    private static boolean preguntaTipoVehiculoParticular() {
        int tipo = Integer.parseInt(JOptionPane.showInputDialog(
                "Que tipo de vehiculo desea? \n"
                        + "1. Particular \n"
                        + "2. Publico"
        ));

        return tipo == 1;
    }

    private static TipoMarca elegirMarcaVehiculo() {
        TipoMarca miMarquita = null;
        int opcion = Integer.parseInt(
                JOptionPane.showInputDialog("Ingresar marca: \n")
                        + "1. KIA \n"
                        + "2. CHEVROLET \n"
                        + "3. RENAULT \n"
                        + "4. TOYOTA\n"
                        + "5. NISSAN \n"

        );
        switch (opcion){
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
                JOptionPane.showMessageDialog(null, "Opcion no valida", "Error"
                ,JOptionPane.ERROR_MESSAGE);
                elegirMarcaVehiculo();
        }
        return miMarquita;
    }
}
