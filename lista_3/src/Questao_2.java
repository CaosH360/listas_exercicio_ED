/*Q_u_e_st_ã_o_2________________________________________________
Par ou ímpar é uma forma tradicional de resolver alguns problemas quando você é criança, seja
numa brincadeira ou em algum conflito. Como as duas mãos juntas temos dez dedos, como cada
pessoa pode usar as duas mãos, vamos ter o máximo de 20 dedos. Então, vamos ensinar as
crianças a contarem todos os números pares e ímpares entre 0 e 20.*/


public class Questao_2 {
    public static void executar_Q2() {
        int contador = 0;
        for (contador = 1; contador < 21; contador++) {
            if (contador % 2 == 0){
                System.out.println(contador + " esse número é par");
            }else {
                System.out.println(contador + " esse número é impar");

            }
        }
    }
}
