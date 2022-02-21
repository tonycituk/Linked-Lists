package main.java;

public class Movie implements Comparable<Movie>{
    private String titulo;
    private String duracion;

    @Override
    public int compareTo(Movie m2) {
        return this.getTitulo().compareTo(m2.getTitulo());
    }

    public Movie (String titulo, String duracion){
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public void setTitulo(String titulo){
        this.titulo  = titulo;
    }

    public void setPresupuesto(String duracion){
        this.duracion = duracion;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getDuracion(){
        return this.duracion;
    }

    public String toString() {
        //return this.titulo + " - " + this.duracion ;
        return this.titulo;
    }
}
