/*_Q_u_e_st_ã_o_ 5_ _____________________ ___________________________
Calcular a área de uma casa, ou um apartamento, pode ser uma tarefa complicada,
principalmente, quando a área construída não é parecida com um quadrado ou retângulo. Por isso,
um modo mais fácil é somar as áreas de cada cômodo da casa e então ter a área total. Faça um
programa que pede a área por cômodo, até que a área informada seja igual a zero. Quando a área
for nula, você deve informar a área total da casa, ou apartamento.*/


import java.util.Scanner;

public class Questao_5 {
    public static void executar_Q5() {
        double area = 0;
        double lerArea;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite a área ");
            lerArea = scan.nextDouble();
            area = area + lerArea;

        } while (lerArea != 0);

        System.out.printf("A área total é  %.2f m²%n", area);

    }
}
