import java.math.List;

public class NotificadorMultiplo implements Notificador{

    List<Notificador> notificadorList = new ArrayList<>();

    public NotificadorMultiplo(Notificador notificadorList){

        if(notificadorList == null){
            throw new IllegalArgumentException("Canal invalido")
        }
        this.notificadorList = notificadorList;
    }


    @Override
    public enviar(String mensagem){

        System.out.println(mensagem);

    }

    public  void notificar(String mensagem)
        if (mensagem == null || mensagem.isBlank()){
            throw new IllegalArgumentException("Mensagem invalida");

        for (Notificador notificador : notificadorList){
            notificador.enviar(mensagem)
        }
    }

    public static void main(String[] args){



    }
}