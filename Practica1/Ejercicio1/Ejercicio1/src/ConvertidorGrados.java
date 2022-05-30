public class ConvertidorGrados {
    LectorTeclado teclado = new LectorTeclado();


    public void comprobador(){
        int minimo;
        int maximo;
        do{
           minimo=teclado.leeEntero("Introduce grados Faren minimo (0-20): ");

        }while(minimo<0 || minimo>20);

        do{
            maximo=teclado.leeEntero("Introduce grados Faren maximo (30-50): ");

        }while(maximo<30 || maximo>50);

        for(int i =minimo; i<maximo; i++){
            System.out.println("Fahrenheit: "+i);
            System.out.println("Celsius: "+((i-32)/1.8));
        }
    }


}
