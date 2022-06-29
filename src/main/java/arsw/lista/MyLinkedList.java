package arsw.app.lista;

import java.util.Iterator;

public class MyLinkedList<E> implements Iterable {

    private Nodo<E> head = new Nodo<E>(null);
    private int size = 0;

    public boolean add(E Nodo) {
        Nodo<E> actual = new Nodo<E>(Nodo);
        if (size == 0) {
            head.setPrior(actual);
            head.setNext(actual);
        } else {
            head.getNext().setNext(actual);
            head.setNext(actual);
        }
        size++;
        return true;
    }


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

    public int getSize() {
        return size;
    }

    public Iterator<E> iterator()
    {
        return new Iterador<E>(head.getPrior());
    }
}