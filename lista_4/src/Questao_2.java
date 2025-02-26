/*________________________________________________________
Você está aprendendo inglês e resolveu brincar com as suas letras de música favoritas.
A brincadeira é muito simples: você deve ler as primeiras 10 linhas da música e depois
colocar a letra da música em ordem inversa, ou seja, a última linha da letra da música
deve ser a primeira a ser exibida e vice-versa*/


import java.util.Scanner;

public class Questao_2 {
    public static void executar_Q2() {
        Scanner scan= new Scanner(System.in);
        String[] linhaMusica = new String[10];
        int contador = 0;
        System.out.println("Vamos brincar com música");

        while (contador < 10){
            System.out.printf("Digite a %d° linha da música %n", (contador + 1));
            linhaMusica[contador] = scan.nextLine();
            contador++;
        }
        contador = 9;

        while (contador >=0 ) {
            System.out.println(linhaMusica[contador]);
            contador--;

        }
    }
}
