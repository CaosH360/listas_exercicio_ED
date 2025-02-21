/*_Q_u_e_st_ã_o_ 9_ ________________________________________________
A professora Alice precisa fazer o mesmo cálculo de médias de seus alunos, porém, ela precisa
fazer isso para todos os seus 25 alunos. Calcule a média final para todos os 25 alunos.*/


import java.util.Scanner;

public class Questao_9 {
    public static void executar_Q9() {
        Scanner scan = new Scanner(System.in);
        int contador = 1;
        double[] nota = new double[25];
        double[] media = new double[25];
        double lerNota = 0;
        int aluno = 1;

        for (int i = 0; i < 25; i++) {
            contador = 1;
            System.out.println("Digite a nota do aluno " + (aluno + i));
            while (contador <= 4){
                System.out.printf("Digite a nota do %d° bimestre %n ", contador);
                lerNota = scan.nextDouble();

                nota[((aluno + i) - 1)] = nota[((aluno + i) - 1)] + lerNota;
                contador++;
            }
            media[((aluno + i) - 1)] = nota[((aluno + i) - 1)] / (contador - 1);
        }
        for (int a = 0; a < 25; a++) {
            System.out.printf("A média do aluno %d é %.2f%n ", (aluno + a), media[((aluno + a) - 1)]);
        }

    }
}
