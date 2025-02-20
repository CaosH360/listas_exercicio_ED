/*_Q_u_e_s_tã_o_ 1_0_ _______________________________________________
A minha sobrinha está aprendendo as letras do alfabeto. Ela ainda confunde o que é vogal e
consoante. Você topou fazer comigo um programa que verifica se uma letra é vogal ou consoante.
Então, é isso, né? Vamos lá?*/


import java.util.Scanner;

public class Questao_10 {
    public static void executar_Q10(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual a letra deseja conferir?");
        String letra = ler.next();

        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
        letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||
        letra.equalsIgnoreCase("u")){
            System.out.println("A letra " + letra  + " é uma vogal.");
        }else {
            System.out.println("A letra " + letra + " é uma consoante.");

        }
    }
}
