/*_Q_u_e_s_tã_o_ 7_ ________________________________________________
Você agora quer fazer um programa apenas para exercitar a sua lógica. Basicamente, você viu que
o IBGE faz uma consulta de 5 preços para ver a média de preços. Você resolveu fazer o seguinte:
ler os valores, calcular a média e verificar quais valores estão acima da média.*/

import java.util.Scanner;

public class Questao_7 {
    public static void executar_Q7(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome do produto");
        String nomeProduto = ler.nextLine();
        System.out.println("Digite o valor do produto no 1° mercado em questão");
        double ValorMercado1 = ler.nextDouble();
        System.out.println("Digite o valor do produto no 2° mercado em questão");
        double ValorMercado2 = ler.nextDouble();
        System.out.println("Digite o valor do produto no 3° mercado em questão");
        double ValorMercado3 = ler.nextDouble();
        System.out.println("Digite o valor do produto no 4° mercado em questão");
        double ValorMercado4 = ler.nextDouble();
        System.out.println("Digite o valor do produto no 5° mercado em questão");
        double ValorMercado5 = ler.nextDouble();

        double media = (ValorMercado1 + ValorMercado2 + ValorMercado3 + ValorMercado4 + ValorMercado5) / 5;

        System.out.printf("A média é R$ %.2f%n", media);
        System.out.println("Os mercados com preços acima da media sao: ");
        if (ValorMercado1 > media) {
            System.out.printf("Mercado 1 no produto %s com um valor de R$ %.2f%n", nomeProduto, ValorMercado1);
        }
        if (ValorMercado2 > media) {
            System.out.printf("Mercado 2 no produto %s com um valor de R$ %.2f%n", nomeProduto, ValorMercado2);
        }
        if (ValorMercado3 > media) {
            System.out.printf("Mercado 3 no produto %s com um valor de R$ %.2f%n", nomeProduto, ValorMercado3);
        }
        if (ValorMercado4 > media) {
            System.out.printf("Mercado 4 no produto %s com um valor de R$ %.2f%n", nomeProduto, ValorMercado4);

        }
        if (ValorMercado5 > media) {
            System.out.printf("Mercado 5 no produto %s com um valor de R$ %.2f%n", nomeProduto, ValorMercado5);
        }

    }
}
