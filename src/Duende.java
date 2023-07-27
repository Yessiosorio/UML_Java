public class Duende extends Persona implements Villano {
    private String field;

    public Duende(String nombre, long descripcion, int poder, int vida, String field) {
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
    public void destruir(){
}
}
