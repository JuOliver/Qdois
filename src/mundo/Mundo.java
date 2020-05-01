
package mundo;

/**
 *
 * @author Juliana
 */

public class Mundo {
    
    public static void main(String[] args) {
     Paises argentina = new Paises () ;
     
     argentina.setNome("Argentina");
     argentina.setCapital("Buenos Aires");
     argentina.setDimensao("2.780.000 km²");
     
     argentina.paisesVisinhos = new String [5];
     argentina.paisesVisinhos[0] = "Brasil";
     argentina.paisesVisinhos[1] = "Chile";
     argentina.paisesVisinhos[2] = "Paraguai";
     argentina.paisesVisinhos[3] = "Uruguai";
     argentina.paisesVisinhos[4] = "Bolivia";
  
    
    
    }
    
    
}
