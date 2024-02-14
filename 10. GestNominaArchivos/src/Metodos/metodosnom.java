package Metodos;

import empleado.empleados;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class metodosnom {
    Vector vPrincipal = new Vector();
 
    public void guardar (empleados unempleado){
        vPrincipal.addElement(unempleado);
    }
    
    public void guardarArchivo(empleados empleado){
        try{
            FileWriter fw = new FileWriter("Empleados.txt",true);
            BufferedWriter bw = new BufferedWriter (fw);
            PrintWriter pw = new PrintWriter (bw);
            pw.print(empleado.getNombre());
            pw.print("||" + empleado.getRFC());
            pw.println("||" + empleado.getNodeemp());
            pw.close();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public DefaultTableModel listadeempleados(){
        Vector cabeceras = new Vector ();
        cabeceras.addElement("Nombre");
        cabeceras.addElement("RFC");
        cabeceras.addElement("Número de empleado");
        
       DefaultTableModel mdlTabla = new DefaultTableModel (cabeceras,0);
        try{
            FileReader fr = new FileReader("Empleados.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while((d=br.readLine())!=null){
                StringTokenizer dato = new StringTokenizer(d,"||");
                Vector x = new Vector ();
                while(dato.hasMoreTokens()){
                    x.addElement(dato.nextToken());
                }
                mdlTabla.addRow(x);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return mdlTabla;    
    }
}
