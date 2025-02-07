//Questão 3
//________________________________________________________
//Maria trabalha para uma construtora no setor de vendas. Constantemente, ela tem que calcular a área
// dos terrenos vendidos. Como Maria é sua amiga há muito tempo, você resolveu ajudá-la criando um programa
// que lê o comprimento e a largura e imprime a área total do terreno em metros quadrados.


import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Questao_3 {
    public static void executar_Q3() {
        JOptionPane.showMessageDialog(null, "Calculador de Área");
        String larguraString = JOptionPane.showInputDialog("Digite  largura em metros");
        String comprimentoString = JOptionPane.showInputDialog("Digite o comprimento em metros");
        
        double largura = Double.parseDouble(larguraString);
        double comprimento = Double.parseDouble(comprimentoString);

        double area = largura * comprimento;

        NumberFormat metroQuadra = new DecimalFormat("###,##0.00m²");

        JOptionPane.showMessageDialog(null, "A área das medidas fornecidas equivale a " + metroQuadra.format(area));



    }
}