package ar.edu.utn.frba.dds.macowins;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class Local {
  private Collection<Venta> ventas;

  public double gananciasDelDia(LocalDate dia) {
    return ventas.stream().filter(v -> v.getFecha().equals(dia)).mapToDouble(Venta::importe).sum();
  }

  public Local(Collection<Venta> ventas) {
    this.ventas = new ArrayList<>(ventas);
  }
}
