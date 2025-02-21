/*_Q_u_e_st_ã_o_ 7_ ________________________________________________
Em um jogo de buraco, a soma dos pontos é importante para saber a equipe vencedora. Deste
modo, vamos fazer um programa que some todos os pontos de um jogador e ao fim imprima a
pontuação total. A leitura deve terminar quando uma pontuação negativa for informada.*/


import java.util.Scanner;

public class Questao_7 {
    public static void executar_Q7() {
        int pontos = 0;
        int lerPontos;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite os pontos do jogador ");
            lerPontos = scan.nextInt();
            pontos = pontos + lerPontos;

        } while (lerPontos < 0);

        System.out.println("a pontuação total é: " +  pontos);

    }
}
