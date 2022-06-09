package arsw.app;

import arsw.app.LinkedList;
import scala.collection.immutable.List;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

;public class Calculator {

    public static void main( File[] args ){
       File file = args[0];

    
    
        List<Integer> listNum = new LinkedList<Integer>();

        Scanner sc = new Scanner(file); 
  
        while (sc.hasNextLine()) 
        System.out.println(sc.nextLine()); 
        System.out.println("La media del archivo "+file+"es: "+CalMedia(listNum));
        System.out.println("La media del archivo "+file+"es: "+CalDevStan(listNum));
        
    }

    private static String CalMedia(List<Integer> listNum) {

        for (int i = 0;  ; i++) {
            System.out.println(i);
          }
    }

    private static String CalDevStan(List<Integer> listNum) {
        return null;
    }


    
}
