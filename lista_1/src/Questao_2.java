//Questão 2
//________________________________________________________
//Você está começando na academia hoje e a sua instrutora fez um levantamento do seu biotipo,
// além de outras informações suas. Ela para calcular o seu IMC (Índice de Massa Corporal),
// mediu o seu peso e sua altura. Com essas informações em mãos, ela calculou o seu IMC usando
// a seguinte fórmula: imc = peso / (altura * altura). Com o valor calculado, ela te apresentou
// a sua ficha de acompanhamento. Você resolveu ajudar a sua instrutora e vai fazer um programa
// para calcular o imc.


import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Questao_2 {
    public  static void executar_Q2() {
        JOptionPane.showMessageDialog(null,"Calculador de IMC");
        String pesoString = JOptionPane.showInputDialog("Digite o peso em kg do individuo ex.: 70.5");
        String alturaString = JOptionPane.showInputDialog("Digite a altura em metros do individuo ex.: 1.80 ");

        double peso = Double.parseDouble(pesoString);
        double altura = Double.parseDouble(alturaString);

        double imc = peso / (altura * altura);
        NumberFormat formato = new DecimalFormat("###,##0.00");

        JOptionPane.showMessageDialog(null, "O imc com os dados fornecidas equivalem a "
                + formato.format(imc) + ".");
    }
}
