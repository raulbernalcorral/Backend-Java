package Semana3.practicaComic;

import Semana3.imonsh.Colors;
import Semana3.imonsh.Dialog;
import Semana3.imonsh.Screen;

import java.util.Locale;

public class Escena extends Comic implements EscenaCallbacks {
    /* Atributos */
    String nombre;
    String description;
    String imagen;

    /* Constructores */
    Escena(String nombre, String description, String imagen) {
        this.nombre=nombre;
        this.description=description;
        this.imagen=imagen;
    }

    /* Getters */
    public String getNombre(){ return nombre; }
    public String getDescription(){ return description; }
    public String getImagen(){ return imagen; }

    /* Setters */
    public boolean setNombre(String nombre){
        if(nombre!=""){
            this.nombre=nombre;
            return true;
        }
        else
            return false;
    }

    public boolean setDescription(String description){
        if(description!=""){
            this.description=description;
            return true;
        }
        else
            return false;
    }


    public boolean setImagen(String imagen){
        if(imagen!=""){
            this.imagen=imagen;
            return true;
        }
        else
            return false;
    }

    /* Métodos */
    public String printState(){
        return "Nombre: " + nombre + "\n" +
                "Descripción: " + description + "\n" +
                "Imagen: " + imagen + "\n";
    }

    @Override
    public void contarEscena(Screen p) {
        p.out("********************************************", Colors.BLACK);
        p.out("\n" + getNombre().toUpperCase(Locale.ROOT) + "\n", Colors.BLACK);
        try{
            Thread.sleep(1000);
        } catch (InterruptedException ie){
            ie.printStackTrace();
        }
        p.showImage(getImagen());
        try{
            Thread.sleep(1000);
        } catch (InterruptedException ie){
            ie.printStackTrace();
        }
        p.out("\n" + getDescription() + "\n", Colors.C64Ntsc);
        p.changeStyle("Helvetica", 28, Colors.AgalFuel, Colors.AntiFlashWhite);
        p.setVisible(true);
    }
}
