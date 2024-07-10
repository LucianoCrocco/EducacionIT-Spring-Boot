package com.desafio.desafio.models;

import com.desafio.desafio.interfaces.IVehiculos;

public class Colectivo implements IVehiculos{
   @Override
   public Integer getCapacidad() {
      return 80;
   }
}
