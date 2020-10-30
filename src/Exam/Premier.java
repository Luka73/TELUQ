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
}
