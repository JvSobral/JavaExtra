 
package javaextra;


public class Moto extends Automovel {
    private int cilindradas;

    public Moto(int ano, String placa, String cor, int cilindradas) {
        super(ano, placa, cor);
        this.cilindradas=cilindradas;
    }
    
    public String toString (){
        return "\n ***MOTO***" +
               "\n Ano: " + getAno() +
               "\n Placa: " + getPlaca() +
               "\n Cor: " + getCor() +
               "\n Cilindradas: " + getCilindradas() + "cc";
    }
    
    

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    
}
