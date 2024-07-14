package com.example.clase01.BeanTres;

public class Persona {
   private Integer id;
   private String nombre;
   private String apellido;
   private Domicilio domicilio;

   public Persona(Integer id, String nombre, String apellido) {
      this.id = id;
      this.nombre = nombre;
      this.apellido = apellido;
   }
   public Persona(Integer id, String nombre, Domicilio domicilio) {
      this.id = id;
      this.nombre = nombre;
      this.domicilio = domicilio;
   }
   
   public Integer getId() {
      return id;
   }
   public void setId(Integer id) {
      this.id = id;
   }
   public String getNombre() {
      return nombre;
   }
   public void setNombre(String nombre) {
      this.nombre = nombre;
   }
   public String getApellido() {
      return apellido;
   }
   public void setApellido(String apellido) {
      this.apellido = apellido;
   }
   public Domicilio getDomicilio() {
      return domicilio;
   }
   public void setDomicilio(Domicilio domicilio) {
      this.domicilio = domicilio;
   }

   @Override
   public String toString() {
      return "TercerBean [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
   }

}
