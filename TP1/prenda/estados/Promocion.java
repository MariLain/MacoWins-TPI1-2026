package ar.edu.utn.frba.dds.macowins;

public class Promocion implements Estado {

  private double descuento;

  public Promocion(double descuento) {
    this.descuento = descuento;
  }

  @Override
  public double precio(double precioBase) {
    return precioBase - descuento;
  }
}
