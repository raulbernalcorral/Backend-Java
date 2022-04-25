package Semana3.practicaMultiverse;

public class GhostSpider extends SpiderMan implements SpiderManActionCallbacks{
    GhostSpider(String nombre, String genero, String descripcion){
        super(nombre, genero, descripcion);
    }

    @Override
    public void trepar() {
        System.out.println("Utiliza manos y pies para trepar edificios...");
    }

    @Override
    public void levantarPeso() {
        System.out.println("Levanta hasta 10 toneladas...");
    }
}
