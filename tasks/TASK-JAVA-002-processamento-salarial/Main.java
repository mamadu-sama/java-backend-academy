public class Main {
    public static void main(String[] args) {
        int salarioBase = 920;
        int horarioExtra = 6;
        int valorExtra = 8;
        int premioProdutividade = 0;

        if (salarioBase <= 0) {
            System.out.println("ERRO: SALARIO BASE INVALIDO");
        } else if (horarioExtra < 0) {
            System.out.println("ERRO: HORAS EXTRA INVALIDAS");
        } else if (horarioExtra > 20) {
            System.out.println("ERRO: LIMITE DE HORAS EXCEDIDO");
        } else {
            if (horarioExtra >= 10) {
                premioProdutividade = 40;
            }

            int valorTotalExtra = valorExtra * horarioExtra;
            int salarioTotal = salarioBase + valorTotalExtra + premioProdutividade;

            System.out.println("SALARIO TOTAL: " + salarioTotal + " EUR");
        }
    }
}
