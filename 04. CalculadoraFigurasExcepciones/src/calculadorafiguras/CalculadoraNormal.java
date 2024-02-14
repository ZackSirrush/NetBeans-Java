
package calculadorafiguras;

import javax.swing.JOptionPane;

public class CalculadoraNormal {
//Atributos
float x;
float y;
float suma;
float resta;
float mult;
float div;
float mod;
    
//Métodos
    public void solicitarNumeros(){
    int continuar;
    JOptionPane.showMessageDialog(null,"Por favor, ingrese dos números: ");
    do{
        try{//inicia manejo de excepciones
        x = Float.parseFloat(JOptionPane.showInputDialog("Digite el primer número"));
        y = Float.parseFloat(JOptionPane.showInputDialog("Digite el segundo número"));    
        }
        catch(java.lang.NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error, ingrese solo números");//mensaje de excepción si el usuario ingresa caracteres
        }
        continuar = Integer.parseInt(JOptionPane.showInputDialog("¿Desea volver a ingresar los números?\n1.Sí\n2.No"));
    }while(continuar<=1);
    }
    public void sumar(){ //Método para sumar
        suma=x+y;
        JOptionPane.showMessageDialog(null,"La suma es: "+suma);
    }
    public void restar(){ //Método para restar
    resta=x-y;
    JOptionPane.showMessageDialog(null,"La resta es: "+resta);
    }
    public void multiplicar(){ //Método para multiplicación
    mult=x*y;
    JOptionPane.showMessageDialog(null,"La multiplicación es: "+mult);
    }
    public void divide(){ //Método para dividir
    try{ //manejo de excepciones
    div=x/y;
    JOptionPane.showMessageDialog(null,"La división es: "+div);    
    }
    catch(java.lang.ArithmeticException e){
        div=0;
        JOptionPane.showMessageDialog(null,"Error, división entre cero"); //muestra un mensaje de error si se da una división entre cero
    }
    }
    public void modulo(){ //Método para calcular el módulo o residuo
    mod=x%y;
    JOptionPane.showMessageDialog(null,"El módulo o residuo es: "+mod);
    }
    public void Promedio (){//Método para calcular el promedio de n números
        try{ //inicio de try catch
            int n,e,sum=0;//declaración de variables
            float promedio;
            
            n=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de números que desea promediar"));
            
            for(int i=1; i<=n;i++){ //agrega una suma iterativa
                e=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: ")); //solicita ingresar números hasta que sea igual a n 
                sum=sum+e;//suma los números y los acumula en sum
            }
            promedio=(float)sum/n;//calcula el promedio entre la cantidad de números "n"
            JOptionPane.showMessageDialog(null,"El promedio de los números ingresados es: "+promedio);//Resultado
            }
        catch(java.lang.NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error, ingrese solo números");//mensaje de excepción si el usuario ingresa caracteres
        } 
        
    } 
   } 
