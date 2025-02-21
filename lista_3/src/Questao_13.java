/*_Q_u_e_st_ã_o_ 1_3_ _______________________________________________
Em uma mesa de apostas, o jogador que tirar o maior número vence a rodada. Cada mesa de
apostas tem o máximo de 6 jogadores. Após lido as jogadas, você deve informar a face de maior
valor, assim como o jogador que fez essa jogada.*/

import java.util.Scanner;

public class Questao_13 {
    public static void executar_Q13() {
        Scanner scan= new Scanner(System.in);
        int maxJogadores = 6;
        int maiorValor = Integer.MIN_VALUE;
        int vencedor = -1;

        System.out.println("Digite o valor da jogada para ate no maximo "+ maxJogadores + " de jogadores ");

        for (int i = 1; i <=maxJogadores; i++) {
            int jogada = scan.nextInt();

            if (jogada > maiorValor) {
                maiorValor = jogada;
                vencedor = i;
            }

        }
        System.out.println("O vencedor é o jogador " + vencedor + " com um valor de " + maiorValor);
    }
}
