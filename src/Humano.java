public class Humano extends Persona implements Heroe {
    private String field;

    public Humano(String nombre, long descripcion, int poder, int vida, String field) {
        super(nombre, descripcion, poder, vida);
        this.field = field;
    }

    @Override
    public void Desplazarse() {
    }

    @Override
    public void atacar() {
    }

    @Override
    public void defender() {
    }

    @Override
    public void recibirAtaque(){
}
}
