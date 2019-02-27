/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileManagement;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

/**
 *
 * @author Laura M
 */
public class ManejoInformacion {
     private String ruta;
    public ManejoInformacion(String ruta){
        this.ruta=ruta;
    }
    
    public boolean guardar(String texto) throws IOException{ //Guarda los datos del arraylist en un archivo, separados por espacios
        File archivo=new File(this.ruta);
        if(!archivo.exists())
            archivo.createNewFile();//le coloca como nombre la ruta de esta clase (this.ruta)
        PrintStream salida=new PrintStream(archivo);
        
        salida.println(texto);

        salida.flush(); //Hace que la informacion se quede en el archivo
        salida.close();
        return true;
    }
}
