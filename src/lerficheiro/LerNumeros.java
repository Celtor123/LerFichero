
package lerficheiro;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Scanner;

public class LerNumeros {
Scanner sc;
File fich;

public void lerNumeros() {
      fich=new File("/home/local/DANIELCASTELAO/csampedroromero/Documentos/Numero.txt");
       
        try{
            
            sc= new Scanner(fich).useDelimiter("\\s*,\\s*");
            while(sc.hasNextInt()){
            System.out.println(sc.nextInt());
            }
        }catch (FileNotFoundException ex){
         System.out.println("error"+ex.getMessage());
        }
        finally{
            sc.close();
        }
}
   
}
