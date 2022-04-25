package Semana3.practicaMultiverse;

public class PruebaSpiderMan {
    public static void main(String[] args) {
        GhostSpider oGhostSpider = new GhostSpider("Ghost Spider", "Femenino", "Creada a partir de que Gwen Stacy es mordida por una araña radioactiva.");
        SpiderMan2099 oSpiderMan2099 = new SpiderMan2099("SpiderMan 2099", "Masculino", "Creado cuando el científico se volvió 50% araña 50% humano tratando de recrear los poderes de SpiderMan.");
        SpiderManCosmico oSpiderManCosmico = new SpiderManCosmico("SpiderMan Cósmico", "Masculino", "Creado cuando un accidente en un laboratorio le dió acceso a una porción de la Fuerza Enigma.");

        System.out.println(oGhostSpider.printState());
        oGhostSpider.trepar();
        oGhostSpider.levantarPeso();
        System.out.println("*********************************************************");
        System.out.println(oSpiderMan2099.printState());
        oSpiderMan2099.trepar();
        oSpiderMan2099.levantarPeso();
        System.out.println("*********************************************************");
        System.out.println(oSpiderManCosmico.printState());
        oSpiderManCosmico.trepar();
        oSpiderManCosmico.levantarPeso();
        System.out.println("*********************************************************");
    }
}
