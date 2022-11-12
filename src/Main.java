import Personas.Empleado;
import Personas.tipos.TipoPermiso;
import Personas.tipos.tipoDocumento;
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

        Empleado miEmpleadito2= new Empleado("Leidy", 39, tipoDocumento.CEDULA,
                "0234567809", "3111234587", "Calle 10 # 1-10");
        miEmpleadito1.setTipoPermiso(TipoPermiso.COMPRA);

        Empleado miEmpleadito3= new Empleado("Jesus", 59, tipoDocumento.CEDULA,
                "1111111111", "2345676543", "Calle 3 # 1-10");
        miEmpleadito1.setTipoPermiso(TipoPermiso.TODOS);

        empleados.add(miEmpleadito1);
        empleados.add(miEmpleadito2);
        empleados.add(miEmpleadito1);
    }

    public static void menuPrincipal(){
        System.out.println("*****************************************************");
        System.out.println("********C O N C E S I O N A R I O   U D E V *********");
        System.out.println("*****************************************************");

        String mensaje = "Elija una opcion \n"
                + "1. Venta de vehiculo \n"
                + "2. Ingreso de Vehiculo\n"
                + "3. Salir \n";

        int opcion = Integer.parseInt(JOptionPane.showInputDialog(mensaje));

    }


}
