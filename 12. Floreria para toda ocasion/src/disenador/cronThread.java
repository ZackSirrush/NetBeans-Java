package disenador;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class cronThread extends Thread {
    
    JLabel eti; /* almacena valor de etiqueta */
    
    public cronThread(JLabel lbltiempotrabajo) {
        this.eti=lbltiempotrabajo; /* guarda eti para hacer uso de la etiqueta tiempotrabajo */
    }
    
    public void run(){ /* metodo run para el thread */
        try{
            int x=0; /* inicializa variable x */
            while(aceptarPedidos.iniciaHilo){
                Thread.sleep(1000); /* establece 1 segundo de "distancia" */
                ejecutarHiloCronometro(x);/* ejecuta metodo hilo */
                x++;/* incrementa el valor de x */
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Exception en el hilo: "+e.getMessage());
        }
    }    

    private void ejecutarHiloCronometro(int x) { /* metodo ejecutar hilo */
        System.out.println(x+" - "+Thread.currentThread().getName());/* muestra en consola el numero de hilo y su nombre */
        aceptarPedidos.seg++; /* incrementa los segundos del cronometro */
        if(aceptarPedidos.seg>59){/* establece como máximo 59 */
            aceptarPedidos.seg=00; /* devuelve 00 cuando se llega a 59 */
            aceptarPedidos.minute++;/* incrementa los minutos */
            if(aceptarPedidos.minute>59){ /* devuelve a 0 cuando llegan a 59 minutos */
                aceptarPedidos.minute=0;
                aceptarPedidos.hour++;/* incrementa las horas */
                if(aceptarPedidos.hour>1){
                    JOptionPane.showMessageDialog(null,"Han pasado 2 horas con el arreglo"); /* al llegar a 2 horas muestra un mensaje que pausa el hilo */
                }
            }
        }
        
        String textoSeg="",textoMin="",textoHora=""; /* coloca valores de string a las variables */
        
        if(aceptarPedidos.seg<10){
            textoSeg="0"+aceptarPedidos.seg;
        } else{
            textoSeg=""+aceptarPedidos.seg;
        }
        if(aceptarPedidos.minute<10){
            textoMin="0"+aceptarPedidos.minute; /* mantiene el formato 00:00:00 para el cronómetro */
        } else{
            textoMin=""+aceptarPedidos.minute;
        }
        if(aceptarPedidos.hour<10){
            textoHora="0"+aceptarPedidos.hour;
        } else{
            textoHora=""+aceptarPedidos.hour;
        }        
        
        String reloj = textoHora+":"+textoMin+":"+textoSeg;
        
        eti.setText(reloj); /* devuelve el valor en la etiqueta */
    }
}
