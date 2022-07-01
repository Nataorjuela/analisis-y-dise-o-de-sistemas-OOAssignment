package app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.DecimalFormat;

/**
 * Esta clase es la principal donde se le ingresa los argumentos
 *
 */
public class App
{
    public static void main( String[] args ) {
        ImpOper op = new ImpOper();
        MyLinkedList prueba = new MyLinkedList();

        String route = args[0];


        System.out.println(" ");


        File archive = new File(route);

        try {
            //Verify that the file exists or not
            if (archive.exists()) {
                BufferedReader archiveRead = new BufferedReader(new FileReader(archive));

                String lineRead;
                //If it is different from null then it gives the value to the first line to the variable lineRead
                while ((lineRead = archiveRead.readLine()) != null) {
                    //System.out.println(LineRead);
                    Double numEntero = Double.parseDouble(lineRead);
                    prueba.add(numEntero);
                }

                //Stop reading the file
                archiveRead.close();
                //If you can't find the file then ...
            } else {
                System.out.println("NO EXISTE EL ARCHIVO");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(op.media(prueba));
        System.out.println(op.desviacion(prueba));
    }
}
