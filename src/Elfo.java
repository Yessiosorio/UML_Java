public class Elfo extends Persona implements Heroe {
    private String field;

    public Elfo(String nombre, long descripcion, int poder, int vida, String field) {
        super(nombre, descripcion, poder, vida);
        this.field = field;
    }


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
