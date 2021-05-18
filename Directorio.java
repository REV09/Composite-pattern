
import java.util.List;
import java.util.ArrayList;

public class Directorio extends Fichero {

    private List<Fichero> ficheros = new ArrayList<>();

    public Directorio(String nombre) {
        super(nombre);

    }

    public List<Fichero> getFicheros() {
        return ficheros;
    }

    public void setFicheros(List<Fichero> ficheros) {
        this.ficheros = ficheros;
    }

    public void addFichero(Fichero f) {
        ficheros.add(f);
    }

    @Override
    public boolean esDirectorio() {
        return true;
    }
}
