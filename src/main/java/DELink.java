package main.java;

/**
 * clase que permite crear un nodo y proporciona los métodos necesarios para
 * gestionarlo
 */
public class DELink<T> {
    public T data;
    public DELink<T> next;

    /**
     * <p>
     * Este método permite crear un nuevo nodo.
     * </p>
     * 
     * @param data el tipo de dato que será asignado al campo de dato del nodo.
     * 
     */
    public DELink(T data) {
        this.data = data;
    }

    /**
     * <p>
     * Este método permite acceder al dato de un determinado nodo.
     * </p>
     * 
     * @return el dato que almacena un determinado nodo.
     * 
     */
    public T getData() {
        return this.data;
    }

    /**
     * <p>
     * Este método permite acceder al nodo consecutivo de un determinado nodo.
     * </p>
     * 
     * @return el nodo que se encuentra en el campo de enlace del nodo que llama al
     *         método.
     * 
     */
    public DELink<T> getNext(){
        return next;
    }

    /**
     * <p>
     * Este método permite establecer un enlace entre el nodo que llama el método y
     * el nodo que se desea sea su siguiente.
     * </p>
     * 
     * @param node el nodo que será enlazado como nodo siguiente del nodo que llama al método.
     */
    public void setNext(DELink<T> node){
        this.next = node; 
    }

    /**
     * <p>
     * Este método permite establecer un enlace entre el nodo que llama el método
     * </p>
     * 
     * @param data el nodo que llama al método.
     */
    public void setData(T data) {
        this.data = data;
    }
}