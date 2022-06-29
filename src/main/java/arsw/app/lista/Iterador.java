package arsw.app.lista;
import java.util.Iterator;

public class Iterador<E> implements Iterator<E>{

    Nodo<E> current;

    public Iterador(Nodo<E> actual) {
        current = actual;
    }

    public boolean hasNext() {
        return current != null;
    }

    public E next() {
        E data = current.getData();
        current = current.getNext();
        return data;
    }

    public void remove() {
        ;
    }

}