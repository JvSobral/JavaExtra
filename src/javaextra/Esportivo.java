
package javaextra;


public class Esportivo extends Carro {
   private double km;

    public Esportivo(int ano, String placa, String cor, int qtdePortas, Double km) {
        super(ano, placa, cor, qtdePortas);
        this.km=km;
    }
   
   
   

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }
  
    
}
