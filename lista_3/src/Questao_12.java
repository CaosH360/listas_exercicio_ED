/*_Q_u_e_st_ã_o_ 1_2_ _______________________________________________
As empresas aéreas calculam o preço médio das suas bagagens considerando o peso médio das
malas despachadas durante um ano. O valor de cada quilo corresponde a R$ 10,00. Você deve ler
os pesos até que uma bagagem com peso zero seja informada. No final, exiba o peso médio das
bagagens e o novo preço da bagagem.*/


import java.util.Scanner;

public class Questao_12 {
    public static void executar_Q12() {
        Scanner scan = new Scanner(System.in);
        int contador = 0;
        double precoQuilo = 10.00;
        double precoBagagem = 0;
        double pesoBagagem = 0;
        double  lerPesoBagagem = 0;

        do {
            System.out.println("Digite os pesos das bagagens durante o ano ");
            lerPesoBagagem = scan.nextDouble();
            pesoBagagem = pesoBagagem + lerPesoBagagem;
            contador++;
        }while (lerPesoBagagem != 0);
        pesoBagagem = pesoBagagem / contador;
        precoBagagem = pesoBagagem * precoQuilo;
        System.out.printf("O peso médio das bagagens durante o ano é %.2f, e o novo preço é de R$ %.2f %n", pesoBagagem, precoBagagem);
    }
}
