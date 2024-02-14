
package herenciapolimorfismo;

public class Sedan extends Vehiculo { //Clase hija o subclase
    //Atributos
    Boolean descapotable;
    
    //Constructor
    public Sedan(String marca, String modelo, int anio, double precio, String tipo, Boolean descapotable){
        super(marca,modelo,anio,precio,tipo); //Indica la herencia de la superclase
        this.descapotable=descapotable;
    }

    public Boolean getDescapotable() {
        return descapotable; //Getter del atributo adicional de la subclase
    }

    @Override //Editor del método heredable
    public String datosVehiculo(){ //Método heredado y modificado de la superclase
        return "\n\nMarca: "+marca+"\nModelo: "+modelo+"\nAño: "+anio+"\nPrecio: "+precio+"\nTipo: "+tipo+
                "\nDescapotable: "+descapotable;
    }
}

