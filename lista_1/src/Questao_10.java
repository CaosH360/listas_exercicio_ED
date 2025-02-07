//_Q_u_e_st_ã_o_ 1_0_ ____________________________________________
//Uma loja de tintas deseja informar para os clientes o melhor custo-benefício na compra de suas
//tintas. Você foi contratado para desenvolver um programa que deverá pedir o tamanho em
//metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6
//metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em
//galões de 3,6 litros, que custam R$ 25,00. Informe ao usuário as quantidades de tinta a serem
//compradas e os respectivos preços em 3 situações:
//  a. comprar apenas latas de 18 litros;
//  b. comprar apenas galões de 3,6 litros;
//  c. misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10%
//      de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.


import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.text.NumberFormat;

//JOptionPane.showMessageDialog(null, "");

public class Questao_10 {
    public static void executar_Q10() {
        double area = 0;
        int lataLitro = 18;
        double galaoLitro = 3.6;
        int quantidade_latas = 0;
        int quantidade_galoes = 0;



        double custoTotal_latas = 0;
        double custoTotal_galoes = 0;
        double custoTotal_ambos = 0;


        NumberFormat metroQuadra = new DecimalFormat("###,##0.00m²");
        NumberFormat formatoBRL = new DecimalFormat("R$ ###,##0.00");


        JOptionPane.showMessageDialog(null, "Tinta max");
        Object[] opcao = {"Sim", "Não", "Cancelar"};
        int pergunta = JOptionPane.showOptionDialog(
                null,
                "Você sabe quantos metros quadrados serão pintados?",
                "Tinta max",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcao,
                opcao[0]
        );

        if (pergunta == 0) {
            String Area = JOptionPane.showInputDialog("Digite  quantos metros quadrados serao pintados");
            area = Double.parseDouble(Area);

            JOptionPane.showMessageDialog(null, "A área a ser pintada é de " + metroQuadra.format(area));
        }
        else if (pergunta == 1) {
            String larguraString = JOptionPane.showInputDialog("Digite  largura em metros");
            String comprimentoString = JOptionPane.showInputDialog("Digite o comprimento em metros");
            double largura = Double.parseDouble(larguraString);
            double comprimento = Double.parseDouble(comprimentoString);
            area = largura * comprimento;

            JOptionPane.showMessageDialog(null, "A área a ser pintada é de " + metroQuadra.format(area));
        } else {
            JOptionPane.showMessageDialog(null, "O usuario cancelou a operação");
            return;
        }

        double tintaNecessaria = (area / 6) * 1.1;
        double tinta_restante = 0;


        Object[] decisao = {"Lata", "Galão", "Ambos", "Cancelar"};
        int recipiente = JOptionPane.showOptionDialog(
                null,
                "Você deseja qual tipo de produto?",
                "Tinta max",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                decisao,
                decisao[0]
        );

        if (recipiente == 0) {
            quantidade_latas = (int) Math.ceil(tintaNecessaria / lataLitro);
            custoTotal_latas = quantidade_latas * 80;
            JOptionPane.showMessageDialog(null, "Você gastará um total de " +
                    formatoBRL.format(custoTotal_latas) + " para pintar toda a área de " +
                    metroQuadra.format(area) + " e usará um total de " + quantidade_latas + " lata(s).");

        }
        else if (recipiente == 1) {
            quantidade_galoes = (int) Math.ceil(tintaNecessaria / galaoLitro);
            custoTotal_galoes = quantidade_galoes * 25;
            JOptionPane.showMessageDialog(null, "Você gastará um total de " +
                    formatoBRL.format(custoTotal_galoes) + " para pintar toda a área de " +
                    metroQuadra.format(area) + " e usará um total de " + quantidade_galoes + " galão(ões).");

    }
        else if (recipiente == 2) {
            quantidade_latas = (int) Math.floor(tintaNecessaria / lataLitro);
            tinta_restante = tintaNecessaria - (quantidade_latas * lataLitro);
            quantidade_galoes =  (int) Math.ceil(tinta_restante / galaoLitro);
            custoTotal_ambos = (quantidade_latas * 80) + (quantidade_galoes * 25);

            JOptionPane.showMessageDialog(null, "Você gastará um total de " +
                    formatoBRL.format(custoTotal_ambos) + " para pintar toda a área de " +
                    metroQuadra.format(area) + " e usará um total de " + quantidade_latas + " Lata(s) e " + quantidade_galoes + " Galão(ões).");


        } else {
            JOptionPane.showMessageDialog(null, "O usuario cancelou a operação");
            return;
        }

    }
}
