/*Questão 4
________________________________________________________
Na sua escola, você faz três avaliações no ano e a sua nota final é a média aritmética dessas três avaliações.
Para você ser aprovado sua média deve ser maior ou igual a 7.0 pontos, caso contrário você estará reprovado.
Faça um programa para ler suas notas e dizer se você está aprovado ou reprovado.*/

import java.util.Scanner;

public class Questao_4 {
    public static void executar_Q4(){
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual sua nota na primeira avaliação? ");
        double nota1 = ler.nextInt();
        System.out.println("Qual sua nota na segunda avaliação? ");
        double nota2 = ler.nextInt();
        System.out.println("Qual sua nota na terceira avaliação? ");
        double nota3 = ler.nextInt();
        double media =  (nota1 + nota2 + nota3) / 3;

        if (media >= 7.80) {
            System.out.printf("Muito bem tirou uma boa nota, você esta aprovado, sua nota foi %.2f%n", media);

        } else if (media >= 7.00) {
            System.out.printf("Muito bem você esta aprovado, mas passou raspando, sua nota foi %.2f%n", media);

        } else {
            System.out.printf("Que pena você tirou uma nota ruim e foi reporvado, sua nota foi %.2f%n", media);

        }
    }
}
