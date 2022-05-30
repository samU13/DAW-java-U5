import java.time.LocalDateTime;

public class FechaActual {

    public void mostrarFecha(){
        LocalDateTime fecha= LocalDateTime.now();
        System.out.printf("Día: %1$tA,%1$td de %1$tB de %1$tY%nHora: %1$tH:%1$tM:%1$tS%n",fecha);
    }
}
