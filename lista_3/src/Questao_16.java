/*_Q_u_e_st_ã_o_ 1_6_ _______________________________________________
O dólar, assim como qualquer outra moeda relativamente estável, tem o seu valor flutuante. Uma
empresa de câmbio normalmente monitora os valores máximos da cotação do dólar comercial
para realizar transações no final do dia. Você deve ler os valores de cotação que são liberados de
30 em 30 minutos das 08h da manhã até às 17h. Esses dados serão informados de uma única vez
no final do dia corrente. Você deve ao fim exibir o valor máximo de cotação.*/

import java.util.Random;

public class Questao_16 {
    public static void executar_Q16() {
        Random random = new Random();
        int vezesAoDia = 18;
        double maiorValor = Double.MIN_VALUE;

        System.out.println("Digite o valor do dolar no momento de o ");

        for (int i = 1; i <=vezesAoDia; i++) {
            double dolar = random.nextDouble() * 7;

            if (dolar > maiorValor) {
                maiorValor = dolar;

            }

        }
        System.out.printf("O maior valor do dolar hoje foi de R$ %.2f", maiorValor);
    }
}
