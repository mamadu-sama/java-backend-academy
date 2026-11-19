import java.util.List;
import java.util.ArrayList;

public class TesteNotificacoes {


    public static void main(String[] args){


        Notificador  email = new NotificadorEmail();
        Notificador sms = new NotificadorSms();



        List<Notificador> notificadores = new ArrayList<>();
        notificadores.add(email);
        notificadores.add(sms);

        NotificadorMultiplo canais = new NotificadorMultiplo(notificadores);

        ServicoBancario  servico = new ServicoBancario(canais);

        servico.avisarCliente("Aviso enviado para todos os canais");



    }
}