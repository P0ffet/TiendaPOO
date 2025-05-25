package Backend;

import java.util.List;

public interface Dao {
    List<A> getAll();
    void guardar(A a);
    void actualizar(A a);
    void borrar(A a);
}
