package Semana3.practicaMona;

public class DJ extends Mona{
    /* Atributos */
    String cabeza;
    String herramienta;

    /* Constructores */
    DJ(String nombre, String vestimenta, String cabeza, String herramienta){
        super(nombre, vestimenta);
        this.cabeza=cabeza;
        this.herramienta=herramienta;
    }

    /* Getters */
    public String getCabeza(){ return cabeza;}
    public String getHerramienta(){ return herramienta;}

    /* Setters */
    public boolean setCabeza(String cabeza){
        if(cabeza!=""){
            this.cabeza=cabeza;
            return true;
        }
        else
            return false;
    }

    public boolean setHerramienta(String herramienta){
        if(herramienta!=""){
            this.herramienta=herramienta;
            return true;
        }
        else
            return false;
    }

    /* Metodos */
    public String printState(){
        String vState = super.printState();
        return vState + "Cabeza: " + cabeza + "\n"+
                "Herramienta: " + herramienta + "\n";
    }

    @Override
    public void realizarActividad() {
        System.out.println("Tocando música...");
    }
}
