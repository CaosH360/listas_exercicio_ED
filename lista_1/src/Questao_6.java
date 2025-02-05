//Q_u_e_st_ã_o_ 6_ ________________________________________________
//O Bar do Boca é um bar conhecido na sua cidade. Todas as sextas-feiras, o bar tem música ao vivo
//e um novo cardápio a cada mês. O dono do bar, Boca, não sabe mais o que fazer com as contas
//que são fechadas erradas, pois os garçons esquecem de adicionar a taxa de couvert ou esquecem
//que a gorjeta sai de 10% para 20%. Você que conhece o Boca há muito tempo resolveu ajudá-lo.
//Você vai fazer um programa que ler o total da conta e acrescenta 20% da gorjeta e a taxa fixa do
//couvert.

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.text.NumberFormat;


public class Questao_6 {
    public static void executar_Q6() {
        JOptionPane.showMessageDialog(null, "Sistema de fechamnento de conta");
        String consumo = JOptionPane.showInputDialog("Digite o valor total do que foi consumido pelo(os) clientes");
        double valorConsumo = Double.parseDouble(consumo);
        double gorjeta = 0.20;
        double couvert = 10.00;

        double conta = valorConsumo + (valorConsumo * gorjeta) + couvert;

        NumberFormat formatoBRL = new DecimalFormat("R$ ###,##0.00");

        JOptionPane.showMessageDialog(null, "O valor total da conta é de " + formatoBRL.format(conta));


    }

}
