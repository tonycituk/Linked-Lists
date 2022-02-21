package main.java;

import main.java.utils.Orderable;

/**
 * Nodo con enlace siguiente y anterior
 * 
 * @author tonycituk
 * 
 * 
 */
public class DoublyLink<T extends Orderable> {

    private T dData;
    private DoublyLink<T> next;
    private DoublyLink<T> prev;

    /**
     * <p>
     * Crea un nuevo nodo.
     * </p>
     * 
     * @param dd El objeto que será asignado al campo de dato del nodo.
     * 
     */
    public DoublyLink(T dd) {
        this.dData = dd;
        this.next = null;
        this.prev = null;
    }

    /**
     * <p>
     * Despliega en pantalla el nodo.
     * </p>
     */
    public void displayLink() {
        System.out.print("{" + dData.toString() + "} ");
    }

    /**
     * <p>
     * Accede al dato almacenado en el nodo.
     * </p>
     * 
     * @return El dato que almacena el nodo.
     * 
     */
    public T getDato() {
        return this.dData;
    }

    /**
     * <p>
     * Accede al nodo consecutivo del nodo.
     * </p>
     * 
     * @return El nodo siguiente que se encuentra referenciado en el atributo next.
     * 
     */
    public DoublyLink<T> getNext() {
        return this.next;
    }

    /**
     * <p>
     * Accede al nodo previo del nodo.
     * </p>
     * 
     * @return El nodo anterior que se encuentra referenciado en el atributo next.
     * 
     */
    public DoublyLink<T> getPrev() {
        return this.prev;
    }

    /**
     * <p>
     * Establece un enlace entre el nodo que llama el método y
     * el nodo que se desea sea su siguiente.
     * </p>
     * 
     * @param n El nodo que será enlazado como nodo siguiente del nodo que llama al
     *          método.
     * 
     * 
     */
    public void setNext(DoublyLink<T> next) {
        this.next = next;
    }

    /**
     * <p>
     * Establece un enlace entre el nodo que llama el método y
     * el nodo que se desea sea su anterio.
     * </p>
     * 
     * @param prev El nodo que será enlazado como nodo siguiente del nodo que llama
     *             al
     *             método.
     * 
     * 
     */
    public void setPrev(DoublyLink<T> prev) {
        this.prev = prev;
    }

    /**
     * Obtiene un valor a través del método getValue de la interface Orderable
     * @return Valor retornado por getValue de un Orderable
     * @see {@link main.java.utils.Orderable}
     */
    public int getValor() {
        return dData.getValue();
    }

}
