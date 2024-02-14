package controlescolar;

import java.util.Scanner;

public class Calificaciones  {
    
    //Atributos
    float calif []=new float[7];//crea el arreglo calif para las calificaciones de 7 alumnos como se indica
    Scanner datos = new Scanner(System.in); //Crear escaner para ingresar datos
    float sumaCalif=0, prom;  //Declaracion de variables de clase     
    float mayor,menor;
    
    //Métodos
    public void ingresarCalif(){ //Solicita al usuario ingresar calificaciones
        System.out.println("Ingrese la calificación siete alumnos: ");
        for(int i=0;i<7;i++){ //repite el ciclo hasta alcanzar el dato máximo del arreglo
            System.out.print((i+1)+". Digite una calificación: ");//Imprime el usuario a ingresar (1,2,3...)
            calif[i]=datos.nextFloat(); //solicita la calificación del arreglo en cada posicion
            if(calif[i]>=0){
                sumaCalif +=calif[i];//realiza la suma de los datos introducidos en el arreglo
            }
        }
    }
    public void calcularPromedio(){//Método para calcular el promedio
        if(sumaCalif==0){ //Si la suma calculada en el método anterior es igual a 0
            System.out.println("Imposible calcular el promedio"); //muestra el mensaje
        }
        else{ //caso contrario
            prom=sumaCalif/7;//calcula el promedio dividiendo la suma de los datos entre el número de datos del arreglo
            System.out.println("Promedio: "+prom);//muestra el promedio del grupo analizado
        }
    }
    public void califMayorMenor(){ //Determina el número mayor y menor del arreglo
        mayor = menor = calif[0]; //Inicializa las variables como todas por igual
        for(int i=0;i<calif.length;i++){ //se repite mientras i sea menor al numero de datos del array
            if(calif[i]>mayor){ //si el dato n del arreglo es mayor
                mayor=calif[i]; //se guarda como mayor
            }
            else if(calif[i]<menor){ //de lo contrario, si el dato n del arreglo es menor
               menor=calif[i];//se guarda como menor
            }
        }
        System.out.println("Calificacion mayor: "+mayor);
        System.out.println("Calificacion menor: "+menor);//Imprime el número mayor y menor del arreglo
    }
}