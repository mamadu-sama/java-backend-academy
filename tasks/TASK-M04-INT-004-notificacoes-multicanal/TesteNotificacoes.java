import java.util.List;
import java.util.ArrayList;

public class TesteNotificacoes {


    public static void main(String[] args){


        Notificador  email = new NotificadorEmail();
        Notificador sms = new NotificadorSms();



        List<Notificador> notificadores = new ArrayList<>();
        notificadores.add(email);
        notificadores.add(sms);

        ServicoBancoo  servico = new ServicoBanco(notificadores);
        servico.avisarCliente("Aviso enviado")



    }
}