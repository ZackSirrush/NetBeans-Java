package manejoarchivos;

import UI.manejoArchivo; /* Importa el paquete de interfaz gráfica */

public class Manejoarchivos {
    public static void main(String[] args) { /* Main */
        manejoArchivo ven = new manejoArchivo(); /* Crea un objeto nuevo de la clase manejoArchivo */
        ven.setVisible(true); /* Selecciona el objeto y lo establece como verdadero */
        ven.setLocationRelativeTo(null); /* Coloca el objeto al centro de la pantalla */
    }
}
