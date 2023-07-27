public class Ogro extends Persona implements Villano {
    private String apariencia;

    public Ogro(String nombre, long descripcion, int poder, int vida, String field) {
        super(nombre, descripcion, poder, vida);
        this.apariencia = field;
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
