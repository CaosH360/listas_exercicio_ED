/*Questão 5
________________________________________________________
The Asa’s Club é um clube da cidade e você está trabalhando na portaria dela. As regras para comprar ingressos para
o clube são claramente machistas, mas elas são aplicadas. As mulheres que chegarem até as 22h não pagam a entrada,
mas depois desse horário, elas pagam metade do valor do ingresso. Os homens que chegarem até as 22h pagam 70% do ingresso,
enquanto depois desse horário pagam o valor integral. Você que não perdeu tempo, fez um programa para a portaria. Eu fico me
perguntando porque tu se mete nessas coisas sem ganhar um centavo, mas tudo bem.*/

import java.util.Scanner;

public class Questao_5 {
    public static void executar_Q5(){
        Scanner ler = new Scanner(System.in);
        double valorIngresso = 80.0;
        System.out.println("Diga qual o hora que a pessoa esta entrando?");
        int hora = ler.nextInt();
        System.out.println("Quem esta entrando agora é homem ou mulher?");
        ler.nextLine();
        String sexo = ler.nextLine();

            if (sexo.equalsIgnoreCase("homem")) {
                if (hora < 22) {
                    System.out.printf("Está pessoa terá que pagar o valor integral do ingresso para entrar que é R$ %.2f%n", valorIngresso);
                } else {
                    valorIngresso = valorIngresso * 0.7;
                    System.out.printf("Está pessoa terá que pagar 70% do valor do ingresso para entrar que é R$ %.2f%n", valorIngresso);
                }
            }else {
                if (hora < 22) {
                    valorIngresso = valorIngresso / 2;
                    System.out.printf("Está pessoa terá que pagar metade do valor do ingresso para entrar que é R$ %.2f%n", valorIngresso);
                } else {
                    System.out.println("Está pessoa pode entrar sem pagar o ingresso");
                }
            }


    }

}
