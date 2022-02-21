package main.java;

/**
 * Interface donde se declaran los metodos a utilizar sin la implementacion de los mismos.
 */
public interface IDELinkList<T>{
    DELink<T> getFirst();
    DELink<T> getLast();
    void insertBefore(T dataRef, T newData);
    void insertAfter(T dataRef, T newData);
    T removeByData(T data);
    T removeByPosition(int position);
    void removeList();
    int search(T data);
    void replace(int position, T data);
    int getSize();
    boolean isEmpty();
}
