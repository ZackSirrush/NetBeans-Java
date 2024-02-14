package empleado;

public class empleados {

    String nombre;
    String RFC;
    String nodeemp;

    public empleados(String nombre, String RFC, String nodeemp) {
        this.nombre = nombre;
        this.RFC = RFC;
        this.nodeemp = nodeemp;
    }

    public empleados() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getRFC() {
        return RFC;
    }

    public String getNodeemp() {
        return nodeemp;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public void setNodeemp(String nodeemp) {
        this.nodeemp = nodeemp;
    }
    
    
}
