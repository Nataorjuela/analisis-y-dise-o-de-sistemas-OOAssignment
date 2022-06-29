package arsw.app.app;
import arsw.app.lista.MyLinkedList;


public class Calculadora {


    public static double media(MyLinkedList<Double> list){
        double cont = 0;
        for(int i =0; i<list.getSize(); i++){
            cont += list.get(i);
        }
        return cont / list.getSize();
    }

    public static double deviacion(MyLinkedList<Double> list){
        double mean = media(list);
        double cont = 0;

        for(int i=0;i<list.getSize();i++){
            cont += Math.pow((list.get(i)-mean),2);
        }
        double res = Math.sqrt(cont/(list.getSize()-1));
        return res;
    }
}