package Semana3.practicaHarry;

public class Personaje {
    /* Atributos */
    public String nombre;//Harry Potter
    public String genero;//Hombre
    public String casa;//Grifindor
    public String boggart;//Voldemort
    public String patronus;//ciervo

    /* Constructores */

    Personaje(){

    }
    Personaje(String nombre, String genero, String casa, String boggart, String patronus){
        this.nombre=nombre;
        this.genero=genero;
        this.casa=casa;
        this.boggart=boggart;
        this.patronus=patronus;
    }

    /* Getters */
    public String getNombre(){return nombre;}
    public String getGenero(){return genero;}
    public String getCasa(){return casa;}
    public String getBoggart(){return boggart;}
    public String getPatronus(){return patronus;}

    /* Setters */
    public boolean setNombre(String nombre){
        if(nombre!=""){
            this.nombre = nombre;
            return true;
        }
        else
            return false;
    }
    public boolean setGenero(String genero){
        if(genero!=""){
            this.genero = genero;
            return true;
        }
        else
            return false;
    }
    public boolean setCasa(String casa){
        if(casa!=""){
            this.casa = casa;
            return true;
        }
        else
            return false;
    }
    public boolean setBoggart(String boggart){
        if(boggart!=""){
            this.boggart = boggart;
            return true;
        }
        else
            return false;
    }
    public boolean setPatronus(String patronus){
        if(patronus!=""){
            this.patronus = patronus;
            return true;
        }
        else
            return false;
    }

    public String printState(){
        return "Nombre: " + nombre + "\n" +
                "Género: " + genero + "\n" +
                "Casa: " + casa + "\n" +
                "Boggart: " + boggart + "\n" +
                "Patronus: " + patronus;
    }
}
