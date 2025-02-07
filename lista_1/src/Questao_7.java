//_Q_u_e_st_ã_o_ 7_ ________________________________________________
//Você saiu com seus amigos para ir ao cinema. Depois de assistirem o filme, vocês foram para um
//restaurante comemorar o aniversário de sua amiga, Alice. Na hora de pagar a conta, como sempre,
//foi aquele furdunço, divide daqui, divide dali. Então, você pensou: vou fazer um programa para
//calcular a conta por pessoa em um aniversário. Claro que a aniversariante não conta. Deste modo,
//você faria um programa que lesse o total da conta, divide-a pelo número de pessoas na mesa,
//menos o aniversariante. Depois, você só precisa exibir quanto cada um tem que pagar.

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Questao_7 {
    public static void executar_Q7() {
        JOptionPane.showMessageDialog(null, "Calculadora de contas para aniversários");
        String valor = JOptionPane.showInputDialog("Digite o valor total da conta");
        double valorConta = Double.parseDouble(valor);
        String pessoas = JOptionPane.showInputDialog("Agora digite a quantidade de pessoas. Obs: pode contar o aniversariante");
        String aniversariantes = JOptionPane.showInputDialog("Agora digite a quantidade de aniversariantes");
        int QuantidadePessoas = Integer.parseInt(pessoas);
        int aniversariante = Integer.parseInt(aniversariantes);

        QuantidadePessoas = QuantidadePessoas - aniversariante;

        double conta = valorConta / QuantidadePessoas;
        NumberFormat formatoBRL = new DecimalFormat("R$ ###,##0.00");
        JOptionPane.showMessageDialog(null, "A nao ser o aniversariante, o valor para cada pessoa é igual a " + formatoBRL.format(conta));



    }
}
