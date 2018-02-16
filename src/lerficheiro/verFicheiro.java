
package lerficheiro;

import lerficheiro.LerLineas;
import lerficheiro.LerNumeros;
import lerficheiro.LerPalabras;
import persoas.LerObxecto;


public class verFicheiro {
     public static void main(String[] args) {
      LerLineas a =new LerLineas();
      LerNumeros b= new LerNumeros();
      LerPalabras z =new LerPalabras();
      LerObxecto w= new LerObxecto();
    a.lerlineas();
        b.lerNumeros();
        z.lerPalabras();
        w.lerObxecto();
    }
    
}
