package manejoarchivos;

import java.io.*;
        
public class abrirArchivos {
    FileInputStream entrada; /* Permite la entrada y salida de archivos */
    FileOutputStream salida;
    File archivo;
    
    public abrirArchivos(){
        
    }
    
    /* Abrir un archivo de texto */
    public String abrirarchtexto(File archivo){
        String contenido = "";
        try{
            entrada = new FileInputStream(archivo); /* Al seleccionar el archivo se selecciona el contenido */
            int ascci;
            while((ascci = entrada.read())!=-1){ /* Lee el flujo de bytes recibidos del archivo */
                char caracter = (char)ascci; /* Convierte los datos de int a char */
                contenido += caracter; /* Concatena los caracteres obtenidos del archivo */
            }
                    
        } catch(Exception e){
            
        }
        return contenido;
    }
    /* Guardar archivo de texto */
    public String guardararchtexto(File archivo, String contenido){
        String respuesta = null;
        try{
            salida = new FileOutputStream(archivo);
            byte[] bytesTxt = contenido.getBytes(); /* Recupera el contenido del flujo y lo almacena en el arreglo de bytes */
            salida.write(bytesTxt);
            respuesta = "El archivo se ha guardado con éxito";
        } catch (Exception e){
        }
        return respuesta;
    }
}
