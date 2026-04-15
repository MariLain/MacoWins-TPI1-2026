package ar.edu.utn.frba.dds.macowins;

import java.time.LocalDate;
import java.util.Collection;

public class VentaTarjeta extends Venta {
  private int cuotas;
  private double coeficiente;

  public VentaTarjeta(Collection<Prenda> prendas, LocalDate fecha, int coutas, double coeficiente) {
    super(prendas, fecha);
    this.cuotas = coutas;
    this.coeficiente = coeficiente;
  }

  @Override
  public double importe() {
    return coeficiente * cuotas + 0.01 * super.importe() + super.importe();
  }

}
