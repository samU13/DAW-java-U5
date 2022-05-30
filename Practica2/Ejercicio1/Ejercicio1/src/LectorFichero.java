import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LectorFichero {

        FileReader flE;
        BufferedReader fE;
        int caracter;

            try{
                flE=new FileReader("texto.txt");
                fE=new BufferedReader(flE);
            }catch  (IOException ex){
                System.out.println(ex.getMessage());
            }
        }
        public void leer(){
            try{
                caracter = fE.read();
                while(caracter != -1){
                    // System.out.print(Character.toChars(caracter));
                    System.out.print((char)caracter);
                    caracter = fE.read();
                }
                System.out.println();
                fE.close();

            }catch(IOException e){
                System.out.println(e.getMessage());
            }

        }
    }