
import app.ImpOper;
import app.MyLinkedList;
import junit.framework.TestCase;

public class Test extends TestCase
{

    /*
     *Deberia calcular la mediana
     */
    public void testDeberiaCalcularLaMedia() {

        ImpOper op = new ImpOper();
        MyLinkedList prueba = new MyLinkedList();
        prueba.add(160.0);
        prueba.add(591.0);
        prueba.add(114.0);
        prueba.add(229.0);
        prueba.add(230.0);
        prueba.add(270.0);
        prueba.add(128.0);
        prueba.add(1657.0);
        prueba.add(624.0);
        prueba.add(1503.0);


        assertEquals(550.6,op.media(prueba));

    }

    /*
     *Deberia calcular la desviación estándar
     */
    public void testDeberiaCalcularLaDesviacionEstandar() {

        ImpOper op = new ImpOper();
        MyLinkedList prueba = new MyLinkedList();
        prueba.add(160.0);
        prueba.add(591.0);
        prueba.add(114.0);
        prueba.add(229.0);
        prueba.add(230.0);
        prueba.add(270.0);
        prueba.add(128.0);
        prueba.add(1657.0);
        prueba.add(624.0);
        prueba.add(1503.0);

        assertEquals(572.026844746915,op.desviacion(prueba));

    }


}