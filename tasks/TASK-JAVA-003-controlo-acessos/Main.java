
public class Main {

    public static void main(String[] a){
        int horaEntrada = 22;
        boolean cartaoValido = true;
        boolean formacaoConcluida = true;
        boolean autorizacaoEspecial = true;
        String nomeProfissional = "Carlos";

        if(horaEntrada < 0 || horaEntrada > 23){
            System.out.println("ERRO: HORA INVALIDA");
        }else if(!cartaoValido){
            System.out.println("ACESSO NEGADO: CARTAO INVALIDO");
        }else if(!formacaoConcluida){
            System.out.println("ACESSO NEGADO: FORMACAO PENDENTE");
        }else if((horaEntrada < 7 || horaEntrada > 19) && !autorizacaoEspecial ){ 
           System.out.println("ACESSO NEGADO: FORA DO HORARIO");
        }else{
            System.out.println("ACESSO AUTORIZADO");
        }
        


    }
    
}
