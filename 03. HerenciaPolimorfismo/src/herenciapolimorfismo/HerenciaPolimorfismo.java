
package herenciapolimorfismo;

public class HerenciaPolimorfismo { //Clase Main

    public static void main(String[] args) {
       
        Vehiculo Vehiculos[]=new Vehiculo[3]; //Arreglo para almacenar vehículos en memoria desde la superclase
        
        Vehiculos[0]= new Vehiculo("Toyota","Yaris",2018,248200.5,"Hatchback");//Vehículos registrados
        Vehiculos[1]= new Sedan("Nissan","Versa",2019,240500.5,"Sedan",true); //Polimorfismo
        Vehiculos[2] = new Camioneta("Ford","Explorer",2020,860900.5,"Camioneta",250,"trasera"); //Guarda vehiculos de clases hijas en la clase padre
    
        for (Vehiculo vehiculos: Vehiculos){
            System.out.println(vehiculos.datosVehiculo());   //Imprime rodos los vehículos guardados en memoria
        }
    } 
}
