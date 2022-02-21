public class DELinkListTest {

    public static void main(String[] args) {
        DELinkList<String> list = new DELinkList<>();

        // Insert before and After para la primer lista de 5 peliculas.
        list.insertFirst("Fast and Furious");
        list.insertBefore("Fast and Furious", "Transformers");
        list.insertBefore("Transformers", "The Pianist");
        list.insertAfter("Fast and Furious", "Avengers");
        list.insertAfter("Avengers", "Sing");
        System.out.println("El tamanio de la lista es de: " + list.getSize());
        list.forEach(elm -> System.out.print(elm + " --> "));
        
        // Se insertan otras 5 peliculas al inicio de la lista anterior.
        list.insertFirst("2012");
        list.insertFirst("The Purge");
        list.insertFirst("Deadpool");
        list.insertFirst("Spiderman");
        list.insertFirst("Harry Potter");

        // Imprime la lista de las 10 peliculas antes de cualquier otro proceso.
        System.out.println("\n\nAntes de remover: ");
        list.forEach(elm -> System.out.print(elm + " --> "));
        
        // Imprime el tamanio de lista de peliculas.
        System.out.println("\nEl tamanio de la lista es de: " + list.getSize());
        System.out.println("\n");

        // Se hace el remplazo del nodo de la posición 1.
        list.replace(0, "PIXELS");

        // Imprime la lista con el cambio realizado.
        System.out.println("La lista luego del remplazo quedo como: \n");
        list.forEach(elm -> System.out.print(elm + " --> "));

        // Muestra cual es el primero y ultimo elemento de la lista, ademas de su tamanio.
        System.out.println("\nEl primer elemento de la lista es :" + list.getFirst().getData());
        System.out.println("\nEl ultimo elemento de la lista es :" + list.getLast().getData());
        System.out.println("\nEl tamanio de la lista de: " + list.getSize());

        // Se hace la busqueda por posicion en la lista.
        System.out.println(
                "\nSe encontro el elemento Fast and Furious en la posicion: " + list.search("Fast and Furious"));
        // Se hace la busqueda por elemento y se devuelve -1 al no encontrarse en la lista.
        System.out.println("\nNo se encontro el elemento Scream : " + list.search("Scream"));
        // Obtener la pelicula que remplazo a otra en la lista.

        System.out.println("Obtener el valor nuevo que era correspondiente a la posicion de Harry Potter : "
        + list.getNode(0).getData());

        // Borran 2 elementos inciales de la lista .
        list.deleteFirst();
        list.deleteFirst();
        
        //Se actualiza la lista luego de esos cambios.
        System.out.println("\nDespues de remover: ");
        list.forEach(elm -> System.out.print(elm + " --> "));

        // Muestra cual es el primero y ultimo elemento de la lista, ademas de su tamanio.
        System.out.println("\nEl primer elemento de la lista es :" + list.getFirst().getData());
        System.out.println("\nEl ultimo elemento de la lista es :" + list.getLast().getData());
        System.out.println("\nEl tamanio de la lista de: " + list.getSize());

        //Se borra el ultimo elemento de la lista.
        System.out.println("\nRemove last: " + list.deleteLast());

        //Se asigna un nuevo ultimo elemento de la lista.
        System.out.println("New last: " + list.getLast().getData());
        list.forEach(elm -> System.out.print(elm + " --> "));
        
        //Se hacen 2 remplazos, uno por posicion y otro por el dato.
        System.out.println("\nRemover el nodo de la posicion 2: " + list.removeByPosition(2));
        System.out.println("\nRemover el elemento proporcionado: " + list.removeByData("The Purge"));

        //Se muestra el tamanio de la lista.
        System.out.println("\nEl tamanio de la lista de: " + list.getSize());
        list.forEach(elm -> System.out.print(elm + " --> "));
        
        //Se borran todos los elementos, por lo que la lista se limpia.
        list.removeList();

        //Validacion que demuestra que la lista quedo vacia.
        System.out.println("\n\nSe eliminaron los elementos de la lista...");
        System.out.println("El tamanio de la lista de: " + list.getSize());
    }
}