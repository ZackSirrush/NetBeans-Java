package bonne.ice;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class BonneIce {

    public static void main(String[] args) {
        
        int out=0,opc; //Variables para ciclo switch-case y do while
        Scanner leer = new Scanner(System.in); //Crear scanner para ingreso de datos
        Vendedores vend = new Vendedores(); //crear objeto vend y car
        Cargas car = new Cargas(); 
        System.out.println("Bienvenido");//Mensaje de bienvenida 
        
        do{ //Ciclo do-while mientras out sea menor o igual a 2
            System.out.println("Por favor seleccione que desea hacer: ");
            System.out.println("1.Ingresar y mostrar vendedores\n2.Capturar, mostrar y obtener totales de cargas del vendedor"
                    + "\n3.Salir del programa"); //Despliega menú de opciones
            opc=leer.nextInt(); //recibe entrada de datos para el switch case
            switch(opc){
                case 1: vend.IngresarVendedores();//Inicializa el objeto vend
                    break;
                case 2: car.capturarCargas();//Inicializa el objeto car
                    break;
                case 3: out=2;//Establece out = 2 para que al ingresar el caso 3 el usuario salga del programa
                    break;
                default: JOptionPane.showMessageDialog(null,"Opción no válida"); //Muestra una ventana emergente con el mensaje
            }    
        }while(out<=1); //Fin del ciclo do-while
    }
}
