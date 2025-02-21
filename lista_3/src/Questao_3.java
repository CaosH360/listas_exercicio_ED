/*________________________________________________________
Quando crianças aprendemos as tabuadas dos números 2, 3, 4, assim em diante.
Vamos criar a tabuada do número que quisermos. O usuário deve informar o número
que ele deseja a tabuada e você deve imprimir a tabuada tal como abaixo:

Número da tabula: 5
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

import java.util.Scanner;

public class Questao_3 {
    public static void executar_Q3() {
        Scanner scan = new Scanner(System.in);
        int numero, contador = 0, tabuada;
        System.out.println("Digite o número que deseja verificar a tabuada");

        numero = scan.nextInt();

        while (contador <= 10){
            tabuada = numero * contador;
            System.out.println(numero + " x " + contador + " = " + tabuada);
            contador++;
        }
    }
}
