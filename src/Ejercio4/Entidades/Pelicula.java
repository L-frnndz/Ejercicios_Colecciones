package Ejercio4.Entidades;

public class Pelicula {
    
    private String Titulo;
    private String Director;
    private Integer duracion;

    public Pelicula() {
    }

    public Pelicula(String Titulo, String Director, Integer duracion) {
        this.Titulo = Titulo;
        this.Director = Director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "Titulo = " + Titulo + ", Director = " + Director + ", duracion = " + duracion + "horas}";
    }
    
    
}
