package Backend;

import java.util.List;
import java.util.Optional;

public interface Dao<T>{
    Optional<T> get(long id);
    List<T> obtenerTodos();
    void guardar(T t);
    void actualizar(T t, String[] params);
    void borrar(T t);
}
