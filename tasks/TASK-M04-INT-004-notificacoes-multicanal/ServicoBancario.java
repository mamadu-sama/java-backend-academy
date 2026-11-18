import java.util.Objects;

public class ServicoBancario {
    private final NotificadorMultiplo notificadorMultiplo;


    public ServicoBancario(NotificadorMultiplo notificadorMultiplo){

        this.notificadorMultiplo = Objects.requireNonNull(notificadorMultiplo);
    }
}