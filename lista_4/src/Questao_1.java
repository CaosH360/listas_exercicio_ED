/*Questão 1
________________________________________________________
O Banco Central do Brasil (BACEN) é a instituição responsável pelo controle monetário do real brasileiro. Um dos fatores
que o BACEN monitora é a variação do valor de moedas estrangeiras no mercado brasileiro. O preço do dólar é um deles.
Nós vamos fazer um monitoramento simples do preço do dólar. Você deve criar um programa que leia 5 preços do dólar em
casas de câmbio distintas. Após ler os valores, por favor, imprima-os na ordem de leitura.*/

import java.util.Scanner;


public class Questao_1 {
    public static void executar_Q1() {
        Scanner scan= new Scanner(System.in);
        double[] valor = new double[5];
        int contador = 0;

        while (contador < 5){
            System.out.printf("Digite o preço do USD$ (dolar) em R$ (reais) na casa de câmbio %d %n", (contador + 1));
            valor[contador] = scan.nextDouble();
            contador++;
        }

        contador = 0;

        while (contador <5 ) {
            System.out.printf("O preço do dolar na casa de cambio %d é de R$ %.2f %n", (contador + 1), valor[contador]);
            contador++;

        }

    }
}
