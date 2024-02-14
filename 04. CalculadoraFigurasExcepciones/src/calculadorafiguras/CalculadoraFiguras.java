
package calculadorafiguras;

import javax.swing.JOptionPane;

public class CalculadoraFiguras {
//Atributos
double ACirc,r; //Variables globales
final double Pi=3.1416;//Constante

//Métodos
public double Trapecio(double BMayor,double BMenor,double h){ //Calcular área del trapecio con variables locales
    double ATrap=(BMayor+BMenor)*h; //Cálculo del área
    JOptionPane.showMessageDialog(null,"El área del trapecio ingresado es: "+ATrap);
    return ATrap; //Resultado
}
public void Circulo(){ //Área del círculo sin variables locales
    r = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del círculo: "));//Dato de entrada
    ACirc=Pi*(r*r);//resultado
    JOptionPane.showMessageDialog(null,"El área del círculo ingresado es: "+ACirc);
}
public double Pentagono(double Per,double Apot){ //Área del pentágono con variables locales
    double APent=(Per*Apot)/2; //Cálculo
   JOptionPane.showMessageDialog(null,"El área del pentágono ingresado es: "+APent);//Resultado
   return APent;
}

}
