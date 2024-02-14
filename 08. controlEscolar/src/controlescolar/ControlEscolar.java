package controlescolar;

import java.util.Scanner;

public class ControlEscolar {

    public static void main(String[] args) {
        int out=0,opc,as; //Variables para ciclos switch-case y do while
        
        Scanner leer = new Scanner(System.in); //Crear scanner para ingreso de datos
        Asignaturas asignat[] = new Asignaturas[12];  //Crea el primer arreglo con los datos de cada asignatura
        asignat[0] = new Asignaturas ("Espanol         ","ESP-01");//Ingresar cada dato del arreglo
        asignat[1] = new Asignaturas ("Matematicas     ","MAT-02");
        asignat[2] = new Asignaturas ("Geografia       ","GEO-03");
        asignat[3] = new Asignaturas ("Civismo         ","CIV-04");
        asignat[4] = new Asignaturas ("Biologia        ","BIO-05");
        asignat[5] = new Asignaturas ("Educacion Fisica","EFI-06");
        asignat[6] = new Asignaturas ("Ingles          ","ING-07");
        asignat[7] = new Asignaturas ("Artistica       ","ART-08");
        asignat[8] = new Asignaturas ("Informatica     ","INF-09");
        asignat[9] = new Asignaturas ("Fisica          ","FIS-10");
        asignat[10] = new Asignaturas ("Historia        ","HIS-11");
        asignat[11] = new Asignaturas ("Quimica         ","QUI-12");
        
        Calificaciones calif = new Calificaciones(); //Ingresa el objeto calificaciones
        
        System.out.println("Bienvenido");//Mensaje de bienvenida 
        
        do{ //Ciclo do-while mientras out sea menor o igual a 2
            System.out.println("Por favor seleccione que desea hacer: "); //Muestra el menú de opciones posibles
            System.out.println("1.Mostrar asignaturas\n2.Calificaciones y estadísticas (máx, min, prom)"+
                              "\n3.Salir"); //Despliega menú de opciones
            opc=leer.nextInt(); //recibe entrada de datos para el switch case
            switch(opc){
                case 1: 
                    System.out.println("Materia           /  Clave  "); 
                    for(Asignaturas asignatu: asignat){// Imprime el arreglo creado para las asignaturas
                        System.out.println(asignatu.datosAsignatura());
                    }
                    break;
                case 2: // Inicia otro switch-case para que el usario ingrese calificaciones por materia y obtenga la estadística
                    System.out.println("Ingrese la asignatura a la que desea agregar calificaciones: " //Muestra el menú de materias de la secundaria (array 1)
                            + "\n1.Espanol\n2.Matematicas\n3.Geografia\n4.Civismo\n5.Biologia\n6.Educacion Fisica"
                            + "\n7.Ingles\n8.Artistica\n9.Informatica\n10.Fisica\n11.Historia\n12.Quimica");
                    as=leer.nextInt();//Solicita ingresar dato de asignatura
                    switch(as){
                        case 1: System.out.println("Asignatura: "+asignat[0].datosAsignatura()); //Muestra la asignatura contenida en la posicion indicada del arreglo asignat
                            calif.ingresarCalif(); //Ejecuta el método ingresar calificaciones de la clase calificaciones
                            calif.calcularPromedio(); //Ejecuta el método calcular promedio
                            calif.califMayorMenor(); //Ejecuta el método calificación mayor y menor
                            break;
                        case 2: System.out.println("Asignatura: "+asignat[1].datosAsignatura()); //Repite el proceso de arriba con una materia diferente
                            calif.ingresarCalif();
                            calif.calcularPromedio();
                            calif.califMayorMenor();
                            break;
                        case 3: System.out.println("Asignatura: "+asignat[2].datosAsignatura());
                            calif.ingresarCalif();
                            calif.calcularPromedio();
                            calif.califMayorMenor();                            
                            break;
                        case 4: System.out.println("Asignatura: "+asignat[3].datosAsignatura());
                            calif.ingresarCalif();
                            calif.calcularPromedio();
                            calif.califMayorMenor();                        
                            break;
                        case 5: System.out.println("Asignatura: "+asignat[4].datosAsignatura());
                            calif.ingresarCalif();
                            calif.calcularPromedio();
                            calif.califMayorMenor();                            
                            break;
                        case 6: System.out.println("Asignatura: "+asignat[5].datosAsignatura());
                            calif.ingresarCalif();
                            calif.calcularPromedio();
                            calif.califMayorMenor();                            
                            break;
                        case 7: System.out.println("Asignatura: "+asignat[6].datosAsignatura());
                            calif.ingresarCalif();
                            calif.calcularPromedio();
                            calif.califMayorMenor();                            
                            break;
                        case 8: System.out.println("Asignatura: "+asignat[7].datosAsignatura());
                            calif.ingresarCalif();
                            calif.calcularPromedio();
                            calif.califMayorMenor();                        
                            break;
                        case 9: System.out.println("Asignatura: "+asignat[8].datosAsignatura());
                            calif.ingresarCalif();
                            calif.calcularPromedio();
                            calif.califMayorMenor();                        
                            break;
                        case 10: System.out.println("Asignatura: "+asignat[9].datosAsignatura());
                            calif.ingresarCalif();
                            calif.calcularPromedio();
                            calif.califMayorMenor();                        
                            break;
                        case 11: System.out.println("Asignatura: "+asignat[10].datosAsignatura());
                            calif.ingresarCalif();
                            calif.calcularPromedio();
                            calif.califMayorMenor();                        
                            break;
                        case 12: System.out.println("Asignatura: "+asignat[11].datosAsignatura());
                            calif.ingresarCalif();
                            calif.calcularPromedio();
                            calif.califMayorMenor();                        
                            break;
                        default: System.out.println("Opción no valida, por favor ingrese una opción del menú");//muestra mensaje si el usuario ingresa una opción diferente
                    }
                    break;
                case 3: out=2;//Establece out = 2 para que al ingresar el caso 3 el usuario salga del programa
                    break;
                default: System.out.println("Opción no valida, por favor ingrese una opción del menú"); //Muestra mensaje de error
            }    
        }while(out<=1); //Fin del ciclo do-while
    }
}
