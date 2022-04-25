package Semana3.practicaMultiverse;

public class SpiderMan2099 extends SpiderMan implements SpiderManActionCallbacks{
    SpiderMan2099(String nombre, String genero, String descripcion){
        super(nombre, genero, descripcion);
    }

    @Override
    public void trepar() {
        System.out.println("Puede trepar usando las garras en sus dedos...");
    }

    @Override
    public void levantarPeso() {
        System.out.println("Puede levantar hasta 10 toneladas...");
    }
}
