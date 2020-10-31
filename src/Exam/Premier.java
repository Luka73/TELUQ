package Exam;

import java.util.Scanner;

public class Premier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tapez un nombre: ");
        int n = sc.nextInt();
        int count = 0;

        for(int j = 1; j <= n; j++) {
            if(n % j == 0) {
                count++;
            }
        }

        String msg = (count == 2) ? " est premier" : " n'est pas premier";
        System.out.println(n + msg);
    }

    /*
        Explicação

        Uma maneira simples de descobrir se um número é primo ou não é calcular a quantidade
        dos seus divisores. Caso essa quantidade seja exatamente igual a 2, ele é primo.
        Por isso, usei essa lógica para resolver esse exercício.

     */
}
