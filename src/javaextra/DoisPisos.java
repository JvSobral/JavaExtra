
package javaextra;


public class DoisPisos extends Executivo {
    private int qtdeBanheiros;

    public DoisPisos(int ano, String placa, String cor, int qtdeAssento, String tipo, int qtdeBanheiros) {
        super(ano, placa, cor, qtdeAssento, tipo);
        this.qtdeBanheiros=qtdeBanheiros;
    }
     public String toString (){
        return "\n ***ONIBUS DOIS PISOS***" +
               "\n Ano: " + getAno() +
               "\n Placa: " + getPlaca() +
               "\n Cor: " + getCor() +
               "\n Numero de Assentos: " + getQtdeAssento() + 
               "\n Tipo: " + getTipo() + 
               "\n Numero de Banheiros: " + getQtdeBanheiros();
    }
    
    
    

    public int getQtdeBanheiros() {
        return qtdeBanheiros;
    }

    public void setQtdeBanheiros(int qtdeBanheiros) {
        this.qtdeBanheiros = qtdeBanheiros;
    }
    
    
}
