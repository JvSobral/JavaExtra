
package javaextra;


public class Rodoviario extends Onibus {
    private int qtdePortas;

    public Rodoviario(int ano, String placa, String cor, int qtdeAssento, int qtdePortas) {
        super(ano, placa, cor, qtdeAssento);
        this.qtdePortas=qtdePortas;
    }
    
    public String toString (){
        return "\n ***ONIBUS RODOVIARIO***" +
               "\n Ano: " + getAno() +
               "\n Placa: " + getPlaca() +
               "\n Cor: " + getCor() +
               "\n Numero de Assentos: " + getQtdeAssento() +
               "\n Numero de Portas: "+ getQtdePortas();
    }
    
    
    

    public int getQtdePortas() {
        return qtdePortas;
    }

    public void setQtdePortas(int qtdePortas) {
        this.qtdePortas = qtdePortas;
    }
    
    
    
}
