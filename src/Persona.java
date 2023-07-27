public abstract class Persona {
    private String nombre;
    private long descripcion;
    private int poder;
    private int vida;

    public Persona(String nombre, long descripcion, int poder, int vida) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.poder = poder;
        this.vida=vida;}

    public abstract void Desplazarse ();
    public int mostrarVida (){
        return vida;
    }
    public void mostrarPoder (){}
}
