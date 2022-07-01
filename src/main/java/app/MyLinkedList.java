package app;

import java.io.Serializable;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/**
 * Esta es mi propia clase LinkedList donde se implementaron los métodos necesarios
 */
public class MyLinkedList<E> implements List<E>, Deque<E>, Cloneable, Serializable {

    private Nodo<E> first;
    private Nodo<E> last;
    private Nodo<E> temp;
    private int size;
    private int cont;

    public MyLinkedList() {
        first = null;
        last = null;
        size = 0;
        cont=1;
    }
    @Override
    public void addFirst(E arg0) {
        // TODO Auto-generated method stub

    }
    @Override
    public void addLast(E arg0) {
        // TODO Auto-generated method stub

    }
    @Override
    public Iterator<E> descendingIterator() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public E element() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public E getFirst() {
        // TODO Auto-generated method stub

        return (E) first.obtenerValor();
    }
    @Override
    public E getLast() {
        // TODO Auto-generated method stub
        return (E) last.obtenerValor();
    }



    @Override
    public boolean offer(E arg0) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public boolean offerFirst(E arg0) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public boolean offerLast(E arg0) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public E peek() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public E peekFirst() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public E peekLast() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public E poll() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public E pollFirst() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public E pollLast() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public E pop() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public void push(E arg0) {
        // TODO Auto-generated method stub

    }
    @Override
    public E remove() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public E removeFirst() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public boolean removeFirstOccurrence(Object arg0) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public E removeLast() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public boolean removeLastOccurrence(Object arg0) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public boolean add(E e) {
        // TODO Auto-generated method stub
        if(isEmpty()) {
            first = new Nodo<E>(e,size);
            first.setLlave(size);
            last = first;
            size +=1;
        }else {
            Nodo<E> newNode = new Nodo<E>(e,size);
            last.enlazarSiguiente(newNode);
            last = newNode;
            last.setLlave(size);
            size +=1;
        }
        return true;
    }
    @Override
    public void add(int arg0, E arg1) {
        // TODO Auto-generated method stub

    }
    @Override
    public boolean addAll(Collection<? extends E> arg0) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public boolean addAll(int arg0, Collection<? extends E> arg1) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public void clear() {
        // TODO Auto-generated method stub

    }
    @Override
    public boolean contains(Object arg0) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public boolean containsAll(Collection<?> arg0) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public E get(int index){
        // TODO Auto-generated method stub
        temp= first;
        while(cont<index  && temp.obtenerSiguiente()!=null ) {
            cont +=1;
            temp = temp.obtenerSiguiente() ;

        }

        cont =1;
        return (E) temp.obtenerValor();



    }
    public Nodo<E> getTemporal() {
        return temp;
    }
    public void setTemporal(Nodo<E> temporal) {
        this.temp = temporal;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public int getContador() {
        return cont;
    }
    public void setContador(int contador) {
        this.cont= contador;
    }
    public void setFirst(Nodo<E> first) {
        this.first = first;
    }
    public void setLast(Nodo<E> last) {
        this.last = last;
    }
    @Override
    public int indexOf(Object arg0) {
        // TODO Auto-generated method stub

        return 0;
    }
    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        if(first==null) {
            return true;
        }else {
            return false;
        }
    }
    @Override
    public Iterator<E> iterator() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public int lastIndexOf(Object arg0) {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public ListIterator<E> listIterator() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public ListIterator<E> listIterator(int arg0) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public boolean remove(Object arg0) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public E remove(int arg0) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public boolean removeAll(Collection<?> arg0) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public boolean retainAll(Collection<?> arg0) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public E set(int arg0, E arg1) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public int size() {
        // TODO Auto-generated method stub
        return size;
    }
    @Override
    public List<E> subList(int arg0, int arg1) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public Object[] toArray() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public <T> T[] toArray(T[] arg0) {
        // TODO Auto-generated method stub
        return null;
    }

}
