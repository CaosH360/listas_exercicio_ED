/*_Q_u_e_st_ã_o_ 6_ ________________________________________________
Em um supermercado é comum que no caixa os produtos sejam passados até que finalize-se a
compra. Você deve fazer um programa que leia os preços dos produtos, até que o preço zero seja
informado. O total da compra deve ser informado no final. Você deve, basicamente, somar todos
os preços informados.*/

import java.util.Scanner;

public class Questao_6 {
    public static void executar_Q6() {
    Scanner scan = new Scanner(System.in);
    double compra = 0, produto = 0;
        do {
            System.out.println("Digite o valor do produto. \n Caso tenha acabados os produtos digite 0");
            produto = scan.nextDouble();
            compra = compra + produto;
        }while (produto != 0);
        System.out.printf("O valor total da compra é %.2f%n", compra);
    }
}
