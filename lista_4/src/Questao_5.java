/*Questão 5
________________________________________________________
Uma das maiores varejistas do mercado resolveu fazer uma promoção onde os clientes poderiam comprar apenas 5 produtos
com descontos incríveis disponíveis. Você deve apenas ler o preço dos produtos na sequência e apresentar o total da
compra do cliente.*/

import java.util.Scanner;

public class Questao_5 {
    public static void executar_Q5() {
        double[] precosProdutos = new double[5];
        Scanner scan = new Scanner(System.in);
        double totalCompra = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o valor do produto " + (i + 1));
            precosProdutos[i] = scan.nextDouble();
            totalCompra = totalCompra + precosProdutos[i];
        }
        System.out.printf("O total da compra foi de R$%.2f", totalCompra);
    }
}
