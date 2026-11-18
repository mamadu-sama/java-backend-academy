public class NotificadorSms implements Notificador{

    @Override
    public void enviar(Strig mensagem){
        System.out.println("SMS: " + mensagem);
    }
}