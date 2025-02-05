//________________________________________________________
//Você quer viajar para fora do Brasil, mas ainda não escolheu o seu destino. Você está em dúvida entre Europa,
// Canadá, Estados Unidos e Argentina. Você sabe que as moedas nessas regiões são: euro, dólar canadense,
// dólar americano, peso argentino. Você queria um programa que você desse o valor que deseja levar e as
// cotações do dia de cada moeda e imprimisse quanto em cada moeda você teria. Então, resolveu que faria
// esse programa para você e sua mãe verem quanto de dinheiro teriam em cada região.
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.text.NumberFormat;


public class Questao_5 {
    public static void executar_Q5() {
        JOptionPane.showMessageDialog(null, "Conversor de moedas.");
        String meuSaldo = JOptionPane.showInputDialog("Digite o valor em R$ BRL que deseja converter");

        double meuSaldoBRL = Double.parseDouble(meuSaldo);

        NumberFormat formatoBRL = new DecimalFormat("R$ ###,##0.00");
        NumberFormat formatoEUR = new DecimalFormat("###,##0.00 €");
        NumberFormat formatoCAD = new DecimalFormat("C$ ###,##0.00");
        NumberFormat formatoUSD = new DecimalFormat("$ ###,##0.00");
        NumberFormat formatoARS = new DecimalFormat("$ ###,##0.00");

        Object[] moedas = {"EUR", "CAD", "USD", "ARS", "Cancelar"};
        int seletorMoeda = JOptionPane.showOptionDialog(
        null,
        "Escolha para qual moeda deseja fazer a conversão.",
        "Moedas disponíveis",
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        moedas,
        moedas[0]
        );

        double taxaEUR = 5.991;
        double taxaCAD = 4.03;
        double taxaUSD = 5.771;
        double taxaARS = 0.005;

        double conversao = 0.00;

        if (seletorMoeda == 0) {
            conversao = meuSaldoBRL / taxaEUR;
            JOptionPane.showMessageDialog(null, "O seu saldo de " +
                    formatoBRL.format(meuSaldoBRL) + " equivale a " + formatoEUR.format(conversao));

        } else if (seletorMoeda == 1) {
            conversao = meuSaldoBRL / taxaCAD;

            JOptionPane.showMessageDialog(null, "O seu saldo de " +
                    formatoBRL.format(meuSaldoBRL) + " equivale a " + formatoCAD.format(conversao));

        } else if (seletorMoeda == 2) {
            conversao = meuSaldoBRL / taxaUSD;

            JOptionPane.showMessageDialog(null, "O seu saldo de " +
                    formatoBRL.format(meuSaldoBRL) + " equivale a " + formatoUSD.format(conversao));

        } else if (seletorMoeda == 3) {
            conversao = meuSaldoBRL / taxaARS;

            JOptionPane.showMessageDialog(null, "O seu saldo de " +
                    formatoBRL.format(meuSaldoBRL) + " equivale a " + formatoARS.format(conversao));
        }
        else {
            JOptionPane.showMessageDialog(null, "O usuario cancelou a operação");
        }

    }
}
