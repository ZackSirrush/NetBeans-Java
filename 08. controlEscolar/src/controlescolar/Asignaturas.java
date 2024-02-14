package controlescolar;

import java.util.Scanner;

public class Asignaturas {
    //atributos
    String materia;
    String clave;
    Scanner leer = new Scanner(System.in); //Crear scanner para ingreso de datos
    
    //Métodos

    public Asignaturas(String materia, String clave) { //Constructor
        this.materia = materia;
        this.clave = clave;
    }

    public String getMateria() {//Getters y setters de las variables
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    public String datosAsignatura(){
        return materia+"  /  "+clave; //Retorno de datos a imprimir en el arreglo
    }
}    