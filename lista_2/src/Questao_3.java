/*Questão 3
________________________________________________________
Você sabe que o “par ou ímpar” é o modo tradicional de escolher algo pela sorte. Normalmente,
as duas pessoas usam apenas uma mão e escolhem o número de dedos que desejam. Você soma o total
de dedos e verifica se o número é ímpar ou par. Um número é par se a sua divisão inteira por 2 resta
zero, um número é ímpar no caso contrário. Então, faça isso. Leia o número de dedos da mão de cada
jogador e diga se o resultado deu ímpar ou par.*/


import java.util.Scanner;

public class Questao_3 {
    public static void executar_Q3(){
        Scanner ler =  new Scanner(System.in);
        System.out.println("Qual numero o jogador 1 jogou? ");
        int jopgador1 = ler.nextInt();
        System.out.println("Qual numero o jogador 2 jogou? ");
        int jogador2 = ler.nextInt();
        int parImpar = (jopgador1 + jogador2) % 2;

        if(parImpar < 1) {
            System.out.println("O numero é par, quem escolheu par é o vencedor!");
        } else {
            System.out.println("O numero é impar, quem escolheu par é o vencedor!");

        }

    }
}
