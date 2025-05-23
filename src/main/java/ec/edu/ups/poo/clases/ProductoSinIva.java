package ec.edu.ups.poo.clases;

import ec.edu.ups.poo.enums.UnidadMedida;

import java.util.Objects;

public class ProductoSinIva extends Producto{
    private String categoriaExension;

    public ProductoSinIva() {
    }

    public ProductoSinIva(int id, String nombreProducto, double precioProducto, UnidadMedida unidadMedida) {
        super(id, nombreProducto, precioProducto, unidadMedida);
    }

    @Override
    public double calcularPrecio() {
        System.out.println(categoriaExension);
        return getPrecioProducto();
    }

    public ProductoSinIva(int id, String nombreProducto, double precioProducto, UnidadMedida unidadMedida, String categoriaExension) {
        super(id, nombreProducto, precioProducto, unidadMedida);
        this.categoriaExension = categoriaExension;
    }

    public String getCategoriaExension() {
        return categoriaExension;
    }

    public void setCategoriaExension(String categoriaExension) {
        this.categoriaExension = categoriaExension;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProductoSinIva that = (ProductoSinIva) o;
        return Objects.equals(categoriaExension, that.categoriaExension);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), categoriaExension);
    }

    @Override
    public String toString() {
        return "ProductoSinIva{" +
                "categoriaExension='" + categoriaExension + '\'' +
                '}';
    }
}
