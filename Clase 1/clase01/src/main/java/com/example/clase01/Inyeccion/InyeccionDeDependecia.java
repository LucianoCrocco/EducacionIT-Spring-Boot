package com.example.clase01.Inyeccion;

import java.util.ArrayList;
import java.util.List;

public class InyeccionDeDependecia {
   public static class ItemFactura {
      private String producto;
      private Double precio;
      private Integer cantidad;

      public ItemFactura(String producto, Double precio, Integer cantidad){
         this.precio = precio;
         this.producto = producto;
         this.cantidad = cantidad;
      }

      public String getProducto() {
         return producto;
      }

      public void setProducto(String producto) {
         this.producto = producto;
      }

      public Double getPrecio() {
         return precio;
      }

      public void setPrecio(Double precio) {
         this.precio = precio;
      }
      
      public Integer getCantidad() {
         return cantidad;
      }

      public void setCantidad(Integer cantidad) {
         this.cantidad = cantidad;
      }
   }

   public static class FacturaConInyeccionDeDependencia {
      private Long id;
      private String titular;
      private List<ItemFactura> detalle;

      public FacturaConInyeccionDeDependencia(Long id, String titular, List<ItemFactura> detalle) {
         this.id = id;
         this.titular = titular;
         this.detalle = detalle;
      }

      public Long getId() {
         return id;
      }
      public void setId(Long id) {
         this.id = id;
      }
      public String getTitular() {
         return titular;
      }
      public void setTitular(String titular) {
         this.titular = titular;
      }
      public List<ItemFactura> getDetalle() {
         return detalle;
      }
      public void setDetalle(List<ItemFactura> detalle) {
         this.detalle = detalle;
      }
   }

   public static class FacturaSinInyeccionDeDependencia {
      private Long id;
      private String titular;
      private List<ItemFactura> detalle;

      public FacturaSinInyeccionDeDependencia(Long id, String titular, String producto, Double precio, Integer cantidad) {
         this.id = id;
         this.titular = titular;
         List<ItemFactura> detallesFactura = new ArrayList<>();
         ItemFactura itemFactura = new ItemFactura(producto, precio, cantidad);
         detallesFactura.add(itemFactura);
         this.detalle = detallesFactura;
      }
      
      public Long getId() {
         return id;
      }
      public void setId(Long id) {
         this.id = id;
      }
      public String getTitular() {
         return titular;
      }
      public void setTitular(String titular) {
         this.titular = titular;
      }
      public List<ItemFactura> getDetalle() {
         return detalle;
      }
      public void setDetalle(List<ItemFactura> detalle) {
         this.detalle = detalle;
      }
   }

   @SuppressWarnings("unused")
   public static void main(String[] ...args){
      // Instanciamos los items del detalle de la factura
      ItemFactura item1 = new ItemFactura("pan", 1.000, 1);
      ItemFactura item2 = new ItemFactura("manteca", 500.0, 2);

      // Instanicamos el detalle de factura y agregamos los items
      List<ItemFactura> detallesFactura = new ArrayList<>();
      detallesFactura.add(item1);
      detallesFactura.add(item2);

      // Inyectamos la depedencia en el objeto factura con inyeccion de dependencias.
      FacturaConInyeccionDeDependencia facturaConInyeccionDeDependencia = new FacturaConInyeccionDeDependencia(123L, "Luciano", detallesFactura);

      // Inyectamos la depedencia en el objeto factura sin inyeccion de dependencias.
      FacturaSinInyeccionDeDependencia facturaSinInyeccionDeDependencia = new FacturaSinInyeccionDeDependencia(123L, "Luciano", "manteca", 500.0, 2);

   }

}
