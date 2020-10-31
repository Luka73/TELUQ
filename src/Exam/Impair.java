package Exam;

import java.util.Scanner;

public class Impair {
    public static void main(String[] args) {
        /*Escreva um programa Java que peça ao usuário para escolher um número
        ímpar entre 0 e 100. O programa deve então oferecer ao usuário um número
        ímpar entre 0 e 100 e perguntar ao usuário se o número escolhido é
        (a) menor (b) maior ou (c) igual ao número oferecido pelo programa.
        O programa deve continuar até que o valor correto seja encontrado
        pelo programa de computador. Sua implementação deve ser eficaz para obter
        todos os pontos. Você deve explicar completamente sua solução.*/


       int myOddNumber = getOddNumber();
       int computerOddNumber = generateOddNumber(0, 100);

       while (true) {
           int answer = compareAnswer(computerOddNumber, myOddNumber);
           if(answer == 0) {
               System.out.println("Acertei!!");
               break;
           } else {
               computerOddNumber = (answer < 0)
                       ? generateOddNumber(computerOddNumber, myOddNumber)
                       : generateOddNumber(myOddNumber, computerOddNumber);
           }

       }
    }

    public static int getOddNumber() {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Escolha um número ímpar entre 1 e 100: ");
            n = sc.nextInt();

            if (n % 2 == 1) break;

            System.out.println(n + " não é ímpar.");
        }

        return n;
    }

    public static int generateOddNumber(int min, int max) {
        if (max % 2 == 0) --max;
        if (min % 2 == 0) ++min;
        return min + 2*(int)(Math.random()*((max-min)/2+1));
    }

    public static int compareAnswer(int a, int b) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" -- Me ajude a acertar: -- ");
        System.out.println("a) " + a + " é maior que " + b);
        System.out.println("b) " + a + " é igual a " + b);
        System.out.println("c) " + a + " é menor que " + b);
        String answer = sc.next().toLowerCase();

        return Integer.compare(a, b);
    }

    /*
        O código é

     */
}
