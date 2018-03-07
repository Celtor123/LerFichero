
package persoas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LerObxecto {
    Scanner sc;
    
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
        try {
            sc=new Scanner (new File("/home/local/DANIELCASTELAO/csampedroromero/Documentos/Persona.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LerObxecto.class.getName()).log(Level.SEVERE, null, ex);
        }
        String[]suspenso;
                 
        
    }
    public void lerficheiro() throws FileNotFoundException{
//        File fich = new File("....")
//        FileReader fr = new FileReader (fich);
//        BufferedReader br = new BufferedReader (fr);
//        br.readLine();
//        br.close();
    }
}
