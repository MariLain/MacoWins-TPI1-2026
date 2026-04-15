package ar.edu.utn.frba.dds.macowins;

public class Nueva implements Estado {

  public Nueva() {
  }

  @Override
  public double precio(double precioBase) {
    return precioBase;
  }
}
