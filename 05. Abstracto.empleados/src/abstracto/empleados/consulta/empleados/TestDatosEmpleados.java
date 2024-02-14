package abstracto.empleados.consulta.empleados;

import abstractoEmpleados.*;//Importar todas las clases del paquete
        
public class TestDatosEmpleados {
   public static void main (String[] args){ //Main
       
       Gerentes Test1=new Gerentes("El grupo de empleados es: ","Gerentes"); //Creación de objetos
       Operativos Test2=new Operativos("El grupo de empleados es: ","Operativos");
       Temporales Test3=new Temporales("El grupo de empleados es: ","Temporales");
       TestConsultarBDD Prueba=new TestConsultarBDD();
              
       Test1.setDatosEmpleado("Gerentes"); //Setter de datos
       Test2.setDatosEmpleado("Operativos");
       Test3.setDatosEmpleado("Temporales");
       
       System.out.println(Test1.getDatosEmpleado());//Impresión de los métodos
       System.out.println(Test2.getDatosEmpleado());
       System.out.println(Test3.getDatosEmpleado());
       
       Prueba.main2(args);//Inicio del proceso de TestConsultarBDD
   }

   
}
