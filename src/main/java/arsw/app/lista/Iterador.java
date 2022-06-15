package arsw.app.lista;


import java.util.Iterator;

public class Iterador<E> implements Iterator<E>{

    Nodo<E> current;

    /**
     * Constructor de la clase LinkedListIterator.
     * @param actual Actual nodo en el que se encuentra el iterador.
     */
    public Iterador(Nodo<E> actual) {
        current = actual;
    }

    /**
     * Verifica si el actual nodo tiene un nodo siguiente.
     * @return boolean
     */
    public boolean hasNext() {
        return current != null;
    }

    /**
     * Obtiene el valor del nodo actual
     * @return E
     */
    public E next() {
        E valor = actual.getValor();
        actual = actual.getNext();
        return valor;
    }

    public void remove() {
        Iterator.super.remove();
    }
}
