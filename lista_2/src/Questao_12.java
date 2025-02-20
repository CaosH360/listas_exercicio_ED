/*Questão 12
________________________________________________________
Parabéns! Esse é o seu primeiro dia no estágio na rede de hotéis:
DOM. O seu supervisor de estágio passou uma demanda que eles estão
tendo em produção. As datas não estão sendo validadas corretamente
pela função da API, então, ele resolveu pedir a você que desenvolvesse
um programa que validasse a data. Você deve ler o dia, o mês e o ano
e ao fim imprimir se a data é válida ou não. Não esqueça de verificar
se o ano é bissexto ou não (se for bissexto, o mês de fevereiro terá 29 dias).*/

import java.util.Scanner;

public class Questao_12 {
    public static void executar_Q12(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o dia");
        int dia = ler.nextInt();
        System.out.println("Digite o mês");
        int mes = ler.nextInt();
        System.out.println("Digite o ano");
        int ano = ler.nextInt();

        boolean MesValid = (mes >= 1 && mes <=12);
        boolean DiaValid = (dia >=1 && dia <=31);
        boolean bissexto = (ano  % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

        if (MesValid){
            if (DiaValid){
                if ((mes == 2 && dia <=28) || (mes == 2 && dia == 29  && bissexto)){
                    System.out.printf("A data fornecida é valida e o ano é bissexto: %d/ %d/ %d", dia, mes, ano);

                } else if ((mes == 4 || mes == 6 || mes == 9  || mes == 11) && dia <= 30) {
                    System.out.printf("A data fornecida é valida: %d/ %d/ %d", dia, mes, ano);

                } else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes ==12) && dia <= 31) {
                    System.out.printf("A data fornecida é valida: %d/ 0%d/ %d", dia, mes, ano);

                } else {
                    System.out.println("Dia inválido");

                }
            }else {
                System.out.println("Dia inválido.");

            }

        }else {
            System.out.println("Mês inválido.");
        }

    }

}
