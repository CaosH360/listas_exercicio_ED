/*_Q_u_e_s_tã_o_ 6_ ________________________________________________
Dessa vez, lhe iludiram e disseram que iam pagar para você fazer um programa, mas no fundo
você sabe que não vai receber. Você foi contratado para criar um programa de promoção do dia
do consumidor. Basicamente, você vai ler o total da compra de um consumidor e aplicar o
desconto conforme abaixo:
total compra desconto
    < 50,00 5%
    < 100,00 10%
    < 200,00 20%
    < 500,00 25%
    >= 500, 00 30%
Por fim, você deve imprimir o valor total da compra após o desconto.*/


import java.util.Scanner;

public class Questao_6 {
    public static void executar_Q6(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o total da compra: ");
        double totalCompra = ler.nextDouble();
        double desconto = 0.0;
        if (totalCompra < 50.00) {
            desconto = 0.05;
        } else if (totalCompra < 100.00) {
            desconto = 0.10;
        } else if (totalCompra < 200.00) {
            desconto = 0.20;
        } else if (totalCompra < 500.00) {
            desconto = 0.25;
        }else {
            desconto = 0.30;
        }
        totalCompra = totalCompra - (totalCompra * desconto);

        System.out.printf("O total da compra recebeu um desconto  %.0f%% e agora é R$ %.2f%n", desconto * 100, totalCompra);

        ler.close();



    }
}
