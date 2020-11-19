package Exam;

import java.util.Scanner;

public class Impair {
    public static void main(String[] args) {
       int myOddNumber = getOddNumber();
       int computerOddNumber = generateOddNumber(0, 100);

       while (true) {
           int answer = compareAnswer(computerOddNumber, myOddNumber);
           if(answer == 0) {
               System.out.println("Acertei!!");
               break;
           } else {
               computerOddNumber = (answer < 0)
                       ? generateOddNumber(++computerOddNumber, 100)
                       : generateOddNumber(0, --computerOddNumber);
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

        while (true) {
            System.out.println(" -- Me ajude a acertar: -- ");
            System.out.println("a) " + a + " é maior que " + b);
            System.out.println("b) " + a + " é igual a " + b);
            System.out.println("c) " + a + " é menor que " + b);
            String answer = sc.next().toLowerCase();

            switch (answer) {
                case "a":
                    return 1;
                case "b":
                    return 0;
                case "c":
                    return -1;
                default:
                    System.out.println("Opção inválida! Digite uma opção correta!");
            }
        }
    }

    /*
        Explicação

        O código é dividido em três partes:
        1) capturar o número ímpar do usuário - E ainda nesse ponto é preciso verificar
        que o número digitado é ímpar; Isso está sendo feito pelo método getOddNumber()

        2) O computador deve gerar um número ímpar; Isso está sendo feito pelo método
        generateOddNumber(int min, int max) que recebe o intervalo de números que
        serão passando para a função random do Java. Além disso, esse método garante
        que os números serão ímpares.

        3) O usuário deve responder se o usuário acertou ou não; Caso não, ele deve
        indicar se o número é maior ou menor que sua escolha. Isso é feito pelo
        método compareAnswer(int a, int b) que compara os números baseados na
        resposta do usuário. Essa comparação poderia ser feito pelo Integer.compare(int a, int b),
        mas nesse caso, estaria ignorando a escolha do usuário.
     */
}
