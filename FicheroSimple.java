import java.util.List;

public class FicheroSimple extends Fichero {

    public FicheroSimple(String nombre) {
        super(nombre);
    }

    @Override
    public boolean esDirectorio() {
        return false;
    }

    @Override
    public List<Fichero> getFicheros() {
        throw new RuntimeException(" un fichero no contiene directorios");
    }
}
