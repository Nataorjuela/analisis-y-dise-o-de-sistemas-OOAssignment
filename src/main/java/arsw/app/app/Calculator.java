package arsw.app.app;
import arsw.app.lista.MyLinkedList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.DecimalFormat;


public class Calculator {
    public static void main( String[] args ) {
        File file = new File(args[0]);

        MyLinkedList <Double> listNum = new MyLinkedList();

        try {
            if (file.exists()) {
                BufferedReader archiveRead = new BufferedReader(new FileReader(file));
                String dato;
                while ((dato = archiveRead.readLine()) != null) {
                    Double datoDec = Double.parseDouble(dato);
                    listNum.add(datoDec);

                }
                double mean=calMedia(listNum);
                double dev = calDevStan(listNum);
                DecimalFormat formato = new DecimalFormat("#.##");
                System.out.println("Mean= " + formato.format(mean));
                System.out.println("Desviation= " + formato.format(dev));
                archiveRead.close();
            } else {
                System.out.println("No existe el Documento");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static Double calMedia(MyLinkedList<Double> listNum) {
        double cont = 0;
        for(int i =0; i<listNum.getSize(); i++){
            cont += listNum.get(i);
        }
        Double media =cont / listNum.getSize();
        return media;
    }

    private static Double calDevStan(MyLinkedList<Double> listNum) {
        double media = calMedia(listNum);
        double cont = 0;

        for(int i=0;i<listNum.getSize();i++){
            cont += Math.pow((listNum.get(i)-media),2);
        }
        double dev = Math.sqrt(cont/(listNum.getSize()-1));
        return dev;
    }
}
