package arsw.app.lista;

import java.util.Iterator;

/**
 *
 *
 */
public class MyLinkedList<E> implements Iterable {

        private Nodo<E> cabeza=new Nodo<E>(null);
        private Nodo<E> cola=new Nodo<E>(null);
        private int size = 0;


    public void add(E Nodo){
        Nodo<E> nuevo = new Nodo<E>(Nodo);
        if (size == 0) {
            cabeza.setPrevious(nuevo);
            cola.setNext(nuevo);
        }

        else {
            cola.setNext(nuevo);
            cola=nuevo;
        }
        size+=1;
    }
    /**
     * Obtiene el elemento dentro de la LinkedList.
     * @param index El indice que indica la posición del elemento que se quiere obtener.
     * @return Dato del nodo
     */
    public E get(int index) {
        if (index < 0 || index < size) {
            int pos = 0;
            Iterator<E> iterador = iterator();
            while (pos != index) {
                iterador.next();
                pos++;
            }
            return iterador.next();
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * Obtiene el tamaño que tiene la linkedList.
     * @return El tamaño que tiene la linkedList.
     */
    public int getSize() {
        return size;
    }


    public Iterator<E> iterator()
    {
        return new Iterador<E>(cabeza.getPrevious());
    }
}
