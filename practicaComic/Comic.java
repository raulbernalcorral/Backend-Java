package Semana3.practicaComic;

import Semana2.Hilos.TestJoin;
import Semana3.imonsh.Colors;
import Semana3.imonsh.Dialog;
import Semana3.imonsh.Screen;

public class Comic extends Thread{

    public static void main(String[] args) {
        Screen p = new Screen();
        Escena t1 = new Escena("Escena 1", "\nPepe Veraz reporta en las noticias los problemas que se están generando en Dimsdale por la gran cantidad de basura. \nTimmy minimiza la noticia destacando el amarillismo de las noticias mientras tira un bote de jugo por la ventana.", "C:\\1246849\\Java\\Projects\\src\\Semana3\\practicaComic\\images\\Escena1.jpg"),
                t2 = new Escena("Escena 2", "\nLos padres de Timmy han comprado una retroexcavadora con el dinero del fondo de ahorro de Timmy la cual utilizan para recoger la basura. \nChester y AJ notan la gran cantidad de polvo en las calles y deciden salir a jugar. \nTimmy se queja de limpiar basura y decide pedir como deseo que alguien más la limpie", "C:\\1246849\\Java\\Projects\\src\\Semana3\\practicaComic\\images\\Escena2.jpg"),
                t3 = new Escena("Escena 3", "\nAparecen los robots limpiadores que se encargan de recoger toda la basura de la ciudad. \nCrocker sospecha que los robots son obra de los Padrinos Mágicos. \nLos robots comienzan a recoger cosas que no son basura incluyendo la manzana que Crocker estaba comiendo", "C:\\1246849\\Java\\Projects\\src\\Semana3\\practicaComic\\images\\Escena3.jpg"),
                t4 = new Escena("Escena 4", "\nLos robots enloquecen al haber limpiado toda la basura y comienzan a recoger cosas que no lo son. \nLos padrinos mágicos y los amigos de Timmy son capturados por los robots debido a este comportamiento.", "C:\\1246849\\Java\\Projects\\src\\Semana3\\practicaComic\\images\\Escena4.jpg"),
                t5 = new Escena("Escena 5", "\nLos robots se unen en un superrobot dedicado a recoger basura el cual amenaza a todos los habitantes de Dimsdale", "C:\\1246849\\Java\\Projects\\src\\Semana3\\practicaComic\\images\\Escena5.jpg"),
                t6 = new Escena("Escena 6", "\nTimmy describe que cuando recoge la basura por sí mismo, los robots comienzan a desaparecer, revirtiendo su deseo. Timmy recoge la basura y provoca que el superrobot sufra un corto circuito.", "C:\\1246849\\Java\\Projects\\src\\Semana3\\practicaComic\\images\\Escena6.jpg");
        t1.contarEscena(p);
        try{
            Thread.sleep(18000);
        } catch (InterruptedException ie){
            ie.printStackTrace();
        }
        t2.contarEscena(p);
        try{
            Thread.sleep(18000);
        } catch (InterruptedException ie){
            ie.printStackTrace();
        }
        t3.contarEscena(p);
        try{
            Thread.sleep(18000);
        } catch (InterruptedException ie){
            ie.printStackTrace();
        }
        t4.contarEscena(p);
        try{
            Thread.sleep(18000);
        } catch (InterruptedException ie){
            ie.printStackTrace();
        }
        t5.contarEscena(p);
        try{
            Thread.sleep(18000);
        } catch (InterruptedException ie){
            ie.printStackTrace();
        }
        t6.contarEscena(p);
    }
}
