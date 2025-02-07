import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Object[] questao = {"Questao_1", "Questao_2", "Questao_3", "Questao_4", "Questao_5", "Questao_6", "Questao_7", "Questao_8", "Questao_9", "Questao_10", "Cancelar"};
    int escolhaQuestao = JOptionPane.showOptionDialog(
                null,
                "Qual questao deseja executar?",
                "Lista 1",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                questao,
                questao[0]
        );

    switch (escolhaQuestao) {
        case 0 : Questao_1.executar_Q1();
            break;
        case 1 : Questao_2.executar_Q2();
            break;
        case 2 : Questao_3.executar_Q3();
            break;
        case 3 : Questao_4.executar_Q4();
            break;
        case 4 : Questao_5.executar_Q5();
            break;
        case 5 : Questao_6.executar_Q6();
            break;
        case 6: Questao_7.executar_Q7();
            break;
        case 7 : Questao_8.executar_Q8();
            break;
        case 8 : Questao_9.executar_Q9();
            break;
        case 9 : Questao_10.executar_Q10();
            break;
        case 10 :
            JOptionPane.showMessageDialog(null, "O usuario cancelou a operação");
            break;

        }

    }
}