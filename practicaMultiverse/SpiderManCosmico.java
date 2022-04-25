package Semana3.practicaMultiverse;

public class SpiderManCosmico extends SpiderMan implements SpiderManActionCallbacks {
    SpiderManCosmico(String nombre, String genero, String descripcion){
        super(nombre, genero, descripcion);
    }

    @Override
    public void trepar() {
        System.out.println("Puede volar hasta la cima de cualquier edificio...");
    }

    @Override
    public void levantarPeso() {
        System.out.println("Puede levantar hasta 1000 toneladas...");
    }
}
