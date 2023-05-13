
package javaextra;


public class Onibus extends Automovel {
    private int qtdeAssento;

    public Onibus(int ano, String placa, String cor, int qtdeAssento) {
        super(ano, placa, cor);
        this.qtdeAssento=qtdeAssento;
    }
    
    

    public int getQtdeAssento() {
        return qtdeAssento;
    }

    public void setQtdeAssento(int qtdeAssento) {
        this.qtdeAssento = qtdeAssento;
    }
    
}
