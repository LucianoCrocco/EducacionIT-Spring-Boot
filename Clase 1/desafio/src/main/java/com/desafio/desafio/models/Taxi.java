package com.desafio.desafio.models;

import com.desafio.desafio.interfaces.IVehiculos;

public class Taxi implements IVehiculos {
   @Override
   public Integer getCapacidad() {
      return 4;
   }
}
