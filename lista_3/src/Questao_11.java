/*_Q_u_e_st_ã_o_ 1_1 ________________________________________________
A equipe de meteorologia de um jornal precisava calcular a temperatura média semanal em
determinada localidade. Para tal, são feitas as leituras das máximas dos sete dias de uma semana.
Por fim, a temperatura média deve ser exibida.*/


import java.util.Scanner;

public class Questao_11 {
    public static void executar_Q11() {
        Scanner scan = new Scanner(System.in);

        int contador = 1;
        double temp = 0;
        double lerTemp = 0;
        double media = 0;

        do {
            System.out.println("Digite a temperatura máxima no dia " + contador);
            lerTemp = scan.nextDouble();
            temp = temp + lerTemp;
            contador++;
        } while (contador <7);
        media = temp / contador;
        System.out.printf("O a temperatura media é de %.2f°C %n ", media);
    }
}
