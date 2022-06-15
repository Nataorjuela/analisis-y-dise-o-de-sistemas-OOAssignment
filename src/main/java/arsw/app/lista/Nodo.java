package arsw.app.lista;

public class Nodo<E> {
    private E valor;
    private Nodo<E> next = null;
    private Nodo<E> previous = null;

    /**
     * Constructor de la clase Nodo.
     * @param valor ingresa la información que se va a almacenar en este nodo.
     */
    public Nodo(E valor) {
        this.valor = valor;
    }

    /***
     * Actualiza la información que almacena este nodo.
     * @param valor La nueva información que se va a almacenar en este nodo.
     */
    public void setValor(E valor) {
        this.valor = valor;
    }

    /**
     * Actualiza cual es el nodo siguiente del nodo actual.
     * @param next El nuevo nodo siguiente al nodo actual
     */
    public void setNext(Nodo<E> next) {
        this.next = next;
    }

    /**
     * Actualiza cual es el nodo anterior del nodo actual.
     * @param previous El nuevo nodo anterior al nodo actual.
     */
    public void setPrevious(Nodo<E> previous) {
        this.previous = previous;
    }

    /**
     * Obtiene la información que almacena este nodo.
     * @return valores del nodo
     */
    public E getValor() {
        return valor;
    }

    /**
     * Obtiene cual es el nodo siguiente del nodo actual.
     * @return El nodo siguiente al nodo actual.
     */
    public Nodo<E> getNext() {
        return next;
    }

    /**
     * Obtiene el anterior nodo del nodo actual.
     * @return El anterior nodo del nodo actual.
     */
    public Nodo<E> getPrevious() {
        return previous;
    }


}