package Semana3.practicaMona;

public class Luchador extends Mona{
    /* Atributos */
    String cara;

    /* Constructores */
    Luchador(String nombre, String vestimenta, String cara){
        super(nombre, vestimenta);
        this.cara=cara;
    }

    /* Getters */
    public String getCara(){ return cara;}

    /* Setters */
    public boolean setCara(String cara){
        if(cara!=""){
            this.cara=cara;
            return true;
        }
        else
            return false;
    }

    /* Metodos */
    public String printState(){
        String vState = super.printState();
        return vState + "Cara: " + cara + "\n";
    }

    @Override
    public void realizarActividad() {
        System.out.println("Luchando contra el oponente...");
    }
}
