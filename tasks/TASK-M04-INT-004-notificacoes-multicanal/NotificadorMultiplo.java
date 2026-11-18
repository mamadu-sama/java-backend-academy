import java.util.ArrayList;
import java.util.Lis

public class NotificadorMultiplo implements Notificador{

    List<Notificador> notificadorList ;

    public NotificadorMultiplo(List<Notificador> notificadorList){

        if(notificadorList == null){
            throw new IllegalArgumentException("Canal invalido")
        }
        this.notificadorList = notificadorList;
    }


    @Override
    public void enviar(String mensagem) {

        if (mensagem == null || mensagem.isBlank()) {
            throw new IllegalArgumentException("Mensagem invalida");
        }
            for (Notificador notificador : notificadorList) {
                notificador.enviar(mensagem);
            }
        }



}