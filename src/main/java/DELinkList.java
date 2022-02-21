package main.java;

import java.util.Iterator;

public class DELinkList<T> implements IDELinkList<T>, Iterable<T>{
    private DELink<T> first;
    private DELink<T> last;
    private int size = 0;

    public DELinkList() {
        first = null;
        last = null;
    }

    /**
     * <p>
     * Este método permite verificar si la lista está vacía.
     * </p>
     * 
     * @return true en caso de que la lista esté vacía, false en caso contrario.
     * 
     */
    public boolean isEmpty() {
        return (first==null);
    }

    /**
     * <p>
     * Este método permite insertar un nodo nuevo en la primera posición de la
     * lista.
     * </p>
     * 
     * @param data el dato que se requiere asignar al nuevo nodo de la lista.
     * 
     */
    public void insertFirst(T data) {
        DELink<T> newLink = new DELink<T>(data);
        if(isEmpty())
            last = newLink;
        newLink.next = first;
        first = newLink;
        size++;
    }

    /**
     * <p>
     * Este método permite insertar un nodo nuevo para que ocupe la última posición
     * de la lista.
     * </p>
     * 
     * @param data el dato que se requiere asignar al nuevo nodo de la lista.
     * 
     */
    public void insertLast(T data) {
        DELink<T> newLink = new DELink<T>(data);
        if(isEmpty())
            first = newLink;
        else
            last.next = newLink;
        last = newLink;
        size++;
    }

    /**
     * <p>
     * Este método permite eliminar un nodo desde la primera posición de la lista.
     * </p>
     * 
     * @return el nodo que anteriormente a la eliminación ocupaba la primera
     *         posición de la lista.
     * 
     */
    public T deleteFirst() {
        T temp = first.getData();
        if(first.next == null)
            last = null;
        first = first.getNext();
        size--;
        return temp;
    }

    /**
     * <p>
     * Este método permite eliminar un nodo desde la última posición de la lista.
     * </p>
     * 
     * @return el nodo que anteriormente a la eliminación ocupaba la última posición
     *         de la lista.
     * 
     */
    public T deleteLast(){
      T temp = last.getData();
      if(first.equals(last)){
        removeList();
      }else{
        DELink<T> node = getNode(getSize() - 2); // obtiene el antepenultimo nodo
        last = node;
        node.setNext(null);
        size--;
      }
      return temp;
    }

    // Método que devuelva el primer elemento de la lista (solo lo devuelve, no lo
    // elimina de la lista)
    /**
     * <p>
     * Este método regresa el nodo correspondiente a la primera posición de la
     * lista.
     * </p>
     * 
     * @return El primer nodo de la lista si es que no está vacía, null en caso
     *         contrario.
     * 
     */
    @Override
    public DELink<T> getFirst() {
        if(!isEmpty())
            return first;
        return null;
    }
    // Método que devuelva el último elemento de la lista (solo lo devuelve, no lo elimina de la lista)

    /**
     * <p>
     * Este método regresa el nodo correspondiente a la última posición de la lista.
     * </p>
     * 
     * @return el último nodo de la lista si es que no está vacía, null en caso
     *         contrario.
     * 
     */
    @Override
    public DELink<T> getLast() {
        if (!isEmpty())
            return last;
        return null;
    }

    /**
     * <p>
     * Validar lo que signifca que el nodo este fuera de rango
     * </p>
     * 
     * @param position la posicion que tiene un respectivo nodo.
     * 
     */
    private boolean isOutOfRange(int position){
      return (isEmpty() || (position < 0 || position >= getSize()));
    }

    /**
     * <p>
     * Verificar que el nodo se encuentre en alguna de las posiciones de la lista y no fuera de rango.
     * </p>
     * 
     * @param position la posicion que tiene un respectivo nodo.
     * 
     */
    public DELink<T> getNode(int position) {
      if(isOutOfRange(position)){
        return null;
      } else if(position == 0){
        return this.first;
      } else if(position == getSize() - 1){
        return this.last;
      }else {
        DELink<T> foundedNode = first;
        int count = 0;
        while( count < position){
          count++;
          foundedNode = foundedNode.getNext();
        }
        return foundedNode;
      }
    }

    // Método para insertar un elemento antes de uno proporcionado (búsqueda por dato).
    /**
     * <p>
     * Este método permite insertar un nodo nuevo antes de algún nodo existente.
     * </p>
     * 
     * @param dataRef el dato existente en alguno de los nodos de la lista, que
     *               servirá de referencia para insertar antes.
     * @param newData el nuevo dato que se asignará a un nuevo nodo que será
     *               insertado antes del nodo de referencia.
     * 
     */
    @Override
    public void insertBefore(T dataRef, T newData) {
      int position = search(dataRef);
      if(!isOutOfRange(position)){
        if(position == 0){
          insertFirst(newData);
        } else {
          DELink<T> prevNode = getNode(position - 1);
          DELink<T> newNode = new DELink<T>(newData);
          newNode.setNext(prevNode.getNext());
          prevNode.setNext(newNode);
          size++;
        }
      }
    }

