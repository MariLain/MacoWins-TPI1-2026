package ar.edu.utn.frba.dds.macowins;


public class ItemPrenda {
  private Prenda prenda;
  private int cantidad;
  private double precio;

  public ItemPrenda(Prenda prenda, int cantidad) {
    this.prenda = prenda;
    this.cantidad = cantidad;
    this.precio = prenda.precio(); //El precio lo calcula el Estado segun el precio base de la Prenda
  }

  public int getCantidad() {
    return cantidad;
  }

  public double getPrecio() {
    return precio;
  }
}