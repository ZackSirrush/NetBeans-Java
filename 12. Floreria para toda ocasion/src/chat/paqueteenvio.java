package chat;

import java.io.Serializable;

class paqueteenvio implements Serializable { /* Método con getters y settter para empaquetar */
    
    private String nick,mensaje; /* y enviar datos del chat */

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) { 
        this.nick = nick;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
}
