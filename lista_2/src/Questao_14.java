/*Questão 14
________________________________________________________
Chega de trabalhar com datas! Agora vamos trabalhar com números aleatórios.
Você está fazendo um sistema de rifas. Você deve ler o número máximo da rifa,
por exemplo: 30, 50, 100, assim como o número da rifa apostado pelo usuário.
Você deve fazer o sorteio e verificar se o número que o usuário escolheu foi
o sorteado. Procure como gerar números aleatórios na internet.*/

import java.util.Random;
import java.util.Scanner;

public class Questao_14 {
    public static void executar_Q14(){
        Scanner ler = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Digite quantos números tem a rifa. Ex.: 100 'vai de 0 a 99' ");
        int rifa = ler.nextInt();
        System.out.println("Digite o número escolhido pelo usuário");
        int userNum = ler.nextInt();
        int sorteio = random.nextInt(rifa);

        boolean venceu = userNum == sorteio;

        if (venceu) {
            System.out.printf("O usuário venceu com o número %d", sorteio);

        }else {
            System.out.printf("O usuário não venceu com o número %d pois o número sorteado foi %d",userNum, sorteio);
        }
    }
}
