package Semana3.practicaHarry;

public class PruebaPersonaje {
    public static void main(String[] args) {
        crearPersonajes();
    }

    public static void crearPersonajes(){
        Personaje oHarry = new Personaje("Harry Potter", "Masculino", "Gryffindor", "Dementor", "Ciervo");
        Personaje oRon = new Personaje("Ronald Weasley", "Masculino", "Gryffindor", "Araña", "Jack Russell Terrier");
        Personaje oHermione = new Personaje("Hermione Granger", "Femenino", "Gryffindor", "La profesora McGonagall diciéndole que reprobó todo", "Nutria");
        Personaje oDraco = new Personaje("Draco Malfoy", "Masculino", "Slytherin", "Lord Voldemort", "Dragon");
        Personaje oLuna = new Personaje("Luna Lovewood", "Femenino", "Ravenclaw", "Ver morir a su padre", "Liebre");
        System.out.println(oHarry.printState());
        System.out.println("*********************************************************");
        System.out.println(oRon.printState());
        System.out.println("*********************************************************");
        System.out.println(oHermione.printState());
        System.out.println("*********************************************************");
        System.out.println(oDraco.printState());
        System.out.println("*********************************************************");
        System.out.println(oLuna.printState());
    }
}
