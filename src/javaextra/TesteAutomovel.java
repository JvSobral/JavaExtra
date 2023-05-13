
package javaextra;


public class TesteAutomovel {
    
    
    public static void main(String[] args) {
        Popular p = new Popular(2015, "JAO-1910", "Azul", 4, 5);
        System.out.println(p);
        
        Audi audi = new Audi (2020, "STA1R77", "Preto", 4, 5000.0, 540.0);
        System.out.println(audi);
        
        Moto moto = new Moto (2018, "LUA-3782", "Vermelha", 600);
        System.out.println(moto);
        
        Rodoviario r = new Rodoviario(2008, "MON-0476", "Branco", 42, 3);
        System.out.println(r);
        
        DoisPisos dp = new DoisPisos(2019, "JVS1S92", "Azul", 60, "Semi-Leito", 2);
        System.out.println(dp);
        
        
    }
    
}
