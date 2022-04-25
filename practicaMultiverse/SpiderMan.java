package Semana3.practicaMultiverse;

public class SpiderMan {
    /* Atributos */
    String nombre;
    String genero;
    String description;

    /* Constructores */
    SpiderMan(){

    }

    SpiderMan(String nombre, String genero, String description){
        this.nombre=nombre;
        this.genero=genero;
        this.description=description;
    }

    /* Getters */
    public String getNombre(){ return nombre; }
    public String getGenero(){ return genero; }
    public String getDescription(){ return description; }

    /* Setters */
    public boolean setNombre(String nombre){
        if(nombre!=""){
            this.nombre=nombre;
            return true;
        }
        else
            return false;
    }

    public boolean setGenero(String genero){
        if(genero!=""){
            this.genero=genero;
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

    /* Métodos */
    public String printState(){
        return "Nombre: " + nombre + "\n" +
                "Género: " + genero + "\n" +
                "Descripción: " + description + "\n";
    }
}
