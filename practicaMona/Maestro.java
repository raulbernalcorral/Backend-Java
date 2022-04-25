package Semana3.practicaMona;

public class Maestro extends Mona{
    /* Atributos */
    String cara;
    String herramienta;

    /* Constructores */
    Maestro(String nombre, String vestimenta, String cara, String herramienta){
        super(nombre, vestimenta);
        this.cara=cara;
        this.herramienta=herramienta;
    }

    /* Getters */
    public String getCara(){ return cara;}
    public String getHerramienta(){ return herramienta;}

    /* Setters */
    public boolean setCara(String cara){
        if(cara!=""){
            this.cara=cara;
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
        return vState + "Cara: " + cara + "\n"+
                "Herramienta: " + herramienta + "\n";
    }

    @Override
    public void realizarActividad() {
        System.out.println("Dando una clase de Backend con Java...");
    }
}
