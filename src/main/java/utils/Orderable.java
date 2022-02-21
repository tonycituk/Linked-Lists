package main.java.utils;

/**
 * Interfaz que obliga a implementar getValue en objetos utilizados en DoublyLinkedList y DoublyLink
 * @see {@link main.java.DoublyLink}
 * @see {@link main.java.DoublyLinkedList}
 * @author tonycituk
 * 
 */
public interface Orderable {

    /**
     * Método para valorar/ratear el objeto del cuál se llama
     * @return valor entero que representa el valor (prioridad o rate) del objeto que pertenece a la clase que implementa esta interface.
     */
    public int getValue();
    
}
