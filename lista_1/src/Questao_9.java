//_Q_u_e_st_ã_o_ 9_ _____________________________________________
//A sua professora de Física passou uma questão sobre velocidade média. Ela explicou que a
//velocidade média de um corpo, por exemplo, um carro, é calculada dividindo a distância
//percorrido (em metros) pela quantidade de tempo (em segundos).
//Desse modo, a velocidade = distancia / tempo. Você que não é besta foi logo fazendo um
//programa que calculasse a velocidade média, apenas lendo a distância percorrida e o tempo
//gastado para percorrê-lo.

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Questao_9 {
    public static void executar_Q9() {
        JOptionPane.showMessageDialog(null, "Sistema de calculo de velocidade média");

        String Distancia = JOptionPane.showInputDialog("Digite a distância percorrida em metros");
        String Tempo = JOptionPane.showInputDialog("Digite o tempo de duração do percurso em segundos");

        double distancia = Double.parseDouble(Distancia);
        double tempo = Double.parseDouble(Tempo);

        double veloMedia = distancia / tempo;
        NumberFormat formato = new DecimalFormat("###,##0.00 m/s");

        JOptionPane.showMessageDialog(null, "A velocidade média é de " + formato.format(veloMedia));
    }

}
