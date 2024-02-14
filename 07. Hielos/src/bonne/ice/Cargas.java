package bonne.ice;

import java.util.Scanner;

public class Cargas {
    
    Scanner leer = new Scanner(System.in); //Inicia el scanner para ingresar datos
    
    public void capturarCargas(){
        int vend; //Declara variable vend para iniciar calcular las filas que tendrá la matríz
        System.out.println("Digite la cantidad de vendedores registrados: ");
        vend=leer.nextInt(); //recibe la cantidad de vendedores
        int cargas [][]=new int [vend][4]; //Implementaciónm del arreglo 
        
        for(int i=0;i<cargas.length;i++){ //bulce for para introducir los elementos de la matríz
            for(int j=0;j<cargas[i].length;j++){
                System.out.println("Introduzca el elemento ["+i+","+j+"]");
                cargas[i][j]=leer.nextInt();
            }
        }
        System.out.println("sencillo/doble/BonneIcezote/Mega");//Imprime el nombre de columnas
        for(int i=0;i<cargas.length;i++){ //bucle for para imprimir la matriz multidimensional
            for(int j=0;j<cargas[i].length;j++){
                System.out.print(cargas[i][j]+"       ");//Imprime la matriz
            }
            System.out.println();//salto de línea
        }
        System.out.println(); //salto de línea
        for(int i = 0;i<cargas[0].length;i++){
            int sumc=0; //suma las columnas de la matríz
            for(int j=0;j<cargas.length;j++){
                sumc=sumc+cargas[j][i];
            }
            System.out.println("La suma de los valores de la columna "+(i+1)+" es: "+sumc); //Imprime la suma de cada columna
        }
        System.out.println();//Salto de línea
    }
}