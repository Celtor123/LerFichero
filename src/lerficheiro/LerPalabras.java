
package lerficheiro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class LerPalabras {
    Scanner sc;
File fich;
public void lerPalabras() {
      fich=new File("/home/local/DANIELCASTELAO/csampedroromero/Documentos/Primeiro.txt");
       
        try{
            
            sc= new Scanner(fich).useDelimiter("\\s*,\\s*");
            while(sc.hasNext()){
            System.out.println(sc.next());
            }
        }catch (FileNotFoundException ex){
         System.out.println("error"+ex.getMessage());
        }
        finally{
            sc.close();
        }
}
  
}
