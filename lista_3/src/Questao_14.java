/*_Q_u_e_st_ã_o_ 1_4_ _______________________________________________
O zoom é uma plataforma de busca dos preços mais baixos da web para um mesmo produto. Ele
além de mostrar o menor valor encontrado, apresenta também o preço médio do produto nos
últimos trinta dias. Para encontrar o menor preço, o programa lê 6 preços durante o mês e
encontra o menor deles. Você deve encontrar o menor preço do produto durante o mês.*/



import java.util.Random;

public class Questao_14 {
    public static void executar_Q14() {

        Random random = new Random();

        double menorValor = Double.MAX_VALUE;
        int dias = 30;
        int diaMenorPreco = -1;

        System.out.println("Digite o preço do produto durantre o mes");

        for (int i = 1; i <=dias; i++) {
            double preco = random.nextDouble() * 10;

            if (preco < menorValor) {
                menorValor = preco;
                diaMenorPreco = i;
            }
            System.out.printf("No dia %d o preço do produto foi de  R$ %.2f %n", i, preco);

        }
        System.out.printf("Durante todo o mês, o menor preço foi de R$ %.2f no dia %d %n", menorValor, diaMenorPreco);
    }
}
