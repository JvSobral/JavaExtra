
package javaextra;


public class Carro extends Automovel {
    private int qtdePortas;

    public Carro(int ano, String placa, String cor, int qtdePortas) {
        super(ano, placa, cor);
        this.qtdePortas=qtdePortas;
    }
    
    

    public int getQtdePortas() {
        return qtdePortas;
    }

    public void setQtdePortas(int qtdePortas) {
        this.qtdePortas = qtdePortas;
    }
    
}
