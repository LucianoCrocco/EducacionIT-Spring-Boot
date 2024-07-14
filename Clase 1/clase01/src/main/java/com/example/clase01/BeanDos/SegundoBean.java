package com.example.clase01.BeanDos;

public class SegundoBean {
   private String saludo;
   private String saludoEnIngles;

   public SegundoBean(String saludo, String saludoEnIngles){
      this.saludo = saludo;
      this.saludoEnIngles = saludoEnIngles;
   }
   public String getSaludo() {
      return saludo;
   }

   public void setSaludo(String saludo) {
      this.saludo = saludo;
   }

   public String getSaludoEnIngles() {
      return saludoEnIngles;
   }

   public void setSaludoEnIngles(String saludoEnIngles) {
      this.saludoEnIngles = saludoEnIngles;
   }

   public void mostrarMensaje(String mensaje){
      System.out.println(
         this.saludo
         .concat("\n")
         .concat(mensaje)
      );
   }
}
