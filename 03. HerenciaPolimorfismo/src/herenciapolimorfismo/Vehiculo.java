
package herenciapolimorfismo;

public class Vehiculo { //Clase padre o superclase
    //Atributos
    String marca;
    String modelo;
    int anio;
    double precio;
    String tipo;
    
    //Métodos
    public Vehiculo(String marca, String modelo, int anio, double precio, String tipo) {    
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
        this.tipo = tipo; //Contructor
    }

    public String getMarca() { //Getters y setter de las variables a utilizar
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
   public String datosVehiculo(){ //Método heredable de la superclase
       return "\n\nMarca: "+marca+"\nModelo: "+modelo+"\nAño: "+anio+"\nPrecio: "+precio+"\nTipo: "+tipo;
   } 
}    