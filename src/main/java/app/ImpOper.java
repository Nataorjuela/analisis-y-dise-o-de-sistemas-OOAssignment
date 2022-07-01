package app;

import java.util.ArrayList;

/**
 * Esta clase implementa la interface que tiene las operaciones de media y desviación estandar
 *
 *
 */
public class ImpOper implements Operacion{

    /*
     * Calcula la media de un LinkedLisT
     * @return: media que es el valor de la media
     */
    @Override
    public double media(MyLinkedList lista) {
        // TODO Auto-generated method stub

        double media = 0;


        for(int x=1; x<lista.size()+1;x++) {
            double valor = (double) lista.get(x);
            media = media + valor;
        }
        media = media/lista.size();
        return media;
    }
    /*
     * Calcula la desviación estándar de un LinkedLisT
     * @return: resultado que es el valor de la desviación estándar
     */
    @Override
    public double desviacion(MyLinkedList lista) {
        // TODO Auto-generated method stub
        double media = media(lista);
        double val1 = 0;
        double valorTotal =0;
        double contador =0;
        double contador2 =0;

        for(int x=1; x<lista.size()+1;x++) {

            double valor = (double) lista.get(x);
            double resta = valor - media;
            resta = resta * resta;
            contador2+=resta;

        }

        double tempo1 =lista.size()-1;
        double tempo = contador2/tempo1;
        double resultado = Math.sqrt(tempo);

        return resultado;
    }

}
