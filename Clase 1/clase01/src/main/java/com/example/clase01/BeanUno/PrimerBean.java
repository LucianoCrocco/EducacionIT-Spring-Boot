package com.example.clase01.BeanUno;

public class PrimerBean {
   private String saludo;

   public PrimerBean(){

   }

   public String getSaludo() {
      return saludo;
   }

   public void setSaludo(String saludo) {
      this.saludo = saludo;
   }

   public void mostrarMensaje(String mensaje){
      System.out.println(
         this.saludo
         .concat("\n")
         .concat(mensaje)
      );
   }
}
