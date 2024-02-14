package arraya1;

public class Vehiculoteorico {
    //Atributos
    String marca;
    String modelo;
    double VaCom;
    char tipo;
    double VaTot;

    //Métodos
    public Vehiculoteorico(String marca, String modelo, double VaCom, char tipo, double VaTot) { //Constructor
        this.marca = marca;
        this.modelo = modelo;
        this.VaCom = VaCom;
        this.tipo = tipo;
        this.VaTot = VaTot;
    }

    public String getMarca() {//Getters y setter de los datos del vehículo
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

    public double getVaCom() {
        return VaCom;
    }

    public void setVaCom(double VaCom) {
        this.VaCom = VaCom;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
    
    public double getVaTot() {
        return VaTot;
    }

    public void setVaTot(double VaTot){
        this.VaTot=VaTot;
    }
}
