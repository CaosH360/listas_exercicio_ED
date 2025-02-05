//Questão 1
//________________________________________________________
//Você trabalha em um supermercado e no caixa que você trabalha o consumidor só pode
// comprar um único produto, mesmo que várias unidades repetidas.
// Você deseja otimizar o seu trabalho e criar um programa que leia o preço do produto
// e a quantidade de itens comprados e informe o total da compra para o usuário.

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Questao_1 {
    public static void executar_Q1() {
        String ProdutoNome = JOptionPane.showInputDialog("Por favor informe o nome do produto.");
        String Valor = JOptionPane.showInputDialog("Agora informe o valor do produto.");
        double ProdutoValor = Double.parseDouble(Valor);
        String Quantidade = JOptionPane.showInputDialog("Agora informe o a quantidade de produto(os).");

        int ProdutoQuantidade = Integer.parseInt(Quantidade);

        double Total = ProdutoValor * ProdutoQuantidade;

        NumberFormat formato = new DecimalFormat("R$ ###,##0.00");

        JOptionPane.showMessageDialog(null, "O total da compra é de " + formato.format(Total) +
                " voce esta comprando " + ProdutoQuantidade + " Unidades de " + ProdutoNome + ".");

    }
}

