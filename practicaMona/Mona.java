package Semana3.practicaMona;

public class Mona {
    /* Atributos */
    String nombre;
    String vestimenta;

    /* Constructores */
    Mona(){

    }

    Mona(String nombre, String vestimenta){
        this.nombre=nombre;
        this.vestimenta=vestimenta;
    }

    /* Getters */
    public String getNombre(){ return nombre; }
    public String getVestimenta(){ return vestimenta; }

    /* Setters */
    public boolean setNombre(String nombre){
        if(nombre!=""){
            this.nombre=nombre;
            return true;
        }
        else
            return false;
    }

    public boolean setVestimenta(String vestimenta){
        if(vestimenta!=""){
            this.vestimenta=vestimenta;
            return true;
        }
        else
            return false;
    }

    /* Métodos */
    public String printState(){
        return "Nombre: " + nombre + "\n" +
                "Vestimenta: " + vestimenta + "\n";
    }

    public void realizarActividad(){
        System.out.println("Realizando actividad...");
    }

    public static void main(String[] args) {
        Mona monaLuchador = new Luchador("Mona Luchador", "Traje de luchador", "Máscara");
        Mona monaInspector = new Inspector("Mona Inspector", "Gabardina", "Sombrero", "Lupa");
        Mona monaBuzo = new Buzo("Mona Buzo", "Traje de buceo", "Goggles", "Tanque de oxígeno");
        Mona monaMaestro = new Maestro("Mona Maestro", "Ropa formal", "Lentes", "Libros");
        Mona monaBombero = new Bombero("Mona Bombero", "Traje de bombero", "Casco", "Manguera");
        Mona monaDJ = new DJ("Mona DJ", "Ropa casual", "Audífonos", "CDJ");


        System.out.println(monaLuchador.printState());
        monaLuchador.realizarActividad();
        System.out.println("*********************************************************");
        System.out.println(monaInspector.printState());
        monaInspector.realizarActividad();
        System.out.println("*********************************************************");
        System.out.println(monaBuzo.printState());
        monaBuzo.realizarActividad();
        System.out.println("*********************************************************");
        System.out.println(monaMaestro.printState());
        monaMaestro.realizarActividad();
        System.out.println("*********************************************************");
        System.out.println(monaBombero.printState());
        monaBombero.realizarActividad();
        System.out.println("*********************************************************");
        System.out.println(monaDJ.printState());
        monaDJ.realizarActividad();
        System.out.println("*********************************************************");

    }
}
