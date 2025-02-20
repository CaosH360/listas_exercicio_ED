/*_Q_u_e_s_tã_o_ 9_ ________________________________________________
Um baralho contém 52 cartas de 4 tipos (naipes) diferentes: paus, espadas, copas e ouro. Em cada
naipe, que consiste de 13 cartas, 3 dessas cartas contêm as figuras do rei, da dama e do valete,
respectivamente. Faça um programa que leia um número de 1 a 13 e informe qual carta o número
representa por extenso. Lembrando que temos algumas cartas especiais: 1 (Ás), 11 (Valete), 12
(Rainha), 13 (Rei).*/


import java.util.Scanner;

public class Questao_9 {
    public static void executar_Q9(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o naipe da carta");
        String naipe = ler.nextLine();
        System.out.println("Me diga o número da carta de 1 a 13 que direi qual carta ela é: ");
        int numCarta = ler.nextInt();

        if (numCarta == 1) {
            System.out.printf("Sua carta é um Ás de %s", naipe);
        } else if (numCarta == 11) {
            System.out.printf("Sua carta é um Valete de %s", naipe);

        } else if (numCarta == 12) {
            System.out.printf("Sua carta é uma rainha de %s", naipe);

        } else if (numCarta == 13) {
            System.out.printf("Sua carta é um Rei de %s", naipe);

        } else {
            System.out.printf("Sua carta é um %d de %s", numCarta, naipe);
        }


    }
}
