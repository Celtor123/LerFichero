
package persoas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class LerObxecto {
    Scanner sc;
    File fich;
    public void lerObxecto(){
        String linea;
        String[]lista;
        Alumnos a1;
        try{
        sc=new Scanner(new File("/home/local/DANIELCASTELAO/csampedroromero/Documentos/Persona.txt"));
        while(sc.hasNextLine()){
            linea=sc.nextLine();
             lista=new String[2];
            lista=linea.split(", ");
            a1=new Alumnos(lista[0],Integer.parseInt(lista[1]));
           System.out.println(a1);
        }
    }catch (FileNotFoundException ex){
    System.out.println(ex.getMessage());
}
}
    public void suspenso(){
        String[]suspenso;
                 
        
    }
}
