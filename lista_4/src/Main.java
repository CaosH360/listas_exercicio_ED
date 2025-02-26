import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler =  new Scanner(System.in);
        System.out.println("qual questaio quer executar? \n 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11(Cancelar)");

        int escolhaQuestao = ler.nextInt();

        switch (escolhaQuestao) {
            case 1:
                Questao_1.executar_Q1();
                break;
            case 2:
                Questao_2.executar_Q2();
                break;
            case 3:
                Questao_3.executar_Q3();
                break;
            case 4:
                Questao_4.executar_Q4();
                break;
            case 5:
                Questao_5.executar_Q5();
                break;
            case 6:
                Questao_6.executar_Q6();
                break;
            case 7:
                Questao_7.executar_Q7();
                break;
            case 8:
                Questao_8.executar_Q8();
                break;
            case 9:
                Questao_9.executar_Q9();
                break;
            case 10:
                Questao_10.executar_Q10();
                break;
            case 11:
                System.out.println("O usuario cancelou a operação");
                break;
        }
    }
}