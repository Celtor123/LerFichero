
package lerficheiro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class LerLineas {
Scanner sc;
File fich;
public void lerlineas() {
      fich=new File("/home/local/DANIELCASTELAO/csampedroromero/Documentos/Primeiro.txt");
       
        try{
            
            sc= new Scanner(fich).useDelimiter("\\s*,\\s*");
            while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
            }
        }catch (FileNotFoundException ex){
         System.out.println("error"+ex.getMessage());
        }
        finally{
            sc.close();
        }
}
  
    
}
