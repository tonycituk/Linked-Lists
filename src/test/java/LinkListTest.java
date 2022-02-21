package test.java;

import main.java.Link;
import main.java.LinkList;

public class LinkListTest {
    public static void main(String[] args) {
        LinkList<String> list = new LinkList<>();

        try {
            // Insert before and After para la primer lista de 5 peliculas.
            list.insertFirst("Fast and Furious");
            list.insertBefore("Fast and Furious", "Transformers");
            list.displayList();

            list.insertBefore("Transformers", "The Pianist");
            list.insertAfter("Fast and Furious", "Avengers");
            list.insertAfter("Avengers", "Sing");
            System.out.println("El tamanio de la lista es de: " + list.getSize());
            list.displayList();

            // Se insertan otras 5 peliculas al inicio de la lista anterior.
            list.insertFirst("2012");
            list.insertFirst("The Purge");
            list.insertFirst("Deadpool");
            list.insertFirst("Spiderman");
            list.insertFirst("Harry Potter");

            // Imprime la lista de las 10 peliculas antes de cualquier otro proceso.
            System.out.println("\n\nAntes de remover: ");
            list.displayList();

            // Imprime el tamanio de lista de peliculas.
            System.out.println("\nEl tamanio de la lista es de: " + list.getSize());
            System.out.println("\n");

            // Se hace el remplazo del nodo de la posición 1.
            list.replaceAtWith(1, new Link<String>("Pixels"));

            // Imprime la lista con el cambio realizado.
            System.out.println("La lista luego del remplazo quedo como: \n");
            list.displayList();

            // Muestra cual es el primero y ultimo elemento de la lista, ademas de su
            // tamanio.
            System.out.println("\nEl primer elemento de la lista es :" + list.first().getDato());
            System.out.println("\nEl ultimo elemento de la lista es :" + list.last().getDato());
            System.out.println("\nEl tamanio de la lista de: " + list.getSize());

            // Se hace la busqueda por posicion en la lista.
            System.out.println(
                    "\nSe encontro el elemento Fast and Furious en la posicion: " + list.buscar("Fast and Furious"));
            // Se hace la busqueda por elemento y se devuelve -1 al no encontrarse en la
            // lista.
            System.out.println("\nNo se encontro el elemento Scream : " + list.buscar("Scream"));

            // Borran 2 elementos inciales de la lista .
            list.deleteFirst();
            list.deleteFirst();

            // Se actualiza la lista luego de esos cambios.
            System.out.println("\nDespues de remover: ");
            list.displayList();

            // Muestra cual es el primero y ultimo elemento de la lista, ademas de su
            // tamanio.
            System.out.println("\nEl primer elemento de la lista es :" + list.first().getDato());
            System.out.println("\nEl ultimo elemento de la lista es :" + list.last().getDato());
            System.out.println("\nEl tamanio de la lista de: " + list.getSize());

            // Se borra el ultimo elemento de la lista.
            System.out.println("\nRemove last: " + list.deleteLast());

            // Se asigna un nuevo ultimo elemento de la lista.
            System.out.println("New last: " + list.last().getDato());
            list.displayList();

            // Se hacen 2 remplazos, uno por posicion y otro por el dato.
            System.out.println("\nRemover el nodo de la posicion 2 ");
            list.deleteAt(2);
            list.displayList();

            System.out.println("\nRemover el elemento proporcionado ");
            list.deleteWhere("2012");

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
        System.out.println("El tamanio de la listaes  de: " + list.getSize());
    }

}
