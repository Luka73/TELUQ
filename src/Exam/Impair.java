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

        Scanner sc = new Scanner(System.in);
        int n = 0;

        while (true) {
            System.out.println("Escolha um número ímpar entre 1 e 100: ");
            n = sc.nextInt();

            if (n % 2 == 1) break;

            System.out.println(n + " não é ímpar.");
        }

        int odd = generateOddNumber();

        while (true) {
            if(matchAnswer(odd, n)) {
                System.out.println("Parabéns! Você acertou!");
                break;
            }
            System.out.println("Resposta errada! Tente novamente!");
        }
    }

    public static int generateOddNumber() {
        int x = (int) (Math.random()*100);
        x += (x % 2 == 0 ? 1 : 0);
        return x;
    }

    public static boolean matchAnswer(int a, int b) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" -- Escolha a resposta correta: -- ");
        System.out.println("a) " + a + " é maior que " + b);
        System.out.println("b) " + a + " é igual a " + b);
        System.out.println("c) " + a + " é menor que " + b);
        String answer = sc.next();

        int comp = Integer.compare(a, b);

        boolean menor = comp < 0 && answer.equals("c");
        boolean maior = comp > 0 && answer.equals("a");
        boolean igual = comp == 0 && answer.equals("b");

        return menor || maior || igual;
    }
}
