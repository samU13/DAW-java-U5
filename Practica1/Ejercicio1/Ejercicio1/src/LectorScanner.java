import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LectorScanner {
    Scanner objeto;

    LectorScanner() {
        objeto = new Scanner(System.in);
    }

    public String leeTexto(String mensaje) {
        boolean error = false;
        String texto = " ";
        do {
            error = false;
            System.out.print(mensaje + ": ");
            try {
                texto = objeto.nextLine();
            } catch (Exception e) {
                error = true;
                System.out.println(e.getMessage());
            }
        } while (error);
        return texto;
    }

    public int leeEntero(String mensaje) {
        boolean error = false;
        int entero = 0;
        do {
            error = false;
            System.out.print(mensaje + ": ");
            try {
                entero = Integer.parseInt(objeto.nextLine());
            } catch (Exception e) {
                error = true;
                System.out.println(e.getMessage());
            }
        } while (error);
        return entero;
    }


    public double leeDouble(String mensaje){
        double db = 0;
        boolean error = true;
        do{
            System.out.print(mensaje + ": ");
            try{
                db = Double.parseDouble(objeto.nextLine());
                error=false;
            }catch (Exception e){
                System.out.println(e.getMessage());
                error=true;
            }
        }while(error);
        return db;
    }

    public char leeCaracter(String mensaje){
        char caracter = ' ';
        boolean error = true;
        do{
            System.out.print(mensaje + ": ");
            try{
                caracter=objeto.nextLine().charAt(0);
                error=false;
            }catch (Exception e){
                System.out.println(e.getMessage());
                error=true;
            }
        }while(error);
        return caracter;

    }


}

