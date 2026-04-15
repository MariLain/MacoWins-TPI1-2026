package ar.edu.utn.frba.dds.macowins;

public class Prenda {
  private Estado estado;
  private double precioBase;

  public Prenda(Estado estado, double precioBase) {
    this.estado = estado;
    this.precioBase = precioBase;
  }

  public double precio() {
    return estado.precio(precioBase);
  }

}
