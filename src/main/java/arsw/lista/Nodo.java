package arsw.app.lista;


public class Nodo<E> {
    private E data;
    private Nodo<E> next = null;
    private Nodo<E> prior = null;


    public Nodo(E data) {
        this.data = data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public void setNext(Nodo<E> next) {
        this.next = next;
    }


    public E getData() {
        return data;
    }


    public Nodo<E> getNext() {
        return next;
    }

    public Nodo<E> getPrior() {
        return prior;
    }

    public void setPrior(Nodo<E> prior) {
        this.prior = prior;
    }
}