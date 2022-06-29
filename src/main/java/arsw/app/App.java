package arsw.app.app;

import arsw.app.lista.MyLinkedList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DecimalFormat;

public class App
{
    public static void main( String[] args )
    {
        try {
            MyLinkedList<Double> elementos;
            String sCadena;
            BufferedReader bf = new BufferedReader(new FileReader("prueba.txt"));
            double n;
            while ((sCadena = bf.readLine())!=null) {
                elementos = new MyLinkedList<Double>();
                String[] lista = sCadena.split(" ");
                for (String elemento: lista){
                    n = Double.parseDouble(elemento);
                    elementos.add(n);
                }
                calcular(elementos);
            }
            bf.close();
        }catch (Exception  e){

        }
    }

    public static void calcular(MyLinkedList<Double> elementos){
        DecimalFormat formato = new DecimalFormat("#.##");
        double media = Calculadora.media(elementos);
        double deviacion = Calculadora.deviacion(elementos);
        System.out.println("Mean: " + formato.format(media) + " Deviation: "+ formato.format(deviacion));
    }
}