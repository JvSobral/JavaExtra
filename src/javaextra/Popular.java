
package javaextra;

public class Popular extends Carro {
    private int qtdePassageiros;

    public Popular(int ano, String placa, String cor, int qtdePortas, int qtdePassageiros) {
        super(ano, placa, cor, qtdePortas);
        this.qtdePassageiros=qtdePassageiros;
    }
    
    public String toString (){
        return "\n ***CARRO POPULAR***" +
               "\n Ano: " + getAno() +
               "\n Placa: " + getPlaca() +
               "\n Cor: " + getCor() +
               "\n Numero de portas: " + getQtdePortas() + 
               "\n Numero de passageiros: " + getQtdePassageiros();
    }
    
    
    

    public int getQtdePassageiros() {
        return qtdePassageiros;
    }

    public void setQtdePassageiros(int qtdePassageiros) {
        this.qtdePassageiros = qtdePassageiros;
    }
    
}
