package arraya1;

import java.util.Scanner; //Importar el scanner para entrada de datos

public class ArrayA1 {
    
    public static void main(String[] args) {
        
        int elem; //inicializar la variable que contará los vehículos a ingresar
        
        Scanner leer = new Scanner(System.in); //crear scanner
        
        System.out.println("Digite la cantidad de vehículos que desea ingresar: "); //Entrada de datos para el número de vehículos
        elem=leer.nextInt();
        leer.nextLine(); //Solución de error que se brincaba la segunda entrada de datos (marca)
        
        Vehiculoteorico Vehiculos[]=new Vehiculoteorico[elem];    //Creación del arreglo
        
        String marca; //Variables por utilizar
        String modelo;
        double VaCom;
        char tipo;
        double VaTot;
        
        for(int i=0;i<Vehiculos.length;i++){ //Inicio del ciclo repetitivo for mientras i sea menor que elem
            System.out.println("Ingrese la marca del vehículo: ");//Ingreso de datos por consola
            marca=leer.nextLine();
            System.out.println("Ingrese el modelo del vehículo: ");
            modelo=leer.nextLine();
            System.out.println("Ingrese el valor comercial del vehículo: ");
            VaCom=leer.nextDouble();
            System.out.println("Ingrese el tipo del vehículo: \nF=Familiar\nP=Público\nC=Carga");
            tipo=leer.next().charAt(0);
            leer.nextLine(); //Solución de error que se saltaba la marca del vehículo siguiente
            if (VaCom>=150001){ //Inicio de variable VaTot con un ciclo If-else
            VaTot=VaCom*1.20; //Indica que si un vehículo tiene un valor comercial mayor a $150,000 se le agrege
            }                 //20% de iva, de lo contrario solo el 16%
            else{
            VaTot=VaCom*1.16;
            }
            Vehiculos[i] = new Vehiculoteorico(marca,modelo,VaCom,tipo,VaTot); //Ingresa los valores al arreglo, siguiendo la estructura
        }
        for (Vehiculoteorico Vehiculo : Vehiculos) { //Imprime los valores del arreglo 
            System.out.println("Marca: "+Vehiculo.getMarca() + " , Modelo: " + Vehiculo.getModelo() + " , Valor comercial: " + Vehiculo.getVaCom() + " , Tipo: " + Vehiculo.getTipo() + " , Valor total: " + Vehiculo.getVaTot());
        }
    }
}
