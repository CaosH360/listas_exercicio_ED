//Questão 4
//________________________________________________________
//Maria amou o programa que você fez para ela de calcular a área dos terrenos,
// mas ela possui outro grande problema: alguns terrenos não possuem lados uniformes,
// assim, ela precisa, muitas vezes, informar, além da área, o perímetro do terreno.
// Ela confirmou a você que todos os terrenos só possuem quatro lados. Você sabe que
// para calcular o perímetro do terreno basta somar todos os lados. Dessa forma, você
// confirmou a ela que faria esse programa de calcular perímetro.


import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.text.NumberFormat;


public class Questao_4 {
    public static void executar_Q4() {
        JOptionPane.showMessageDialog(null, "Calculador de Perímetro");
        String lado_1_String = JOptionPane.showInputDialog("Digite em metros o lado um");
        String lado_2_String = JOptionPane.showInputDialog("Digite em metros o lado dois");
        String lado_3_String = JOptionPane.showInputDialog("Digite em metros o lado três");
        String lado_4_String = JOptionPane.showInputDialog("Digite em metros o lado quatro");

        double lado_1 = Double.parseDouble(lado_1_String);
        double lado_2 = Double.parseDouble(lado_2_String);
        double lado_3 = Double.parseDouble(lado_3_String);
        double lado_4 = Double.parseDouble(lado_4_String);


        double perimetro = lado_1 + lado_2 + lado_3 + lado_4;

        NumberFormat formato = new DecimalFormat("###,##0.00m");

        JOptionPane.showMessageDialog(null, "O perímetro das medidas fornecidas equivale a "
            + formato.format(perimetro));
    }
}
