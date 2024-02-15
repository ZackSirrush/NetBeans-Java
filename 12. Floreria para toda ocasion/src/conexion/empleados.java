package conexion;

public class empleados {
    
    private int idEmpleado; /* metodos getters y setters para el formulario de empleados */
    private String nombreEmp;
    private String apellidoPaterno;
    private String apellidoMaterno; /* obtienen los valores que se almacenan en los textbox y combobox del formulario */
    private int idPuesto;
    private String puntoDeVenta;
    private String user;
    private String password;
    private String nombreTipoUser;

    public String getNombreTipoUser() {
        return nombreTipoUser;
    }

    public void setNombreTipoUser(String nombreTipoUser) {
        this.nombreTipoUser = nombreTipoUser;
    }
    
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmp() {
        return nombreEmp;
    }

    public void setNombreEmp(String nombreEmp) {
        this.nombreEmp = nombreEmp;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(int idPuesto) {
        this.idPuesto = idPuesto;
    }

    public String getpuntoDeVenta() {
        return puntoDeVenta;
    }

    public void setpuntoDeVenta(String puntoDeVenta) {
        this.puntoDeVenta = puntoDeVenta;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }  
}
