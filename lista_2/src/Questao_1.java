/*Questão 1
________________________________________________________
Sofia tem oito anos e está aprendendo os números, os antecessores e os sucessores. Você resolveu fazer um programa
para ajudá-la a saber se um número é sucessor de outro. Você basicamente pede como entrada um número, depois o suposto
sucessor, por fim exibe se o suposto sucessor é o sucessor mesmo. É tipo assim: Sofia insere os números: 23 e, depois,
24 e você vai exibir: “O número 24 é sucessor de 23”, mas se Sofia colocar 23 e, depois, 26, você deve exibir: “O número
26 não é sucessor de 23”.*/

import java.util.Scanner;

public class Questao_1 {
    public static void executar_Q1(){
    Scanner ler =  new Scanner(System.in);
        System.out.println("Digite o primeiro número ");
    int num1 = ler.nextInt();
        System.out.println("Digite o segundo número ");
    int num2 = ler.nextInt();

        if (num1 < num2) {
            System.out.println("O número " + num2  +" é sucessor de " + num1);
        } else if (num1 > num2) {
            System.out.println("O número " + num2  +" não é sucessor de " + num1);
        } else {
            System.out.println("O número " + num2  +" é igaul ao número " + num1);
        }
    }
}
