
package herenciapolimorfismo;

public class Camioneta extends Vehiculo { //clase hija o subclase
    //Atributos
    double capacidadCarga;
    String traccion;
    
    //Constructor
    public Camioneta (String marca, String modelo, int anio, double precio, String tipo, double capacidadCarga, String traccion){
         super(marca,modelo,anio,precio,tipo); //Herencia de atributos de la superclase
         this.capacidadCarga=capacidadCarga;
         this.traccion=traccion;
    }

    public double getCapacidadCarga() { //Getter de la variable capacidad de carga
        return capacidadCarga;
    }

    public String getTraccion() { //Getter de la variable Tracción
        return traccion;
    }

    @Override //Reescritura de los métodos de la superclase vehículo
    public String datosVehiculo(){
        return "\n\nMarca: "+marca+"\nModelo: "+modelo+"\nAño: "+anio+"\nPrecio: "+precio+"\nTipo: "+tipo+
                "\nCapacidad de Carga: "+capacidadCarga+" Kg"+"\nTracción: "+traccion;
    }
    
}
