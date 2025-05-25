package Backend;

import java.util.List;
import java.util.ArrayList;

public class ArticulosDao implements Dao{
    private List<Articulos> articulos = new ArrayList<>();

    public ArticulosDao() {
        articulos.add(new Articulos(123456, "Papel", 10.0, 200));
        articulos.add(new Articulos(234567, "Lápiz", 15.0, 100));
    }
    public List<Articulos> getArticulos() {
        return articulos;
    }

    @Override
    public void guardar(Articulos articulo) {
        articulos.add(articulos);
    }
    @Override
    public void borrar(Articulos articulo) {
        articulos.remove(articulo);
    }
    @Override
    public void actualizar(Articulos articulo) {
        articulos.set((int) articulo.getId(), articulo);
    }
}
