/*
* Questão 2
________________________________________________________
Você viu na televisão que esse inverno vai ser rigoroso no Brasil. Decidiu então que vai monitorar a temperatura da sua cidade.
* Se as temperaturas estiverem abaixo de 17ºC, você vai exibir na tela: “Frio da moléstia", mas caso contrário:
* “Tudo normal nas terras de Cuçumarim”.*/

import java.util.Scanner;

public class Questao_2 {
    public static void executar_Q2(){
        Scanner ler =  new Scanner(System.in);
        System.out.println("Digite o qual a temperatura atual em Celcius: ");
        int temperaturaC = ler.nextInt();
        if(temperaturaC <= 17) {
            System.out.println("Frio da moléstia");
        } else {
            System.out.println("Tudo normal nas terras de Cuçumarim");

        }
    }
}
