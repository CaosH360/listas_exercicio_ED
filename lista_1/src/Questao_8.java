//_Q_u_e_st_ã_o_ 8_ _____________________________________________
//O IBGE (Instituto Brasileiro de Geografia e Estatística) para definir um preço médio de um produto
//alimentar, por exemplo: o feijão, faz consulta a pelo menos 5 mercados de tamanhos variados.
//Após ler os valores dos 5 mercados, o instituto calcula o valor médio do produto. Diferente do que
//era praticado antes, atualmente, o IBGE utiliza um pequeno sistema para computar o preço
//médio. Você está trabalhando na equipe de TI do IBGE para calcular o preço médio dos produtos.
//Lembre-se de ler os cinco preços, calcular a média e exibir o resultado.


import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Questao_8 {
    public static void executar_Q8() {
        JOptionPane.showMessageDialog(null, "Sistema de media de valor de produto");
        String produto = JOptionPane.showInputDialog("Digite o nome do produto");
        String mercado1 = JOptionPane.showInputDialog("Digite o valor do produto no mercado em questão");
        String mercado2 = JOptionPane.showInputDialog("Digite o valor do produto no mercado em questão");
        String mercado3 = JOptionPane.showInputDialog("Digite o valor do produto no mercado em questão");
        String mercado4 = JOptionPane.showInputDialog("Digite o valor do produto no mercado em questão");
        String mercado5 = JOptionPane.showInputDialog("Digite o valor do produto no mercado em questão");

        double ValorMercado1 = Double.parseDouble(mercado1);
        double ValorMercado2 = Double.parseDouble(mercado2);
        double ValorMercado3 = Double.parseDouble(mercado3);
        double ValorMercado4 = Double.parseDouble(mercado4);
        double ValorMercado5 = Double.parseDouble(mercado5);

        double media = (ValorMercado1 + ValorMercado2 + ValorMercado3 + ValorMercado4 + ValorMercado5) / 5;
        NumberFormat formatoBRL = new DecimalFormat("R$ ###,##0.00");


        JOptionPane.showMessageDialog(null, "A media de preço do(a) " + produto +" é de " + formatoBRL.format(media));

    }
}
