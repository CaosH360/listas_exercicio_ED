/*_Q_u_e_s_tã_o_ 8_ _______________________________________________
Em um jogo de tabuleiro, um jogador pode movimentar uma peça apenas se o número do seu
dado for maior que o do seu adversário. Faça um programa que informe se o jogador pode ou não
jogar aquela partida. Leia o número do dado do jogador e do seu adversário e informe quem deve
jogar. No caso de empate, nenhum dos jogadores joga.*/


import java.util.Scanner;

public class Questao_8 {
    public static void executar_Q8(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome do jogador 1");
        String jogador1 = ler.nextLine();
        System.out.println("Digite o nome do jogador 2");
        String jogador2 = ler.nextLine();
        System.out.println("Qual número do dado o "+ jogador1 +" tirou");
        int DadoJ1 = ler.nextInt();
        System.out.println("Qual número do dado o "+ jogador2 +" tirou");
        int DadoJ2 = ler.nextInt();

        if (DadoJ1 > DadoJ2) {
            System.out.println("Quem vai jogar nessa rodada será o(a) jogador(a) "+ jogador1);
        } else if (DadoJ2 > DadoJ1) {
            System.out.println("Quem vai jogar nessa rodada será o(a) jogador(a) " + jogador2);
        } else {
            System.out.println("A rodada resultou em empate, ninguém irá jogar");

        }
    }
}
