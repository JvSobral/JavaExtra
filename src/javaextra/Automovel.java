
package javaextra;


public class Automovel {
    private int ano;
    private String placa;
    private String cor;
    
    public Automovel (int ano, String placa, String cor){
        this.ano=ano;
        this.placa=placa;
        this.cor=cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
}
