public class TesteNotificacoes {


    public static void main(String[] args){


        Notificador  email = new NotificadorEmail();
        Notificador sms = new NotificadorSms();

        Notificador notificadoes = new NotificadorMultiplo(email, sms);

        notificadoes.avisarCliente("Aviso geral enviado");

    }
}