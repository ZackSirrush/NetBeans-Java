package bonne.ice;

import java.util.Scanner;

public class Vendedores { //Clase vendedores
    
    Scanner leer = new Scanner(System.in);  //Inicia el scanner para ingresar datos
    
    public void IngresarVendedores (){ 
        int vend; //Inica variables locales
        String nombre;
        
        System.out.println("Digite la cantidad de vendedores que desea ingresar: ");
        
        vend=leer.nextInt(); //Solicitar la cantidad de vendedores que tendrá el arreglo
        leer.nextLine();
        
        String [] vendedores = new String [vend]; //Inicio del arreglo de tipo String
        
        for(int i=0;i<vendedores.length;i++){ //Ciclo for para solicitar nombres del arreglo
            System.out.println("Ingrese el nombre del vendedor: ");
            nombre=leer.nextLine();
            vendedores[i]=nombre;
        }
        System.out.println("Vendedores");//Imprime título de la tabla
        for (String vendedore : vendedores) {
            System.out.println(vendedore);//Imprime los vendedores del arreglo
        }
    }
}