    // Método para insertar un elemento después de uno proporcionado (búsqueda por dato).
    /**
     * <p>
     * Este método permite insertar un nodo nuevo después de algún nodo existente.
     * </p>
     * 
     * @param dataRef el dato existente en alguno de los nodos de la lista, que
     *               servirá de referencia para insertar después.
     * @param newData el nuevo dato que se asignará a un nuevo nodo que será
     *               insertado después del nodo de referencia.
     * 
     */
    @Override
    public void insertAfter(T dataRef, T newData) {
      int position = search(dataRef);
      if(!isOutOfRange(position)){
        if(position == (getSize() - 1)){
          insertLast(newData);
        } else {
          DELink<T> newNode = new DELink<T>(newData);
          DELink<T> currNode = getNode(position);
          newNode.setNext(currNode.getNext());
          currNode.setNext(newNode);
          size++;
        }
      }
    }

    // Método para eliminar un elemento proporcionado (mediante su dato)
    /**
     * <p>
     * Este método permite eliminar el nodo de la lista que contenga un dato
     * específico.
     * </p>
     * 
     * @param data el dato existente en alguno de los nodos de la lista, que servirá
     *             para buscar el nodo a eliminar.
     * 
     */
    @Override
    public T removeByData(T data) {
      int position = search(data);
      if(position == -1){
        return null;
      }
      return removeByPosition(position);
    }

    // Método para eliminar un nodo de una posición proporcionada mediante su indice
    /**
     * <p>
     * Este método permite eliminar el nodo de la lista que corresponda a una
     * posición determinada
     * </p>
     * 
     * @param position el entero que representa la posición del nodo que se desea
     *               eliminar.
     * 
     */
    @Override
    public T removeByPosition(int position) {
        DELink<T> currNode = first;
        DELink<T> prevNode = null;
        if(isOutOfRange(position)){
          return null;
        }else if(position == 0){
          return deleteFirst();
        }else if(position == getSize() - 1){
          return deleteLast();
        }else{
          currNode = getNode(position);
          prevNode = getNode(position - 1);
          prevNode.setNext(currNode.getNext());
          size--;
        }
        return currNode.getData();
    }

    // Método para eliminar todos los elementos de la lista (limpiar la lista).
    /**
     * <p>
     * Este método eliminar todos los elementos de la lista para dejarla vacía.
     * </p>
     */
    @Override
    public void removeList() {
        if (!isEmpty()) {
            first = null;
            last = null;
            size = 0;
        }
    }

    // Método para hacer una búsqueda de un elemento y devolver -1 si no lo encontró
    // y la posición del dato en la lista en caso de que se haya encontrado
    /**
     * <p>
     * Este método permite buscar un dato para saber si se encuentra en alguno de
     * los nodos de la lista, también permite conocer la posición del dato si se
     * encontró.
     * </p>
     * 
     * @param data el dato que servirá de referencia para buscar si en la lista se
     *             encuentra algún nodo que contenga dicho dato.
     * @return un entero que representa la posición del nodo donde se encontró el
     *         dato en la lista. Si regresa -1 indica que no se encontró un nodo con
     *         dicho dato
     */
    @Override
    public int search(T data) {
        DELink<T> currNode = first;
        int position = 0;
        while(currNode != null){
          if(currNode.getData().equals(data)){
            return position;
          }
          currNode = currNode.getNext();
          position++;
        }
        return -1;
    }

    // Método para reemplazar un nodo de una posición proporcionada con otro nodo.
    /**
     * <p>
     * Este método permite reemplazar el nodo de una posición determinada en la
     * lista con un nuevo nodo.
     * </p>
     * 
     * @param position el entero que representa la posición del nodo que se desea
     *            sustituir.
     * @param data  el nodo que se desea que sustituya al nodo de la posición enviada.
     * 
     */
    @Override
    public void replace(int position, T data) {
      if(isEmpty() || (position < 0 || position >= getSize())){
        System.out.println("Lista vacia");
      }{
        DELink<T> temp = getNode(position);
        temp.setData(data);
      }
    }

    // Método que devuelva el tamaño de la lista
    /**
     * <p>
     * Este método permite conocer el tamaño de la lista, es decir el número de
     * elementos que contiene.
     * </p>
     * 
     * @return un entero que representa la cantidad de elementos almacenados en la
     *         lista.
     * 
     */
    @Override
    public int getSize() {
        return this.size;
    }

    /**
     * <p>
     * Iterador o contador que se usa para recorrer la lista de nodos.
     * </p>
     * @return iterableDELinkList 
     * 
     */
    @Override
    public Iterator<T> iterator() {
        return new IterableDELinkList();
    }

    /**
     * <p>
     * Metodo que implementa al iterador
     * </p>
     * 
     * @return iterableDELinkList
     * 
     */
    public class IterableDELinkList implements Iterator<T> {
        private DELink<T> curr = first;

        /**
         * <p>
         * Verificar si hay más elementos en la iteracion
         * </p>
         * 
         * @return booleano de que existen mas elementos que iterar.
         * 
         */
        @Override
        public boolean hasNext() {
            return curr != null;
        }

        /**
         * <p>
         * Creacion del siguiente nodo.
         * </p>
         * 
         * @return el siguiente elemento de la iteracion.
         * 
         */
        @Override
        public T next() {
            T node = curr.getData();
            curr = curr.getNext();
            return node;
        }
    }
}
