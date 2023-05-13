
package javaextra;


public class Audi extends Esportivo{
    private double potencia;

    public Audi(int ano, String placa, String cor, int qtdePortas, Double km, double potencia) {
        super(ano, placa, cor, qtdePortas, km);
        this.potencia=potencia;
    }
    public String toString (){
        return "\n ***AUDI***" +
               "\n Ano: " + getAno() +
               "\n Placa: " + getPlaca() +
               "\n Cor: " + getCor() +
               "\n Numero de Portas: " + getQtdePortas() + 
               "\n Quilometragem: "  + getKm() + "Km" + 
               "\n Potência: " + getPotencia() + "cv"   ;
    }
    
    
    

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    
    
}
