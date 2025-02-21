/*_Q_u_e_st_ã_o_ 8_ ________________________________________________
A professora Alice precisa calcular a média das notas dos seus alunos. Os alunos possuem quatro
notas bimestrais. A média final do aluno é a média aritmética das notas. Calcule e imprima a
média de um aluno.*/


import java.util.Scanner;

public class Questao_8 {
    public static void executar_Q8() {
        Scanner scan = new Scanner(System.in);
        int contador = 1;
        double nota = 0, media = 0, lerNota = 0;



        while (contador <= 4){
            System.out.printf("Digite a nota do %d° bimestre %n", contador);
            lerNota = scan.nextDouble();

            nota = nota + lerNota;
            contador++;
        }
        media = nota / (contador - 1);
        System.out.printf("A média do aluno é %.2f%n", media);
    }
}
