package ar.edu.utn.frba.dds.macowins;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class Venta {
  private Collection<ItemPenda> itemsPrendas;
  private LocalDate fecha;

  public LocalDate getFecha() {
    return fecha;
  }

  public double importe() {
    return itemsPrendas.stream().map(item -> item.getPrecio * item.getCantidad()).sum();
  }

  public Venta(Collection<ItemPenda> ItemPrendas, LocalDate fecha) {
    this.itemsPrendas = new ArrayList<>(ItemPendas);
    this.fecha = fecha;
  }
}
