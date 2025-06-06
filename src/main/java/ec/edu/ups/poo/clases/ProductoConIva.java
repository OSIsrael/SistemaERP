package ec.edu.ups.poo.clases;

import ec.edu.ups.poo.enums.UnidadMedida;
import java.util.Objects;

public class ProductoConIva extends Producto {
    private double porcentajeIVA;

    public ProductoConIva() {
    }

    public ProductoConIva(int id, String nombreProducto, double precioProducto, UnidadMedida unidadMedida, double porcentajeIVA) {
        super(id, nombreProducto, precioProducto, unidadMedida);
        this.porcentajeIVA = porcentajeIVA;
    }

    public double getPorcentajeIVA() {
        return porcentajeIVA;
    }

    public void setPorcentajeIVA(double porcentajeIVA) {
        this.porcentajeIVA = porcentajeIVA;
    }

    @Override
    public double calcularPrecio() {
        // Corregido para sumar el IVA al precio base
        double respuesta = getPrecioProducto() + porcentajeIVA * getPrecioProducto();
        return respuesta;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProductoConIva that = (ProductoConIva) o;
        return Double.compare(porcentajeIVA, that.porcentajeIVA) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), porcentajeIVA);
    }

    @Override
    public String toString() {
        // Podrías incluir el porcentaje de IVA si es relevante para la representación
        return "ProductoConIva{" +
                "id=" + getId() + // Incluir atributos de la superclase para mejor visualización
                ", nombreProducto='" + getNombreProducto() + '\'' +
                ", precioProducto=" + getPrecioProducto() +
                ", unidadMedida=" + getUnidadMedida() +
                ", porcentajeIVA=" + porcentajeIVA +
                '}';
    }
}