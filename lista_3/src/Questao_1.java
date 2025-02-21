/*Q_u_e_st_ã_o_1________________________________________________
Você está ensinando uma criança a contar até 10. Não é uma atividade fácil, pois as crianças não
têm um senso claro de ordem. Assim como as crianças, os computadores não sabem contar,
então você precisa ensiná-los. Conte de 1 até 10.*/

import java.util.Scanner;

public class Questao_1 {
    public static void executar_Q1() {

        int num = 1;
        Scanner Ler = new Scanner(System.in);

        System.out.println("Vamos contar de 1 a 10 (um a  dez)?");
        do{
            System.out.println(num);
            num = num + 1;
            System.out.println("Escreva o número: ");
            String LerNum = Ler.nextLine();
        }
        while(num <=10);

        System.out.println("Terminamos a nossa contagem");
    }

}
