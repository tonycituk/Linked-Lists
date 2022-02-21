package test.java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import main.java.*;
import main.java.utils.ExcepcionDynamicList;
public class App {
    public static void main(String[] args) throws Exception {
        //this.usuarios = new ArrayList <Usuario>();
        LinkList<Movie> l = new LinkList<Movie>();

        //String ruta1 = "C:/Users/fer98/Desktop/JAVA VS CODE/problema2/Movie.csv";
        String ruta = "Movie.csv";
        String linea = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            int i = 0;
            while( (linea = br.readLine()) != null && i<4){
                String[] datos = linea.split(",");
                //Movie movie = new Movie(datos[1], Double.parseDouble(datos[7]));
                Movie movie  = new Movie(datos[1], datos[2]);
                l.insertFirst(movie);
                //usr.imprimirInfo(); //Eliminar después
                i++;
            }
            Movie m2 = new Movie("Batman","120");
            l.insertLast(m2);
            System.out.println("Primer nodo " + l.first().getDato().getTitulo() + "Duración " + l.first().getDato().getDuracion());
            System.out.println("último nodo " + l.last().getDato().getTitulo() + "Duración " + l.last().getDato().getDuracion());
            l.displayList();
            Movie m = new Movie("Avatar", "178");
            System.out.println("Objeto creado: " + m.getTitulo() + " " + m.getDuracion());


           // System.out.println("Buscando Spectre" + l.buscar(m));
            //metodo 2
            System.out.println("size: " + l.getSize());

            //metodo 3
            Movie movie = new Movie("Pokemon","105");
            l.insertBefore(m, movie);
            l.displayList();

            //metodo 4
            Movie movie2 = new Movie("Minions","123");
            l.insertAfter(movie, movie2);
            l.displayList();

            //metodo 5, pendiente a), b)
            LinkList<Movie> k = new LinkList<Movie>();
            Movie m10 = new Movie("Sonic","45");
            Movie m9 = new Movie("Spiderman", "124");
            Movie m8 = new Movie("Avengers", "105");
            Movie m7 = new Movie("Nemo","98");
            Movie m6 = new Movie("Sandalia","98");
            Movie m5 = new Movie("Sr","98");
            Movie mk5 = new Movie("Zombiland","98");
            Movie mk6 = new Movie("Digimon","98");
            
            k.insertCrescent(m9);
            k.insertCrescent(m8);
            k.insertCrescent(m7);
            k.insertCrescent(m6);
            k.insertCrescent(m5);
            k.insertCrescent(mk5);
            k.insertCrescent(mk6);
            k.insertCrescent(m10);
            k.displayList();

            k.clearList();

            k.insertDecrescent(m9);
            k.insertDecrescent(m8);
            k.insertDecrescent(m7);
            k.insertDecrescent(m6);
            k.insertDecrescent(m5);
            k.insertDecrescent(mk5);
            k.insertDecrescent(mk6);
            k.insertDecrescent(m10);

            k.displayList();
            //metodo 6
            l.deleteWhere("Avatar");
            l.displayList();

            //metodo 7
            l.deleteAt(3);
            l.displayList();


            //metodo 9
            System.out.println("Buscando minions " + l.buscar("Minions"));
            System.out.println("Buscando emoji " + l.buscar("emoji"));

            //metodo 10
            Movie m3 = new Movie("Coco","134");
            Link<Movie> link1 = new Link<Movie>(m3);
            l.replaceAtWith(2, link1);
            l.displayList();

            //metodo 8 (clear)
            l.clearList();
            l.insertFirst(m3);
            l.displayList();

            //String a = "Nemo";
            //System.out.println(a.compareTo("Spiderman"));
            br.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex){
            ex.printStackTrace();
        }catch(ExcepcionDynamicList ex){
            ex.printStackTrace();
        }
    }
}
