public class Main {
    public static void main(String[] args) {
        int saldo = 100;
        int valorPagamento = 150;
        boolean contaBloqueada = true;
        int limiteDiario = 300;

        if (valorPagamento <= 0) {
            System.out.println("VALOR INVALIDO");
        } else if (contaBloqueada) {
            System.out.println("CONTA BLOQUEADA");
        } else if (valorPagamento > saldo) {
            System.out.println("SALDO INSUFICIENTE");
        } else if (valorPagamento > limiteDiario) {
            System.out.println("LIMITE EXCEDIDO");
        } else {
            System.out.println("PAGAMENTO AUTORIZADO");
        }
    }
}
