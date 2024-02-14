package calculadoraevidenciaaprendizajeu2;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String [] args){ //Main
        CalculadoraEvidenciaAprendizajeU2 oper=new CalculadoraEvidenciaAprendizajeU2(); //Creación de objeto en main
        int opc, out=0;//variables del switch-case y de do-while
        JOptionPane.showMessageDialog(null,"Bienvenid@, esta calculadora te servira para realizar\n algunas operaciones");
        //Mensaje de bioenvenida
        do{//Inicio del ciclo do-while
            opc = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la operación que desea realizar: \n1.Área rectángulo\n2.Área triángulo\n3.Promedio\n4.Mayor, menor o igual de dos números\n5.Salir"));
            //Selección de menú
            switch(opc){//Inicio switch case
                case 1: oper.Rectangulo();//Método 1 calcular área de rectángulo
                    break;
                case 2: oper.Triangulo();//Método 2 calcular área de triángulo
                    break;
                case 3: oper.Promedio();//Método 3 calcular promedio de N números
                    break;
                case 4: oper.MayMenIgual(); //Método 4 elegir mayor, menor o igual de dos números
                    break;
                case 5: out=2;//cambia la variable out a 2 y sale del sistema.
                    break;
                default: JOptionPane.showMessageDialog(null,"Opción no válida"); // Indica opción equivocada        
            }
        }while(out<=1);//Repite el ciclo hasta que "out" sea mayor a 1
    }    
}

