/*
* _Q_u_e_st_ã_o_ 1_0_ _______________________________________________
O zoom é uma plataforma de busca dos preços mais baixos da web para um mesmo produto. Ele
além de mostrar o menor valor encontrado, apresenta também o preço médio do produto nos
últimos trinta dias. Para encontrar o preço médio, o programa lê 6 preços durante o mês e calcula
a média deles. Faça um programa que leia os 6 preços do produto e apresente o valor médio.*/

import java.util.Scanner;

public class Questao_10 {
    public static void executar_Q10() {
    Scanner scan = new Scanner(System.in);

    int contador = 1;
    double valor = 0;
    double lerValor = 0;
    double media = 0;

    do {
        System.out.println("Digite o valor do produto no dia " + (contador + 4));
        lerValor = scan.nextDouble();
        valor = valor + lerValor;
        contador++;
    } while (contador <6);
    media = valor / contador;
    System.out.printf("O valor médio é de R$ %.2f%n ", media);
    }
}
