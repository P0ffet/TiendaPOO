package Backend;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

public class ArticulosDao implements Dao<Articulos>{
    private List<Articulos> listaArticulos;

    public ArticulosDao() {
        listaArticulos.add(new Articulos(12345, "Goma", 5.0, 100));
        listaArticulos.add(new Articulos(23456, "Cuaderno", 50.0, 100));

    }
    @Override
    public Optional<Articulos> get(long id) {
        return Optional.empty();
    }
    @Override
    public List<Articulos> obtenerTodos() {
        return List.of();
    }
    @Override
    public void guardar(Articulos articulos) {

    }
    @Override
    public void actualizar(Articulos articulos, String[] params) {

    }
    @Override
    public void borrar(Articulos articulos) {

    }
}
