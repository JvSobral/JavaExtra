
package javaextra;

public class Executivo extends Onibus{
    private String tipo;

    public Executivo(int ano, String placa, String cor, int qtdeAssento, String tipo) {
        super(ano, placa, cor, qtdeAssento);
        this.tipo=tipo;
    }
    
   
    
    
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
