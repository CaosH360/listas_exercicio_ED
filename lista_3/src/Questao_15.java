/*_Q_u_e_st_ã_o_ 1_5_ _______________________________________________
As temperaturas no verão estão sendo cada vez mais quentes, assim como algumas regiões estão
tendo invernos mais rigorosos. Devido a isso, alertas de emergências devem ser divulgados com
antecedência. Você deve fazer um programa que leia as temperaturas máximas e mínimas
durante uma semana. Você deve apresentar a mínima e a máxima da semana.*/

import java.util.Random;

public class Questao_15 {
    public static void executar_Q15() {
        Random random = new Random();
        double tempMax = Double.MIN_VALUE;
        double tempMin = Double.MAX_VALUE;
        int diaSemana = 7;
        int diaTempMin = -1;
        int diaTempMax = -1;

        System.out.println("Digite o as temperaturas durante a semana ");

        for (int i = 1; i <=diaSemana; i++) {
            double temp = random.nextDouble() * 30;

            if (temp < tempMin) {
                tempMin = temp;
                diaTempMin = i;
            }
            if (temp > tempMax) {
                tempMax = temp;
                diaTempMax = i;
            }

        }
        System.out.printf("A temperatura máxima da semana foi %.2f no dia %d %n",tempMax ,diaTempMax);
        System.out.printf("A temperatura mínima da semana foi %.2f no dia %d %n",tempMin ,diaTempMin);
    }
}
