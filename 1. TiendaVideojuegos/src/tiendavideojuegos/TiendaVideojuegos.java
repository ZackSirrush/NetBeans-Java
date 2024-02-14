package tiendavideojuegos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class TiendaVideojuegos {

    public static void main(String[] args) {
       Scanner entrada=new Scanner (System.in);
       int figuras,videojuegos,accesorios,sumaArticulos;
       float ventasFiguras,ventasVideojuegos,ventasAccesorios,ventaTotal,porFig,porVdjgs,porAcc;
       System.out.println("Bienvenido."); //Mensaje de bienvenida
       System.out.println("Este programa te será de utilidad para comparar");
       System.out.println("los productos vendidos según su categoría y mostrar");
       System.out.println("el porcentaje de ingreso con relación a las ventas totales.");
       figuras = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la cantidad de figuras vendidas: ")); //Ingreso de datos
       ventasFiguras = Float.parseFloat(JOptionPane.showInputDialog("Ingrese ahora el total de ventas por figuras: ")); //se muestra en este formato ya que
       videojuegos = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la cantidad de videojuegos vendidos: ")); //para ingresar los datos solicitados 
       ventasVideojuegos = Float.parseFloat(JOptionPane.showInputDialog("Ingrese ahora el total de ventas por videojuegos: ")); //se abre una ventana
       accesorios = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la cantidad de accesorios vendidos: "));
       ventasAccesorios = Float.parseFloat(JOptionPane.showInputDialog("Ingrese ahora el total de ventas por accesorios: "));
       sumaArticulos=figuras+videojuegos+accesorios; //Operaciones aritméticas
       ventaTotal=ventasFiguras+ventasVideojuegos+ventasAccesorios;
       porFig=(ventasFiguras*100)/ventaTotal; //cálculo de los porcentajes
       porVdjgs=(ventasVideojuegos*100)/ventaTotal;
       porAcc=(ventasAccesorios*100)/ventaTotal;
       System.out.println("El total de artículos vendidos durante el periodo es: "+sumaArticulos); //Muestra en pantalla los datos obtenidos
       System.out.println("El ingreso total de dichos artículos es de: "+ventaTotal);
       System.out.print("Se vendieron "+figuras);
       System.out.print(" figuras, por un total de "+ventasFiguras);
       System.out.print(" pesos, lo que equivale a "+porFig);
       System.out.println("% de las ventas totales");
       System.out.print("Se vendieron "+videojuegos);
       System.out.print(" juegos, por un total de "+ventasVideojuegos);
       System.out.print(" pesos, lo que equivale a "+porVdjgs);
       System.out.println("% de las ventas totales");
       System.out.print("Se vendieron "+accesorios);
       System.out.print(" accesorios, por un total de " +ventasAccesorios);
       System.out.print(" pesos, lo que equivale a "+porAcc);
       System.out.println("% de las ventas totales");
    }
    
}
