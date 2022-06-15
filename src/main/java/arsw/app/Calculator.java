package arsw.app;
import arsw.app.LinkedList;
import scala.collection.immutable.List;
import java.io.File;
import java.io.FileReader;
import javax.sound.sampled.SourceDataLine;
import LinkedList;

public class Calculator {

    public static void main( String[] args ) {
        File file = new File(args[0]);
        LinkedList listNum = new LinkedList();

        try {
            if(file.exists()) {
                BufferedReader archiveRead = new BufferedReader(new FileReader(file));
                String dato;
                while((dato = archiveRead.readLine()) != null ) {
                   Double datoDec=Double.parseDouble(dato);
                    System.out.println(datoDec);
                }
                archiveRead.close();
            }else {
                System.out.println("No existe el Documento");
            }
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }



        System.out.println("La media del archivo " + file + "es: " + CalMedia(listNum));
        System.out.println("La desviación estandar del archivo " + file + "es: " + CalDevStan(listNum));


    }

    private static String CalMedia(List<Integer> listNum) {

    }
    private static String CalDevStan(List<Integer> listNum) {
        return null;
    }
}
