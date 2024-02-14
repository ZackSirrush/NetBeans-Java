
package calculadorafiguras;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String [] args){ //Método Main
        CalculadoraFiguras operaciones = new CalculadoraFiguras(); //Objeto nuevo en Main
        CalculadoraNormal cn=new CalculadoraNormal();
        int opc,opc2,opc3;
        int out;//Variables
        JOptionPane.showMessageDialog(null,"Bienvenid@, esta calculadora te permitirá realizar\n cálculos normales y también de figuras geométricas"); //mensaje de bienvenida
        do{//Inicio ciclo do-while
            try{ //Inicio a prueba de errores
                opc2= Integer.parseInt(JOptionPane.showInputDialog("Seleccione la calculadora que desea utilizar: \n1.Calculadora de Figuras geométricas\n2.Calculadora normal")); 
                switch (opc2){
                    case 1: //Calculadora de figuras geoétricas
                        opc = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la operación que desea realizar: \n1.Área Trapecio\n2.Área círculo\n3.Área pentágono"));
                        //Menú de selección
                        switch (opc){ //Inicio ciclo switch-case
                            case 1: //Caso 1 con variables locales
                                double BMayor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Base Mayor: ")); //Requerimiento de parámetros
                                double BMenor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Base Menor: "));
                                double h = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Altura: "));
                                operaciones.Trapecio(BMayor, BMenor, h); //Inicio del método Trapecio con variables locales en case 1
                            break;
                            case 2:
                                operaciones.Circulo(); //Inicio del método Círculo con variables globales
                            break;
                            case 3: 
                                double Per = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el perímetro del pentágono: "));//Parámetros de entrada
                                double Apot = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la apotema del pentágono: "));
                                operaciones.Pentagono(Per, Apot);//Inicio del método Pentágono con variables locales en case 3
                            break;
                            default: JOptionPane.showMessageDialog(null,"Opción no válida"); //Mensaje de opción no valida al ingresar otro número que no esté en el menú
                        }
                        break;
                    case 2: //Calculadora normal
                        opc3 = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la operación que desea realizar: \n1.Suma\n2.Resta\n3.Multiplicación\n4.División\n5.Módulo\n6.Promedio"));
                        switch(opc3){ //switch case de los métodos de la calculadora normal
                            case 1:cn.solicitarNumeros(); //solicita dos números para la suma
                                cn.sumar(); //metodo resta
                            break;
                            case 2:cn.solicitarNumeros(); //solicita dos números para la resta
                                cn.restar();
                            break;
                            case 3: cn.solicitarNumeros();
                                cn.multiplicar();
                            break;
                            case 4:cn.solicitarNumeros();
                                cn.divide();
                            break;
                            case 5:cn.solicitarNumeros(); 
                                cn.modulo();
                            break;
                            case 6:cn.Promedio();//método promedio
                            break;
                            default: JOptionPane.showMessageDialog(null,"Opción no válida"); //Mensaje de opción no valida al ingresar otro número que no esté en el menú
                        }                    
                    break;
                    default: JOptionPane.showMessageDialog(null,"Opción no válida");    //en caso de ingresar un número diferente a 1 y 2           
                    }   
            }
            catch(java.lang.NumberFormatException e){ //marca error al ingresar caractéres en lugar de números
                JOptionPane.showMessageDialog(null,"Error, carácter no adminitido");//mensaje de excepción
            }
            out = Integer.parseInt(JOptionPane.showInputDialog("¿Desea utilizar la calculadora?\n1.Sí\n2.No")); //permite dejar de ejecutar la calculadora
        }while(out<=1);//fin del ciclo do-while
    }
}
