/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author rafa
 */
public class vehiculos {
  private static int vehiculosCreados;
  private static int kilometrosTotales;

  public vehiculos() {
  }

  public static int getVehiculosCreados() {
    return vehiculosCreados;
  }

  public static void setVehiculosCreados(int vehiculosCreados) {
    vehiculos.vehiculosCreados = vehiculosCreados;
  }

  public static int getKilometrosTotales() {
    return kilometrosTotales;
  }

  public static void setKilometrosTotales(int kilometrosTotales) {
    vehiculos.kilometrosTotales = kilometrosTotales;
  }
  
  
  public class bicileta {
    private String  tipoBici;
    private boolean ruedines;

    public bicileta(String tipoBici, boolean ruedines) {
      this.tipoBici = tipoBici;
      this.ruedines = ruedines;
    }

    public String getTipoBici() {
      return tipoBici;
    }

    public void setTipoBici(String tipoBici) {
      this.tipoBici = tipoBici;
    }

    public boolean isRuedines() {
      return ruedines;
    }

    public void setRuedines(boolean ruedines) {
      this.ruedines = ruedines;
    }

    @Override
    public String toString() {
      return "bicileta{" + "tipoBici=" + tipoBici + ", ruedines=" + ruedines + '}';
    }
    
  }
  
}
