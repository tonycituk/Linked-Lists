package test.java;

import main.java.DoublyLink;
import main.java.DoublyLinkList;

public class DoublyLinkListTest {
    public static void main(String[] args) {
        DoublyLinkList<ObjectTest> list = new DoublyLinkList<ObjectTest>();

        try {
            //Inserta antes y después del 6
            ObjectTest miObject = new ObjectTest(6);
            list.insertFirst(new ObjectTest(6));
            list.insertBefore(miObject, new ObjectTest(5));

            list.insertBefore(miObject, new ObjectTest(4));
            list.insertAfter(miObject, new ObjectTest(7));
            list.insertAfter(miObject, new ObjectTest(8));
            System.out.println("El tamanio de la lista es de: " + list.getSize());
            list.displayList();

            // Se insertan otros 3 nuevos objetos al inicio de la lista anterior.
            list.insertFirst(new ObjectTest(3));
            list.insertFirst(new ObjectTest(2));
            list.insertFirst(new ObjectTest(1));

            // Imprime la lista antes de cualquier otro proceso.
            System.out.println("\n\nAntes de remover: ");
            list.displayList();

            // Imprime el tamanio de lista de peliculas.
            System.out.println("\nEl tamanio de la lista es de: " + list.getSize());
            System.out.println("\n");

            // Se hace el remplazo del nodo de la posición 1.
            list.replaceAtWith(1, new DoublyLink<ObjectTest>(new ObjectTest(1)));

            // Imprime la lista con el cambio realizado.
            System.out.println("La lista luego del remplazo quedo como: \n");
            list.displayList();

            // Muestra cual es el primero y ultimo elemento de la lista, ademas de su
            // tamanio.
            System.out.println("\nEl primer elemento de la lista es :" + list.getFirst().getDato());
            System.out.println("\nEl ultimo elemento de la lista es :" + list.getLast().getDato());
            System.out.println("\nEl tamanio de la lista de: " + list.getSize());

            // Se hace la busqueda por posicion en la lista.
            System.out.println(
                    "\nSe encontro el elemento en la posicion: " + list.buscar(new ObjectTest(7)));
            // Se hace la busqueda por elemento y se devuelve -1 al no encontrarse en la
            // lista.
            System.out.println("\nNo se encontro el: " + list.buscar(new ObjectTest(79)));

            // Borran 2 elementos inciales de la lista .
            list.deleteFirst();
            list.deleteFirst();

            // Se actualiza la lista luego de esos cambios.
            System.out.println("\nDespues de remover: ");
            list.displayList();

            // Muestra cual es el primero y ultimo elemento de la lista, ademas de su
            // tamanio.
            System.out.println("\nEl primer elemento de la lista es :" + list.getFirst().getDato());
            System.out.println("\nEl ultimo elemento de la lista es :" + list.getLast().getDato());
            System.out.println("\nEl tamanio de la lista de: " + list.getSize());

            // Se borra el ultimo elemento de la lista.
            System.out.println("\nRemove last: " + list.deleteLast());

            // Se asigna un nuevo ultimo elemento de la lista.
            System.out.println("New last: " + list.getLast().getDato());
            list.displayList();

            // Se hacen remuevo por posicion
            System.out.println("\nRemover el nodo de la posicion 2 ");
            list.deleteAt(1);

            // Se muestra el tamanio de la lista.
            System.out.println("\nEl tamanio de la lista de: " + list.getSize());
            list.displayList();

            // Se borran todos los elementos, por lo que la lista se limpia.
            list.clearList();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Validacion que demuestra que la lista quedo vacia.
        System.out.println("\n\nSe eliminaron los elementos de la lista...");
        System.out.println("El tamanio de la lista de: " + list.getSize());
    }
}
