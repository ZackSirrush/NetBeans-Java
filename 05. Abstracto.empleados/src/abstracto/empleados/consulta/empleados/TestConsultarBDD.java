package abstracto.empleados.consulta.empleados;

import java.util.Scanner;
import Conexion.BDD.*;//Importar clases desde paquete de mismo nombre

public class TestConsultarBDD {
    public void main2 (String[] args){
        Scanner entrada=new Scanner(System.in); //Inicia un scanner para responder el switch case en consola
        ConexionMySQL MySQL=new ConexionMySQL();//Objeto nuevo de clase
        
        int opc,out;
        System.out.println("***********************************************************\n"+
                           "***********************************************************\n");
        do{
        System.out.println("Qué desea hacer?\n1.Establecer conexión\n2.Insertar un registro\n3.Cerrar conexión");
        opc=entrada.nextInt();//scaner de opciones
        switch(opc){//Inicio del switch case
            case 1: MySQL.establecerConexion();//Métodos de la clase conexionMySQL
            break;
            case 2: MySQL.insertar();
            break;
            case 3: MySQL.cerrarConexion(false);
            break;
            default: System.out.println("Opción inválida");
        }
            System.out.println("*******\n¿Desea salir?\n1.No\n2.Si\n******");//Permite repetir el proceso del programa
            out=entrada.nextInt();//Recibe decisión de usuario.
        }while (out<=1);//Condicion while
    }
}
