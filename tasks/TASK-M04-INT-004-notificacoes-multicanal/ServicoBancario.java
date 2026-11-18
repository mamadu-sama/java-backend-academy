import java.util.Objects;

public class ServicoBancario {
    private final Notificador notificador;


    public ServicoBancario(Notificador notificador){

        this.notificador = Objects.requireNonNull(notificador);
    }


    public void avisarCliente(String mensagem){
        notificador.enviar(mensagem);
    }
}