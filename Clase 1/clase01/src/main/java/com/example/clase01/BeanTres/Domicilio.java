package com.example.clase01.BeanTres;

public class Domicilio {
   private String direccion;

   public Domicilio() {}

   public String getDireccion() {
      return direccion;
   }
   public void setDireccion(String direccion) {
      this.direccion = direccion;
   }

   @Override
   public String toString() {
      return "Domicilio [direccion=" + direccion + "]";
   }
}
