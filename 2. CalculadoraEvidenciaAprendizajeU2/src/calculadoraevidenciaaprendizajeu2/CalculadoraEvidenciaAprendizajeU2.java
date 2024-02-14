package calculadoraevidenciaaprendizajeu2;

import javax.swing.JOptionPane;

public class CalculadoraEvidenciaAprendizajeU2 {
//En esta clase no hay atributos globales

//Métodos
public void Rectangulo(){//Método rectángulo
    double bRec,hRec; //variables
    bRec = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del rectángulo: "));//Ingresar parámetros para la operación
    hRec = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del rectángulo: "));
    double ARect=bRec*hRec; //Operación
    JOptionPane.showMessageDialog(null,"El área del rectángulo ingresado es: "+ARect); //Resultado
}
public void Triangulo(){//Método para calcular el área de un triángulo
    double bTri,hTri;  //declaración de variables  
    bTri = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del tiángulo: "));//Ingresar parámetros
    hTri = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del triángulo: "));
    double ATri=(bTri*hTri)/2;//Realizar operación
    JOptionPane.showMessageDialog(null,"El área del triángulo ingresado es: "+ATri); //Resultado
}
public void Promedio (){//Método para calcular el promedio de n números
    int n,x=0;//declaración de variables
    float promedio,suma=0;
    n = Integer.parseInt(JOptionPane.showInputDialog("Indique la cantidad de números que desea promediar: "));//n=números por ingresar
    while(x<=n){/*ciclo while, se repite mientras x (que es el valor de los números ingresados sea
        igual a n (números por promediar)*/
        x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));//Ingresa n números hasta igualar a n
        suma=suma+n;//suma iterativa
        x++;//sumar uno a x    
    }
    promedio = (float)suma/n; //realiza la operación
    JOptionPane.showMessageDialog(null,"El promedio de los números ingresados es: "+promedio);//Resultado
}
public void MayMenIgual(){//Método Mayor, Menor o Igual
    float n1,n2; //Variables (número 1 y número 2)
    n1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer número: ")); //Ingresar números a comparar
    n2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo número: "));
    if(n1>n2){ //inicio de ciclo if-else anidado
        JOptionPane.showMessageDialog(null, "El primer número es mayor que el segundo"); //indica que n1 es mayor a n2
    }
    else if(n1==n2){//si no, compara e indica que n1 es igual a n2
        JOptionPane.showMessageDialog(null,"El primer número es igual al segundo número");     
    }
    else{//si no indica que n1 es menor que n2
        JOptionPane.showMessageDialog(null,"El primer número es menor que el segundo número"); 
    }
}
}
