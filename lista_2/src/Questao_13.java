/*Questão 13
________________________________________________________
Esse desafio vai exigir de você um pouco de curiosidade, eu já lhe aviso.
Como eu sou generoso, vou lhe deixar uma dica aqui. Bem, nesse desafio,
você deve informar se a data do dia faz parte da primavera ou do outono.
Um dia está na primavera se estiver entre 22/09 à 21/12 e o outono de datas entre 20/03 à 21/06.*/

import java.util.Scanner;

public class Questao_13 {
    public static void executar_Q13(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o dia");
        int dia = ler.nextInt();
        System.out.println("Digite o mês");
        int mes = ler.nextInt();
        System.out.println("Digite o ano");
        int ano = ler.nextInt();

        boolean MesValid = (mes >= 1 && mes <=12);
        boolean DiaValid = (dia >=1 && dia <=31);

        if (MesValid){
            if (DiaValid){
                if (mes >= 9 && mes <= 12 ){
                    if (mes == 9 && dia >= 22 && dia <= 30) {
                        System.out.printf("A data fornecida faz parte da primavera: %d/ %d/ %d", dia, mes, ano);
                    } else if (mes == 10 && (dia >= 1 && dia <= 31)) {
                        System.out.printf("A data fornecida faz parte da primavera: %d/ %d/ %d", dia, mes, ano);

                    } else if (mes == 11 && (dia >= 1 && dia <= 30)) {
                        System.out.printf("A data fornecida faz parte da primavera: %d/ %d/ %d", dia, mes, ano);

                    } else if (mes == 12 && dia >= 1 && dia <= 21) {
                        System.out.printf("A data fornecida faz parte da primavera: %d/ %d/ %d", dia, mes, ano);
                    }else {
                        System.out.printf("A data fornecida faz parte de outra estação e não do outono nem do inverno: %d/ %d/ %d", dia, mes, ano);
                    }
                } else if (mes >= 3 && mes <= 6 ) {
                    if (mes == 3 && dia >= 20 && dia <= 31) {
                        System.out.printf("A data fornecida faz parte da outono: %d/ %d/ %d", dia, mes, ano);
                    } else if (mes == 4 && (dia >= 1 && dia <= 31)) {
                        System.out.printf("A data fornecida faz parte da outono: %d/ %d/ %d", dia, mes, ano);
                    }else if ( mes == 5 && (dia >= 1 && dia <= 30)) {
                        System.out.printf("A data fornecida faz parte da outono: %d/ %d/ %d", dia, mes, ano);
                    } else if (mes == 6 && dia >= 1 && dia <= 21) {
                        System.out.printf("A data fornecida faz parte da outono: %d/ %d/ %d", dia, mes, ano);
                    }else {
                    System.out.printf("A data fornecida faz parte de outra estação e não do outono nem do inverno: %d/ %d/ %d", dia, mes, ano);
                    }


                } else {
                    System.out.printf("A data fornecida faz parte de outra estação e não do outono nem do inverno: %d/ %d/ %d", dia, mes, ano);
                }
            }else {
                System.out.println("Dia inválido.");

            }

        }else {
            System.out.println("Mês inválido.");
        }


    }
}
